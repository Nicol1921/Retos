import java.util.Scanner;
public class Reto1 {      
    public static void main(String[] args){

        double fahrenheit;
        double centigrados;
        int harina,torta;
        Scanner Lectura=new Scanner(System.in);
        
            
        System.out.println("ingresar grados fahrenheit");
        fahrenheit= Lectura.nextDouble();
        centigrados= (fahrenheit-32) * 5/9;
        System.out.println("grados convertidos:" + centigrados);

        System.out.println("ingrese la cantidad de personas para realzar la torta");
        torta=Lectura.nextInt();

        harina=(torta/13);

        System.out.println("\nLa abuela debe colocar" +harina+"cantidad en su torta ");

            Lectura.close();
    }
}       