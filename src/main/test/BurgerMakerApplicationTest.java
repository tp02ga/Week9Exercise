package main.test;

import java.util.ArrayList;
import java.util.List;

import main.BurgerTest;
import main.burgerfactory.Burger;
import main.burgerfactory.BurgerFactory;
import main.ingredients.Ingredient;
import main.ingredients.Meat;
import main.ingredients.Onion;
import main.ingredients.Pickle;

public class BurgerMakerApplicationTest {
	
	@BurgerTest(enabled = true)
	public void should_add_ingredients() {
		BurgerFactory burgerFactory = new BurgerFactory();
		
		List<Ingredient> ingredients = new ArrayList<>(); 
		Pickle pickle = new Pickle();
		Onion onion = new Onion();
		Meat meat = new Meat();
		
		ingredients.add(meat);
		ingredients.add(pickle);
		ingredients.add(onion);
		
		Burger burger = burgerFactory.createABurger(ingredients);
		
		if (burger != null) { 
			System.out.println("DING DING, ORDER UP!!!");
		} else {
			System.out.println("test failed");
		}
	}
	
	
	public void should_add_ketchup_and_mustard() {
		// DISABLE THIS TEST USING YOUR CUSTOM TESTING INTERFACE
	}

}
