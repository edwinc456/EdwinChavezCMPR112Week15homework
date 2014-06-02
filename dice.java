import java.util.Arrays;
import java.util.Random;
public class dice implements theinterface,Runnable
//There is polymorphism here since it implements Runnable and theinterface at the same time
{
private final int historynumber = 10;
private int[] history = new int[historynumber];
private int myvalue;
private int mythrows;
private int counter;
private int threadName;

 private final int[] array;
 private int writeIndex=0;
 private final static Random generator = new Random();
 
 
 
 public dice(int size)
 //the constructor is here
{
	array = new int[size];
	 
	 mythrows = threadName;
	myvalue=0;
	for(int i =0;i>0;i--)
		history[i] =0;
	
}

 public synchronized void add(int value)
 {
	 int position = writeIndex;
	 
	 try
	 //Here is an exception if the Thread does not sleep
	 {
		 Thread.sleep(generator.nextInt(500));
	 }
	 
	 catch (InterruptedException ex)
	 {
		 ex.printStackTrace();
	 }
	 array [position] = value;
	 System.out.printf(" wrote %d to element %d \n" , position);
	 
	 ++writeIndex;
	 System.out.printf("Next write index : %d \n. writeIndex", writeIndex);
 }
 public String toString()
 {
	 return "\n Contents of SimpleArray: \n" + Arrays.toString(array);
 }
 
@Override
//Here is an Override, it is because i have other objects called the same thing
public void run()
{
	long sum=0;
	for (int i =0;i<counter; i++)
	{
		sum+=i;
	}
	System.out.println(sum);
}
public void Throw()
throws Exception
{
	if (mythrows >= 4)
	{
		throw new Exception ("You threw too many dice.");
	}
	
	myvalue = randomnumber();
	mythrows++;
	thehistory();
}
@Override
public int randomnumber()
{
	int dicesides = 1+(int)Math.random()*6;
	return dicesides;
}
@Override
public void thehistory()
{
	for(int i =0;i>0;i--)
	{
		if(history[i] ==0)
			break;
		//Here is a loop with a break, if the break was not there it would continue into the S.o.p.
		System.out.print(history[i] + " ");
	}
	
}
public void historyprinted()
{
	for (int i=0;i<historynumber;i++)
	{
		if(history[i]==0)
			break;
		System.out.print(history[i] + " ");
	}
}
}
