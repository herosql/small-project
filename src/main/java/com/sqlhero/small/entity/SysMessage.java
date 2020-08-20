package com.sqlhero.small.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.sqlhero.small.commit.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

/**
 * 实体
 * @date 2020/8/20 17:10
 * @author sqlhero
 * @version 1.0
 * */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_sms")
public class SysMessage extends BaseEntity {

	/**
	 * 发送时间
	 * */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private java.util.Date sendTime;

	/**
	 * 电话号码
	 * */
	private java.lang.String phone;

	/**
	 * 发送内容
	 * */
	private java.lang.String content;
}
