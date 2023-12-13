package telran.configuration.examples;

import telran.configuration.Configuration;

public class TestConfigurationAppl {

	public static void main(String[] args) {
		TestConfiguration testObj = new TestConfiguration();
		Configuration config = new Configuration(testObj);
		config.configInjection();
		System.out.println(testObj);
	}

}
