package linked_list;

public class linked_list {

	private String list_name;
	private node first, list;
	private int nodeCount = 0;
	
	public linked_list(String name)
	{
		setList_name(name);
	}
	
	public void add(int val)
	{
		if(list==null)
		{
			list = new node();
			list.value = val;
			list.next = null;
			setFirst(list);
		}
		else
		{
			node temp;
			temp = list;
			list = new node();
			list.value = val;
			list.next = null;
			temp.next = list;			
		}
		nodeCount++;
	}
	
	public void printlist()
	{
		node temp = first;
		while(temp.next!=null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void delete()
	{
		
	}
	
	public int Count()
	{
		return nodeCount;
	}

	/*Getter and Setter*/
	public String getList_name() {
		return list_name;
	}

	public void setList_name(String list_name) {
		this.list_name = list_name;
	}

	public node getFirst() {
		return first;
	}

	public void setFirst(node first) {
		this.first = first;
	}
}
