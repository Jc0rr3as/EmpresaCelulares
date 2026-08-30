import java.util.Scanner;
public class metodos {
    Scanner sc = new Scanner(System.in);
    public celular[] registrarCelular(celular[] celulares){
        System.out.println("Ingrese la cantidad de celulares a registrar: ");
        int a = sc.nextInt();
        sc.nextLine(); 
        celular[] c = new celular[a];
        for(int i = 0; i < a; i++){
            System.out.println("Ingrese la marca del celular: ");
            String marca = sc.nextLine();
            System.out.println("Ingrese el modelo del celular: ");
            String modelo = sc.nextLine();
            System.out.println("Ingrese el precio del celular: ");
            Double precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad de celulares: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            Double descuento = 0.0;
            int descuentoAplicado = 0;
            celular o = new celular(marca, modelo, precio, cantidad, descuento, descuentoAplicado);
            c[i] = o;
        }

        return c;
    }
    public celular[] aplicarDescuento(celular[] c){
        System.out.println("Ingrese el modelo al que desea aplicar el descuento: ");
        String modelo = sc.nextLine();
        System.out.println("Ingrese el porcentaje de descuento: ");
        Double descuento = sc.nextDouble();
        sc.nextLine();
        boolean modeloEncontrado = false;
        for(int i = 0; i < c.length; i++){
            if(c[i].getModelo().equalsIgnoreCase(modelo)){
                Double precio = c[i].getPrecio();
                Double nuevoPrecio = precio - (precio * (descuento / 100));
                c[i].setPrecio(nuevoPrecio);
                c[i].setDescuento(descuento);
                c[i].setDescuentoAplicado(1);
                modeloEncontrado = true;
            }           
        }
        if(!modeloEncontrado){
            System.out.println("No se encontro el modelo");
        }
        return c;
    }
    public void mostrarCelulares(celular[] c){
        for(int i = 0; i < c.length; i++){
            System.out.println("Marca: " + c[i].getMarca());
            System.out.println("Modelo: " + c[i].getModelo());
            System.out.println("Precio: " + c[i].getPrecio());
            System.out.println("Cantidad: " + c[i].getCantidad());
            if(c[i].getDescuentoAplicado() == 1){
                System.out.println("Descuento aplicado: " + c[i].getDescuento() + "%");
            }else{
                System.out.println("No se ha aplicado descuento");
            }
            System.out.println("-----------------------------");
        }
    }
    public void mostrarCelularesConDescuento(celular[] c){
        boolean hayDescuento = false;
        for(int i = 0; i < c.length; i++){
            if(c[i].getDescuentoAplicado() == 1){
                System.out.println("Marca: " + c[i].getMarca());
                System.out.println("Modelo: " + c[i].getModelo());
                System.out.println("Precio: " + c[i].getPrecio());
                System.out.println("Cantidad: " + c[i].getCantidad());
                System.out.println("Descuento aplicado: " + c[i].getDescuento() + "%");
                System.out.println("-----------------------------");
                hayDescuento = true;
            }
        }
        if(!hayDescuento){
            System.out.println("No hay celulares con descuento");
        }
    }
}
