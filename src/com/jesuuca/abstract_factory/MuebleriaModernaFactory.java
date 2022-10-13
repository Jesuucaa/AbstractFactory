package com.jesuuca.abstract_factory;

import com.jesuuca.chair.IChair;
import com.jesuuca.chair.ModernChair;
import com.jesuuca.coffeetable.ICoffeeTable;
import com.jesuuca.coffeetable.ModernCoffeeTable;
import com.jesuuca.sofa.ISofa;
import com.jesuuca.sofa.ModernSofa;

public class MuebleriaModernaFactory extends MuebleriaAbstractFactory{
	
	IChair chair;
	ICoffeeTable coffeeTable;
	ISofa sofa;

	@Override
	public IChair createChair() {
		chair = new ModernChair();
		return chair;
	}

	@Override
	public ICoffeeTable createCoffeeTable() {
		coffeeTable = new ModernCoffeeTable();
		return coffeeTable;
	}

	@Override
	public ISofa createSofa() {
		sofa = new ModernSofa();
		return sofa;
	}

}
