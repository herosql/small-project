package com.sqlhero.small.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sqlhero.small.SmallApplication;
import com.sqlhero.small.entity.SysMessage;
import com.sqlhero.small.service.ISysMessageService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest(classes = SmallApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class SysMessageServiceImplTest {

    @Autowired
    private ISysMessageService sysMessageService;

    @Test
    @Transactional
    @Rollback
    public void saveData() {
        SysMessage sysMessage = new SysMessage();
        sysMessage.setContent("来一杯");
        sysMessage.setPhone("15000000000");
        sysMessage.setSendTime(new Date());
        sysMessageService.save(sysMessage);

        SysMessage message = sysMessageService.getOne(new LambdaQueryWrapper<SysMessage>()
                .eq(SysMessage::getPhone, sysMessage.getPhone()));
        assertEquals(message.getContent(), sysMessage.getContent());
    }

}
