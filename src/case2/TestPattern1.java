package case2;

public class TestPattern1 {

    public static void main(String[] args) {
        LogWritter logger;

        logger = LogWritter.getSingletone();
        logger.log("오리꽥꽥");

        logger = LogWritter.getSingletone();
        logger.log("오리꾸액꾸액");

    }

}
