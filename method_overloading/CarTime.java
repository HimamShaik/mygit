/* wap for the below requirement 
1 a car moving at the speed of 120km/hr and it as covered distance 600km,calculate the taken by the car
2 devlope a separate method to calculate the time, take speed and distace as parameters,return the time taken*/
class  CarTime
{
	public static int hai(int i, int j)
	{
	return i/j;
	}
	public static void main(String[] args) 
	{
		System.out.println("process started");
		int time=hai(600,120);
        System.out.println(time);
		System.out.println("process ended");
	}
}
