//2. Create a sub class for an abstract class. Create an object in the child class for the 
//abstract class and access the non-abstract methods
package com.akshay.prog1;

public abstract class AbstractClass {
	
	abstract void m1();
	
	public void m2() {
		System.out.println("Concrete class");
	}

}
