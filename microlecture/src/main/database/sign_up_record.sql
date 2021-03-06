CREATE TABLE `sign_up_record` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	`user_id` BIGINT(20) NOT NULL COMMENT '关联user.id',
	`lecture_id` BIGINT(20) NOT NULL COMMENT '关联lecture.id',
	`amount` DECIMAL(10,2) NOT NULL COMMENT '报名实付金额',
	`status` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '报名状态，0待审核1待付款2报名成功',
	`is_deleted` TINYINT(1) NOT NULL DEFAULT '0' COMMENT '删除字段，0未删除1已删除',
	`create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY (`id`)
)
COMMENT='活动报名记录表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
;
