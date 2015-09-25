
public class Class_C extends Class_B 
{
	private String someStr;
	public Class_C()
	{
		super("Class C");
	} 
	
	public String printHello()
	{
		setString();
		return someStr;
	}
	
	private void setString()
	{
		someStr="Hello World";
	}
	
	protected String printALine()
	{
		return "This is another string.";
	}
}
