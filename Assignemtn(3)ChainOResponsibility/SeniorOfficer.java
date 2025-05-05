public class SeniorOfficer implements AuthorizationHandler{
    private AuthorizationHandler nextHandler ;

    @Override
    public void authorize(int ammount){
        if(ammount > 10000 && ammount <= 1000000){
            System.out.println("Senior Officer Authorized");
            System.out.println("Money Withdraw : "+ ammount +"\n");
        }
        else if (nextHandler != null){
            System.out.println("Senior Officer Authorized...");
            nextHandler.authorize(ammount) ;
        }
        else {
            System.out.println("Authorization denied");
        }
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler){
        this.nextHandler = nextHandler ;
    }
}
