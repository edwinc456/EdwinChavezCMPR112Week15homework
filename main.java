

public class main 
{
public static void main(String[]args)
{
	dice newdice = new dice(3);
	//Here is encapsulation, this allows the class to get information from other objects in different classes
	System.out.println("Start");
	for(int i=0;i<25; i++)
	{
		Runnable T1 = new dice(3);
		Thread worker = new Thread(T1);
		worker.start();
	//the command above gives the command to make the thread to start
		Runnable T2 = new dice(3);
		System.out.println("Start");
		Thread worker2 = new Thread(T2);
	}
	
	
	
}
}
