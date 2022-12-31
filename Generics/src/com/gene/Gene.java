package com.gene;

public class Gene<T> {
	T n;

	public Gene(T n) {
		this.n = n;
	}

	public void work() {
		if (n instanceof String) {
			System.out.println("It is a String");
		} else if (n instanceof Number) {
			System.out.println("It is a Number");
		} else {
			System.out.println("It is a Character");
		}
	}
}
