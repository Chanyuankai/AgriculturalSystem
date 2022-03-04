/*
MySQL Data Transfer
Source Host: localhost
Source Database: agriculturalsystem
Target Host: localhost
Target Database: agriculturalsystem
Date: 2022-3-4 22:55:10
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for agmachinery
-- ----------------------------
DROP TABLE IF EXISTS `agmachinery`;
CREATE TABLE `agmachinery` (
  `id` int(111) NOT NULL AUTO_INCREMENT,
  `type` varchar(222) DEFAULT NULL,
  `name` varchar(111) DEFAULT NULL,
  `model` varchar(111) DEFAULT NULL,
  `people` varchar(111) DEFAULT NULL,
  `date` varchar(111) DEFAULT NULL,
  `img` varchar(111) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for agriculturetype
-- ----------------------------
DROP TABLE IF EXISTS `agriculturetype`;
CREATE TABLE `agriculturetype` (
  `id` int(111) NOT NULL AUTO_INCREMENT,
  `name` varchar(111) NOT NULL,
  `permuyield` varchar(111) NOT NULL,
  `massif` varchar(111) NOT NULL,
  `cycle` varchar(111) NOT NULL,
  `smonth` varchar(111) NOT NULL,
  `emonth` varchar(111) NOT NULL,
  `describe11` varchar(111) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(111) DEFAULT NULL,
  `introduce` varchar(1111) DEFAULT NULL,
  `img` varchar(111) DEFAULT NULL,
  `sina` varchar(111) DEFAULT NULL,
  `tencent` varchar(111) DEFAULT NULL,
  `site` varchar(111) DEFAULT NULL,
  `email` varchar(111) DEFAULT NULL,
  `phone` varchar(111) DEFAULT NULL,
  `linkman` varchar(111) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(111) NOT NULL AUTO_INCREMENT,
  `identitcard` varchar(111) DEFAULT NULL,
  `date` varchar(111) DEFAULT NULL,
  `birthday` varchar(111) DEFAULT NULL,
  `permisson` varchar(111) DEFAULT NULL,
  `gendy` varchar(111) DEFAULT NULL,
  `homesite` varchar(111) DEFAULT NULL,
  `phone` varchar(111) DEFAULT NULL,
  `cardnumber` varchar(111) DEFAULT NULL,
  `img` varchar(111) DEFAULT NULL,
  `remark` varchar(111) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `id` int(111) NOT NULL AUTO_INCREMENT,
  `number` varchar(111) DEFAULT NULL,
  `name` varchar(111) DEFAULT NULL,
  `statue` varchar(111) DEFAULT NULL,
  `building` varchar(111) DEFAULT NULL,
  `principal` varchar(111) DEFAULT NULL,
  `remrk` varchar(111) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good` (
  `id` int(111) NOT NULL AUTO_INCREMENT,
  `name` varchar(111) NOT NULL,
  `sort` varchar(111) NOT NULL,
  `danwei` varchar(111) NOT NULL,
  `prive` varchar(111) NOT NULL,
  `img` varchar(111) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orderlist
-- ----------------------------
DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist` (
  `id` int(111) NOT NULL AUTO_INCREMENT,
  `name` varchar(111) NOT NULL,
  `phone` varchar(111) NOT NULL,
  `Customersource` varchar(111) NOT NULL,
  `Customertype` varchar(111) NOT NULL,
  `Workaddress` varchar(111) NOT NULL,
  `remarks` varchar(111) NOT NULL,
  `Tradename` varchar(111) NOT NULL,
  `Specifications` varchar(111) NOT NULL,
  `Originalprice` varchar(111) NOT NULL,
  `UnitPrice` varchar(111) NOT NULL,
  `num` varchar(111) NOT NULL,
  `subtotal` varchar(111) NOT NULL,
  `stock` varchar(111) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for plot
-- ----------------------------
DROP TABLE IF EXISTS `plot`;
CREATE TABLE `plot` (
  `id` int(111) NOT NULL AUTO_INCREMENT,
  `img` varchar(111) DEFAULT NULL,
  `name` varchar(111) DEFAULT NULL,
  `area` varchar(111) DEFAULT NULL,
  `site` varchar(111) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=124 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userid` int(111) NOT NULL AUTO_INCREMENT,
  `useraccout` varchar(111) DEFAULT NULL,
  `userpassword` varchar(111) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wuliuxinxi
-- ----------------------------
DROP TABLE IF EXISTS `wuliuxinxi`;
CREATE TABLE `wuliuxinxi` (
  `receiver` varchar(255) DEFAULT NULL,
  `contactnumber` varchar(255) DEFAULT NULL,
  `Delivery_tem` varchar(255) DEFAULT NULL,
  `deliveryweight` double DEFAULT NULL,
  `receiveaddress` varchar(255) DEFAULT NULL,
  `Modeofdelivery` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `company` VALUES ('11', '21', '123', '123', '123', '123', '123', '123', '123', '123');
INSERT INTO `good` VALUES ('1', 'hhh', 'jj', '111', '52.0', '');
INSERT INTO `good` VALUES ('122', '1', '1', '1', '1', '');
INSERT INTO `good` VALUES ('123', '123', 'qew', '111111', 'qe', '');
INSERT INTO `good` VALUES ('124', '11', '11', '11', '11', '');
INSERT INTO `good` VALUES ('125', 'czy', 'fg', 'gj', '11133', '');
INSERT INTO `good` VALUES ('126', 'czy', 'fg', 'gj', '11133', '');
INSERT INTO `orderlist` VALUES ('1', '王先生', '13713713137', '网络电商', '普通客户', '江西', '无', '小番茄', '公斤', '10.00', '10.00', '2', '10.00', '100');
INSERT INTO `plot` VALUES ('123', 'http://localhost:8080/upload/img02.png', '123', '123', '123');
INSERT INTO `userinfo` VALUES ('1', '123', '123');
