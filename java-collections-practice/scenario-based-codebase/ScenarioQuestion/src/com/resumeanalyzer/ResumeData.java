package com.resumeanalyzer;

public class ResumeData {
	 private int keyword;
    private String phoneno;
    private String email;
    public ResumeData() {
		
	}

	public ResumeData(int keyword,String phoneno, String email) {
    	this.phoneno = phoneno;
    	this.email = email;
    	this.keyword = keyword;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Phone Number : "+this.phoneno+
    		   "\nEmail Id     : "+this.email+
    		   "\nKeywords     : "+this.keyword;
    }

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getKeyword() {
		return keyword;
	}

	public void setKeyword(int keyword) {
		this.keyword = keyword;
	}
    
}
