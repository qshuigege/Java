package myutils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogUtils {
	public final static Logger LOGGER = init();

	private static Logger init() {
		PropertyConfigurator.configure(LogUtils.class.getClassLoader().getResourceAsStream("log4j.properties"));
		return Logger.getRootLogger();
	}

	public static Logger getRootLogger() {
		return LOGGER;
	}

}
