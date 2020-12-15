import java.rmi.Naming;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            IHolaFecha objeto = (IHolaFecha) Naming.lookup("rmi://localhost/HelloServer");
            System.out.println("fecha del servidor: "+ objeto.sayHello());
            System.out.println("fecha del servidor: "+ objeto.getDate());
            Date d_local = new Date();
            System.out.println("fecha del servidor: "+ d_local);

        } catch (Exception e) {
            System.out.println("HelloClient exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
