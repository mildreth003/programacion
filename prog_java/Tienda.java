package prog_java;

    import java.util.Scanner;

    public class Tienda {
        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
    
            // Pedir el precio del artículo
            System.out.print("Ingrese el precio del artículo: ");
            double precio = scanner.nextDouble();
    
            // Pedir la cantidad de artículos que lleva el cliente
            System.out.print("Ingrese la cantidad de artículos: ");
            int cantidad = scanner.nextInt();
    
            // Calcular el total a abonar
            double total = precio * cantidad;
    
            // Mostrar el total
            System.out.println("El total a abonar es: $" + total);
    
            // Cerrar el scanner
            scanner.close();
        }
    }

    

