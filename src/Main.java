import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int val;
        int val2;
        double answer;
        int choice;

        System.out.println("Inicio");
        System.out.println("Seleccione la operacion que desea realizar");
        System.out.println("1-SUMA \n2-RESTA \n3-DIVISION \n4-MULTIPLICACION \n5-PAW \n6-SQRT ");
        choice = teclado.nextInt();

        while (choice > 0 && choice <= 7) {
            switch (choice) {
                case 1:
                    System.out.println("Ingrese el primer valor");
                    val = teclado.nextInt();

                    System.out.println("Ingrese el segundo valor");
                    val2 = teclado.nextInt();

                    answer = val + val2;
                    System.out.println("El resultado es le siguiente:" + answer);
                    break;
                case 2:
                    System.out.println("Ingrese el primer valor");
                    val = teclado.nextInt();

                    System.out.println("Ingrese el segundo valor");
                    val2 = teclado.nextInt();

                    answer = val + ((-1) * val2);
                    System.out.println("El resultado es le siguiente:" + answer);
                    break;
                case 3:
                    System.out.println("Ingrese el primer valor");
                    val = teclado.nextInt();

                    System.out.println("Ingrese el segundo valor");
                    val2 = teclado.nextInt();

                    if (val2 > 0) {
                        answer = val / val2;
                        System.out.println("El resultado es le siguiente:" + answer);
                    } else {
                        System.out.println("el segundo valor ingresado debe ser distinto de 0");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el primer valor");
                    val = teclado.nextInt();

                    System.out.println("Ingrese el segundo valor");
                    val2 = teclado.nextInt();

                    answer = val * val2;
                    System.out.println("El resultado es le siguiente:" + answer);
                    break;
                case 5:
                    System.out.println("ingrese la base y seguido el exponente Luego ENTER5");
                    answer = Math.pow(teclado.nextDouble(), teclado.nextDouble());
                    System.out.println("El resultado es le siguiente:" + answer);
                    break;
                case 6:
                    System.out.println("Ingrese el valor");
                    answer = teclado.nextInt();

                    Math.sqrt(answer);
                    System.out.println("El resultado es le siguiente:" + answer);
                    break;
                case 7:
                    System.out.println("Fin del Programa");
                    break;
            }
            System.out.println("Desea seguir operando? \n1-SUMA \n2-RESTA \n3-DIVISION \n4-MULTIPLICACION \n5-PAW \n6-SQRT \n7-EXIT");
            choice= teclado.nextInt();
        }

    }
}
/*
* hAY UN PROBLEMA CON EL CHOICE, TENOG QUE DEFINIR UNA VARIABLE NUEVA PARA LA SELECCION
* */