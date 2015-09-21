import java.util.*;
import java.math.*;
public class areaOfShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.print("Please choose circle (1), square (2), rectangle (3), or triangle (4): ");
int choice = scan.nextInt();
switch(choice){
case(1): {
	System.out.print("Please enter radius: ");
	double val = scan.nextDouble();
	System.out.println("Answer: " + (Math.pow(val,2) * Math.PI));
}
case(2): {
	System.out.print("Please enter side length: ");
	double val = scan.nextDouble();
	System.out.println("Answer: " + Math.pow(val,2));
}
case(3): {
	System.out.print("Please enter side 1 length: ");
	double val = scan.nextDouble();
	System.out.print("Please enter side 2 length: ");
	double val1 = scan.nextDouble();
	System.out.println("Answer: " + (val * val1));
}
case(4): {
	System.out.print("Please enter base length: ");
	double val = scan.nextDouble();
	System.out.print("Please enter height: ");
	double val1 = scan.nextDouble();
	System.out.println("Answer: " + (val * val1 / 2));
}
}
		
		
		
	}

}
