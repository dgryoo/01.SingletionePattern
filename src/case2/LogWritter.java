package case2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWritter {

    private static LogWritter singletone = new LogWritter();
    private static BufferedWriter bw;

    private LogWritter() {
        try {
            bw = new BufferedWriter(new FileWriter("log.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LogWritter getSingletone() {
        return singletone;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            super.finalize();
            bw.close();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

    }

    public synchronized void log(String str) {
        try {
            bw.write(str + "\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
