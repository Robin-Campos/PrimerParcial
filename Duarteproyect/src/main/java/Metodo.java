/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this datolate file, choose Tools | Templates
 * and open the datolate in the editor.
 */

/**
 *
 * @author Manuel Duarte
 */
public class Metodo {
    public int mayor(int num1, int num2){

        if (num1 > num2){
            return num1;
        }
        return num2;
    }

    public int menor(int num1, int num2){

        if (num1 < num2){
            return num1;
        }
        return num2;
    }
    public boolean elPrimo(int num) {


        int iniciaConteo = 2;
        boolean prime = true;

        while (iniciaConteo <= (num / 2)) {

            if (num % iniciaConteo == 0) {
                prime = false;

                break;
            }
            iniciaConteo++;
        }

        return prime;

    }

    public  int conteoPrimix(int num1, int num2) {

        int fin = mayor(num1,num2);
        int iniciaConteo = menor(num1,num2);
        int contar = 0;

        for (int i = iniciaConteo; i <= fin; i++) {

            if (elPrimo(i)) {
                contar++;
            }
        }
        return contar;
    }

    public int[] Lista (int num1, int num2) {

        int fin = mayor(num1,num2);
        int iniciaConteo = menor(num1,num2);
        int limite = conteoPrimix(num1, num2);

        int primix[] = new int[limite];

        int entrada = 0;
        for (int i = iniciaConteo; i <= fin; i++) {
            if (elPrimo(i)) {
                primix[entrada] = i;
                entrada++;
            }

        }

        return primix;
    }

    public void conteoVectorcito(int vectorcito[]) {

        int limite = vectorcito.length;

        int dato[] = new int[limite];
        int entrada = limite - 1;

        for (int i = 0; i < limite; i++) {
            dato[i] = vectorcito[entrada];

            entrada--;
        }

        entrada = 0;
        for (int i : dato) {
            vectorcito[entrada] = i;
            entrada++;
        }
    }

    public void impVector(int vectorcito[]) {

        for (int i : vectorcito) {
            System.out.println(i);
        }
    }
}
