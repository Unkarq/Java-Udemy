package lesson003.objectprograming.method;

public class Test {

    void write(String imie, String nazwisko) {

        System.out.println(imie + " " + nazwisko);

    }


    int sumAwithB(int a, int b) {

        return a + b;
    }

    double sumAwithB(double a, double b) {
        return a + b;
    }

    double divide(double a, double b) {

        if (b == 0)
            return 0;

        return a / b;
    }


}
