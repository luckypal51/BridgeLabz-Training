package com.feedBack;

public class Main {
    public static void main(String[] args) {

        FeedbackAnalyzer analyzer = new FeedbackAnalyzer();
        analyzer.analyzeFolder("file/resume.txt"); 
        analyzer.displayResults();
    }
}
