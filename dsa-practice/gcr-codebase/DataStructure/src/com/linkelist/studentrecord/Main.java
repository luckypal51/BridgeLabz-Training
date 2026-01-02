package com.linkelist.studentrecord;

public class Main {
    public static void main(String[] args) {
    	LinkList list = new LinkList();
    	list.addStudent("Lucky",22 ,101,'A');
    	list.addStudent("Nageshwar", 26, 102, 'B');
    	list.atPosition("Himesh", 203, 103, 'B', 1);
    	
    	list.updateGrade(102, 'A');
    	list.displayAll();
    }
}
