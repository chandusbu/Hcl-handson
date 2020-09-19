package com.hh;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SummaryLog {
	public static String main(String[] args) {
		
	final String DAILEDNUMBER = "";
	final String TOTALDURATION = "";
	
		
	    String file = "weeklycall.txt";
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		List<String[]> content = new ArrayList();
		@SuppressWarnings("unused")
		Object c=new CallLog(file);
		content.add((String[]) c);
	    try {
	        @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
	        String line = "";
	        while ((line = br.readLine()) != null) {

	            content.add(line.split(","));

	            @SuppressWarnings("unused")
				var v = (String[][]) content.toArray(new String[content.size()][12]);

	        }
	    } catch( IOException e) {

	    }
	    public int compareTo(content n) {
	        int compareage=((content)comparestu).getcontent();
	        /* For Ascending order*/
	        return this.studentage-compareage;

	        /* For Descending order do like this */
	        //return compareage-this.studentage;
	    }

	    @Override
	    public String toString() {
	        return "[ rollno=" + TOTALDURATION + ", name=" + DAILEDNUMBER + ", age=" + file + "]";
	    }
	}
}
