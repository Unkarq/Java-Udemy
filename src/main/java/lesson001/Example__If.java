package lesson001;

public class Example__If {

    void exampleIf() {
        int a = 5,
                b = 7,
                c = 9;

//        System.out.println(a!=b);
//
//        if(a !=b && c > 5)
//            System.out.println("test");
//
//

        if (a > b)
            System.out.println("a > b");
        else if (a < b) {
            System.out.println("a < b");
            System.out.println("It's working");
        } else
            System.out.println("a == b");


    }


}

