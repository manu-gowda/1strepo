class TempleOperatorRunner{
	public static void main(String[] gudi)
	{
		System.out.println("main:nadita ide");
		
		String temple1="dharmasthala ";
		TempleOperator.save(temple1);
		
		TempleOperator.save("channakeshava temple");
		TempleOperator.save("ganapathi");
		TempleOperator.displayDetails();
		System.out.println("main:mugita ide");
	}
}
