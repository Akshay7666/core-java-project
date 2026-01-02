
import java.io.*;

class calcu 
{
    BufferedReader br = new BufferedReader
    (new InputStreamReader(System.in));

    int a, b;

    void get()
     {
        try
         {
            System.out.println("Enter a value of a: ");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter a value of b: ");
            b = Integer.parseInt(br.readLine());
        } 
     catch (Exception e)
        {
        
        }
     }
    void add() {
        System.out.println("Addition of a & b: " + (a + b));
    }
    void sub() {
        System.out.println("Subtraction of a & b: " + (a - b));
    }
    void multi() {
        System.out.println("Multiplication of a & b: " + (a * b));
    }
    void div() {
        {
            System.out.println("Division of a & b: " + (a / b));
        } 
    }
}

class calculation {
    public static void main(String[] args)
     {
        calcu c1 = new calcu();
        c1.get();
        c1.add();
        c1.sub();
        c1.multi();
        c1.div();
    }
}