import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
public static void main(String[] args){

    String fakeInput = "1111\n2222\n1234";
    String pass = "1234";

    InputStream inputStream = new ByteArrayInputStream(fakeInput.getBytes());
    Scanner sc = new Scanner(inputStream);



    if (comprobarPass(sc, pass))
        System.out.println("Si");
    else
        System.out.println("No");
}

private static boolean comprobarPass(Scanner sc, String pass){

    String texto;

    do {
        System.out.println("Adivina");
        texto = sc.nextLine();
        System.out.println("He recibido " + texto);

    }while (!texto.equals(pass) && sc.hasNext());

    return texto.equals(pass);
}

}
