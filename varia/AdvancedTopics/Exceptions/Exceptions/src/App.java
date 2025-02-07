public class App {
    public static void main(String[] args) throws Exception {
        ExceptionsDemo.show();

        // catch the exception thrown by the account method
        try {
            ExceptionsDemo.account(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // catch the exception thrown by the withdraw method
        var exceptionDemo = new ExceptionsDemo();
        try {
            exceptionDemo.withdraw(10);
        } catch (NoBalanceException e) {
            System.out.println(e.getMessage());
        }      
        
        // catch the exception thrown by the withdrawChain method
        try {
            exceptionDemo.withdrawChain(10);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }   
    }
}
