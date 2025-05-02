public class SeniorOfficer extends AuthorizationHandler{
    
    public void handleRequest(WithdrawalRequest request){
        if ( request.getAmount() >= 10000 && request.getAmount() <= 100000) {
            System.out.println("Cashier and SeniorOfficer has authorized the withdrawal of " + request.getAmount());
        } else if (nextHandler != null) {
            System.out.println("SeniorOfficer: Forwarding the request to Manager");
            nextHandler.handleRequest(request);
        }
    }
    
}
