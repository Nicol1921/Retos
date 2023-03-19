import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) {
        int numero=(int)(Math.random()*2+1);
        int proceso=0,apuesta;
         Scanner lectura=new Scanner(System.in);

         System.out.println("ingrese 1 si desea cara y 2 si desea sello");
         proceso=lectura.nextInt();
         System.out.println("ingrese lo que desea apostar ");
         apuesta=lectura.nextInt();


         if (proceso==numero){
            System.out.println("usted gano "+ apuesta);
         }
         else{
            System.out.println("usted pierde "+(-apuesta));
         }

         lectura.close();
    
}
}
