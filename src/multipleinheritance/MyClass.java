package multipleinheritance;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 28, 2013 8:06:39 AM 
 */
public class MyClass extends MySuperClass implements MyInterface
{

   int a;
   int b;
    
    
   @Override
    public void changeValues(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args)
    {
        
    }

}
