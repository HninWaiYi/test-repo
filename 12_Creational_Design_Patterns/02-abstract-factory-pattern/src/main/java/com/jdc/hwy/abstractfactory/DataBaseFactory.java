package com.jdc.hwy.abstractfactory;

public interface DataBaseFactory {
	
	Connection createConnection();
	Command createCommand();

}
