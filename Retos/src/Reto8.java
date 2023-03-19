import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        
        String nombre_aprendiz,auxilio_aprendiz;
        int proceso;
        Scanner Lectura=new Scanner(System.in);

        System.out.println("si usted tiene un auxilio digite 1 por favor y ingrese 2 si no tiene ningun auxilio");
        proceso=Lectura.nextInt();

        if(proceso==1){
            System.out.println("usted ya tiene un auxilio no puede aplicar a otro");
            
        }
        else if (proceso==2) {
           
            System.out.println("ingrese su nombre por favor");
            nombre_aprendiz=Lectura.nextLine();

            System.out.println("digite por favor el auxilio que desea registra, Transpporte, Alimentación, Sostenimiento, Regular, Sostenimiento FIC, Apoyo digital  ");
            auxilio_aprendiz=Lectura.nextLine();
            
        
        System.out.println("su nombe es  "+nombre_aprendiz+  "El auxilio al que aplico es  "+auxilio_aprendiz);
        }
        
Lectura.close();
    
            
        }
     
}







    

