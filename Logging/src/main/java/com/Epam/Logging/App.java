package com.Epam.Logging;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

public class App 
{
	private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
       Scanner sc = new Scanner(System.in);
       logger.info("Enter principal rate:");
       double principalAmount = sc.nextDouble();
       logger.info("Enter rate of interest:");
       double rateOfInterest = sc.nextDouble();
       logger.info("Enter Time Period:");
       double time = sc.nextDouble();
      // Interest obj = new Interest();
       logger.info("\nCompoundInterest:"+Interest.CompoundInterest(principalAmount,time,rateOfInterest));
       logger.info("\nSimpleInterest:"+ Interest.SimpleInterest(principalAmount,time,rateOfInterest));
    }
}
