
public class Main
{

	public static void main(String[] args) 
	{
		BankAccount BA = new BankAccount();
		System.out.println("||=====|Bank Account|=====||");
		System.out.println(BA.Customer_name="James");
		System.out.println(BA.Account_type="Savings Account");
		System.out.println(BA.balance=40000);
		System.out.println(BA.deposit(5000));
		System.out.println(BA.Withdraw(6000));
				
		Calculator Cal = new Calculator();
		System.out.println("||=====|Calculator|=====||");
		Cal.Add(5, 5);
		Cal.Subtraction(6, 3);
		Cal.Multiplication(10, 8);
		Cal.Division(40, 4);
		
		Factorial Fact = new Factorial();
		System.out.println("||=====|Factorial|=====||");
		System.out.println(Fact.Factorial(4));
				
		FordCar FC = new FordCar();
		System.out.println("||=====|Ford Car|=====||");
		System.out.println(FC.color="Yellow");
		System.out.println(FC.model="Mustang");
		System.out.println(FC.type="Coupe");
		System.out.println(FC.cylinder=6);
		
		FC.start();
		FC.Accelerate();
		
		Person Per = new Person();
		System.out.println("||=====|Person|=====||");
		System.out.println(Per.Name="Wallace");
		System.out.println(Per.height=155);
		System.out.println(Per.age=19);
		Per.Speak();
		Per.Listen();
		
		
		ShippingBox SB = new ShippingBox();
		System.out.println("||=====|Shipping Box|=====||");
		System.out.println(SB.Sender_name="Bob");
		System.out.println(SB.Receiver_Name="Rob");
		System.out.println(SB.Cpr=150);
		System.out.println(SB.Weight=15);
		SB.ShippingCost();
	}

}
