/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : tmall

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2016-05-22 23:54:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_buy_record`
-- ----------------------------
DROP TABLE IF EXISTS `tb_buy_record`;
CREATE TABLE `tb_buy_record` (
  `record_id` varchar(32) NOT NULL DEFAULT '',
  `user_id` varchar(32) DEFAULT NULL,
  `product_id` varchar(32) DEFAULT NULL,
  `order_number` varchar(32) DEFAULT NULL COMMENT '订单编号',
  `product_name` varchar(32) DEFAULT NULL COMMENT '商品名称',
  `product_image` varchar(32) DEFAULT NULL COMMENT '商品缩略图',
  `price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `amount` decimal(10,2) DEFAULT NULL COMMENT '数量',
  `status` varchar(10) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_buy_record
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_evaluate`
-- ----------------------------
DROP TABLE IF EXISTS `tb_evaluate`;
CREATE TABLE `tb_evaluate` (
  `evaluate_id` varchar(32) NOT NULL DEFAULT '',
  `user_id` varchar(32) DEFAULT NULL,
  `order_number` varchar(32) DEFAULT NULL,
  `spec` varchar(32) DEFAULT NULL,
  `score` decimal(10,2) DEFAULT NULL,
  `distribution_fee` decimal(10,2) DEFAULT NULL,
  `product_evaluate` varchar(500) DEFAULT NULL,
  `service_evaluate` varchar(500) DEFAULT NULL,
  `product_eval_level` varchar(10) DEFAULT NULL,
  `service_eval_level` varchar(10) DEFAULT NULL,
  `eval_img_id` varchar(32) DEFAULT NULL,
  `user_image` varchar(32) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`evaluate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_evaluate
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_eval_image`
-- ----------------------------
DROP TABLE IF EXISTS `tb_eval_image`;
CREATE TABLE `tb_eval_image` (
  `evl_img_id` varchar(32) NOT NULL DEFAULT '',
  `image_url` varchar(64) DEFAULT NULL,
  `image_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`evl_img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_eval_image
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_message`
-- ----------------------------
DROP TABLE IF EXISTS `tb_message`;
CREATE TABLE `tb_message` (
  `message_id` varchar(32) NOT NULL DEFAULT '',
  `user_id` varchar(32) DEFAULT NULL,
  `title` varchar(64) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_message
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_order`
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order` (
  `order_id` varchar(32) NOT NULL DEFAULT '',
  `user_id` varchar(32) DEFAULT NULL,
  `order_number` varchar(32) DEFAULT NULL COMMENT '订单编号',
  `order_status` varchar(10) DEFAULT NULL COMMENT '订单状态',
  `product_name` varchar(32) DEFAULT NULL COMMENT '商品名称',
  `product_image` varchar(32) DEFAULT NULL COMMENT '商品缩略图',
  `spec` varchar(32) DEFAULT NULL COMMENT '规格',
  `price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `total_money` decimal(10,2) DEFAULT NULL COMMENT '总价',
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_order
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_product`
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product` (
  `product_id` varchar(32) NOT NULL DEFAULT '',
  `product_numbre` varchar(32) DEFAULT NULL COMMENT '商品编号',
  `content` text COMMENT '商品内容',
  `product_name` varchar(32) DEFAULT NULL COMMENT '商品名称',
  `image_url` varchar(64) DEFAULT NULL COMMENT '商品URL',
  `price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `discount_price` decimal(10,2) DEFAULT NULL COMMENT '折扣价',
  `discount` decimal(10,2) DEFAULT NULL COMMENT '折扣',
  `is_grounding` varchar(10) DEFAULT NULL COMMENT '是否上架',
  `category_id` varchar(32) DEFAULT NULL COMMENT '一级分类',
  `categroy_second_id` varchar(32) DEFAULT NULL COMMENT '二级分类',
  `categroy_third_id` varchar(32) DEFAULT NULL COMMENT '三级分类',
  `evaluate_id` varchar(32) DEFAULT NULL COMMENT '评价id',
  `brand_name` varchar(20) DEFAULT NULL COMMENT '品牌名称',
  `distribution_fee` decimal(10,2) DEFAULT NULL COMMENT '配送费',
  `spec` varchar(32) DEFAULT NULL COMMENT '规格',
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_product
-- ----------------------------
INSERT INTO `tb_product` VALUES ('1', '12', '12', '12', '12', '12.00', '121.00', '121.00', '12121', '2121', null, null, null, null, null, null, null, null);
INSERT INTO `tb_product` VALUES ('2', '123', '123', '123', 'http://www.baidu.com', '123.00', '12.00', '123.00', '123', '123', '123', null, null, null, null, null, null, null);
INSERT INTO `tb_product` VALUES ('3', '23', '23', '23', '23', '23.00', '32.00', '23.00', '23', '23', '23', null, null, null, null, null, null, null);
INSERT INTO `tb_product` VALUES ('4', '023423', null, '234', '324', null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `tb_product_brand`
-- ----------------------------
DROP TABLE IF EXISTS `tb_product_brand`;
CREATE TABLE `tb_product_brand` (
  `brand_id` varchar(32) NOT NULL DEFAULT '',
  `brand_name` varchar(20) DEFAULT NULL,
  `brand_logo` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_product_brand
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_product_one_category`
-- ----------------------------
DROP TABLE IF EXISTS `tb_product_one_category`;
CREATE TABLE `tb_product_one_category` (
  `category_id` varchar(32) NOT NULL DEFAULT '' COMMENT '一级分类id',
  `categroy_second_id` varchar(32) DEFAULT NULL COMMENT '二级分类id',
  `category_name` varchar(20) DEFAULT NULL COMMENT '分类名称',
  `level` varchar(10) DEFAULT NULL COMMENT '级别',
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_product_one_category
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_product_second_category`
-- ----------------------------
DROP TABLE IF EXISTS `tb_product_second_category`;
CREATE TABLE `tb_product_second_category` (
  `category_second_id` varchar(32) NOT NULL,
  `category_third_id` varchar(32) DEFAULT NULL,
  `category_name` varchar(20) DEFAULT NULL,
  `level` varchar(10) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`category_second_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_product_second_category
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_product_third_category`
-- ----------------------------
DROP TABLE IF EXISTS `tb_product_third_category`;
CREATE TABLE `tb_product_third_category` (
  `category_third_id` varchar(32) NOT NULL DEFAULT '',
  `category_name` varchar(20) DEFAULT NULL,
  `level` varchar(10) DEFAULT NULL,
  `brand_id` varchar(32) DEFAULT NULL COMMENT '品牌id',
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`category_third_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_product_third_category
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_receipt_address`
-- ----------------------------
DROP TABLE IF EXISTS `tb_receipt_address`;
CREATE TABLE `tb_receipt_address` (
  `address_id` varchar(32) NOT NULL DEFAULT '',
  `user_id` varchar(32) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL COMMENT '省份',
  `city` varchar(20) DEFAULT NULL COMMENT '城市',
  `address` varchar(64) DEFAULT NULL COMMENT '详细地址',
  `post_code` varchar(12) DEFAULT NULL COMMENT '邮编',
  `reveiver` varchar(12) DEFAULT NULL COMMENT '收件人',
  `phone` varchar(11) DEFAULT NULL COMMENT '收件人电话',
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_receipt_address
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_shopping_cart`
-- ----------------------------
DROP TABLE IF EXISTS `tb_shopping_cart`;
CREATE TABLE `tb_shopping_cart` (
  `cart_id` varchar(32) NOT NULL DEFAULT '',
  `user_id` varchar(32) DEFAULT NULL,
  `product_id` varchar(32) DEFAULT NULL,
  `spec` varchar(32) DEFAULT NULL COMMENT '规格',
  `amount` decimal(10,2) DEFAULT NULL COMMENT '数量',
  `price` decimal(10,2) DEFAULT NULL COMMENT '单价',
  `total_money` decimal(10,2) DEFAULT NULL COMMENT '总价',
  `create_time` timestamp NULL DEFAULT NULL,
  `create_user` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`cart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_shopping_cart
-- ----------------------------

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_id` varchar(32) NOT NULL,
  `login_name` varchar(12) DEFAULT NULL COMMENT '用户登录名',
  `user_type` varchar(10) DEFAULT NULL COMMENT '用户类型',
  `password` varchar(32) DEFAULT NULL COMMENT '用户登录密码',
  `user_name` varchar(12) DEFAULT NULL COMMENT '用户名',
  `head_image` varchar(32) DEFAULT NULL COMMENT '用户头像',
  `gender` varchar(10) DEFAULT NULL COMMENT '性别',
  `age` varchar(3) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机',
  `email` varchar(20) DEFAULT NULL COMMENT '邮箱',
  `flag` varchar(10) DEFAULT NULL COMMENT '用户状态设置标识',
  `org_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
