public class Manager implements AuthorizationHandler{
    @Override
    public void authorize(int ammount){
        if(ammount > 1000000) {
            System.out.println("Manager Authorized");
            System.out.println("Money Withdraw: "+ ammount+'\n');
        }
        else {
            System.out.println("Authorization Denied.");
        }
    }

    @Override 
    public void setNextHandler(AuthorizationHandler nextHandler){
        //
    }
}
