import java.util.Scanner;

public class ejercicioclase {
	
	public static void main (String args[]) {
    Scanner s= new Scanner(System.in);
    
    System.out.print("Dime una palabra: ");
    String palabra = s.nextLine();
    System.out.print("Dime el numero de veces a repetir: ");
    int n = s.nextInt();
    
    for(int i=1; i<=n; i++)
    {
      System.out.println(""+palabra);
    }
    
	}
}

