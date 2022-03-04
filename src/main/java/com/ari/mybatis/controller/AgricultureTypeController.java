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
import com.ari.mybatis.bean.agriculturetype;
import com.ari.mybatis.dao.GoodMapper;
import com.ari.mybatis.dao.UserInfoMapper;
import com.ari.mybatis.dao.agriculturetypeMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "农产品种类管理的接口")
public class AgricultureTypeController {
	@Resource
	agriculturetypeMapper agriculturetypeMapper;


	
	@PostMapping("/selectagriculturetype")
	@ApiOperation(value="查找种类")
	public Result selectagriculturetype(int id){
		agriculturetypeMapper.selectByPrimaryKey(id);
		Result result = new Result("查找成功");
		result.setData(id);
		return result;
	}
	
	@PostMapping("/updatetagriculturetype")
	@ApiOperation(value="修改种类")
	public Result updatetagriculturetype(agriculturetype id){
		agriculturetypeMapper.updateByPrimaryKey(id);
		Result result = new Result("修改成功");
		result.setData(id);
		return result;
	}
	
	@PostMapping("/deleteagriculturetype")
	@ApiOperation(value="删除种类")
	public Result deleteagriculturetype(int id){
		agriculturetypeMapper.deleteByPrimaryKey(id);
		Result result = new Result("删除成功");
		result.setData(id);
		return result;
	}
	

	@PostMapping("/addagriculturetype")
	@ApiOperation(value="添加种类信息")
	public Result addagriculturetype(agriculturetype agriculturetype){
		agriculturetypeMapper.insert(agriculturetype);
		Result result = new Result("插入成功");
		result.setData(agriculturetype);
		return result;
	}
	
	


}
