package test;

import java.util.regex.Pattern;

public class TestMisc {
    public static void main(String args[]) {
    	String title = "Test 123 a - 1";
    	System.out.println(title.replaceAll("[^a-zA-Z0-9]+$", ""));
    	
    	String regex = "Title (1293)";
		if (regex!=null) {
			if (regex.indexOf("(")>=0 && regex.indexOf("\\(")<0) {
				// we have ( but not escaped
				regex = regex.replaceAll("\\(", "\\\\(");
			}
			if (regex.indexOf(")")>=0 && regex.indexOf("\\)")<0) {
				// we have ( but not escaped
				regex = regex.replaceAll("\\)", "\\\\)");
			}
		}
		
		System.out.println("Regext: " + regex);
    }
}
