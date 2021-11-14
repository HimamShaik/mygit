class demo
{
	private class run implements sample
	{
	 public void test()
		 {
		 System.out.println("text message");
		 }
	}
	public sample objectcall()
	{
	  sample s1=new run();
	  return s1;
	}
}
