package case1.step1;

public class TestPattern1 {

    public static void main(String[] args) {

//        Database d1 = new Database("1");
//        Database d2 = new Database("2");
//        Database d3 = new Database("3");
//        Database d4 = new Database("4");
//        Database d5 = new Database("5");
//        Database d6 = new Database("6");
        Database database;

        database = Database.getInstance("First Database");
        System.out.println("This is the " + database.getName());

        database = Database.getInstance("Second Database");
        System.out.println("This is the " + database.getName());



        System.out.println("database use");




    }

}
