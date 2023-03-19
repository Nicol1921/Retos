import java.util.Random;
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
     
        int proceso,apuesta,i=1;
         Scanner lectura=new Scanner(System.in);
     
         System.out.println("ingrese lo que desea apostar ");
         apuesta=lectura.nextInt();

      while( i==1){
        for(int vidas=3;vidas>0;){
            System.out.println("ingrese 1 si desea jugar con sello y 2 si desea jugar con cara ");
            proceso=lectura.nextInt();
    
        int num=(int)(Math.random()*2+1);

        if (proceso>num){
        System.out.println("usted gano "+(apuesta*2));

        }
        else{
            System.out.println("usted perdio " +(-apuesta/2));
            vidas--;
    }
            System.out.println("sus vidas son 0, digite 1 si quiere volver a jugar ");
            i=lectura.nextInt();
          
        }
        System.out.println("fin del juego");
        lectura.close(); 
      }
}
}




