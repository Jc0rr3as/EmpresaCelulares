import java.util.Scanner;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        celular[] celulares = null;
        int opcion = 0;
        do{
            System.out.println("1. Registrar celulares");
            System.out.println("2. Aplicar descuento");
            System.out.println("3. Mostrar celulares");
            System.out.println("4. Mostrar celulares con descuento");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    celulares = m.registrarCelular(celulares);
                    break;
                case 2:
                    if(celulares != null){
                        celulares = m.aplicarDescuento(celulares);
                    }else{
                        System.out.println("No hay celulares registrados");
                    }
                    break;
                case 3:
                    if(celulares != null){
                        m.mostrarCelulares(celulares);
                    }else{
                        System.out.println("No hay celulares registrados");
                    }
                    break;
                case 4:
                    if(celulares != null){
                        m.mostrarCelularesConDescuento(celulares);
                    }else{
                        System.out.println("No hay celulares registrados");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion != 5);
        sc.close();
    }
}
