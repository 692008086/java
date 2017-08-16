public class MammalInt implements TestInterface{
    public void test(){
        System.out.println("test");
    }

    public void travel(){
        System.out.println("travel");
    }

    public static void main(String[] args){
        MammalInt ma = new MammalInt();
        ma.test();
        ma.travel();
    }
}