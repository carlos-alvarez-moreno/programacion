/*
 * ejercicio29.java
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

public class ejercicio29 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int total=1;
    
    System.out.print("Dime un numero: ");
		int n = s.nextInt();
    System.out.print("Dime por cuanto lo quieres dividir: ");
		int div = s.nextInt();
    
    for(int i=1; i<=n; i++)
    {
      System.out.print(i+" ");
      if(n%div==0)
      {
        System.out.println(i);
      }
    }
	}
}

