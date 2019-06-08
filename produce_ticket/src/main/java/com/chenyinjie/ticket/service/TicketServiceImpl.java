package com.chenyinjie.ticket.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/8 16:32
 * 陈银杰专属测试
 */
@Service
@Component
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《老子天下无敌》";
    }

}
