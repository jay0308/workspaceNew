package pureAnnotaionBased.configuration;

import org.springframework.beans.factory.annotation.Autowired;

public class SamsungPhone {
	
	@Autowired
	SamsungProcessor cpu;
	
	public void config() {
		System.out.println("Samsung Galaxy S7, Octa core, 4gb ram, 20 mega pixel rare camera");
		cpu.Processor();
	}
}
