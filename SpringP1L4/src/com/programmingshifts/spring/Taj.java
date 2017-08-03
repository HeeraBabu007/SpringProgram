package com.programmingshifts.spring;

public class Taj 
{
	PartyPackInterface PPI;


	public PartyPackInterface getPPI() {
		return PPI;
	}


	public void setPPI(PartyPackInterface pPI) {
		PPI = pPI;
	}


	public void BeforeBookingAlert()
	{
		PPI.TajBookingCounter();
	}

}
