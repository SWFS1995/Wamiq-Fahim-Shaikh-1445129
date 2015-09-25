
public class ShippingBox 
{
	public String Sender_name, Receiver_Name;
	public int Cpr, Weight;
	
	public int ShippingCost()
	{
		int ShpCost;
		ShpCost = Cpr * Weight;
		return ShpCost;
	}
}
