package com.ari.mybatis.controller;
import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ari.mybatis.bean.Good;
import com.ari.mybatis.bean.Result;
import com.ari.mybatis.bean.UserInfo;
import com.ari.mybatis.dao.GoodMapper;
import com.ari.mybatis.dao.UserInfoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "商品管理的接口")
public class GoosController {
	@Resource
	GoodMapper goodmaper;

//	@PostMapping("/addGood")
//	@ApiOperation(value="新增商品")
//	public Result handleAddGood(Good good){
//		goodmaper.insert(good);
//		Result result = new Result("插入成功");
//		result.setData(good);
//		return result;
//	}
	
	@PostMapping("/selectGood")
	@ApiOperation(value="查找商品")
	public Result handleselectGood(int id){
		goodmaper.selectByPrimaryKey(id);
		Result result = new Result("查找成功");
		result.setData(id);
		return result;
	}
	
	@PostMapping("/updatetGood")
	@ApiOperation(value="修改商品")
	public Result handleupdatetGood(Good id){
		goodmaper.updateByPrimaryKey(id);
		Result result = new Result("修改成功");
		result.setData(id);
		return result;
	}
	
	@PostMapping("/deleteGood")
	@ApiOperation(value="删除商品")
	public Result handledeleteGood(int id){
		goodmaper.deleteByPrimaryKey(id);
		Result result = new Result("删除成功");
		result.setData(id);
		return result;
	}
	
	@PostMapping("/addGood")
	 @ApiOperation(value="添加商品信息")
	 public Object addGood(@RequestParam("GoodFile")MultipartFile file,Good good,HttpServletRequest request) throws IllegalStateException, IOException{
	  //图片文件上传
	    String path = request.getServletContext().getRealPath("/upload");
	     String fileName = file.getOriginalFilename();
	           File dir = new File(path,fileName);
	           if(!dir.exists()){
	               dir.mkdirs();
	           }
	           System.out.println("上传成功");
	           file.transferTo(dir);

	           good.setImg("http://localhost:8080/upload/"+fileName);
	           goodmaper.insert(good);
	    return new Result(good);
	 }
	
	


}
