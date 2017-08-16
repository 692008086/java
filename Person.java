public class Person{
    public static void main(String[] args){
        PersonPrivate p = new PersonPrivate();
        p.setName("Rocky");
        p.setAge(30);
        p.setIdNum("aa88");

        System.out.println();
        System.out.println("name:"+p.getName()+"age:"+p.getAge());
    }
}

class PersonPrivate{
    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIdNum(String newId){
        idNum = newId;
    }
}