/*
 * ej5.java
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
 * 
 */
public class ej5 {
  public static void main(String[] args) {
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    int n;
    for (int i = 0; i < 50; i++) {
      n = (int)(Math.random()*100) + 100;
      System.out.print(n + " ");
      suma += n;
     
      if (n < minimo) {
        minimo = n;
      }
      if (n > maximo) {
        maximo = n;
      }
    }
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50\);
  }
}
