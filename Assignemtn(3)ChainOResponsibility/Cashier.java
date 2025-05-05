public class Cashier implements AuthorizationHandler {
    private AuthorizationHandler nextHandler;

    @Override
    public void authorize(int ammount) {
        if (ammount <= 10000) {
            System.out.println("Cashier Authorized");
            System.out.println("Money Withdraw: " + ammount + " \n");
        }

        else if (nextHandler != null) {
            if (ammount >= 1000000) {
                System.out.println("Cashier Forwading to Senior Officer...");
            } else {
                System.out.println("Cashier Authorized...");
            }
            nextHandler.authorize(ammount);

        }
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
