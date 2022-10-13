package com.jesuuca.abstract_factory;

import com.jesuuca.chair.IChair;
import com.jesuuca.coffeetable.*;
import com.jesuuca.sofa.*;

public abstract class MuebleriaAbstractFactory {
	public abstract IChair createChair();
	public abstract ICoffeeTable createCoffeeTable();
	public abstract ISofa createSofa();
}
