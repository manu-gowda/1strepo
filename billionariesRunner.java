class BillionariesRunner{
	public static void main(String[] args)
	{
		System.out.println("main: information beku");
		String billionaries1="Bqkjdi";
		Billionaries.save(billionaries1);
		Billionaries.save("top1 omker");
		Billionaries.save("top2 manu");
		Billionaries.save("malan");
		Billionaries.save("moeen");
		Billionaries.save("brook");
		Billionaries.save("msd");
		Billionaries.save("virat");
		Billionaries.save("kl rahul");
		Billionaries.save("nam baby");
		Billionaries.displayDetails();
		Billionaries.update("shinchuu","surya");
		Billionaries.update(2,"didi");
		boolean found=Billionaries.findBillionaries("Blue");
		System.out.println("billionaries found:"+found);
		System.out.println("main: information saku");
	}
}