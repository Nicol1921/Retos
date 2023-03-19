import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        String nombre_empleado,nombre_producto,nombre_cliente;
        int cantidad_producto,total=0,precio_producto;
        Scanner Lectura=new Scanner(System.in);

        System.out.print("Ingrese por favor el nombre del empleado: ");
        nombre_empleado=Lectura.nextLine();

        if(nombre_empleado.equals("Juan")){
            System.out.print("Ingrese por favor el nombre del cliente: ");
            nombre_cliente=Lectura.nextLine();
            System.out.print("Ingrese por favor el nombre del producto: ");
            nombre_producto=Lectura.nextLine();
            System.out.print("Ingrese por favor la cantidad de productos: ");
            cantidad_producto=Lectura.nextInt();
            System.out.print("Ingrese por favor el precio del producto: ");
            precio_producto=Lectura.nextInt();
            total=(cantidad_producto*precio_producto);
            System.out.print("el nombre del empleado es. " +nombre_empleado);
            System.out.print("el nombre de su cliente es: " +nombre_cliente);
            System.out.print("el nombre de su  producto es: " +nombre_producto);
            System.out.print("la cantidad de su compra es: " +cantidad_producto);
            System.out.print("el total de su compra es: " +total);}
        else{
        System.out.print("No se encuentra registrado, registrese por favor");
        nombre_empleado=Lectura.nextLine();
            }
            }
        }  

    
  

