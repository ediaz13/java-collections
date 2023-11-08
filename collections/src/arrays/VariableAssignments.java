package arrays;

public class VariableAssignments {
    public static void main(String[] args) {
        int[] x = new int[2];
        int[] a = x;

        x[0] = 1;
        System.out.println(x[0]);
        System.out.println(a[0]);

        a[1] = 2;
        System.out.println(x[1]);
        System.out.println(a[1]);

        //-------------------------

        int[] b = {1, 2, 3};
        int[] c = {13, 22};

        b= c;

        System.out.println(b[2]);

        //-------------------------

        String[] s = new String[3];
        Object[] o = s;

        //-------------------------
        short[] shortArray = new short[3]; //[S
        //int[] ints = shortArray; //[I


    }
}
