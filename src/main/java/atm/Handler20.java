package atm;

public class Handler20 extends Handler {
    public void process(int price){
        int count = price / 20;
        if (count > 0) {
            System.out.println("20 x " + count);
        }
        if (price % 20 > 0) {
            nextHandler.process(price % 20);
        }
    }
}
