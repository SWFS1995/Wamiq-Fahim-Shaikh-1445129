
public class Counter
{
	private int Count, Base;
	public Counter(int BaseVal)
	{
		Base = BaseVal;
	}
	public void increment()
	{
		Count++;
		if(Count==Base)
		{
			reset();
		}
	}
	public void reset()
	{
		Count =0;
	}
	public int ViewCount()
	{
		return Count;
	}
}
