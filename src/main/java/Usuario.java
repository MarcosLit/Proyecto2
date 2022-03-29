import java.util.Scanner;

public class Usuario {

    private String nombre;
    private String pass;

    public Usuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre de usuario");
        this.nombre = sc.nextLine();
        System.out.println("Introduce pass de usuario " + this.nombre);
        this.pass = sc.nextLine();
    }

    public Usuario(String nombre, String pass){
        this.nombre=nombre;
        this.pass=pass;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + " y mi pass es " + pass;
    }
}
