package com.test.itextExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import com.cranedge.amc.MailSender;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.TabSettings;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;


public class Practice extends PdfPageEventHelper  {
	 private static Font cellFont = new Font(Font.FontFamily.TIMES_ROMAN, 9,
             Font.NORMAL);
	 private static Font underLineFont = new Font(Font.FontFamily.TIMES_ROMAN, 9,
             Font.UNDERLINE);
	 private static Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 10,
             Font.NORMAL);
	 private static Font headerFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
             Font.BOLD);
	
	 public static void main(String[] args) {

		 
		 List<Integer> li = new ArrayList();
		 li.add(2);
		 System.out.println(li.get(0).toString());
	 Document document = new Document();

	     try {
	         PdfWriter writer=PdfWriter.getInstance(document,
	             new FileOutputStream("E:/var/tmp/itext/HelloWorld-Table.pdf"));
	
	          document.open();
	
	         List<String> firstTableHeaderlist= new ArrayList<String>();
	         firstTableHeaderlist.add("Bucket");
	         firstTableHeaderlist.add("Total Warranty complaints closed");
	         firstTableHeaderlist.add("Strike Rate of Warranty Resolution closed (%)");
	         
	         List<String> secondTableHeaderlist= new ArrayList<String>();
	         secondTableHeaderlist.add("Wr ID");
	         secondTableHeaderlist.add("Customer Name");
	         secondTableHeaderlist.add("Crane ID");
	         secondTableHeaderlist.add("Crane Serial no");
	         secondTableHeaderlist.add("Status");
	         secondTableHeaderlist.add("Remark");
	         
	         List<String> textHeaderList= new ArrayList<String>();
	         textHeaderList.add("Date of Report");
	         textHeaderList.add("No of warranty complaints received in last 24hrs");
	         textHeaderList.add("No of warranty complaints resolved in last 24hrs");
	         textHeaderList.add("Total No of warranty complaints open till date");
	         textHeaderList.add("Total No of warranty complaints which are open (unresolved) more than 48hrs");
	         textHeaderList.add("Total Warranty Complaints received from 1-Nov 2016 till date");
	         textHeaderList.add("Total Warranty Complaints closed from 1-Nov 2016 till date");
	         
	         List<String> valueHeaderList= new ArrayList<String>();
	         valueHeaderList.add(new Date().toString());
	         valueHeaderList.add("23");
	         valueHeaderList.add("0");
	         valueHeaderList.add("60");
	         valueHeaderList.add("2");
	         valueHeaderList.add("100");
	         valueHeaderList.add("90");
	         
	         List<String> secondSectiontextList= new ArrayList<String>();
	         secondSectiontextList.add("No. of Warranty complaint unresolved with details (Status & Remark)");
	         
	         Paragraph preface = new Paragraph();
	         
	         createTableHeader(document,textHeaderList,valueHeaderList);
	         addEmptyLine(document, 1);
	         
	         createTableStructure(document,firstTableHeaderlist);
	         addEmptyLine(document, 1);
	        preface.clear();
	        addTitle(document,preface,secondSectiontextList,Collections.<String> emptyList());
	        addEmptyLine(document, 1);
	         createTableStructure(document,secondTableHeaderlist);
	         
	         secondSectiontextList.clear();
	         secondSectiontextList.add("Regards,");
	         secondSectiontextList.add("Cranedge");
	         addEmptyLine(document, 3);
	         addTitle(document,preface,secondSectiontextList,Collections.<String> emptyList());
	         
	         
	         
	     } catch(Exception e){
	    	 e.printStackTrace();
	     }
	     finally{
	    	 document.close();
	     }
   }
	 public static void  addTitle(Document doc,Paragraph  preface,List<String> dataSet,List<String> valueSet) throws DocumentException{
		 
		 for(int i=0;i<dataSet.size();i++){
			 
			 Chunk chunk = new Chunk(dataSet.get(i),normalFont);
			 preface.add(chunk);
			 if(valueSet.size() > 0){
				 preface.setTabSettings(new TabSettings(98f));
				 preface.add(Chunk.TABBING);
				 Chunk valueChunk = new Chunk(valueSet.get(i),underLineFont);
				 preface.add(valueChunk);
			 }
			 doc.add(preface);
			// addEmptyLine(doc, 1);
			 preface.clear();
		 }
		 
	 }
	 
	 public  static void createTableHeader(Document document,List<String> columnHeader,List<String> valuesHeader)
     {
		 PdfPTable table = new PdfPTable(2);
		 
		 for(String headerText:columnHeader){
			 PdfPCell c1 = new PdfPCell(new Paragraph(headerText,headerFont));
	         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	        // table.addCell(c1); 
		 }
		 float[] columnWidths = {2f, 1f};

		 try {
			table.setWidths(columnWidths);
		} catch (DocumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
         table.setHeaderRows(0);
         table.setWidthPercentage(90);
         for(int i=0;i<columnHeader.size();i++){
        	 PdfPCell cell = new PdfPCell(new Phrase(columnHeader.get(i), cellFont));
        	 cell.setBorder(Rectangle.NO_BORDER);
        	 
        	  PdfPCell cell1 = new PdfPCell(new Phrase(valuesHeader.get(i), cellFont));
        	  cell1.setBorder(Rectangle.NO_BORDER);
        	  cell1.setHorizontalAlignment(Element.ALIGN_LEFT);
        	 table.addCell(cell);
         table.addCell(cell1);
         }
         try {
			document.add(table);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
     }
	 
	 public  static void createTableStructure(Document document,List<String> columnHeader)
     {
		 PdfPTable table = new PdfPTable(columnHeader.size());
		 
		 for(String headerText:columnHeader){
			 PdfPCell c1 = new PdfPCell(new Paragraph(headerText,headerFont));
	         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         table.addCell(c1); 
		 }
		 /*PdfPCell c1 = new PdfPCell(new Phrase("Bucket"));
         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
         table.addCell(c1);

         c1 = new PdfPCell(new Phrase("Total Warranty complaints closed"));
         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
         table.addCell(c1);

         c1 = new PdfPCell(new Phrase("Strike Rate of Warranty Resolution closed (%)"));
         c1.setHorizontalAlignment(Element.ALIGN_CENTER);
         table.addCell(c1);*/
         table.setHeaderRows(1);
         table.addCell("Within 0-24 hrs ");
         table.addCell("200");
         table.addCell("20");
         table.addCell("Within 25-36 hrs ");
         table.addCell("150");
         table.addCell("15");
         table.addCell("within 37-48 hrs");
         table.addCell("256");
         table.addCell("25");
         table.addCell("Within 49 – 72 hrs ");
         table.addCell("150");
         table.addCell("15");
         table.addCell("Within 73-96 hrs ");
         table.addCell("190");
         table.addCell("17");
         table.addCell("> 97 hrs ");
         table.addCell("50");
         table.addCell("5");
         

         try {
			document.add(table);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	 
	 private static void addEmptyLine(Document paragraph, int number) throws DocumentException {
         for (int i = 0; i < number; i++) {
                 paragraph.add(new Paragraph(" "));
         }

        
	 }
	 //Mail in PDF
	 public void get(){
		 try {
	            
	            /*new MailSender(context, "aman.shrivastava@forgeahead.io",
	                "aman.shrivastava@forgeahead.io", "Report", "Please Find the Attachment", "");*/
	            
	            ArrayList<String> li = new ArrayList<String>();
	            li.add("E:/var/tmp/itext/HelloWorld-Table.pdf");
	            // MimeBodyPart[] attachPart = new MimeBodyPart[5];
	            // MimeBodyPart subAttachPart = new MimeBodyPart();
	            // subAttachPart.attachFile(filename);
	            // attachPart[0] = subAttachPart;
	            // mailsender.sendWithAttachments(attachPart);
	            Properties prop = new Properties();
	            String propFileName = "mail.properties";
	            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
	            prop.load(inputStream);
	            if (inputStream == null) {
	                throw new FileNotFoundException("property file '" + propFileName
	                        + "' not found in the classpath");
	            }
	            prop.getProperty("mail.host.name");
	            prop.getProperty("mail.host.port");
	            prop.getProperty("mail.host.username");
	            prop.getProperty("mail.host.password");
	            
	            //Mail Send Method
	            
	             /*EventHandlerBase.sendEmail("Please Find the AttachmentPlease Find the Attachment",
	             "aman.shrivastava@forgeahead.io", host, "Report", "aman.shrivastava@forgeahead.io",
	           new ArrayList(), new ArrayList(), username, password, li);*/
	        } catch (final Exception e) {
	            this.log.error(e);
	        }
	 }
}
