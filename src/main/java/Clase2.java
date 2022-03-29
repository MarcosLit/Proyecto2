public class Clase2 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Antonio", "1234");
        Usuario u2 = new Usuario();
        System.out.println(u1);
        System.out.println(u2);
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = u1;
        usuarios[1] = u2;

        //Pedir iniciar sesion
        //1º Comprobar el nombre
        //Si el nombre es correcto, pide contraseña
        //Si no te sigue preguntando por el nombre
        //Si la contraseña es correcta que diga usuario logueado!!
        //Si no te pregunto hasta 3 veces la pass
    }
}
