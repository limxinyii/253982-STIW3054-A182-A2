package com.assignment2;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class STIW3054 extends readPdf implements Runnable{

	public void run(){
		 try {
			 PDDocument document = PDDocument.load(new File("D:\\A182 Draft Stud.pdf"));
	            document.getClass();

	            if (!document.isEncrypted()) {
				
	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	              
	                String lines[] = pdfFileInText.split(System.getProperty("line.separator"));
	                
	                for (String line : lines) {
	                	
	                    if(line.contains("STIW3054")) {
	                    	System.out.println("------------------------------------------------------------------");
	    	                System.out.println("Thread 5   Display the information of STIW3054 : \n\n"+ line);
	    	                System.out.println("------------------------------------------------------------------");
	                    }
	                	
	                }
	            }    
	            
		 }catch(IOException ex) {
			 ex.printStackTrace();
		 }
	}
}
