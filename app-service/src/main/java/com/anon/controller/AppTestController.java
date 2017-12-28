package com.anon.controller;

import com.anon.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Date:2017/12/28</p>
 * <p>Module:</p>
 * <p>Description: </p>
 * <p>Remark: </p>
 *
 * @author wuxiangbo
 * @version 1.0
 *          <p>------------------------------------------------------------</p>
 *          <p> Change history</p>
 *          <p> Serial number: date:modified person: modification reason:</p>
 */
@Api(description = "app-service测试Controller",basePath = "/app/test")
@RestController
@RequestMapping("/app/test")
public class AppTestController {

    @Value("${temp.config.app.service.name}")
    private String config;
    @Autowired
    private UserService userService;


    /**

     * @return
     */
    @RequestMapping(value = "/appConfigRead",method = RequestMethod.GET)
    @ApiOperation(value="读取app的配置", notes="")
    public String  userConfigRead(@RequestParam(value = "name")String name){
        return "hello" + name + ",app-config is " + config;
    }


    /**

     * @return
     */
    @RequestMapping(value = "/userConfigRead",method = RequestMethod.GET)
    @ApiOperation(value="读取app的配置", notes="")
    public String  getAppConfig(@RequestParam(value = "name")String name){
        return userService.ConnectApp(name);
    }



}
