package operation;

public class Operation {

    public static String ganrateCapcha() {
        String s = "";
        String charector = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        for (byte i = 1; i <= 6; i++) {
            byte x = (byte) ((Math.random() * 61) + 1);
            s += charector.charAt(x);
        }
        return s;
    }
}
