package com.assignment2;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class Course_SOC extends readPdf implements Runnable {

	@Override
	public void run() {
		try {
			 PDDocument document = PDDocument.load(new File("D:\\A182 Draft Stud.pdf"));
	            document.getClass();
	     
	            if (!document.isEncrypted()) {
				
	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	              
	                String lines[] = pdfFileInText.split(System.getProperty("line.separator"));
	                System.out.println("------------------------------------------------------------------");
	                System.out.println("Thread 3   List of courses from SOC :  ");	
	                
	                for (String line : lines) {
	                
	                	if(line.contains("STIA")) {
	                	System.out.println("\n"+line);
	                	}
	                	if(line.contains("STID")) {
	                		System.out.println("\n"+line);
	                	}
	                	if(line.contains("STIJ")) {
	                		System.out.println("\n"+line);
	                	}
	                	if(line.contains("STIK1")) {
	                		System.out.println("\n"+line);
	                	}
	                	if(line.contains("STIK2")) {
	                		System.out.println("\n"+line);
	                	}
	                	if(line.contains("STIN")) {
	                		System.out.println("\n"+line);
	                	}

	                	if(line.contains("STIW")) {
	                		System.out.println("\n"+line);
	                	}
	                	if(line.contains("STQM")) {
	                		System.out.println("\n"+line);
	                	}
	                	if(line.contains("STQS")) {
	                		System.out.println("\n"+line);
	                	}
	                }
	            
	               
	         }document.close();
	         System.out.println("------------------------------------------------------------------");
		 }catch(IOException ex) {
			 ex.printStackTrace();
		 }

        
    }
}
	
