package case1.step3;

public class Database {

    private static Database singletone = new Database("products");
    private String name;


    public String getName() {
        return name;
    }

    private Database(String name) {
//        this.name = name;
        try {
            Thread.sleep(100);
            this.name = name;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    synchronized = 차례대로 실행되도록
    public synchronized static Database getInstance(String name) {
//        if (singletone == null) {
//            singletone = new Database(name);
//        }
        return singletone;
    }
}
