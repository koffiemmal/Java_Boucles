import java.util.Scanner;

public class EXercice6 {
    public static void main(String[] args) {
        Scanner entier = new Scanner(System.in);
        System.out.print("entrer votre nombre :");
        int nombre = entier.nextInt();

               double racine = Math.sqrt(nombre);
               boolean decimal = false;

               if(racine == (int) racine){
                   System.out.println(racine);
               }else {
                   System.out.println("votre nombre est pas entier");
               }




    }
}
