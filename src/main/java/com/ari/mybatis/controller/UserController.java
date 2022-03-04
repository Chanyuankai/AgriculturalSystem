package com.ari.mybatis.controller;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ari.mybatis.bean.UserInfo;
import com.ari.mybatis.dao.UserInfoMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "测试接口", tags = "用户管理相关的接口")
public class UserController {
	@Resource
	UserInfoMapper userInfoMapper;
	

	@RequestMapping("/login")
	@ApiOperation(value="输入登录信息")
	public String handleLogin(String useraccount,String userpassword){
		UserInfo user = userInfoMapper.login(useraccount, userpassword);
		if(user!=null){
			System.out.println("登录成功");
			return "index";
		}
		else
			return "login";
	}


}
