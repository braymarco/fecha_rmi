import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/*
Definir los objetos que serán accedidos remotamente
    Se  definen métodos y parámetros
Se extiende de java.rmi.Remote

Todos los métodos podrían lanzar excepciones
 */

public interface IHolaFecha extends Remote{
    String sayHello()throws RemoteException;
    Date getDate() throws  RemoteException;
}