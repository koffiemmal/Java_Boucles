import java.util.Scanner;

public class Exerice7 {
    public static void main(String[] args) {

        Scanner parfait = new Scanner(System.in);

        System.out.print("entrer votre nombre :");

        int nombre = parfait.nextInt();

        int somme = 0;

        for(int i =1;i<nombre;i++){

            if(nombre % i ==0){

                somme+=i;
            }


        }
        if(somme!=nombre) {
            System.out.println("votre nombre n'est pas parfait");
        }else{
            System.out.println("votre nombre est parfait");
        }

        }
    }

