package sample4_02;

public class sample4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar rccar1 = new RacingCar(1234,20.5,5);
	}

}

class Car
{
	private int num;
	private double gas;
	
	public Car() 
	{
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
	
	public Car(int n,double g) 
	{
		num = n ;
		gas = g;
		System.out.println("將車號設爲"+num+"汽油量設爲"+gas);
	}
	
	public void show() 
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class RacingCar extends Car
{
	private  int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了車子");
	}
	
	public RacingCar(int n,double g,int c) 
	{
		super(n,g);
		course =c;
		System.out.println("生產了編號為"+course+"的車子");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設爲"+course);
	}
}
