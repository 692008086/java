import java.io.File;
public class Dir{
    public static void main(String[] args){
        String dirname = "./";
        File f1 = new File(dirname);
        if(f1.isDirectory()){
            System.out.println("目录："+dirname);
            String[] s = f1.list();
            for(int i = 0; i < s.length; i++){
                File f = new File(dirname+"/"+s[i]);
                if(f.isDirectory()){
                    System.out.println(s[i]+"是一个目录");
                }else{
                    System.out.println(s[i]+"是一个文件");
                }
            }
        }else{
            System.out.println("不是目录");
        }
    }

    public void mkdir(){
        String dirname = "./aa";
        File d = new File(dirname);
        d.mkdirs();
    }

    
}