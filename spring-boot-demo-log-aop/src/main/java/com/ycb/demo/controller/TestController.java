package com.ycb.demo.controller;

import cn.hutool.core.lang.Dict;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-05 11:10
 */
@RestController
@Slf4j
public class TestController {
    /**
     * 测试方法
     *
     * @param who 测试参数
     * @return {@link Dict}
     */
    @GetMapping("/test")
    public Dict test(String who){
        return Dict.create().set("who", StrUtil.isBlank(who) ? "me" : who);
    }

    /**
     *  测试post json方法
     * @param map 请求的json参数
     * @return {@link Dict}
     */
    @PostMapping("/testJson")
    public Dict testJson(@RequestBody Map<String,Object> map){
        final String str = JSONUtil.toJsonStr(map);
        log.info(str);
        return Dict.create().set("json",str);
    }

}
