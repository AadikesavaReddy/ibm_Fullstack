package Activity;
class CuustomException extends Exception {
    private String message = null;

    public CuustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity5 {
    public static void main(String[] a){
        try {
            // Method call with correct input
            Activity5.exceptionTest("Will print to console");
            // Method call with incorrect input
            Activity5.exceptionTest(null); // Exception is thrown here
            Activity5.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}
