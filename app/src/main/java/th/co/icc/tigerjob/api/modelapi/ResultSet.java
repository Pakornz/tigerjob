package th.co.icc.tigerjob.api.modelapi;


public class ResultSet
{
    private boolean success = false ;

    private String message = null ;

    private int count = 0 ;

    private int errorCount = 0 ;

    private int resultCode = -1;

    /*====================  setter =====================*/
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    /*======================= getter =======================*/

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public int getCount() {
        return count;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public int getResultCode() {
        return resultCode;
    }
}
