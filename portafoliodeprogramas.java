import java.util.Scanner;

public class portafoliodeprogramas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("\nBienvenidos a mi programa java [Versión 1.0]");

        System.out.println("  __       _     _              ");
        System.out.println(" / _| __ _| |__ (_) __ _ _ __   ");
        System.out.println("| |_ / _` | '_ \\| |/ _` | '_ \\  ");
        System.out.println("|  _| (_| | |_) | | (_| | | | | ");
        System.out.println("|_|  \\__,_|_.__/|_|\\__,_|_| |_| ");

        do {
            System.out.println("[?] Selecciona una opción para continuar:");
            System.out.println("Proyecto Iniciado --> Mar 18 8:45 am 2025\n");
            System.out.println("[1] Suma de dos números");
            System.out.println("[2] Resta de dos números");
            System.out.println("[3] Multiplicación de dos números");
            System.out.println("[4] División de dos números");
            System.out.println("[5] Módulo (Residuo de una división)");
            System.out.println("[6] Promedio de tres números");
            System.out.println("[7] Número mayor y menor entre dos números");
            System.out.println("[8] Número mayor y menor entre tres números");
            System.out.println("[9] Conversión de metros a centímetros");
            System.out.println("[10] Conversión de kilogramos a gramos");
            System.out.println("[0] Salir");
            System.out.print("[?] ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma(scanner);
                    break;
                case 2:
                    realizarResta(scanner);
                    break;
                case 3:
                    realizarMultiplicacion(scanner);
                    break;
                case 4:
                    realizarDivision(scanner);
                    break;
                case 5:
                    realizarModulo(scanner);
                    break;
                case 6:
                    calcularPromedio(scanner);
                    break;
                case 7:
                    encontrarMayorMenorDos(scanner);
                    break;
                case 8:
                    encontrarMayorMenorTres(scanner);
                    break;
                case 9:
                    convertirMetrosCentimetros(scanner);
                    break;
                case 10:
                    convertirKgGramos(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
            System.out.println("\n--------------------------------------------\n");
        } while (opcion != 0);

        scanner.close();
    }

    public static void realizarSuma(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a + b));
    }

    public static void realizarResta(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a - b));
    }

    public static void realizarMultiplicacion(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a * b));
    }

    public static void realizarDivision(Scanner scanner) {
        System.out.print("Ingrese el numerador: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el denominador: ");
        double b = scanner.nextDouble();
        if (b != 0) {
            System.out.println("Resultado: " + (a / b));
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

    public static void realizarModulo(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        if (b != 0) {
            System.out.println("Resultado: " + (a % b));
        } else {
            System.out.println("Error: No se puede calcular el módulo con divisor cero.");
        }
    }

    public static void calcularPromedio(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double c = scanner.nextDouble();
        System.out.println("Promedio: " + ((a + b + c) / 3));
    }

    public static void encontrarMayorMenorDos(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Mayor: " + Math.max(a, b));
        System.out.println("Menor: " + Math.min(a, b));
    }

    public static void encontrarMayorMenorTres(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double c = scanner.nextDouble();
        System.out.println("Mayor: " + Math.max(a, Math.max(b, c)));
        System.out.println("Menor: " + Math.min(a, Math.min(b, c)));
    }

    public static void convertirMetrosCentimetros(Scanner scanner) {
        System.out.print("Ingrese la cantidad de metros: ");
        double metros = scanner.nextDouble();
        System.out.println(metros + " metros son " + (metros * 100) + " centímetros.");
    }

    public static void convertirKgGramos(Scanner scanner) {
        System.out.print("Ingrese la cantidad de kilogramos: ");
        double kg = scanner.nextDouble();
        System.out.println(kg + " kilogramos son " + (kg * 1000) + " gramos.");
    }
}