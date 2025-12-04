package www.stock.az.exception;

import java.io.IOException;

public class MyException  extends RuntimeException{
    private  Integer code;

    public MyException(Integer code, String message) {
        super(message);
        this.code=code;
    }
}
