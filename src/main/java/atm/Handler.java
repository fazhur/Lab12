package atm;

import lombok.Getter;
import lombok.Setter;

public abstract class Handler {
    @Setter @Getter
    public Handler nextHandler;
    public abstract void process(int price);
}
