package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Map test(@RequestParam(value = "str", required = false) String str) {

        Map map = new HashMap<>();

        map.put("code", 200);
        map.put("msg", str);
        map.put("data", System.currentTimeMillis());

        return map;
    }

}
