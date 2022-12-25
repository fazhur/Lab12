package atm;

public class Handler5 extends Handler{
    public void process(int price){
        int count = price / 5;
        if (count > 0) {
            System.out.println("5 x " + count);
        }
        if (price % 5 > 0) {
            nextHandler.process(price % 5);
        }
    }
}
