package com.methodreference;

import java.util.LinkedList;
import java.util.Random;
import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String ar[]) {

		//System.out.println(doSomething(new Employee1()::producer));
		doSomething(new Employee1()::producer);

	}

	public static  void doSomething(MethodReferenceInterface methodReferenceInterface) {

		String str = "Hello";

		System.out.println("Hello1");
		//return (R) str;
	}

}

@FunctionalInterface
interface MethodReferenceInterface {

	public abstract void run();
}

class Employee1 /* implements MethodReferenceInterface */ {

	LinkedList<Integer> list = new LinkedList<Integer>();
	Random random = new Random();
	Integer maxSize = 2;

	String getEmployeeName() {

		return "Suresh";
	}

	public void producer() {
		while (true) {

			synchronized (this) {

				while (maxSize == list.size()) {
					try {
						wait();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int value = random.nextInt();
				list.add(value);

				System.out.println(value + " produced");
				System.out.println("now list size is " + list.size());
				notify();
			}
		}

	}

}