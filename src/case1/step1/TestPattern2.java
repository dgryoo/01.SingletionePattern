package case1.step1;

import javax.xml.crypto.Data;

public class TestPattern2 {

    static int nNum = 0;

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                nNum++;
                Database database = Database.getInstance(nNum + "번째 Database");
                System.out.println("This is the " + database.getName() + "!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i=0; i <10; i++) {
            Thread t = new Thread(task);
            t.start();
        }

    }
}