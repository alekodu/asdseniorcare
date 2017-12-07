public interface IPayment {

    public Boolean makePayment(Request req);
    public Boolean sendPaymentConf(Request req);
}
