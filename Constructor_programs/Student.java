class Student 
{
	public static String college="SRI_INDU";
	public String branch;
	public String name;
	public String dept;
	public double percent;
	public String company;
	public double sal;

	Student(String B,String N,String D,double P,String C,double S)
	{
	 branch=B;
	 name=N;
	 dept=D;
	 percent=P;
	 company=C;
	 sal=S;
	}


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
	 Student d1=new Student("ece","Abhilash","electrical",67.6,"wipro",18000);
	 Student d2=new Student("mech","sagar","mechanical",72.8,"Amazon",23000);
	 
	 d1.display();
	 d2.display();

		
}
}