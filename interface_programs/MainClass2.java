interface Sample
{
	/* in inter_face by default all nonstatic variables are final and static members*/
	public int k=23;
}


class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println(Sample.k);
	}
}
