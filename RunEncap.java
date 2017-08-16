public class RunEncap{
    public static void main(String[] args){
        EncapTest encap = new EncapTest();
        encap.setName("rocky");
        encap.setAge(30);
        encap.setIdNum("aa123");

        System.out.print("Name : " + encap.getName()+ 
                             " Age : "+ encap.getAge());
    }
}