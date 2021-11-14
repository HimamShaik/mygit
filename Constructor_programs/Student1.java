class Student1 
{
	public static String college="SRI_INDU";
	public String branch;
	public String name;
	public String dept;
	public double percent;
	public String company;
	public double sal;

	Student1(String branch,String name,String dept,double percent,String company,double sal)
	{
	 this.branch=branch;
	 this.name=name;
	 this.dept=dept;
	 this.percent=percent;
	 this.company=company;
	 this.sal=sal;
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
	 Student1 d1=new Student1("ece","Abhilash","electrical",67.6,"wipro",18000);
	 Student1 d2=new Student1("mech","sagar","mechanical",72.8,"Amazon",23000);
	 
	 d1.display();
	 d2.display();

		
}
}
