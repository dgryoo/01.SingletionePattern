package case1.step1;

public class Database {

    private String name;
    private static Database singletone;

    public String getName() {
        return name;
    }

    private Database(String name) {
//        this.name = name;
        try {
            Thread.sleep(100);
            this.name = name;
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static Database getInstance(String name) {
        if (singletone == null) {
            singletone = new Database(name);
        }
        return singletone;
    }
}
