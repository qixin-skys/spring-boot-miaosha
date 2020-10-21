package com.miaosha.agent.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author lr-qixin
 * */

@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsVo extends Goods {
	private Double miaoshaPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
	private Integer status;
	private Integer seconds;
}
