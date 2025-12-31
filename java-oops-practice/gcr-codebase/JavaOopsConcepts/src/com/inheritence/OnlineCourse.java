package com.inheritence;

public class OnlineCourse extends Course{

	protected String platfrom;
	protected boolean isRecorded;
	
	public OnlineCourse(String name, int duration,String platfrom,boolean isRecorded) {
		super(name, duration);
		this.platfrom = platfrom;
		this.isRecorded =isRecorded;
	}
	
	@Override
	public void courseDetail() {
		// TODO Auto-generated method stub
		super.courseDetail();
		System.out.println("Platfrom    : "+this.platfrom);
		System.out.println("isRecorded  : "+this.isRecorded);
	}

}
