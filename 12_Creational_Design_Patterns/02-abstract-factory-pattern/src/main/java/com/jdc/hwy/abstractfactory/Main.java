package com.jdc.hwy.abstractfactory;

import com.jdc.hwy.abstractfactory.mongo.MongoFactory;
import com.jdc.hwy.abstractfactory.mysql.MySqlFactory;

public class Main {
	
	// This is used for easy to switched mysql and mongo
	// When switched mysql ,change object in behind.
	// It is also support for open/closed principles.

	public static void main(String[] args) {
		DataBaseFactory df = useDatabase("mongo");
		df.createConnection().connect();
		df.createCommand().someCommand();
	}
	
	static DataBaseFactory useDatabase(String name) {
		return switch(name) {
			case "mysql" -> new MySqlFactory();
			case "mongo" -> new MongoFactory();
			default -> null;
		};
	}

}
