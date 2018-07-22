package com.seymour.observer.launchers;

import com.seymour.observer.observers.Observer;
import com.seymour.observer.observers.StockObserver;
import com.seymour.observer.subjects.StockGrabber;
import com.seymour.observer.subjects.Subject;

public class ObserverLauncher {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		Observer observer1 = new StockObserver(stockGrabber);
				
		stockGrabber.setIbmPrice(50.0);
		stockGrabber.setAaplPrice(100.0);
		stockGrabber.setGoogPrice(150.0);
		
		Observer observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(51.0);
		stockGrabber.setAaplPrice(103.0);
		stockGrabber.setGoogPrice(148.0);
		
		stockGrabber.unregister(observer1);
		
		stockGrabber.setIbmPrice(50.0);
		stockGrabber.setAaplPrice(100.0);
		stockGrabber.setGoogPrice(150.0);
	}
}
