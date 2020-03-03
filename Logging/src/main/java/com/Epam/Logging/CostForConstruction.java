package com.Epam.Logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.Epam.Logging.App;
public class CostForConstruction {
	private static Logger logger = LogManager.getLogger(App.class);
	public static void main(String[] args) {
		Cost obj = new Cost();
		obj.ReadInput();
		logger.info("Cost For Construction = " + obj.getCost());
	}
}
