import java.io.*;
public class TryMore{
    // public static void main(String[] args){

    //     try
    //     {
    //       file = new FileInputStream(fileName);
    //       x = (byte) file.read();
    //     }catch(IOException i)
    //     {
    //       i.printStackTrace();
    //       return -1;
    //     }catch(FileNotFoundException f) //Not valid!
    //     {
    //       f.printStackTrace();
    //       return -1;
    //     }

    // }
    //
    // 如果一个方法没有捕获一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。
    // //也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。
    public void deposit(double amount) throws RemoteException
    {
        throw new RemoteException();
        
    }
    // 一个方法可以声明抛出多个异常，多个异常之间用逗号隔开。 
    public void withdraw(double amount) throws RemoteException,InsufficientFundsException
    {

    }
}