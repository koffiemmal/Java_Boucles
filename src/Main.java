import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner boucle = new Scanner(System.in);

        System.out.print("entrer le nombre de ligne :");

        int l = boucle.nextInt();

        System.out.print("entrer le nombre de colones :");

        int c = boucle.nextInt();

        for (int i=0;i<l;i++) {

            for (int j = 0; j < c; j++) {

                if (i == 0 || i == l - 1) {
                    System.out.print(" * ");
                } else {
                    if (j == 0 || j == c - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }

                }
            }


            System.out.println("");
        }

        }
    }

