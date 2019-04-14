package lesson003.objectprograming.method;

public class Method {

    public static void main(String[] args) {

        Test a = new Test();

        a.write("Miki", "Mouse");

        Test b = new Test();
        b.write("Oliczka", "Maou");


        int sum = a.sumAwithB(2, 5);
        System.out.println(sum);




        double div = a.divide(10,2);

System.out.println(div);


    }






}
