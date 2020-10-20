package exercise4;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();

        double []values=new double[count];
        for (int i=0;i<values.length;i++)
        {
            values[i]= scanner.nextDouble();
        }
        double maxvalue=values[0];
        for (int i=1;i<values.length;i++)
        {
            if (maxvalue<values[i])
            {
                maxvalue=values[i];
            }
        }
        System.out.println("Max number: "+maxvalue);

    }
}
