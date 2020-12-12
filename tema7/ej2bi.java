/*
 * ej2bi.java
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

public class ej2bi {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int num[][] = new int[5][5];
    int suma=0;
    int suma2=0;
    int total=0;
    
    for(int i=0; i<4 ; i++){
      
      for(int j=0; j<5; j++){
        System.out.print("Introduce la fila " + i + ", columna " + j + ": ");
        num[i][j]= s.nextInt();
      }
    }
    
    for(int i=0; i<4 ; i++){
      suma = 0;
      suma2 = 0;
      for(int j=0; j<5; j++){
        System.out.printf("%8d",num[i][j]);
        suma += num[i][j];
        suma2 += num[j][i];
      }
      total += suma2;
      System.out.println("| fila "+(i+1)+" total: "+suma+"| columna "+(i+1)+" total: "+suma2);
    }
    System.out.print("El total es: "+total);
  }
}

