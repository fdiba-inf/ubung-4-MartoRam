package exercise4;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

int count=input.nextInt();
int[]numbers=new int[count];
for (int index=0;index<numbers.length;index++)
{
    numbers[index]=input.nextInt();
}
        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: "+numbersAsString);
    }

}
