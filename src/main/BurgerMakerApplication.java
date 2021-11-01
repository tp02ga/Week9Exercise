package main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import main.test.BurgerMakerApplicationTest;

public class BurgerMakerApplication {

	public static void main(String[] args) {		
		
		BurgerMakerApplicationTest burgerMakerApplicationTest = new BurgerMakerApplicationTest();
		
		Method[] methods = BurgerMakerApplicationTest.class.getMethods();
		
		for (Method method : methods) {
			BurgerTest burgerTest = method.getAnnotation(BurgerTest.class);
			
			if (burgerTest != null) {
				if (burgerTest.enabled()) {
					try {
						method.invoke(burgerMakerApplicationTest);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
		
		

	}

}
