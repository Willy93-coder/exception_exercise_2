import java.io.IOException;

public class MyCustomException extends IOException {

    public MyCustomException() {}

    public MyCustomException(String message) {
        super(message);
    }
}
