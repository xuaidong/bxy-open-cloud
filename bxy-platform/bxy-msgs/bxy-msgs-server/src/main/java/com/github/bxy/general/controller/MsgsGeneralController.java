package com.github.bxy.general.controller;

import com.github.bxy.base.BaseEnum;
import com.github.bxy.base.R;
import com.github.bxy.msgs.enumeration.MsgsBizType;
import com.github.bxy.msgs.enumeration.MsgsCenterType;
import com.github.bxy.sms.enumeration.ProviderType;
import com.github.bxy.sms.enumeration.SendStatus;
import com.github.bxy.sms.enumeration.SourceType;
import com.github.bxy.sms.enumeration.TaskStatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用 控制器
 *
 * @author bxy
 * @date 2019/07/25
 */
@Slf4j
@RestController
@Api(value = "Common", tags = "公共Controller")
public class MsgsGeneralController {

    @ApiOperation(value = "获取当前系统所有枚举", notes = "获取当前系统所有枚举")
    @GetMapping("/enums")
    public R<Map<String, Map<String, String>>> enums() {
        Map<String, Map<String, String>> map = new HashMap<>(6);
        map.put(MsgsCenterType.class.getSimpleName(), BaseEnum.getMap(MsgsCenterType.values()));
        map.put(MsgsBizType.class.getSimpleName(), BaseEnum.getMap(MsgsBizType.values()));
        map.put(ProviderType.class.getSimpleName(), BaseEnum.getMap(ProviderType.values()));
        map.put(SourceType.class.getSimpleName(), BaseEnum.getMap(SourceType.values()));
        map.put(SendStatus.class.getSimpleName(), BaseEnum.getMap(SendStatus.values()));
        map.put(TaskStatus.class.getSimpleName(), BaseEnum.getMap(TaskStatus.values()));
        return R.success(map);
    }


}
