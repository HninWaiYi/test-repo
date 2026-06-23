package com.jdc.hwy.abstractfactory.mysql;

import com.jdc.hwy.abstractfactory.Command;

public class MySqlCommand implements Command {

	@Override
	public void someCommand() {
		System.out.println("Using mysql commands");
		
	}

}
