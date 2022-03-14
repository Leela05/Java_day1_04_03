public class HelloWorld {
    public static void main(String[] args) {
        String name = "Amu";
        Integer a=5,b=4,c,d,e,f,g,h,i;
        h=a++;
        i=a--;
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        g=a%b;

        System.out.println("Addition:"+c);
        System.out.println("Subtraction:"+d);
        System.out.println("Multiplication:"+e);
        System.out.println("Division:"+f);
        System.out.println("Modulo:"+g);
        System.out.println("Increment:"+h);
        System.out.println("Decrement:"+i);
        System.out.println("Hello" +name);
        System.out.println("Hello World!");

    }
}
