package com.github.bxy.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.bxy.sms.entity.SmsTemplate;

/**
 * <p>
 * 业务接口
 * 短信模板
 * </p>
 *
 * @author bxy
 * @date 2019-08-01
 */
public interface SmsTemplateService extends IService<SmsTemplate> {
    /**
     * 保存模板，并且将模板内容解析成json格式
     *
     * @param smsTemplate
     * @return
     * @author bxy
     * @date 2019-05-16 21:13
     */
    void saveTemplate(SmsTemplate smsTemplate);

    /**
     * 修改
     *
     * @param smsTemplate
     */
    void updateTemplate(SmsTemplate smsTemplate);
}
