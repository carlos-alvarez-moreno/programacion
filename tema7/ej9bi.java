/*
 * ej9bi.java
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


public class ej9bi {
	
	public static void main (String args[]) {
    
    int matriz[][] = new int [12][13];
		
    for(int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        matriz[i][j] = (int) (Math.random()*101);
        System.out.printf("%4d",matriz[i][j]);
      }
      System.out.println();
    }
    for(int i=0; i<1; i++) {
      int aux1 = matriz[i][11 - i];
      for (int j=11-i; j>i; j--) {
        matriz[i][j] = matriz[i][j - 1];
      }
      
      for (int j = 11-i; j>i; j--) {
        matriz[j][11-i] = matriz[j-1][11-i];
      }
      
    }
    
    System.out.println();
    
    for(int i=0; i<12; i++) {
      for(int j=0; j<12; j++) {
        System.out.printf("%4d", matriz[i][j]);
      }
      System.out.println();
    }
  }
}

