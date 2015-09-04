
public class Factorial 
{
	public int Factorial(int Fact)
	{
		int i;
		for(i=Fact;i>0;i--)
		{
			Fact=Fact*i;
		}
		return Fact;
	}
}
