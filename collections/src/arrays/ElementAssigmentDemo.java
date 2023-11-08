package arrays;

public class ElementAssigmentDemo {
    public static void main(String[] args) {

        //Object Type
        Object[] objArray = new Object[5];
        objArray[0] = new Object();


        //Abstract Class Type
        Number[] numArray = new Number[5];
        numArray[0] = Integer.valueOf(5);


        //Interface Type
        Runnable[] r = new Runnable[5];
        r[0] = new Thread();



    }
}
