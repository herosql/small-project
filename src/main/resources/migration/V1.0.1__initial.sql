DROP TABLE IF EXISTS `sys_sms`;
CREATE TABLE `sys_sms` (
  `id` varchar(32) NOT NULL COMMENT '主键',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) DEFAULT NULL COMMENT '修改者',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `send_time` datetime DEFAULT NULL COMMENT '发送时间',
  `phone` varchar(30) DEFAULT NULL COMMENT '电话号码',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
ALTER TABLE `sys_sms` ADD COLUMN `test_column`  int(10) NULL DEFAULT NULL COMMENT '测试状态';
