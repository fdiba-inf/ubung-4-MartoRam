package exercise4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count= scanner.nextInt();
        char []idk=new char[count];
        char []kdi=new char[count];
        int typo= idk.length-1;
        for (int i=0;i<idk.length;i++)
        {
            idk[i]= scanner.next().charAt(0);
        }
        for (int i2=0;i2< kdi.length;i2++)
        {

            kdi[i2]=idk[typo];
            typo--;
        }

        System.out.println("Reversed symbols: "+Arrays.toString(kdi));

    }
}
