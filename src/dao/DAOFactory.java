package dao;

import dao.custom.impl.CustomerDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory() {
    }
    public static DAOFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public <T> T getDAO(DAOTypes daoType){
        switch (daoType) {
            case CUSTOMER:
                return (T) new CustomerDAOImpl();
            /*case ITEM:
                return new ItemDAOImpl();
            case ORDER:
                return new OrderDAOImpl();
            case ORDER_DETAILS:
                return new OrderDetailsDAOImpl();
            case QUERY_DAO:
                return new QueryDAOImpl();*/
            default:
                return null;
        }
    }

}
