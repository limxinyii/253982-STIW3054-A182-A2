package com.assignment2;

public class readPdf {
	public static void main (String[] args) throws Exception{
		
		try {
		Thread t1 = new Thread(new totalCourse()); //Calculate the total number of courses
		t1.start();
		Thread.sleep(2000);
		
		Thread t2 = new Thread(new totalDays());
		t2.start();
		Thread.sleep(2000);
		t2.join();
		
		Thread t4 = new Thread(new totalCourse_SOC()); // Calculate the number of courses from SOC
		t4.start();
		Thread.sleep(2000);
		t4.join();
		
		Thread t3 = new Thread(new Course_SOC()); // List of courses from SOC
		t3.start();
		Thread.sleep(2000);
		
		Thread t5 = new Thread(new STIW3054()); //Display the information of STIW3054 
		t5.start();
		Thread.sleep(2000);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
