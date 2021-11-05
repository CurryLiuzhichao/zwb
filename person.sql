/*
 Navicat Premium Data Transfer

 Source Server         : lzc
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : person

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 05/11/2021 08:05:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for area_info
-- ----------------------------
DROP TABLE IF EXISTS `area_info`;
CREATE TABLE `area_info`  (
  `area_id` int NOT NULL COMMENT '地区编号',
  `area_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地区名称',
  PRIMARY KEY (`area_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of area_info
-- ----------------------------
INSERT INTO `area_info` VALUES (456000, '郑州');
INSERT INTO `area_info` VALUES (456250, '浚县');

-- ----------------------------
-- Table structure for person_info
-- ----------------------------
DROP TABLE IF EXISTS `person_info`;
CREATE TABLE `person_info`  (
  `person_id` int NOT NULL AUTO_INCREMENT COMMENT '人员编号',
  `person_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '人员名称',
  `person_area_id` int NOT NULL COMMENT '户口所在地id',
  `person_age` int NULL DEFAULT NULL COMMENT '人员年龄',
  `person_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '家庭住址',
  PRIMARY KEY (`person_id`) USING BTREE,
  INDEX `id`(`person_area_id`) USING BTREE,
  CONSTRAINT `id` FOREIGN KEY (`person_area_id`) REFERENCES `area_info` (`area_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person_info
-- ----------------------------
INSERT INTO `person_info` VALUES (1, '张文博', 456000, 24, '河南省鹤壁市浚县');
INSERT INTO `person_info` VALUES (2, '张文博', 456000, 21, '河南省郑州');
INSERT INTO `person_info` VALUES (4, '刘智超', 456000, 24, '河南省鹤壁市');

SET FOREIGN_KEY_CHECKS = 1;
