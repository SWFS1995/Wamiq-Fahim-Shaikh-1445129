package linked_list;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked_list myList = new linked_list("myList");
		
		for(int i = 0; i<10;i++)
		{
			System.out.println("added value!!");
			myList.add(i);
		}
		myList.printlist();
		System.out.println("Node Count = "+myList.Count());
		
	}

}
