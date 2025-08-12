package JavaBasics;

import java.util.Scanner;
import java.util.Scanner;
public class CyclicSort {
    public int main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:\n");
        int n=sc.nextInt();
        System.out.println("enter the array elements:\n");
        int []nums=new int[100];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("entered array elements:\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(nums[i]);
        }
        int i = 0;
        while (i < nums.length)
        {
            int num = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[num]) {
                int temp = nums[i];
                nums[i] = num;
                nums[num] = temp;
            } else
            {
                i++;
            }

        }
        for (int index = 0; index < nums.length; index++)
        {
            if (nums[index] != index)
            {
                return index;
            }
        }
        return nums.length;
    }
}
