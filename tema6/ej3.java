/*
 * ej3.java
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

public class ej3 {
	
	public static void main (String args[]) {
    
    int numcarta= (int)(Math.random()*13)+1;
    switch(numcarta){
      default:System.out.println(numcarta);
      break;
      case 1 : System.out.println("A");
      break;
      case 11: System.out.println("Sota");
      break;
      case 12: System.out.println("Caballo");
      break;
      case 13: System.out.println("Rey");
      break;
	}
}
}

