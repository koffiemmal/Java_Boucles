public class Exercice4 {
    public static void main(String[] args) {

        int u0 = 2;
        int u1 = 1;


        System.out.println("U0 = " + u0);
        System.out.println("U1 = " + u1);


        for (int i = 2; i < 21; i++) {

            int U =u0+u1;

            System.out.println("U"+i+"="+U);

            u0=u1;
            u1=U;
        }
    }
}
