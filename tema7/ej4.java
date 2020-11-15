/*
 * ej4.java
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


public class ej4 {
	
	public static void main (String args[]) {
		
    int[] num;
    num = new int[20];
    
    int[] cuadrado;
    cuadrado = new int[20];
    
    int[] cubo;
    cubo = new int[20];
    
    for(int i=0; i<20; i++){
      num[i] = (int)(Math.random()*101);
      System.out.print(num[i]+" ");
      
      cuadrado[i]=num[i]*num[i];
      System.out.print(cuadrado[i]+" ");
      
      cubo[i]=cuadrado[i]*num[i];
      System.out.print(cubo[i]+" ");
      
      System.out.println();
    }
  } 
}
