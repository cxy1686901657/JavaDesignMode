package com.qc.designmode.create.builder;

/**
 * 把产品和创建过程封装在一起了 增加了耦合性
 *
 */
public abstract class AbstractHouse {
	
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	
	public void build() {
		buildBasic();
		buildWalls();
		roofed();
	}
	
}
