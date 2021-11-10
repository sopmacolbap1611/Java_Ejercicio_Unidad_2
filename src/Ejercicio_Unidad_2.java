import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Ejercicio_Unidad_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, voy a pedirte unos datos para guardar en mi sistema. ¿Podrías empezar escribiendo tu nombre?");

        String name = sc.nextLine();

        System.out.println("Y tu apellido, por supuesto: ");

        String lastName = sc.nextLine();

        System.out.println("Vamos bien, ahora quisiera saber tu edad: ");

        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Podrías decirme cuál es tu hobbie: ");

        String hobbie = sc.nextLine();

        System.out.println("¿Cuál editor de código preferido?");

        String editor = sc.nextLine();


        System.out.println("Por último, me gustaría saber qué sistema operativo usas:");

        String opSystem = sc.nextLine();

        System.out.println("¡Muy bien! Te llamás " + name + " " + lastName + " " + " y tenés " + age + " años. \n Tu hobbie es " + hobbie
        + " y tu editor de código favorito es " + editor + " Por último, tu sistema operativo es " + opSystem + ".\n ¡Muchas gracias por responder!");

    }
}
