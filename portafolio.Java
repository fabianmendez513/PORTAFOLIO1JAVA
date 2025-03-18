import java.util.Scanner;

public class portafolio {

    public class void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("[1] ");
            System.out.println("[2] ");
            System.out.println("[3] ");
            System.out.println("[0] ");
            System.out.print("[?] ");
            opcion = scanner.nexInt();

            //OPCIONES
            switch (opcion){
                case 1 :

                    System.out.println("[n1] ");
                    int n1 = scanner.nextInt();

                    break;
                default:
                    break;
            } while (opcion !=0);
        }
    }
}