public class Manager extends AuthorizationHandler {
    
    public void handleRequest(WithdrawalRequest request){
        if ( request.getAmount() >100000){
            System.out.println("SeniorOfficer and Manager has authorized the withdrawal of " + request.getAmount());
        }else {
            System.out.println("Manager: Unable to process the request for Tk. " + request.getAmount());
        }
    }
}
