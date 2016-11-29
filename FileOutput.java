import java.io.*;
public class FileOutput{
    public static void main(String[] args){
        try{
            byte bWite[] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("String.txt");
            for(int x = 0; x < bWite.length; x++){
                os.write(bWite[x]);
            }

            os.close();

            InputStream is = new FileInputStream("String.txt");
            int size = is.available();
            for(int i = 0; i < size;i++){
                System.out.print((char)is.read()+" ");
            }
            is.close();


        }catch(IOException e){
            System.out.print("Exception");
        }

    }

    
}