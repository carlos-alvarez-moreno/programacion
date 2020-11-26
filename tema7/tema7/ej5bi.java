/*
 * ej5bi.java
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


public class ej5bi {
	
	public static void main (String args[]) {
		
    int num[][] = new int[6][10];
    int maximo=0;
    int minimo=1000;
    
    for(int i=0; i<6 ; i++){
      for(int j=0; j<10; j++){
        num[i][j]=(int)(Math.random()*1001);
        if(num[i][j]>maximo){
          maximo=num[i][j];
        }
        if(num[i][j]<minimo){
          minimo=num[i][j];
        }
      }
    }
    
    for(int i=0; i<4 ; i++){
      for(int j=0; j<5; j++){
        System.out.printf("%8d|",num[i][j]);
      }
      System.out.println();
    }
    System.out.println("El maximo es: "+maximo);
    System.out.print("El minimo es: "+minimo);
	}
}

