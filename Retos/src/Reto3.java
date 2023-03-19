import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
    int num=(int)(Math.random()*3+1);
    int proceso=0,apuesta;
     
     
     Scanner lectura=new Scanner(System.in);

     System.out.println("ingrese 1 si desea jugar con papel, 2 con tijeras y 3 con piedra ");
     proceso=lectura.nextInt();
     System.out.println("ingrese lo que desea apostar ");
     apuesta=lectura.nextInt();

     if (proceso>num){
         System.out.println("usted gano "+ apuesta);
     }
     else if (proceso<num){
         System.out.println("usted perdio " +(-apuesta));
     }
     else{
         System.out.println("empate");
     }  
     
     lectura.close();     

             }

         }
    

