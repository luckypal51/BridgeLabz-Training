package com.resumeanalyzer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Process {

    private String email;
    private String phone;
    private int count;
    private Map<String, ResumeData> map = new TreeMap<>();

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}", Pattern.CASE_INSENSITIVE);

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("(\\+91[- ]?)?[6-9]\\d{9}");
    
    private static final Pattern DOMAIN_PYTHON = Pattern.compile("python",Pattern.CASE_INSENSITIVE);
    private static final Pattern DOMAIN_JAVA = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
    private static final Pattern DOMAIN_SPRING = Pattern.compile("spring",Pattern.CASE_INSENSITIVE);

    public void file(String filePath) throws Exception {

        email = null;
        phone = null;
        count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                check(line);
            }
        }

        if (email == null) email = "No Email Found";
        if (phone == null) phone = "No Phone Found";

        map.put(email, new ResumeData(count,phone, email));
    }

    public void check(String line) {
        
        Matcher emailMatcher = EMAIL_PATTERN.matcher(line);
        if (emailMatcher.find()) {
            email = emailMatcher.group();
        }

        Matcher phoneMatcher = PHONE_PATTERN.matcher(line);
        if (phoneMatcher.find()) {
            phone = phoneMatcher.group();
        }
        Matcher python = DOMAIN_PYTHON.matcher(line);
        if(python.find()) {
        	count+=1;
        }
        Matcher java = DOMAIN_JAVA.matcher(line);
        if(java.find()) {
        	count+=1;
        }
        Matcher spring = DOMAIN_SPRING.matcher(line);
        if(spring.find()) {
        	count+=1;
        }
       
    }

    public void view() {
    	  map.values().stream()
          .sorted((a, b) -> Integer.compare(b.getKeyword(), a.getKeyword()))
          .forEach(System.out::println);
    }
  
}
