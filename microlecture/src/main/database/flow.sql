CREATE TABLE `flow` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	`account_id` BIGINT(20) NOT NULL COMMENT '关联account.id',
	`subject` VARCHAR(64) NULL DEFAULT NULL COMMENT '资金流水说明',
	`amount` DECIMAL(10,2) NOT NULL COMMENT '资金大小，大于0收入小于0支出',
	`type` TINYINT(1) NOT NULL COMMENT '资金渠道，0个人账户1微信支付',
	`is_deleted` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '删除字段，0未删除1已删除',
	`create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY (`id`)
)
COMMENT='用户账户收支流水表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
