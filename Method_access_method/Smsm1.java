/*static method directly access static method because both are at same static pool are */
class Smsm1 
{ 
	public static void fly()
	{
	System.out.println("hai how are u rey");
	}

	public static void move()
	{
	fly();
	}

	public static void main(String[] args) 
	{
		move();
		
	}
}