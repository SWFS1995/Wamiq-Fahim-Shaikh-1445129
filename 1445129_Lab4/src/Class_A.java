
public class Class_A 
{
protected String StringName;
	
	public Class_A(String ClassName)
	{
		StringName = ClassName;
	}
	
	private int add(int a,int b)
	{
		int sum;
		sum = a +b;
		return sum;
	}
	
	protected int Multiply(int a, int b)
	{
		int ans;
		add(3,4);
		ans = a*b;
		return ans;
	}
}
