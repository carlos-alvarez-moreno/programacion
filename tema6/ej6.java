/*
 * ej6.java
 * 
 * Copyright 2020 Linux User <tux@slitaz>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * @author carlos
 */

import java.util.Scanner;

public class ej6 {
	
	public static void main (String args[]) {
    
		Scanner s = new Scanner(System.in);
    int intentos=5;
    int respuesta= 0;
    
    int numaleatorio = (int)((Math.random()*101));

    do{
      System.out.print("Introduce un numero: ");
      respuesta = s.nextInt();
      
      if(respuesta!=numaleatorio){
        intentos-=1;
        System.out.println("has fallado te quedan "+intentos+" intentos");
        if(respuesta<numaleatorio){
          System.out.println("El numero introducido es menor que el numero secreto");
        }
        if(respuesta>numaleatorio){
          System.out.println("El numero introducido es mayor que el numero secreto");
        }
      }

    }while(intentos!=0 && respuesta!=numaleatorio);
	}
}

