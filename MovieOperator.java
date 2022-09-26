class MovieOperator{
	static String[] movieNames={null,null,null,null,null};
	static int position=0;
	static void save(String movieName)
	{
		System.out.println("save: nadita ide ");
		movieNames[position]=movieName;
		System.out.println("Saved movie name:"+movieName+"at position:"+position);
		position++;
		System.out.println("Next position of ref"+ position);
		System.out.println("save: mugita ide");
	}
	
	static void displayDetails()
	{
		for(int index=0;index<movieNames.length;index++)
		{
			String ref = movieNames[index];
			System.out.println("movie:"+ref);
		}
	}
}