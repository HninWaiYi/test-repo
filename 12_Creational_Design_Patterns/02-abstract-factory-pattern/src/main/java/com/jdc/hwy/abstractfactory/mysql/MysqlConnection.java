package com.jdc.hwy.abstractfactory.mysql;

import com.jdc.hwy.abstractfactory.Connection;

public class MysqlConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connect with mysql database.");
	}

}
