class Student
{

	 private int number;
	 private String name;

	 public Student()
	 {

	 }

	 public Student(int no, String nm)
	 {

	 	number = no;
	 	name = nm;

	 } // Parameterized Constructor

	public void setNumber(int no)
	{
			number = no;
	}

	public void setName(String nm)
	{
		name = nm;
	}

	public int getNumber()
	{
		return number;

	}

	public String getName()
	{
		return name;
	}


}


public class ParameterisedDefaultConstructorEx
{
	public static void main(String args[])
	{
		Student s1 = new Student(111,"Srinu");

		System.out.println(" \n Student 1 Details ");
		System.out.println(" Number : "+s1.getNumber());
		System.out.println(" Name   : "+s1.getName());


		Student s2 = new Student(222,"Uday");

		System.out.println(" \n Student 2 Details ");
		System.out.println(" Number : "+s2.getNumber());
		System.out.println(" Name   : "+s2.getName());

	}
}














