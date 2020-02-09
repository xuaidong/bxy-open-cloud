package com.github.bxy.authority.api.hystrix;

import java.util.Map;

import com.github.bxy.authority.api.AuthorityGeneralApi;
import com.github.bxy.base.R;

import org.springframework.stereotype.Component;

/**
 * 查询通用数据
 *
 * @author bxy
 * @date 2019/07/26
 */
@Component
public class AuthorityGeneralApiFallback implements AuthorityGeneralApi {
    @Override
    public R<Map<String, Map<String, String>>> enums() {
        return R.timeout();
    }
}
