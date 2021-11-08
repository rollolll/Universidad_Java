package seccion_2;

public class Ejercicio_Concatenacion {

    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = usuario + " " + titulo;
        System.out.println("union = "+union);
        var i = 3;
        var j = 4;
        System.out.println(i+j);
        System.out.println(i+j+usuario);
        System.out.println(usuario+i+j);
        System.out.println(usuario+(i+j));

    }
}
