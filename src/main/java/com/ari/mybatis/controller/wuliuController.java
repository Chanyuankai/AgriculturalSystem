package com.ari.mybatis.controller;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ari.mybatis.bean.Result;
import com.ari.mybatis.bean.wuliu;
import com.ari.mybatis.dao.UserInfoMapper;
import com.ari.mybatis.dao.wuliuMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "物流管理相关的接口")
public class wuliuController {
	@Resource
	wuliuMapper wuliuMapper;

	@PostMapping("/addWuLiu")
	@ApiOperation(value="添加物流")
	public Result handleaddWuLiu(wuliu w){
		wuliuMapper.insert(w);
		return new Result(w);
	}
	@PostMapping("/deleteWuLiu")
	@ApiOperation(value="删除物流")
	public Result handleaddWuLiu1(int id){
		wuliuMapper.deleteByPrimaryKey(id);
		return new Result(id);
	}	@PostMapping("/updateWuLiu")
	@ApiOperation(value="修改物流")
	public Result handleaddWuLiu2(wuliu w){
		wuliuMapper.updateByPrimaryKey(w);
		return new Result(w);
	}	@PostMapping("/selectWuLiu")
	@ApiOperation(value="查询物流")
	public Result handleaddWuLiu3(int id){
		wuliuMapper.selectByPrimaryKey(id);
		return new Result(id);
	}

}
