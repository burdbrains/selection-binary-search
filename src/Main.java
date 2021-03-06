import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] list = {2,5,6,8,11,13,16,21,35,51};
        System.out.println(sequential(list, 13));
        System.out.println(sequential(list, 22));

        System.out.println(binary(list, 51));
        System.out.println(binary(list, 22));
    }

    public static int sequential(int[] list, int vPar)
    {
        int vRet = -1;
        for (int v = 0; v < list.length; v++)
        {
            if (list[v] == vPar)
            {
                vRet = v;
            }
        }
        return vRet;
    }

    public static boolean vRet = false;
    public static boolean binary(int[] list, int vPar)
    {
        int[] list1 = Arrays.copyOfRange(list, 0, list.length/2);
        int[] list2 = Arrays.copyOfRange(list, list.length/2, list.length);

        if (list.length == 2 && (list1[0] != vPar && list2[0] != vPar))
        {
            // do nothing #1
        }
        else if (list1[list1.length-1] > vPar)
        {
            binary(list1, vPar);
        }
        else if (list2[0] < vPar)
        {
            binary(list2, vPar);
        }
        else
        {
            vRet = true;
        }

        return vRet;
    }
}
