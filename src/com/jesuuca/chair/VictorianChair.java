package com.jesuuca.chair;

public class VictorianChair implements IChair{

	@Override
	public String getStyle() {
		// TODO Auto-generated method stub
		return "Victoriana";
	}

	@Override
	public int legsNumber() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Rojo";
	}

	@Override
	public String toString() {
		return "VictorianChair [getStyle()=" + getStyle() + ", legsNumber()=" + legsNumber() + ", getColor()="
				+ getColor() + "]";
	}

}
