package package1;


class ConstructorLecture17_3
{
	int empid;
	String empname;
	
	ConstructorLecture17_3(int x ,String  name) 
	{
		 empid = x;
		 empname = name;		 
		 System.out.println("The empid is" + x + "and name is " + name );	
	}
	
	public static void main (String args[]) {
		ConstructorLecture17_3 obj = new ConstructorLecture17_3(10,"john");
		ConstructorLecture17_3 obj1 = new ConstructorLecture17_3(11,"rahul");
	
		System.out.println( "thisis first" +obj.empid + obj.empname );
		System.out.println(" this is second" + obj1.empid + obj1.empname );
}
}