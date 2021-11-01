package main.burgerfactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class BurgerFactory {
	

	public static final List<String> INGREDIENTS = List.of("Pickle", "Onion", "Meat", "Lettuce");	
	
	public Burger createABurger(List<?> ingredients) {
		Burger burger = new Burger();
		ingredients.stream().forEach(ingredient -> {
			String className = ingredient.getClass().getSimpleName();
			if (INGREDIENTS.contains(className)) {
				try {
					String methodName = "prepare" + className;
					Class<?> ingredientClass = Class.forName(ingredient.getClass().getName());
					Method prepareMethod = ingredientClass.getMethod(methodName);
					Object result = prepareMethod.invoke(ingredient);
					System.out.println(result);					
					
					addIngredientsToBurger(burger, ingredient);
				} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		return burger;
	}
		
	
	
	private <T> void addIngredientsToBurger(Burger burger, T ingredient) {
		
		
		// PSEUDOCODE:
		// concatenate a dynamically created setter method using the 
		// ingredient class simple name (ingredient.getClass().getSimpleName()) prefixed with "set"
		// what were trying to create here is: set<IngrediantName> ie. setPickle or setMeat
		String methodName = null;
		try {
			// create the burger setter Method using the method name and the ingredient.getClass() as a parameter 
			// to the dynamically created setter method.
			
			// here we are getting the physical setter method from the Burger class and saying we are passing in 
			// the ingredient as its parameter...
			// REMEMBER:: burger.getClass() gets the class, burger.getClass().getMethod gets a method from the class
			// burger.getClass().getMethod() requires two parameters: getMethod(methodName, the ingredient class)
			Method setBurgerIngredientMethod = null;
			// invoke the newly created method, 
			// here we physically call the method and pass in the burger and the ingredient as parameters
			setBurgerIngredientMethod.invoke(null, null);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			
			e.printStackTrace();
		}
	}

}
