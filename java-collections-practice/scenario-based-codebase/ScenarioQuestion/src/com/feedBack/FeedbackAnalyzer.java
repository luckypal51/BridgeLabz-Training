package com.feedBack;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackAnalyzer {

    private static final Pattern RATING_PATTERN =
            Pattern.compile("(\\d{1,2})/10"); 

    private Map<String, List<String>> categorizedFeedback = new HashMap<>();

    public FeedbackAnalyzer() {
        categorizedFeedback.put("Positive", new ArrayList<>());
        categorizedFeedback.put("Neutral", new ArrayList<>());
        categorizedFeedback.put("Negative", new ArrayList<>());
    }

    public void analyzeFolder(String folderPath) {
        File folder = new File(folderPath);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path!");
            return;
        }

        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null) return;

        for (File file : files) {
            readFile(file);
        }
    }

    private void readFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                processLine(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }

    private void processLine(String line) {
        try {
            Matcher matcher = RATING_PATTERN.matcher(line);

            if (matcher.find()) {
                int rating = Integer.parseInt(matcher.group(1));

                String category = categorize(rating);
                categorizedFeedback.get(category).add(line);
            } else {
                throw new IllegalArgumentException("No rating found");
            }

        } catch (Exception e) {
            System.out.println("Invalid feedback line: " + line);
        }
    }

    private String categorize(int rating) {
        if (rating >= 8) return "Positive";
        if (rating >= 5) return "Neutral";
        return "Negative";
    }

    public void displayResults() {
        categorizedFeedback.forEach((category, feedbackList) -> {
            System.out.println("\n=== " + category + " Feedback ===");
            feedbackList.forEach(System.out::println);
        });
    }
}
