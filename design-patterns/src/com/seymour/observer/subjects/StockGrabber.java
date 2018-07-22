package com.seymour.observer.subjects;

import java.util.ArrayList;

import com.seymour.observer.observers.Observer;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	
	
	public StockGrabber() {
		super();
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		
		observers.add(o);		
	}

	@Override
	public void unregister(Observer o) {

		int index = observers.indexOf(o);
		
		System.err.println("deleting observer of index: " + index);
		
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {

		for(Observer observer : observers) {
			
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
		
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		
		notifyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		
		notifyObserver();
	}
	
}
