/*
 * ejercicioclase7.java
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

public class ejercicioclase7 {
	
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
    
    System.out.print("Dime un el num de filas ");
    int n = s.nextInt();
    
    for(int i=1; i<=n; i++)
    {
      for(int a=1; a<=i; a++)
      {
        System.out.print(" "+a);
      }
      System.out.println("");
    }
	}
}
