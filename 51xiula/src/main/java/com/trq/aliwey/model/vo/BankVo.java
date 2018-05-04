package com.trq.aliwey.model.vo;

import java.util.List;

import javolution.util.FastList;

public class BankVo {
	private Integer id;
	private String name;
	private String value;

	public BankVo() {
		super();
	}
	public BankVo(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public BankVo(Integer id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public BankVo(String value, String name) {
		super();
		this.value = value;
		this.name = name;
	}

	public static List<BankVo> getBankList() {
		List<BankVo> kvs = FastList.newInstance();
		kvs.add(new BankVo("1025", "中国工商银行"));
		kvs.add(new BankVo("1051", "中国建设银行"));
		kvs.add(new BankVo("104", "中国银行"));
		kvs.add(new BankVo("103", "中国农业银行"));
		kvs.add(new BankVo("3407", "交通银行"));
		kvs.add(new BankVo("3230", "中国邮政储蓄银行"));
		kvs.add(new BankVo("3080", "招商银行"));
		kvs.add(new BankVo("313", "中信银行"));
		kvs.add(new BankVo("314", "上海浦东发展银行"));
		kvs.add(new BankVo("309", "兴业银行"));
		kvs.add(new BankVo("305", "中国民生银行"));
		kvs.add(new BankVo("312", "光大银行"));
		kvs.add(new BankVo("307", "平安银行"));
		kvs.add(new BankVo("311", "华夏银行"));
		kvs.add(new BankVo("310", "北京银行"));
		kvs.add(new BankVo("3061", "广东发展银行"));
		kvs.add(new BankVo("326", "上海银行"));
		kvs.add(new BankVo("335", "北京农商行"));
		kvs.add(new BankVo("342", "重庆农商银行"));
		kvs.add(new BankVo("343", "上海农商行"));
		kvs.add(new BankVo("316", "南京银行"));
		kvs.add(new BankVo("302", "宁波银行"));
		kvs.add(new BankVo("324", "杭州银行"));
		kvs.add(new BankVo("336", "成都银行"));
		kvs.add(new BankVo("3341", "青岛银行"));
		kvs.add(new BankVo("344", "恒丰银行"));
		return kvs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
