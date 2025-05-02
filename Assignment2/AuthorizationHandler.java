abstract class AuthorizationHandler {
    protected AuthorizationHandler nextHandler;

    public void setNextHandler(AuthorizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest (WithdrawalRequest request) ;
}
