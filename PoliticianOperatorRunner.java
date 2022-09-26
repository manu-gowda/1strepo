class PoliticianOperatorRunner{
	public static void main(String[] politics)
	{
		System.out.println("main :start aytu");
		String politician1="kumar anna";
		PoliticianOperator.save(politician1);
		PoliticianOperator.save("devegowda");
		PoliticianOperator.save("DK Shivakumar");
		PoliticianOperator.displayDetails();
		System.out.println("main:mugitu");
	}
}