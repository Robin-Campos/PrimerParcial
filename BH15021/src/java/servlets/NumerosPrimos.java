/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

/**
 *
 * @author Glass
 */
public class NumerosPrimos {


    public boolean buscarPrimo(int num) {
        int contador = 2;
        boolean numPrimo = true;
        while ((numPrimo) && (contador != num)) {
            if (num % contador == 0) {
                numPrimo = false;
            }
            contador++;
        }
        return numPrimo;
    }
    
}
