/*
 * ej10.java
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


public class ej10 {
	
	public static void main (String args[]) {
    
    String pintar="";
    for(int lineas=0; lineas<10; lineas++){
      int caracteres = (int)(Math.random()*40)+1;
      int signo = (int)(Math.random()*5);
      switch(signo){
        case 0: pintar="+"; 
        break;
        case 1: pintar="="; 
        break;
        case 2: pintar="*"; 
        break;
        case 3: pintar="@"; 
        break;
        case 4: pintar="."; 
        break;
      }
      for(int j=0; j<=caracteres; j++){
        System.out.print(pintar);
      }
      System.out.println();
    }
		
	}
}

