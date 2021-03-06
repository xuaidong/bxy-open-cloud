package com.github.bxy.msgs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.bxy.msgs.dao.MsgsCenterInfoReceiveMapper;
import com.github.bxy.msgs.entity.MsgsCenterInfoReceive;
import com.github.bxy.msgs.service.MsgsCenterInfoReceiveService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 业务实现类
 * 消息中心 接收表
 * 全量数据
 * </p>
 *
 * @author bxy
 * @date 2019-08-01
 */
@Slf4j
@Service
public class MsgsCenterInfoReceiveServiceImpl extends ServiceImpl<MsgsCenterInfoReceiveMapper, MsgsCenterInfoReceive> implements MsgsCenterInfoReceiveService {

}
