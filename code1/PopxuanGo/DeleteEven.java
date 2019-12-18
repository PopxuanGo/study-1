package COREJava;

/**
 * @author tangzixuan
 * @date 2019/12/17 22:18
 * Version 1.0.0
 */
public class DeleteEven {
    public static void deleteEven(int[] array)
    {
        int count=0;//记录数组中第count+1个奇数
        int length=array.length;
        for(int i=0;i<length;i++)
            if(array[i]%2==1)
                array[count++]=array[i];
        for(int i=0;i<count;i++)
            System.out.print(" "+array[i]);
    }

    public static void main(String[] args)
    {
        int[] array={12,3,4,3,56,23,60,35,78,8,25,67,3,7,20};
        deleteEven(array);
    }
}
