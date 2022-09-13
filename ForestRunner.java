class ForestRunner{
	
	public static void main (String[] sharath){
		System.out.println(Forest.name);
		System.out.println(Forest.typeofforest);
		System.out.println(Forest.region);
		System.out.println(Forest.totalarea);
		System.out.println(Forest.primaryanimals);
		for (int index=0; index<Forest.primaryanimals.length; index++)
			{
				String ref0=Forest.primaryanimals[index];
				System.out.println("animals name:"+index+"name"+ref0);
			}
	}
}