CREATE TABLE `lecture` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	`user_id` BIGINT(20) NOT NULL COMMENT '讲座作者，关联user.id',
	`subject` VARCHAR(64) NULL DEFAULT NULL COMMENT '讲座主题',
	`content` VARCHAR(1000) NULL DEFAULT NULL COMMENT '讲座内容',
	`latitude` VARCHAR(32) NULL DEFAULT NULL COMMENT '讲座地址纬度',
	`longitude` VARCHAR(32) NULL DEFAULT NULL COMMENT '讲座地址经度',
	`start_time` DATETIME NULL DEFAULT NULL COMMENT '讲座开始时间',
	`end_time` DATETIME NULL DEFAULT NULL COMMENT '讲座结束时间',
	`lower_price` DECIMAL(10,2) NULL DEFAULT NULL COMMENT '讲座最低价格',
	`upper_price` DECIMAL(10,2) NULL DEFAULT NULL COMMENT '讲座最高价格',
	`max_join` INT(11) NULL DEFAULT NULL COMMENT '讲座最多报名人数',
	`status` TINYINT(1) NULL DEFAULT NULL COMMENT '讲座状态，0报名中1进行中2已结束',
	`is_deleted` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '删除字段，0未删除1已删除',
	`create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY (`id`)
)
COMMENT='讲座表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
