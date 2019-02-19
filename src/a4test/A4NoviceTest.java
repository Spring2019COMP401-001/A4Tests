package a4test;

import static org.junit.Assert.*;


import org.junit.Test;

import a4.*;

public class A4NoviceTest {
	double amount1 = 1.34;
	double amount2 = 0.24;
	
	@Test
	public void testAvocado() {
		System.out.println("Testing Avocado ingredient");
		
		String name = "avocado";
		double price = 0.24;
		int cals = 42;
		boolean veg = true;
		boolean rice = false;
		boolean shell = false;
		
		Ingredient i = new Avocado();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}

	@Test
	public void testCrab() {
		System.out.println("Testing Crab ingredient");
		String name = "crab";
		double price = 0.72;
		int cals = 37;
		boolean veg = false;
		boolean rice = false;
		boolean shell = true;
		
		Ingredient i = new Crab();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}
	
	@Test
	public void testEel() {
		System.out.println("Testing Eel ingredient");
		String name = "eel";
		double price = 2.15;
		int cals = 82;
		boolean veg = false;
		boolean rice = false;
		boolean shell = false;
		
		Ingredient i = new Eel();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}

	@Test
	public void testRice() {
		System.out.println("Testing Rice ingredient");
		String name = "rice";
		double price = 0.13;
		int cals = 34;
		boolean veg = true;
		boolean rice = true;
		boolean shell = false;
		
		Ingredient i = new Rice();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}
	
	@Test
	public void testYellowtail() {
		System.out.println("Testing Yellowtail ingredient");
		String name = "yellowtail";
		double price = 0.74;
		int cals = 57;
		boolean veg = false;
		boolean rice = false;
		boolean shell = false;
		
		Ingredient i = new Yellowtail();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}
	
	@Test
	public void testSeaweed() {
		System.out.println("Testing Seaweed ingredient");
		String name = "seaweed";
		double price = 2.85;
		int cals = 105;
		boolean veg = true;
		boolean rice = false;
		boolean shell = false;
		
		Ingredient i = new Seaweed();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}

	@Test
	public void testShrimp() {
		System.out.println("Testing Shrimp ingredient");
		String name = "shrimp";
		double price = 0.65;
		int cals = 32;
		boolean veg = false;
		boolean rice = false;
		boolean shell = true;
		
		Ingredient i = new Shrimp();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}

	@Test
	public void testTuna() {
		System.out.println("Testing Tuna ingredient");
		String name = "tuna";
		double price = 1.67;
		int cals = 42;
		boolean veg = false;
		boolean rice = false;
		boolean shell = false;
		
		Ingredient i = new Tuna();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}
	
	@Test
	public void testAvocadoPortion() {
		System.out.println("Testing AvocadoPortion");

		double amt = Math.random() + 1.0;

		IngredientPortion p = new AvocadoPortion(amt);
		Ingredient i = new Avocado();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}

	@Test
	public void testCrabPortion() {
		System.out.println("Testing CrabPortion");
		double amt = Math.random() + 1.0;

		IngredientPortion p = new CrabPortion(amt);
		Ingredient i = new Crab();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}
	
	@Test
	public void testEelPortion() {
		System.out.println("Testing EelPortion");
		double amt = Math.random() + 1.0;

		IngredientPortion p = new EelPortion(amt);
		Ingredient i = new Eel();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}

	@Test
	public void testRicePortion() {
		System.out.println("Testing RicePortion");
		double amt = Math.random() + 1.0;

		IngredientPortion p = new RicePortion(amt);
		Ingredient i = new Rice();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}

	@Test
	public void testYellowtailPortion() {
		System.out.println("Testing YellowtailPortion");
		double amt = Math.random() + 1.0;

		IngredientPortion p = new YellowtailPortion(amt);
		Ingredient i = new Yellowtail();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}

	@Test
	public void testSeaweedPortion() {
		System.out.println("Testing SeaweedPortion");
		double amt = Math.random() + 1.0;

		IngredientPortion p = new SeaweedPortion(amt);
		Ingredient i = new Seaweed();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}

	@Test
	public void testShrimpPortion() {
		System.out.println("Testing ShrimpPortion");
		double amt = Math.random() + 1.0;

		IngredientPortion p = new ShrimpPortion(amt);
		Ingredient i = new Shrimp();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}

	@Test
	public void testTunaPortion() {
		System.out.println("Testing TunaPortion");
		double amt = Math.random() + 1.0;

		IngredientPortion p = new TunaPortion(amt);
		Ingredient i = new Tuna();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}


	@Test
	public void testEquals(){
		System.out.println("Testing equals method of an ingredient.");

		Avocado avocado1= new Avocado();
		Avocado avocado2= new Avocado();
		Crab crab1= new Crab();
		
		assertTrue(avocado1.equals(avocado2));
		assertFalse(avocado1.equals(crab1));
		assertFalse(crab1.equals(avocado2));
	}
	
	@Test
	public void testCombine(){
		System.out.println("Testing combine method of an ingredient portion");
		AvocadoPortion ap1 = new AvocadoPortion(amount1);
		AvocadoPortion ap2 = new AvocadoPortion(amount2);
		IngredientPortion ap3 = ap1.combine(ap2);
		CrabPortion cp1= new CrabPortion(2);
		
		assertEquals(amount1+amount2, ap3.getAmount(), 0.0001);
		assertTrue(ap3.getIngredient().equals(new Avocado()));
	}
	
	@Test (expected = RuntimeException.class)
	public void testBadCombine(){
		System.out.println("Testing whether combin method throws exception if attempted with two different ingredient types");

		AvocadoPortion ap1 = new AvocadoPortion(amount1);
		AvocadoPortion ap2 = new AvocadoPortion(amount2);
		IngredientPortion ap3 = ap1.combine(ap2);
		CrabPortion cp1= new CrabPortion(2);
		
		ap1.combine(cp1);
		fail("Expected RuntimeException to be thrown");
	}
	

	@Test
	public void testBadAmount(){
		System.out.println("Testing ingredient portion constructors for throwing exception if amount is illegal");

		try {
			IngredientPortion ip = new AvocadoPortion(-2);
			fail("Expected RuntimeException to be thrown");
		} catch (RuntimeException e) {
		}
		try {
			IngredientPortion ip = new CrabPortion(-2);
			fail("Expected RuntimeException to be thrown");
		} catch (RuntimeException e) {
		}
		try {
			IngredientPortion ip = new EelPortion(-2);
			fail("Expected RuntimeException to be thrown");
		} catch (RuntimeException e) {
		}
		try {
			IngredientPortion ip = new RicePortion(-2);
			fail("Expected RuntimeException to be thrown");
		} catch (RuntimeException e) {
		}
		try {
			IngredientPortion ip = new YellowtailPortion(-2);
			fail("Expected RuntimeException to be thrown");
		} catch (RuntimeException e) {
		}
		try {
			IngredientPortion ip = new SeaweedPortion(-2);
			fail("Expected RuntimeException to be thrown");
		} catch (RuntimeException e) {
		}
		try {
			IngredientPortion ip = new ShrimpPortion(-2);
			fail("Expected RuntimeException to be thrown");
		} catch (RuntimeException e) {
		}
		try {
			IngredientPortion ip = new TunaPortion(-2);
			fail("Expected RuntimeException to be thrown");
		} catch (RuntimeException e) {
		}
	}
	

}
