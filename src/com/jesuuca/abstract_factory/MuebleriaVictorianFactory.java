package com.jesuuca.abstract_factory;

import com.jesuuca.chair.IChair;
import com.jesuuca.chair.VictorianChair;
import com.jesuuca.coffeetable.ICoffeeTable;
import com.jesuuca.coffeetable.VictorianCoffeeTable;
import com.jesuuca.sofa.ISofa;
import com.jesuuca.sofa.VictorianSofa;

public class MuebleriaVictorianFactory extends MuebleriaAbstractFactory{
	
	IChair chair;
	ICoffeeTable coffeeTable;
	ISofa sofa;

	@Override
	public IChair createChair() {
		chair = new VictorianChair();
		return chair;
	}

	@Override
	public ICoffeeTable createCoffeeTable() {
		coffeeTable = new VictorianCoffeeTable();
		return coffeeTable;
	}

	@Override
	public ISofa createSofa() {
		sofa = new VictorianSofa();
		return sofa;
	}

}
