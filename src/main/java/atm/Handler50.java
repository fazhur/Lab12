package atm;

public class Handler50 extends Handler {
    public void process(int price){
        int count = price / 50;
        if (count > 0) {
            System.out.println("50 x " + count);
        }
        if (price % 50 > 0) {
            nextHandler.process(price % 50);
        }
    }
}
