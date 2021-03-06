CREATE TABLE `account` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	`user_id` BIGINT(20) NOT NULL COMMENT '关联user.id',
	`balance` DECIMAL(10,2) NULL DEFAULT NULL COMMENT '账户余额',
	`is_deleted` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '删除字段，0未删除1已删除',
	`create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY (`id`)
)
COMMENT='用户账户表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
