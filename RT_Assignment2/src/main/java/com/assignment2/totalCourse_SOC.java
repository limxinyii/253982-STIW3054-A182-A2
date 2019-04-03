package com.assignment2;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;


public class totalCourse_SOC extends readPdf implements Runnable {
	

	@Override
	public void run() {
		try {
		 PDDocument document = PDDocument.load(new File("D:\\A182 Draft Stud.pdf"));
         document.getClass();
         int count = 0;
         if (!document.isEncrypted()) {
			
             PDFTextStripperByArea stripper = new PDFTextStripperByArea();
             stripper.setSortByPosition(true);

             PDFTextStripper tStripper = new PDFTextStripper();

             String pdfFileInText = tStripper.getText(document);
           
             String lines[] = pdfFileInText.split(System.getProperty("line.separator"));	
             
             for (String line : lines) {
             
             	if(line.contains("STIA1")) {
             		count++;            	
             	}
             	if (line.contains("STIA2")) {
             		count++;
             	}
             	if(line.contains("STID")) {
            		count++;
            	}
             	if(line.contains("STIJ")) {
            		count++;
            	}
             	if(line.contains("STIK1")) {
            		count++;
            	}
             	if(line.contains("STIK2")) {
            		count++;
            	}
             	if(line.contains("STIN")) {
            		count++;
            	}
             	if(line.contains("STIW")) {
            		count++;
            	}
             	if(line.contains("STQM")) {
            		count++;
            	}
             	if(line.contains("STQS")) {
            		count++;
            	}
             }
             System.out.println("------------------------------------------------------------------");
             System.out.println("Thread 4   Number of courses from SOC : "+ count);
             System.out.println("------------------------------------------------------------------");
         }document.close();
	 }catch(IOException ex) {
		 ex.printStackTrace();
	 }

	}
	
}

