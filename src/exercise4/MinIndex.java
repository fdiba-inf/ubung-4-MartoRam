package exercise4;

import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        int index=0;
        double []values=new double[count];
        for (int i=0;i<values.length;i++)
        {
            values[i]= scanner.nextDouble();
        }
        double minvalue=values[0];
        for (int i=1;i<values.length;i++)
        {
            if (minvalue>values[i])
            {
                index=i;
                minvalue=values[i];
            }
        }

        System.out.println("Min index: "+index);


    }
}
