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

import com.ari.mybatis.bean.Company;
import com.ari.mybatis.bean.Employee;
import com.ari.mybatis.bean.Result;
import com.ari.mybatis.dao.EmployeeMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "员工管理相关的接口")
public class EmployeeController {
	
	@Resource
	EmployeeMapper employeeMapper;
	@GetMapping("/employee")
	@ApiOperation(value="查找员工信息")
	/*
	 *根据id查找公司
	 * */
	public Object selectEmployee(int id){
		Employee employee = employeeMapper.selectByPrimaryKey(id);
		return new Result(employee);
	}
	
	@PostMapping("/updateemploy")
	@ApiOperation(value="编辑公司信息")
	public Object handleUpdateComInfo(@RequestParam("employFile")MultipartFile file,Employee employee ,HttpServletRequest request) throws IllegalStateException, IOException{
		//图片文件上传
		String path = request.getServletContext().getRealPath("/upload");
		 String fileName = file.getOriginalFilename();
	        File dir = new File(path,fileName);
	        if(!dir.exists()){
	            dir.mkdirs();
	        }
	        System.out.println("上传成功");
	        file.transferTo(dir);
	        employee.setId(1);
	        employee.setImg("http://localhost:8080/upload/"+fileName);
	        employeeMapper.updateByPrimaryKey(employee);
		return new Result(employee);
	}
	
	@PostMapping("/addEemployee")
	@ApiOperation(value="添加公司信息")
	public Object addEmployee(@RequestParam("employFile")MultipartFile file,Employee employee ,HttpServletRequest request) throws IllegalStateException, IOException{
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
			      employee.setImg("http://localhost:8080/upload/"+fileName);
			      employeeMapper.insert(employee);
				return new Result(employee);
	}
	@GetMapping("/deleteemployee")
	@ApiOperation(value="删除员工信息")
	public Object deleteCompany (int id){

		if(employeeMapper.deleteByPrimaryKey(id) == 1){
			return new Result();
		}
		else {
			return new Result("error");
		}
	}

}
