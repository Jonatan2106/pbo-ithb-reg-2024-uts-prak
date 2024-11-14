package Model;

public class OnlinePayment implements Payment{
    private String transactionID;
    private String paymentGateway;
    public OnlinePayment() {
    }
    public OnlinePayment(String transactionID, String paymentGateway) {
        this.transactionID = transactionID;
        this.paymentGateway = paymentGateway;
    }
    public String getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }
    public String getPaymentGateway() {
        return paymentGateway;
    }
    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    @Override
    public Double makePayment(Double ammount){
        return 1.0;
    }

}
