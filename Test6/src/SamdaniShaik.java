import java.util.Scanner;
public class SamdaniShaik {
	
private static int empid=1240598;
	public static  void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
System.out.println("enter the employee id");
int emp1;
 emp1=input.nextInt();
 Samdani z=new Samdani();
if(empid==emp1)
{
	System.out.println("the project name is"+ z.getProject() );
	System.out.println("the location is"+ z.getLocation());
}
else
	System.out.println("unknown user");
	}


}
