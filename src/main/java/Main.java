import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
public static void main(String[] args){

    String fakeInput = "1111";
    String pass = "1234";

    InputStream inputStream = new ByteArrayInputStream(fakeInput.getBytes());
    Scanner sc = new Scanner(inputStream);

    String texto;

    do {
        System.out.println("Adivina");
        texto = sc.nextLine();
        System.out.println("He recibido " + texto);

    }while (!texto.equals(pass));
}


}
