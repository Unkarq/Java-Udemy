package lesson002;

public class LoopWhileDoWhile {


    String[] kursProgramowania =
            {
                    "aaaa",
                    "bbbbb",
                    "cccc",
                    "dddd"

            };
    int i = 0;
    int y = 0;
//        while (i < kursProgramowania.length)
//        {
//            System.out.println(kursProgramowania[i]+ "    :)" );
//            i++;
//        }
//        do {
//            System.out.println(kursProgramowania[i]);
//            i++;
//
//        }while (i < kursProgramowania.length);
//        {
//            System.out.println(kursProgramowania[i]);
//        }

    int[] tab = new int[10];

    void loop() {
        while (i <= 10) {
            tab[i] = y + 10;
            System.out.println(tab[i]);
            y = tab[i];
            i++;

        }


    }


}



