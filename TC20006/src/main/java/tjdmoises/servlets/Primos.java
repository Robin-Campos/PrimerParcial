package tjdmoises.servlets;


/**
 *
 * @author Moisés Tejada
 */

class Primos {
    int cont = 0;
    public boolean esPrimo(int num) {
        int cont = 2;
        boolean primo = true;
        while ((primo) && (cont != num)) {
            if (num % cont == 0) {
                primo = false;
            }
            cont++;
        }
        return primo;
    }
}