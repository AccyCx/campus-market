package com.accycx.backend.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "测试模块", description = "用于测试环境是否跑通")
@RestController
@RequestMapping("/test")
public class HelloController {

    @Operation(summary = "打招呼接口 V3.0", description = "返回 Hello World,这是1自动化测试的版本")
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello啊, Campus Market!";
    }
}