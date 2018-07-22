package com.seymour.observer.subjects;

import com.seymour.observer.observers.Observer;

public interface Subject {

	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
	
}
