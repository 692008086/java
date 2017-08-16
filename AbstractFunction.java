public class AbstractFunction extends AbstractCla{
    private double salary;
    public double computePay(){
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }

    public static void main(String[] args){

        AbstractFunction a = new AbstractFunction();
        a.name = "me";
        a.salary = 100;
        a.computePay();
    }
}

abstract class AbstractCla
{
   protected String name;
   private String address;
   private int number;
   
   public abstract double computePay();

   protected String getName(){
    return this.name;
   }
   
   //其余代码
}