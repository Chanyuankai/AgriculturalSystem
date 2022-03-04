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
import com.ari.mybatis.bean.Result;
import com.ari.mybatis.dao.CompanyMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "公司管理相关的接口")
public class CompanyController {
	
	@Resource
	CompanyMapper companyMapper;
	
	@PostMapping("/updatecominfo")
	@ApiOperation(value="编辑公司信息")
	public Object handleUpdateComInfo(@RequestParam("comIconFile")MultipartFile file,Company company ,HttpServletRequest request) throws IllegalStateException, IOException{
		//图片文件上传
		String path = request.getServletContext().getRealPath("/upload");
		 String fileName = file.getOriginalFilename();
	        File dir = new File(path,fileName);
	        if(!dir.exists()){
	            dir.mkdirs();
	        }
	        System.out.println("上传成功");
	        file.transferTo(dir);
	        company.setId(1);
	        company.setImg("http://localhost:8080/upload/"+fileName);
		companyMapper.updateByPrimaryKey(company);
		return new Result(company);
	}
	

}
