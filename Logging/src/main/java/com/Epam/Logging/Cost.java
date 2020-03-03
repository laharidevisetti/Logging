package com.Epam.Logging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Epam.Logging.App;
public class Cost {
	private static Logger logger = LogManager.getLogger(App.class);
	int MaterialType;
	int Area;
	int costPerSqFt = 0;
	public void ReadInput() {
		Scanner sc = new Scanner(System.in);
		logger.info("Enter required standard of the material:\n1 for Standard Materials\n2 for Above Standard Materials\n3 for"
				+ "High Standard Materials\n");
		MaterialType = sc.nextInt();
		logger.info("Enter Area:");
		Area = sc.nextInt();
		switch(MaterialType){
		case 1:
			costPerSqFt = 1200;
			break;
		case 2:
			costPerSqFt = 1500;
			break;
		case 3:
			logger.info("Enter 1 for Automated home 2 for non Automated home");
			int temp = sc.nextInt();
			if(temp == 1)
				costPerSqFt = 1800;
			else
				costPerSqFt = 2500;
		default: logger.info("Enter a valid standard");
		}
		
	}

	public int getCost() {
		// TODO Auto-generated method stub
		return costPerSqFt * Area;
	}
	

}
