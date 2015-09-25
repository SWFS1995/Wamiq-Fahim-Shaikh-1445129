
public class Clock 
{
	private Counter hours, mins, secs;
	public Clock()
	{
			hours = new Counter(24);
			mins = new Counter(60);
			secs = new Counter(60);
	}
	public void tick()
	{
		secs.increment();
		if(secs.ViewCount()==0)
		{
			mins.increment();
			if((secs.ViewCount()==0)&&(mins.ViewCount()==0))
			{
				hours.increment();
			}
		}
	}
	public int viewHr()
	{
		return hours.ViewCount();
	}
	public int viewMin()
	{
		return mins.ViewCount();
	}
	public int viewSec()
	{
		return secs.ViewCount();
	}
	
	
	public void ShowTime()
	{
		System.out.println(hours.ViewCount()+":"+mins.ViewCount()+":"+secs.ViewCount());
	}
}

