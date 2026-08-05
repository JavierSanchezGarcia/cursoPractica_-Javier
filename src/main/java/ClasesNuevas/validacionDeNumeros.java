package ClasesNuevas;

public class validacionDeNumeros {

    public static String elNumeroEsPositivoONegativo(int numero){
        String resultado="";
        if (numero==0){
            resultado="es igual a cero";
        } else if (numero>0){
            resultado="Positivo";
        }else {
            resultado="negativo";
        }
        return resultado;
    }


}
