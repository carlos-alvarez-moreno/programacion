/*
 * ej11bi.java
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


public class ej11bi {
	
	public static void main (String args[]) {
		
    int num[][] = new int[10][10];
    
    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        num[i][j]= (int)((Math.random()*101)+200);
        System.out.print(num[i][j]+" ");
      }
      System.out.println();
    }
    
    System.out.println();
    
    int contador=0;
    int total=0;
    int max=0;
    int min=300;
    
    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        if(contador==j && contador==i){
          total=total+num[i][j];
          System.out.print(num[i][j]+" ");
          contador=contador+1;
          if(min>num[i][j]){
            min=num[i][j];
          }
          if(max<num[i][j]){
            max=num[i][j];
          }
        }
      }
    }
    System.out.println();
    System.out.println("La media es: "+total/contador);
    System.out.println("El minimo es: "+min);
    System.out.println("El maximo es: "+max);
	}
}

