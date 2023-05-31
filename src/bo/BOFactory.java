package bo;

import bo.custom.impl.*;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){
    }
    public static BOFactory getBoFactory(){
        return (boFactory==null)? boFactory=new BOFactory() : boFactory;
    }

    //Object creation logic for BO objects
    public <T> T getBO(BOTypes type){
        switch (type){
            case CUSTOMER:
                return (T) new CustomerBOImpl();
            /*case ITEM:
                return new ItemBOImpl();
            case PO:
                return new PurchaseOrderBOImpl();*/
            default:
                return null;
        }
    }
}
