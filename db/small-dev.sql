/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3002
Source Server Version : 50730
Source Host           : 127.0.0.1:3002
Source Database       : small-dev

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2020-08-20 17:38:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_sms
-- ----------------------------
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

-- ----------------------------
-- Records of sys_sms
-- ----------------------------
