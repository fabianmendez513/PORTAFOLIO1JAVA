import java.util.Scanner;
public class portafoliodeprogramas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        vistas.vista.banner();

        do {
            System.out.println("[0] Salir");
            System.out.print("[?]");

            opcion = scanner.nextInt();

        //Opciones
        switch (opcion){
            case 1 :
            System.out.println ("---------------------------");
            System.out.print("[n1]");
            int n1 = scanner.nextInt();
            System.out.println(n1);
            System.out.println ("---------------------------");
            break;
        default:
        case 2 :
            System.out.println ("---------------------------");
            System.out.print("[n2]");
            int n2 = scanner.nextInt();
            System.out.println(n2);
            System.out.println ("---------------------------");
            break;
        case 3 :
            System.out.println ("---------------------------");
            System.out.print("[n3]");
            int n3= scanner.nextInt();
            System.out.println(n3);
            System.out.println ("---------------------------");
        case 4 :
            System.out.println ("---------------------------");
            System.out.print("[n4]");
            int n4 = scanner.nextInt();
            System.out.println(n4);
            System.out.println ("---------------------------");
        case 5 :
            System.out.println ("---------------------------");
            System.out.print("[n5]");
            int n5 = scanner.nextInt();
            System.out.println(n5);
            System.out.println ("---------------------------");
        case 6 :
            System.out.println ("---------------------------");
            System.out.print("[n6]");
            int n6 = scanner.nextInt();
            System.out.println(n6);
            System.out.println ("---------------------------");
        case 7 :
            System.out.println ("---------------------------");
            System.out.print("[n7]");
            int n7 = scanner.nextInt();
            System.out.println(n7);
            System.out.println ("---------------------------");
        case 8 :
            System.out.println ("---------------------------");
            System.out.print("[n8]");
            int n8 = scanner.nextInt();
            System.out.println(n8);
            System.out.println ("---------------------------");
        case 9 :
            System.out.println ("---------------------------");
            System.out.print("[n9]");
            int n9 = scanner.nextInt();
            System.out.println(n9);
            System.out.println ("---------------------------");
        case 10 :
            System.out.println ("---------------------------");
            System.out.print("[n10]");
            int n10 = scanner.nextInt();
            System.out.println(n10);
            System.out.println ("---------------------------");
            break;
        }while (opcion != 0);
    }
  }

}