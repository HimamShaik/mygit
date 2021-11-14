class Student 
{
	public static String college="SRI_INDU";
	public String branch;
	public String name;
	public String dept;
	public double percent;
	public String company;
	public double sal;

	public double annulsal()
	{
	return sal*12;
	}

	public void display()
	{
     System.out.println("**************************************");

	System.out.println("branch is :"+branch);
		System.out.println("name is :"+name);
			System.out.println("dept is :"+dept);
				System.out.println("percent is :"+percent);
					System.out.println("company is :"+company);
						System.out.println("sal is :"+sal);
												System.out.println("annulsal is :" + annulsal());

														System.out.println("**************************************");

	}

	public static void main(String[] args) 
	{
     Student d1=new Student();
	 Student d2=new Student();
	 d1.branch="ece";
	 d1.name="Abhilash";
	 d1.dept="electrical";
	 d1.percent=67.6;
	 d1.company="wipro";
	 d1.sal=18000;
	 
	 d1.display();

	 d2.branch="mech";
	 d2.name="sagar";
	 d2.dept="mechanical";
	 d2.percent=72.8;;
	 d2.company="Amazon";
	 d2.sal=23000;
	 d2.display();

		
}
}
