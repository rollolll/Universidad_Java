package seccion_2;

public class Tipos_Variables {

    public static void main(String[] args) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificar el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //Var - Inferencia de tipos java
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 "+ miVariableCadena2);
    }

}

