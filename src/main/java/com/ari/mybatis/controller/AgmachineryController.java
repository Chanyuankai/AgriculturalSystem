package com.ari.mybatis.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ari.mybatis.bean.Agmachinery;
import com.ari.mybatis.bean.Company;
import com.ari.mybatis.bean.Employee;
import com.ari.mybatis.bean.Result;
import com.ari.mybatis.dao.AgmachineryMapper;
import com.ari.mybatis.dao.CompanyMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "农机管理相关的接口")
public class AgmachineryController {
	
	@Resource
	AgmachineryMapper agmachineryMapper;
	
	@GetMapping("/agmachinery")
	@ApiOperation(value="查找农机信息")
	/*
	 *根据id查找公司
	 * */
	public Object selectagmachinery(int id){
		Agmachinery agmachinery = agmachineryMapper.selectByPrimaryKey(id);
		return new Result(agmachinery);
	}
	
	@PostMapping("/updateagmachinery")
	@ApiOperation(value="编辑农机信息")
	public Object handleUpdateagmachinery(@RequestParam("agmachineryFile")MultipartFile file,Agmachinery agmachinery ,HttpServletRequest request) throws IllegalStateException, IOException{
		//图片文件上传
		String path = request.getServletContext().getRealPath("/upload");
		 String fileName = file.getOriginalFilename();
	        File dir = new File(path,fileName);
	        if(!dir.exists()){
	            dir.mkdirs();
	        }
	        System.out.println("上传成功");
	        file.transferTo(dir);
	        agmachinery.setId(1);
	        agmachinery.setImg("http://localhost:8080/upload/"+fileName);
	        agmachineryMapper.updateByPrimaryKey(agmachinery);
		return new Result(agmachinery);
	}
	
	@PostMapping("/addagmachinery")
	@ApiOperation(value="添加农机信息")
	public Object addEmployee(@RequestParam("agmachineryFile")MultipartFile file,Agmachinery agmachinery ,HttpServletRequest request) throws IllegalStateException, IOException{
		//图片文件上传
				String path = request.getServletContext().getRealPath("/upload");
				 String fileName = file.getOriginalFilename();
			        File dir = new File(path,fileName);
			        if(!dir.exists()){
			            dir.mkdirs();
			        }
			        System.out.println("上传成功");
			        file.transferTo(dir);
			        agmachinery.setImg("http://localhost:8080/upload/"+fileName);
			        agmachineryMapper.insert(agmachinery);
				return new Result(agmachinery);
	}
	@GetMapping("/deleteagmachinery")
	@ApiOperation(value="删除农机信息")
	public Object deleteagmachinery (int id){

		if(agmachineryMapper.deleteByPrimaryKey(id) == 1){
			return new Result();
		}
		else {
			return new Result("error");
		}
	}
	

}
