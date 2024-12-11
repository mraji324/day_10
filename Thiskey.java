import java.util.*;
public class Thiskey{
    void display()
    {
        System.out.println("hello students");
    }
    void dis1()
    {

        this.display();
    }
    public static void main(String[] args)
    {
      Thiskey o=new Thiskey();
      o.dis1();
    }
}