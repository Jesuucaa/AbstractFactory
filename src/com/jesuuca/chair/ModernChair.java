package com.jesuuca.chair;

public class ModernChair implements IChair{
	
	@Override
	public String getStyle() {
		// TODO Auto-generated method stub
		return "Moderna";
	}

	@Override
	public int legsNumber() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Café";
	}

	@Override
	public String toString() {
		return "ModernChair [getStyle()=" + getStyle() + ", legsNumber()=" + legsNumber() + ", getColor()=" + getColor()
				+ "]";
	}
	
	 
	
}
