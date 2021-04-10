
package web;

public class procesos {
  
    
    public static String operacion(String numero1,String numero2,String operacion){
        int numeroUno = Integer.parseInt(numero1);
        int numeroDos = Integer.parseInt(numero2);
        int OperacionHacer = Integer.parseInt(operacion);
        int resultado = 0;
        
        if(OperacionHacer == 1){
            resultado = numeroUno + numeroDos;
            return "El resultado de la Suma es:" + resultado;
        }else if(OperacionHacer == 2){
            resultado = numeroUno - numeroDos;
            return "El resultado de la resta es:" + resultado;
        }else if(OperacionHacer == 3){
            resultado = numeroUno * numeroDos;
            return "El resultado de la Multiplicacion es:" + resultado;
        }else if(OperacionHacer == 4){
            resultado = numeroUno / numeroDos;
            return "El resultado de la divicion es:" + resultado;
        }   
        
        return "No se realizo la operacion";
    }
    
    
    public static String numeroPrimos(String numero1, String numero2){
        int numeroUno = Integer.parseInt(numero1);
        int numeroDos = Integer.parseInt(numero2);
        int numerosPrimos[];
        int cantNumeroPrimos = 0;
        int contador= 0;
        
        String resultado = "";
        
        for (int numeroEvaluar = numeroUno; numeroEvaluar <= numeroDos; numeroEvaluar++) {
            int conteo = 0;
            for (int numeroDividir = 1; numeroDividir <= numeroEvaluar; numeroDividir++) {
                if (numeroEvaluar % numeroDividir == 0) {
                    conteo++;
                }
            }
            if (conteo == 2){
                cantNumeroPrimos++;
            }
        }
        
        numerosPrimos =new int[cantNumeroPrimos];
        
        for (int numeroEvaluar = numeroUno; numeroEvaluar <= numeroDos; numeroEvaluar++) {
            int conteo = 0;
            for (int numeroDividir = 1; numeroDividir <= numeroEvaluar; numeroDividir++) {
                if (numeroEvaluar % numeroDividir == 0) {
                    conteo++;
                }
            }
            if (conteo == 2){
                numerosPrimos[contador] = numeroEvaluar;
                contador++;
            }
        }
        
        for(int numPri = numerosPrimos.length-1; numPri > -1; numPri--){
            
            resultado += numerosPrimos[numPri] + ",";
            
        }
        System.out.println(resultado);
        return resultado;
    }
}
