package com.itstep.oop.principles.encapsulation.kukishev_homework;

class OrderManager {



    private final int[] orderIds;

    OrderManager(int[] orderIds) {
        this.orderIds = orderIds;
    }

    double purchaseOrder (int orderId, double price) {

        if (isOrderIdExist(orderId)){
            deleteExistOrder(orderId);
            return price + price * 0.2;
        }

        throw new RuntimeException("Order not exist");


    }


            private boolean isOrderIdExist(int orderId){
                for (int id : orderIds){

                    if (id == orderId){
                        return true;
                    }
                }
                return false;

                    }

                    private void deleteExistOrder (int orderId){
                        for (int i = 0; i <orderIds.length ; i++) {
                            if (orderIds[i] == orderId){
                                orderIds[i] =-1;
                            }

                        }


                    }



}
