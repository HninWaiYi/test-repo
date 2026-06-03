package com.jdc.hwy.exe;

public class Main {
	
	public static void main(String[] args) {
		Educator<Professor> prof = new Educator<>(new Professor());
		Educator<Teacher> teacher = new Educator<>(new Teacher());
		doWork(prof);
		doWork(teacher);
	}

	static void doWork(Educator<?> educator) {
		educator.doWork();
	}
}

class Educator<T extends Job>{
	private T job;
	
	Educator(T job){
		this.job = job;
	}
	void doWork() {
		job.doJob();
	}
}

interface Job{
	void doJob();
}

class Professor implements Job{

	@Override
	public void doJob() {
		System.out.println("researching");
		
	}
}

class Teacher implements Job{
	@Override
	public void doJob() {
		System.out.println("teaching");
		
	}
}