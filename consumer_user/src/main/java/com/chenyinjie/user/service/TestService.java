package com.chenyinjie.user.service;

import com.chenyinjie.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/6/8 16:58
 * 陈银杰专属测试
 */
@Service
public class TestService {

    @Reference
    private TicketService ticketService;


    public String getTicket(){
        return ticketService.getTicket();
    }
}
