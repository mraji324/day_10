Class a
{
    int c;
    string b;
    a()
    {
        this.c=345;
        this.b="hello amarnath";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
public class Default
{
    public static void main(String[] args)
    {
        a s=new a();
        s.display();
    }
}
}