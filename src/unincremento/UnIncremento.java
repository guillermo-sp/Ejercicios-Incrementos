/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unincremento;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class UnIncremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce un numero");
        int num1 = teclado.nextInt();
           
        if (num1%2==0){
             int numpar=num1+2;
            System.out.printf("El numero es par, por lo tanto es %d %n",numpar);
                  
        }else if(num1%3==0){
            int multiploTres = num1 +3;
            System.out.printf("El numero es multiplo de tres y se convierte en %d %n",multiploTres);
        }else if (num1%5==0){
            int multiploCinco=num1+5;
            System.out.printf("El numero es multiplo de cinco y se convierte en %d %n", multiploCinco);
        } else {
            int unIcremento=num1+1;
            System.out.printf("El numero no es multiplo de nada y se convierte en %d %n ", unIcremento);
            
        }
               
    }
    
}
