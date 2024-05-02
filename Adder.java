import java.rmi.*;

public interface Adder extends java.rmi.Remote{
    public int add(int x, int y) throws RemoteException;
}