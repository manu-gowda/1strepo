class GraduateOperatorRunner{
	public static void main(String[] student)
	{
		System.out.println("main: information beku");
		String graduate1="Manu gowda ECE 7.34";
		GraduateOperator.save(graduate1);
		GraduateOperator.save("shinchuu CSE 9.0");
		GraduateOperator.save("priya ECE still 2nd year");
		GraduateOperator.displayDetails();
		System.out.println("main: information saku");
	}
}