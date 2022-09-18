class Vehicle{
	static double Transport(String Source,double Destination)
	{
		System.out.println("Enerted Transport");
		System.out.println("Source:"+Source);
		System.out.println("Destination:"+Destination);
		if(Source=="chikmagaloru" &&  Destination==350)
		{
			System.out.println("the journey Starts from chikmagaloru and end to darmasthala");
			return 350;
		}
		return 0;
	}
		
	static double Transport(String Source,double Destination, boolean onTime)
	{
		System.out.println("Enerted Transport");
		System.out.println("Source:"+Source);
		System.out.println("Destination:"+Destination);
		System.out.println("onTime:"+onTime);
		if(Source=="Mysure" &&  Destination==150 && onTime==true)
		{
			System.out.println("the journey Starts from Mysure and end to tiptur");
			return 150;
		}
		return 0;
	}
		
	static boolean Transport(boolean Destination)
	{
		System.out.println("Enerted Transport ");
		System.out.println("Destination:"+Destination);
		if(Destination==true)
		{
			System.out.println("the journey Starts from belur and end to bangalore");
			return true;
		}
		return false;
		
	}
	
	static boolean Transport(double Destination, boolean onTime)
	{
		System.out.println("Enerted Transport");
		System.out.println("Destination:"+Destination);
		System.out.println("onTime:"+onTime);
		if(Destination==200 && onTime==true)
		{
			System.out.println("the journey Starts from mysore and end to tiptur");
			return true;
		}
		return false;
	}
	
	static boolean Trans_port( boolean onTime)
	{
		System.out.println("Enerted Trans_port");
		System.out.println("onTime:"+onTime);
		if(onTime==true)
		{
			System.out.println("the journey Starts from tiptur and end to goa");
			return true;
		}
		return false;
	}
		
		

	
}