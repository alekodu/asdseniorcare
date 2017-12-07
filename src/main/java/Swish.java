public class Swish implements IPayment {

    public Boolean makePayment(Request req) {
        return true;
    }

    public Boolean sendPaymentConf(Request req) {
        return true;
    }
}
