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
import com.ari.mybatis.bean.Equipment;
import com.ari.mybatis.bean.Result;
import com.ari.mybatis.dao.AgmachineryMapper;
import com.ari.mybatis.dao.CompanyMapper;
import com.ari.mybatis.dao.EquipmentMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "设备管理相关的接口")
public class EquipmentController {
	
	@Resource
	EquipmentMapper equipmentMapper;
	
	@GetMapping("/equipment")
	@ApiOperation(value="查找设备信息")
	/*
	 *根据id查找设备
	 * */
	public Object selectagmachinery(int id){
		Equipment  equipment = equipmentMapper.selectByPrimaryKey(id);
		return new Result(equipment);
	}
	
	
	@PostMapping("/addequipment")
	@ApiOperation(value="添加设备信息")
	public Object addEmployee(Equipment equipment ){		
		equipmentMapper.insert(equipment);
		return new Result(equipment);
	}
	@GetMapping("/deleteequipment")
	@ApiOperation(value="删除设备信息")
	public Object deleteequipment (int id){
		if(equipmentMapper.deleteByPrimaryKey(id) == 1){
			return new Result();
		}
		else {
			return new Result("error");
		}
	}
	@PostMapping("/updateequipment")
	@ApiOperation(value="编辑设备信息")
	public Object handleUpdateequipment(Equipment equipment){		
		equipmentMapper.updateByPrimaryKey(equipment);
		return new Result(equipment);
	}
	

}
