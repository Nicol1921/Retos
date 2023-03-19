import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        
    String NombreMedico,NombreMama,NombreBebe;
    int mes_actual=0,mes_nacimiento=0,peso;

    Scanner Lectura=new Scanner(System.in);

    System.out.println("ingrese por favor el nombre del medico");
    NombreMedico=Lectura.nextLine();

    System.out.println("ingrese por favor el nombre de la mamá");
    NombreMama=Lectura.nextLine();

    System.out.println("ingrese por favor el nombre del Bebe");
    NombreBebe=Lectura.nextLine();

    System.out.println("ingrese por favor el peso del Bebe");
    peso=Lectura.nextInt();
    peso=+15;

    System.out.println("digite el mes actual en numeros por favor");
    mes_actual=Lectura.nextInt();

    System.out.print("digithe el mes de nacimiento en numeros por favor");
    mes_nacimiento=Lectura.nextInt();
    
    int meses=(mes_actual-mes_nacimiento);

    System.out.println("El bebe tiene "+meses+ "meses");
    meses=+5+5*8;

    int dosis=meses+peso;

    System.out.println("El medico que atendio al bebe se llama "+NombreMedico);
    System.out.println("La mamá de bebe se llama "+NombreMama);
    System.out.println("El nombre del bebe es "+NombreBebe);
    System.out.println("La dosis necesaria para el bebe es "+dosis);
    
    
    Lectura.close();
    }

    }
    
