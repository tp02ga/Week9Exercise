package main.burgerfactory;

import main.ingredients.Lettuce;
import main.ingredients.Meat;
import main.ingredients.Onion;
import main.ingredients.Pickle;

public class Burger {
	
	private Pickle pickle;
	private Onion onion;
	private Meat meat;
	private Lettuce lettuce;
	
	public Pickle getPickle() {
		return pickle;
	}
	public void setPickle(Pickle pickle) {
		this.pickle = pickle;
	}
	public Onion getOnion() {
		return onion;
	}
	public void setOnion(Onion onion) {
		this.onion = onion;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Lettuce getLettuce() {
		return lettuce;
	}
	public void setLettuce(Lettuce lettuce) {
		this.lettuce = lettuce;
	}
	@Override
	public String toString() {
		return "Burger [pickle=" + pickle + ", onion=" + onion + ", meat=" + meat + ", lettuce=" + lettuce + "]";
	}
	
	
	

}
