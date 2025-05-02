public class Cashier extends AuthorizationHandler{

    @Override 
    public void handleRequest(WithdrawalRequest request){
        if ( request.getAmount() < 10000) {
            System.out.println("Cashier has authorized the withdrawal of " + request.getAmount());
        } else if (nextHandler != null) {
            System.out.println("Cashier: Forwarding the request to SeniorOfficer");
            nextHandler.handleRequest(request);
        }
    }
    
}
