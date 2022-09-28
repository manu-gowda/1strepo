class Billionaries{
	static String[] billionariesNames={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	static void save(String billionariesName)
	{
		System.out.println("save:start aytu");
		if(billionariesNames.length>10)
		{
			System.err.println("SIZE IS EXCECEED...");
			return;
		}
		if(billionariesName!=null && billionariesName.length()>2)
		{
		billionariesNames[position]=billionariesName;
		System.out.println("Saved billionaries names:"+billionariesName+"at position"+position);
		position++;
		System.out.println("Next position of ref:"+position);
		}
		else{
			System.err.println("NAME IS NOT CORRECT:"+billionariesName);
		}
		System.out.println("save:mugitu");
	}
	static void displayDetails()
	{
		for(int index=0;index<billionariesNames.length;index++)
		{
			String ref=billionariesNames[index];
			System.out.println("elements:"+ref);
		}
	}
	static boolean findBillionaries(String name)
	{
		if(name!=null && name.length()>5)
		{
			System.out.println("Valid name will check in array");
			for(int find=0;find<billionariesNames.length;find++)
			{
				String ref=billionariesNames[find];
				if(ref==name)
				{
				System.out.println("billionaries found:"+name);
				return true;
			}
			}
		}
	else{
		System.err.println("Not a Valid Name:"+name);
	}return false;
	}
	static String update(String oldName,String newName)
	{
		System.out.println("update:start aytu..");
		if(oldName!=null && newName!=null)
		{
			if(oldName.length()>5 && newName.length()>5)
			{
				System.out.println("Data is valid for update");
				for(int index=0;index<billionariesNames.length;index++)
				{
					String ref=billionariesNames[index];
					if(ref==oldName)
					{
						System.out.println("Billionaries found"+ref+"write index"+index);
						billionariesNames[index]=newName;
						return newName;
					}
				
				else{
					System.out.println("Data is invalid for update");
				}
			}
			
			}
			
		}return null;
	}
	static String update(int index,String newName){
		System.out.println("update:start aytu..");
		if(index!=0 && newName!=null)
		{
			if(newName.length()>5)
			{
				System.out.println("Data is valid for update");
				
				{
					String ref=billionariesNames[index];
					if(ref==newName)
					{
						System.out.println("Billionaries found"+ref+"write index"+index);
						billionariesNames[index]=newName;
						return newName;
					}
				
				else{
					System.out.println("Data is invalid for update");
				}
			}
			
			}
			
		}return null;
	}
	

}