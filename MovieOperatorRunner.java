class MovieOperatorRunner{
	public static void main(String[] film)
	{
		System.out.println("main: nadita ide");
		
		String Movie1="lucky man";
		MovieOperator.save(Movie1);
		
		MovieOperator.save("appu");
		MovieOperator.save("yuvarathna");
		MovieOperator.save("james");
		MovieOperator.displayDetails();
		System.out.println("main:mugita ide");
	}
}