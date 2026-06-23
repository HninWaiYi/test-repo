package com.jdc.hwy.abstractfactory.mongo;

import com.jdc.hwy.abstractfactory.Connection;

public class MongoConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connect with mongo database.");
	}

}
