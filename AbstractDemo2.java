public class AbstractDemo2
{
    public static void main(String[] args){
        ExtendsAbstract s = new ExtendsAbstract("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        AbstractClass e = new ExtendsAbstract("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}