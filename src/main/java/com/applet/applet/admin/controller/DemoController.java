package com.applet.applet.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: RenZiHan
 * @Date: 2019-06-28 15:49
 * @Description: 测试类
 */
@Controller
@Api(value = "/",description = "测试接口")
public class DemoController {

    @RequestMapping("demoApi")
    @ApiOperation(value = "测试方法",httpMethod = "GET")
    public String demoApi(ModelMap modelMap){
        modelMap.put("test","测试");
        System.out.println("测试");
        return "index";
    }
}
