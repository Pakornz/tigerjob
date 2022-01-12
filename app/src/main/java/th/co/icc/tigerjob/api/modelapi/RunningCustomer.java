package th.co.icc.tigerjob.api.modelapi;

public class RunningCustomer {


    /**
     * result : true
     * status : 200
     * message : TDL6201070002
     */

    private boolean result;
    private int status;
    private String message;


    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RunningCustomer{" +
                "result=" + result +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
