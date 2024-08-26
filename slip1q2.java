import java.util.*;
public class slip1q2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList arr= new ArrayList<>();
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        System.out.println("Enter"+n+"Integers:");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.println("The Element of array List:");
        
    }
}