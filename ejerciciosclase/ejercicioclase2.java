//@author Carlos

import java.util.Scanner;

public class ejercicioclase2 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n1=0;
    int n2=0;
    int total=0;
    
		for(int i=1; i<=10; i++)
    {
      System.out.print("Dime un numero ");
      n1 = s.nextInt();
      System.out.print("Dime otro numero ");
      n2 = s.nextInt();
      total=n1+n2;
      System.out.println("la suma de los dos es: "+total);
    }
	}
}

