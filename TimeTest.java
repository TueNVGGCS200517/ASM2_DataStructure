public class TimeTest {
    public static void main(String[] args) throws Exception {
        Messager message1 = new Messager("message1");
        Messager message2 = new Messager("message2");
        message1.connect(message2);
        
        long start = System.currentTimeMillis();
        String chat = "Test Time";
        for (int i = 0; i < 100000; ++i) {
            message1.send(chat);
        }
        message2.receive();
        // Get elapsed time in milliseconds
        long elapsedTimeMillis = System.currentTimeMillis()-start;

        message2.printAll();
        System.out.println(elapsedTimeMillis/100000.0);

    }
}
