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

import com.ari.mybatis.bean.Plot;
import com.ari.mybatis.bean.Result;
import com.ari.mybatis.dao.PlotMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "地块管理相关的接口")
public class PlotController {
	
	@Resource
	PlotMapper plotMapper;
	@GetMapping("/plot")
	@ApiOperation(value="查找员工信息")
	/*
	 *根据id查找地块
	 * */
	public Object selectPlot(int id){
		Plot plot = plotMapper.selectByPrimaryKey(id);
		return new Result(plot);
	}
	
	@PostMapping("/updateplot")
	@ApiOperation(value="编辑地块信息")
	public Object handleUpdateComInfo(@RequestParam("plotFile")MultipartFile file,Plot plot ,HttpServletRequest request) throws IllegalStateException, IOException{
		//图片文件上传
		String path = request.getServletContext().getRealPath("/upload");
		 String fileName = file.getOriginalFilename();
	        File dir = new File(path,fileName);
	        if(!dir.exists()){
	            dir.mkdirs();
	        }
	        System.out.println("上传成功");
	        file.transferTo(dir);
	        plot.setId(1);
	        plot.setImg("http://localhost:8080/upload/"+fileName);
	        plotMapper.updateByPrimaryKey(plot);
		return new Result(plot);
	}
	
	@PostMapping("/addplot")
	@ApiOperation(value="添加地块信息")
	public Object addplot(@RequestParam("plotFile")MultipartFile file,Plot plot ,HttpServletRequest request) throws IllegalStateException, IOException{
		//图片文件上传
				String path = request.getServletContext().getRealPath("/upload");
				 String fileName = file.getOriginalFilename();
			        File dir = new File(path,fileName);
			        if(!dir.exists()){
			            dir.mkdirs();
			        }
			        System.out.println("上传成功");
			        file.transferTo(dir);

//				System.out.println("update--------"+fileName);
			        plot.setImg("http://localhost:8080/upload/"+fileName);
			        plotMapper.insert(plot);
				return new Result(plot);
	}
	@GetMapping("/deleteplot")
	@ApiOperation(value="删除地块信息")
	public Object deleteCompany (int id){

		if(plotMapper.deleteByPrimaryKey(id) == 1){
			return new Result();
		}
		else {
			return new Result("error");
		}
	}

}
