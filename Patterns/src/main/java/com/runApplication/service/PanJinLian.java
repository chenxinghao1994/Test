package com.runApplication.service;

import com.runApplication.client.KindWomen;

/**
 * 代理模式
 * @author ASUS
 */
public class PanJinLian implements KindWomen{

	public void makeEyesWithMan() {
		System.out.println("潘金莲抛媚眼");
	}
	
	
	public void happyWithMan() {
		System.out.println("潘金莲在和男人做那个.....");
	}

}
