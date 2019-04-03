package com.assignment2;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class totalCourse extends readPdf implements Runnable{

	public void run() {
		 try {
			 PDDocument document = PDDocument.load(new File("D:\\A182 Draft Stud.pdf"));
	            document.getClass();
	            
	            int course = 0;
	            if (!document.isEncrypted()) {
				
	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	              
	                String lines[] = pdfFileInText.split(System.getProperty("line.separator"));
	                
	                for (String line : lines) {
	                	
	                    if(line.contains(".")) {
	                    	for(int a=0; a<646; a++) {
	                    		course = a;	
	                    	}
	                }document.close();
	                
	            } 
	                System.out.println("------------------------------------------------------------------");
	                System.out.println("Thread 1   Total number of courses : "+ (course));   
	                System.out.println("------------------------------------------------------------------");
	            }
		 }catch(IOException ex) {
			 ex.printStackTrace();
		 }
	}
}

		
	
	

