package ces.ge.music.utils;

public class ResponseHelper<T> {

    private String message;
    private int code;
    private T data;

    public ResponseHelper() {
    }

    public String getMessage() {
        return message;
    }

    public ResponseHelper<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public int getCode() {
        return code;
    }

    public  ResponseHelper<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public  ResponseHelper<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResponseHelper{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }

    public ResponseHelper success(){
        code = 1;
        return this;
    }

    public ResponseHelper fail(){
        code = 0;
        return this;
    }

}
