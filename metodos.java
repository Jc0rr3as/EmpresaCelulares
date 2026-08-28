import java.util.Scanner;
public class metodos {
    public celular[] registrarCelular(celular[] c, Scanner sc){
        System.out.println("Ingrese la cantidad de celulares a registrar: ");
        int a = sc.nextInt();
        celular[] celulares = new celular[a];
        for (int i = 0; i < celulares.length; i++) {
            System.out.println("Ingrese la marca del celular: ");
            String marca = sc.next();
            System.out.println("Ingrese el modelo del celular: ");
            String modelo = sc.next();
            System.out.println("Ingrese el precio del celular: ");
            Double precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad de celulares: ");
            int cantidad = sc.nextInt();

            celulares[i] = new celular(marca, modelo, precio, cantidad);
        }

        return celulares;
    }
}
