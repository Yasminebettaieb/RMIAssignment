import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    char MinChar(String ch) throws RemoteException;
    StringBuffer CaseChanger(String ch) throws RemoteException;
    String Reverse(String ch) throws RemoteException;
}

