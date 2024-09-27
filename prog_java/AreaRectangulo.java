
package prog_java;

/**
 * AreaRectangulo
 */
public class AreaRectangulo {

    public static void main(String[] args) {
        int base, altura, area;
    //Entrada
    System.out.println("Ingresa la base: ");
    base =Integer. parseInt((System.console().readLine()));

    System.out.println("Ingrese la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    
    //Proceso
    area = base*altura;

    //salida
    System.out.println("el area del rectangulo es: "+area);
    

    }
}

