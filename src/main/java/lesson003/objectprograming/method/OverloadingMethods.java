package lesson003.objectprograming.method;

public class OverloadingMethods {

    public static void main(String[] args) {

        Test a = new Test();

        a.write("Miki", "Mouse");

        Test b = new Test();
        b.write("Oliczka", "Maou");


        int sum = a.sumAwithB(22,15);
        System.out.println(sum);

        double sum2 = a.sumAwithB(2.23,5);
        System.out.println(sum2);

        double div = a.divide(10, 2);

        System.out.println(div);


    }


}

