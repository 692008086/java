public class Super{
    public static void main(String[] args){
        new SubClass().showMessage();
    }
}


class SuperClass{
    int i = 50;
}

class SubClass extends SuperClass{
    int i = 100;
    public void showMessage(){
        System.out.printf("super.i = %d,this.id = %d\n",super.i,this.i);
    }
}