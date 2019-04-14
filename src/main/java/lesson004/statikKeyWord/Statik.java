package lesson004.statikKeyWord;

public class Statik {


    public static void main(String[] args) {

//        Mathematic test = new Mathematic();
//
//        double score= Mathematic.sum(10,30);
//
//        System.out.println(score);
//System.out.println(Mathematic.PI);

Client a = new Client("AAAAA");
Client b = new Client("BBBBB");
Client c = new Client("CCCCC");

System.out.println(a.getId());
System.out.println(b.getId());
System.out.println(c.getId());
System.out.println(Client.getNextId());




    }


}
