package lesson004.statikKeyWord;

public class Client {
    private String name;
    private int id = 0;
    private static int nextId = 0;

    Client(String name) {
        this.name = name;
        id = nextId;
        nextId++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Client.nextId = nextId;
    }
}
