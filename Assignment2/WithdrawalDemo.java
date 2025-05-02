public class WithdrawalDemo {

    public static void main(String[] args) {

        AuthorizationHandler cashier = new Cashier();
        AuthorizationHandler seniorOfficer = new SeniorOfficer();
        AuthorizationHandler manager = new Manager();

        cashier.setNextHandler(seniorOfficer);
        seniorOfficer.setNextHandler(manager);

        WithdrawalRequest request1 = new WithdrawalRequest(1000000);
        // WithdrawalRequest request2 = new WithdrawalRequest(50000);
        // WithdrawalRequest request3 = new WithdrawalRequest(1500000);

        cashier.handleRequest(request1);
        System.out.println("====================================");
        // cashier.handleRequest(request2);
        // System.out.println("====================================");
        // cashier.handleRequest(request3);
        
    }
    
}


