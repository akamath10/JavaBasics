package com.singleton;

public class Singleton {
	private Singleton() {
	}

	// private static class SingletonHelper{
	private static final Singleton INSTANCE = new Singleton();
	// }

	public static Singleton getInstance() {
		// return SingletonHelper.INSTANCE;
		return INSTANCE;
	}
}

class MainClass {
	Singleton single = Singleton.getInstance();
}