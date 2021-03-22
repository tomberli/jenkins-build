package com.jenkins.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author mingxing.li02@hand-china.com
 * @Date 2021/3/22 17:11
 */
@RestController
@RequestMapping("/jenkins")
public class TestController {

    /**
     * localhost:8099/jenkins/test
     * @return
     */
    @GetMapping("/test")
    public String test() {
        return "jenkins部署11122";
    }



}
