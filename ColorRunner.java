class ColorRunner{
	public static void main(String[] args)
	{
		System.out.println("main: information beku");
		String colors1="Blue";
		Color.save(colors1);
		Color.save("Black");
		Color.save("Red");
		Color.save("Orange");
		Color.save("Purple");
		Color.save("Green");
		Color.save("Pink");
		Color.displayDetails();
		boolean found=Color.findColor("Blue");
		System.out.println("color found:"+found);
		System.out.println("main: information saku");
	}
}