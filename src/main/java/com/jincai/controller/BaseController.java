package com.jincai.controller;

import com.jincai.model.ReturnResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 基础数据模块查询
 *
 * @author LiuBing
 * @date 2018/9/12 10:23
 */
@RestController
@Api(value = "数据接口", description = "数据接口")
@RequestMapping("/base")
public class BaseController {

    @ApiOperation(value = "得到数据")
    @PostMapping("/getData")
    public String getData(@RequestBody ReturnResult returnResult){


        return "";
    }
}
