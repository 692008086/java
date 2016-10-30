import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 正则表达式
 */
public class reg{

    public static void main(String[] args){
        //按指定模式在字符串中查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";
        //创建Pattern对象
        Pattern r = Pattern.compile(pattern);
        //创建matcher对象
        Matcher m = r.matcher(line);

        if(m.find()){
            System.out.println("Found value :" + m.group(0));
            System.out.println("Found value :" + m.group(1));
            System.out.println("Found value :" + m.group(2));
        }else{
            System.out.println("NO MATCH");
        }

        System.out.println();
        System.out.println();
        reg.regex();
        System.out.println();
        System.out.println();
        reg.matchesAndLookingAt();
        System.out.println();
        System.out.println();
        reg.place();
        System.out.println();
        System.out.println();
        reg.append();

    }


    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    public static void regex(){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        int count = 0;
        while(m.find()){
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }

    private static final String R = "foo";
    private static final String I = "fooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    public static void matchesAndLookingAt(){
        pattern = Pattern.compile(R);
        matcher = pattern.matcher(I);

        System.out.println("current regex is :"+R);
        System.out.println("current input is :"+I);

        System.out.println("lookingAt() :"+matcher.lookingAt());
        System.out.println("matches() :"+matcher.matches());
    }

    private static String RR = "dog";
    private static String II = "The dog says meow. " +
                                    "All dogs say meow.";
    private static String REPLACE = "cat";
 
    public static void place() {
       Pattern p = Pattern.compile(RR);
       // get a matcher object
       Matcher m = p.matcher(II); 
       II = m.replaceAll(REPLACE);
       System.out.println(II);
   }

   private static String RRR = "a*b";
   private static String III = "aabfooaabfooabfoob";
   private static String RLA = "-";
   public static void append() {
      Pattern p = Pattern.compile(RRR);
      // 获取 matcher 对象
      Matcher m = p.matcher(III);
      StringBuffer sb = new StringBuffer();
      while(m.find()){
         m.appendReplacement(sb,RLA);
      }
      m.appendTail(sb);
      System.out.println(sb.toString());
   }


}