package com.jdc.hwy.abstractfactory.mysql;

import com.jdc.hwy.abstractfactory.Command;
import com.jdc.hwy.abstractfactory.Connection;
import com.jdc.hwy.abstractfactory.DataBaseFactory;

public class MySqlFactory implements DataBaseFactory {

	@Override
	public Connection createConnection() {
		return new MysqlConnection();
	}

	@Override
	public Command createCommand() {
		return new MySqlCommand();
	}

}
