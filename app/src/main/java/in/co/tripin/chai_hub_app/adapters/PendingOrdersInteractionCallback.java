package in.co.tripin.chai_hub_app.adapters;

public interface PendingOrdersInteractionCallback {

    void onOrderAccepted(String mOrderId);
    void onOrderRejected(String mOrderId);
    void onOrderSent(String mOrderId);
    void onCalledCustomer(String mMobile);

}
