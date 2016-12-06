public class Penguin extends ParentTest{
    public void Penguin(String myName, int myId){
        super(myName, myId);
    }
    public static void main(String[] args){
        Penguin Penssss = new Penguin();
    }
}

class ParentTest
{
    private String name;
    private int id;

    public void ParentTest(String myName,int myId){
        name = myName;
        id = myId;
    }

    public void eat(){
        System.out.println(name+"正在吃。。");
    }

    public void sleep(){
        System.out.println(name+"正在睡觉。。");
    }

    public void introduction(){
        System.out.println("大家好！我是"+id+"号"+name+".");
    }
}