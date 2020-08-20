package com.sqlhero.small.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sqlhero.small.entity.SysMessage;
import com.sqlhero.small.mapper.SysMessageMapper;
import com.sqlhero.small.service.ISysMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 业务实现
 * @date 2020/8/20 17:10
 * @author sqlhero
 * @version 1.0
 * */
@Service
public class SysMessageServiceImpl extends ServiceImpl<SysMessageMapper, SysMessage> implements ISysMessageService {

}
