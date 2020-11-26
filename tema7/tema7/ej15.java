/*
 * ej15.java
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

public class ej15 {
	
	public static void main (String args[]) {
		
    Scanner s = new Scanner(System.in);
    int mesas[] = new int[10];
    int clientes=0;
    
    for(int i=0 ; i<10; i++){
      mesas[i] = (int)(Math.random()*5);
      System.out.print("mesa nº"+(i+1));
      System.out.print(" ocupación: "+mesas[i]);
      System.out.println();
    }
    do{
      System.out.print("Pulse -1 para salir o digame cuantos son: ");
      clientes = s.nextInt();
      if(clientes>4){
        System.out.print("no pueden ser mas de 4 por favor introduzca otro numero: ");
        clientes = s.nextInt();
      }
      else{
        for(int i=0; i<10 ; i++){
          switch(clientes){
            case 4:
            if(mesas[i]==0){
              mesas[i]=mesas[i]+4;
              System.out.println("puede sentarse en la mesa:"+(i+1));
            }
            else{
              System.out.println("Lo siento no nos queda sitio en la mesa: "+(i+1));
            }
            break;
            case 1:
            if(mesas[i]<4){
              mesas[i]=mesas[i]+1;
              System.out.println("puede sentarse en la mesa:"+(i+1));
            }
            else{
              System.out.println("Lo siento no nos queda sitio en la mesa: "+(i+1));
            }
            break;
            case 2:
            if(mesas[i]<3){
              mesas[i]=mesas[i]+2;
              System.out.println("puede sentarse en la mesa:"+(i+1));
            }
            else{
              System.out.println("Lo siento no nos queda sitio en la mesa: "+(i+1));
            }
            break;
            case 3:
            if(mesas[i]<2){
              mesas[i]=mesas[i]+3;
              System.out.println("puede sentarse en la mesa:"+(i+1));
            }
            else{
              System.out.println("Lo siento no nos queda sitio en la mesa: "+(i+1));
            }
            break;
          }
        }
        for(int i=0 ; i<10; i++){
        System.out.print("mesa nº"+(i+1));
        System.out.print(" ocupación: "+mesas[i]);
        System.out.println();
        }
      }
    }while(clientes!=-1);
  }
}

