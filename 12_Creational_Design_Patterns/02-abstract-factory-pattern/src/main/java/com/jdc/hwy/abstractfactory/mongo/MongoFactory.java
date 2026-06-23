package com.jdc.hwy.abstractfactory.mongo;

import com.jdc.hwy.abstractfactory.Command;
import com.jdc.hwy.abstractfactory.Connection;
import com.jdc.hwy.abstractfactory.DataBaseFactory;

public class MongoFactory implements DataBaseFactory {

	@Override
	public Connection createConnection() {
		return new MongoConnection();
	}

	@Override
	public Command createCommand() {
		return new MongoCommand();
	}

}
