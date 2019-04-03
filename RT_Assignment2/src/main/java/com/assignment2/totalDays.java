package com.assignment2;



public class totalDays extends readPdf implements Runnable {

	@Override
	public void run() {
		int day, firstDate=25, lastDate=20;
		
		day = ((31-firstDate)+ lastDate)-8;
		System.out.println("------------------------------------------------------------------");
		System.out.println("Thread 2   Total number of days : "+ day);
		System.out.println("------------------------------------------------------------------");
	}

}
