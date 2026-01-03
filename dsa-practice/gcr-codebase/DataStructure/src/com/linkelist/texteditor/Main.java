package com.linkelist.texteditor;

public class Main {
	 public static void main(String[] args) {

	        TextEditor editor = new TextEditor();

	        editor.addState("Lucky");
	        editor.addState("Lucky Pal");
	        editor.addState("Lucky Pal is");
	        editor.addState("Lucky Pal is best");

	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();

	        editor.undo();
	        editor.displayCurrentState();

	        editor.redo();
	        editor.displayCurrentState();

	        editor.addState("Lucky coder");
	        editor.displayCurrentState();

	        editor.redo(); 
	    }
}
