import java.util.Random;
import java.util.Scanner;

public class jeu {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner entier = new Scanner(System.in);

       int nombreAleatoire = random.nextInt(100)+1;


        int i=1;

        Scanner niveau = new Scanner(System.in);



        System.out.println("quelle niveau choisissez vous ? \n 1= facile \n 2= moyen \n 3=difficile");


        int level = niveau.nextInt();

        System.out.print("entrer un nombre compris entre 1 et 100 :");

        int valeur = entier.nextInt();

        if(level ==1 ){if(nombreAleatoire == valeur){

            System.out.println("BRAVO!!!");
        }
        else{
            while (i<15){
                i++;



                if(nombreAleatoire == valeur){
                    System.out.println("Bravo");
                }
                else{

                    System.out.println("reassayer"+ " il vous reste "+(16-i)+"essaie");
                    if(valeur>nombreAleatoire){
                        System.out.println("c'est moins");
                    }else{
                        System.out.println("c'est plus");
                    }

                }
                valeur = entier.nextInt();

                if(i == 15){
                    System.out.println("vous avez perdu");
                    break;
                }

            }
            System.out.println(nombreAleatoire);
        }}
 if (level == 2){
     if(nombreAleatoire == valeur){

         System.out.println("BRAVO!!!");
     }
     else{
         while (i<10){
             i++;



             if(nombreAleatoire == valeur){
                 System.out.println("Bravo");
             }
             else{

                 System.out.println("reassayer"+ " il vous reste "+(11-i)+"essaie");
                 if(valeur>nombreAleatoire){
                     System.out.println("c'est moins");
                 }else{
                     System.out.println("c'est plus");
                 }
             }
             valeur = entier.nextInt();
             if(i == 10){
                 System.out.println("vous avez perdu");
                 break;
             }


         }
         System.out.println(nombreAleatoire);
     }}
if(level ==3){

    if(nombreAleatoire == valeur){

        System.out.println("BRAVO!!!");
    }
    else{
        while (i<5){
            i++;



            if(nombreAleatoire == valeur){
                System.out.println("Bravo");
            }
            else{

                System.out.println("reassayer" + " il vous reste "+(6-i)+"essaie");
                if(valeur>nombreAleatoire){
                    System.out.println("c'est moins");
                }else{
                    System.out.println("c'est plus");
                }
            }
            valeur = entier.nextInt();
            if(i == 5){
                System.out.println("vous avez perdu");
                break;
            }

        }
        System.out.println(nombreAleatoire);
    }
}



    }
}
