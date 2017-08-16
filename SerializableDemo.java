import java.io.*;

class SerializableBase implements java.io.Serializable{
    
    public String name;
    public String address;
    public transient int SSN;//该属性是短暂的
    public int number;

    public void mailCheck(){
        System.out.println("Mailing a check to " + name
                           + " " + address);
    }
}


public class SerializableDemo{
    public static void main(String[] args){
        SerializableBase ser = new SerializableBase();
        ser.name = "rocky";
        ser.address = "guangzhou panyu";
        ser.SSN = 2233;
        ser.number = 3344;

        try {

            FileOutputStream fileOut = new FileOutputStream("./SerializableBase.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ser);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in ./SerializableBase.ser");

        }catch (IOException i){

            i.printStackTrace();
        }





      System.out.println();
      System.out.println("反序列化");

      SerializableBase e = null;
      try{
         FileInputStream fileIn = new FileInputStream("./SerializableBase.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (SerializableBase) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);




    }
}