package com.Epam.Logging;

public class Interest {

	public static double CompoundInterest(double principalAmount, double time, double rateOfInterest) {
		// TODO Auto-generated method stub
		return (principalAmount * Math.pow((1 + (rateOfInterest / 100)), time));
	}

	public static double SimpleInterest(double principalAmount, double time, double rateOfInterest) {
		// TODO Auto-generated method stub
		return (principalAmount * time * rateOfInterest) / 100;
	}

}
