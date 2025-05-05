public interface AuthorizationHandler {
    void authorize(int ammount) ;
    void setNextHandler(AuthorizationHandler nextHandler);
}