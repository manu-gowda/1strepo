class TempleOperator{
	static String[] templeNames={null,null,null,null,null};
	static int position=0;
	static void save(String templeName)
	{
		System.out.println("save:nadita ide");
		templeNames[position]=templeName;
		System.out.println("Saved temple name:"+templeName+"at position:"+position);
		position++;
		System.out.println("Next position ofref"+position);
		System.out.println("save:mugita ide");
	}
	static void displayDetails()
	{
		for (int index=0; index<templeNames.length;index++)
		{
			String ref=templeNames[index];
			System.out.println("temple:"+ref);
		}
	}
}