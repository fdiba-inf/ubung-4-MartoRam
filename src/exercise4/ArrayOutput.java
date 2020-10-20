package exercise4;
import java.util.Scanner;
public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=input.nextInt();
        String output ="";
        int i=0;
        int []numbers=new int[count];
        for (int index=0;index<numbers.length;index++)
        {
            numbers[index]=input.nextInt();
        }
        for (int count2=0;count2< numbers.length;count2++)
        {
            output+=" ";
            System.out.println(output+numbers[count2]);
        }



    }
}
