package com.ari.mybatis.controller;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ari.mybatis.bean.Good;
import com.ari.mybatis.bean.OrderList;
import com.ari.mybatis.bean.Result;
import com.ari.mybatis.bean.UserInfo;
import com.ari.mybatis.dao.OrderListMapper;
import com.ari.mybatis.dao.UserInfoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "订单相关的接口")
public class OrderListController {
	@Resource
	OrderListMapper orderlistmapper;

	@PostMapping("/addOrderList")
	@ApiOperation(value="新增订单")
	public Result addOrderList(OrderList orderlist){
		orderlistmapper.insert(orderlist);
		Result result = new Result("新增成功");
		result.setData(orderlist);
		return result;
	}
	@PostMapping("/selectOrderList")
	@ApiOperation(value="查找订单")
	public Result selectOrderList(int id){
		orderlistmapper.selectByPrimaryKey(id);
		Result result = new Result("查找成功");
		result.setData(id);
		return result;
	}
	
	@PostMapping("/updatetOrderList")
	@ApiOperation(value="修改商品")
	public Result updatetOrderList(Good id){
		orderlistmapper.updateByPrimaryKey(id);
		Result result = new Result("修改成功");
		result.setData(id);
		return result;
	}
	
	@PostMapping("/deleteOrderList")
	@ApiOperation(value="删除商品")
	public Result handledeleteGood(int id){
		orderlistmapper.deleteByPrimaryKey(id);
		Result result = new Result("删除成功");
		result.setData(id);
		return result;
	}


}
