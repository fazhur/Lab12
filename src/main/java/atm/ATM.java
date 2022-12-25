package atm;

public class ATM {
    public static void main(String[] args) {
        Handler handler5 = new Handler5();
        Handler handler20 = new Handler20();
        Handler handler50 = new Handler50();
        handler50.setNextHandler(handler20);
        handler20.setNextHandler(handler5);
        handler50.process(125);
    }
}
