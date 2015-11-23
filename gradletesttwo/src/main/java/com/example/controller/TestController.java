package com.example.controller;



import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by arahansa on 2015-11-04.
 */
@Slf4j
@Controller
@RequestMapping(produces = "application/json;charset=utf-8")
public class TestController {

    @RequestMapping(value="/test.do")
    @ResponseBody
    public String testDo(@RequestBody TestUser testUser){
        log.debug(" connect to test.do ");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", testUser);
        return jsonObject.toString();
    }
    
    
    @RequestMapping("/test2.do")
    @ResponseBody
    public String test2(){
    	TestUser userInformationVO = new TestUser();
        userInformationVO.setSecId("arahansa");
        userInformationVO.setPasswd("1234");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", userInformationVO);
        return jsonObject.toString();
    }

    @RequestMapping("/test3.do")
    @ResponseBody
    public String test3(String secId, String passwd){
    	TestUser userInformationVO = new TestUser();
        userInformationVO.setSecId(secId);
        userInformationVO.setPasswd(passwd);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", userInformationVO);
        return jsonObject.toString();
    }
    
    
}
