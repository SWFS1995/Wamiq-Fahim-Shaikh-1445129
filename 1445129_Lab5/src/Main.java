import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int registrationNo;
		String studentName, departmentName;
		
		Student[] STD = new Student[3];
		
		for(int i=0;i<STD.length;i++)
		{
			System.out.println("Student Name:   ");
			studentName = scan.next();
			System.out.println("Student Registration Number:   ");
			registrationNo = scan.nextInt();
			System.out.println("Student Department Name:   ");
			departmentName = scan.next();
			STD[i] = new Student(studentName, registrationNo, departmentName);
		}
		for(int j=0;j<STD.length;j++)
		{
			System.out.println(STD[j].StdName+" "+STD[j].RegNo+" "+STD[j].StdDepo);
		}
	}

}
