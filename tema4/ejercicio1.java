
public class ejercicio1 {
	
	public static void main (String args[]) {
    System.out.print("Dime un dia de la semana: ");
    String dia;
    dia = System.console().readLine();
    String nombredia;
    
    switch (dia)
    {
      case "lunes":
      System.out.print("a primera hora hay  programacion");
      break;
      case "martes":
      System.out.print("a primera hora hay  sistemas");
      break;
      case "miercoles":
      System.out.print("a primera hora hay  programacion");
      break;
      case "jueves":
      System.out.print("a primera hora hay  programacion");
      break;
      case "viernes":
      System.out.print("a primera hora hay  sistemas");
      break;
    }
	}
}

