class FoodItemsRunner{
	public static void main(String[] snacks)
	{
		System.out.println("main:start aytu");
		String snacks1="fish fry";
		FoodItems.save(snacks1);
		FoodItems.save("pani puri");
		FoodItems.displayDetails();
		System.out.println("main:mugitu");
	}
}