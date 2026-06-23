package com.jdc.hwy.abstractfactory.mongo;

import com.jdc.hwy.abstractfactory.Command;

public class MongoCommand implements Command {

	@Override
	public void someCommand() {
		System.out.println("Using mongo commands");
	}

}
