package com.seymour.observer.observers;

import com.seymour.observer.subjects.StockGrabber;
import com.seymour.observer.subjects.Subject;

public class StockObserver implements Observer {

	private static int observerIdCounter = 0;
	
	private int observerId;
	
	private Subject stockGrabber;
	
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	
	
	public StockObserver(Subject stockGrabber) {
		super();

		this.stockGrabber = stockGrabber;
		
		this.observerId = ++observerIdCounter;
		
		System.out.println("Registered new Observer with id" + this.observerId);
		
		stockGrabber.register(this);
	}



	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {

		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		this.printPrices();
		
	}
	
	public void printPrices() {
		System.out.println("ObserverId: " + observerId);
		System.out.println("IBM Price: " + ibmPrice);
		System.out.println("Apple Price: " + aaplPrice);
		System.out.println("Google Price: " + googPrice);
		System.out.println();
	}

}
