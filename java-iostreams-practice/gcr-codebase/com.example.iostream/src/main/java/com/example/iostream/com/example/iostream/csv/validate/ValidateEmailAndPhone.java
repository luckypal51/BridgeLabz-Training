package com.example.iostream.com.example.iostream.csv.validate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import com.opencsv.CSVReader;

public class ValidateEmailAndPhone {
	public static void main(String[] args) throws Exception {
	    final String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        final String phoneRegex = "^[6-9][0-9]{9}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        CSVReader csv = new CSVReader(new FileReader("file/regex.csv"));
        List<String[]> list = csv.readAll();
        csv.close();

        for (int i = 1; i < list.size(); i++) { 
            String[] s = list.get(i);

            Matcher emailMatcher = emailPattern.matcher(s[1]);
            Matcher phoneMatcher = phonePattern.matcher(s[2]);

            if (!emailMatcher.matches() || !phoneMatcher.matches()) {
                System.out.println("Invalid Data: " + Arrays.toString(s));
            }
        }
	}
}
