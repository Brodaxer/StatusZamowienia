class OrderList {
    private final int ORDER_LIST_MAX = 10;
    private int totalOrders = 0;
    private Order[] orders = new Order[ORDER_LIST_MAX];

    public void add(Order order) {
        if (totalOrders < ORDER_LIST_MAX) {
            orders[totalOrders] = order;
            totalOrders++;
        }
    }

    public String find( Status status) {
        String s = "";
        for (int i = 0; i < totalOrders; i++) {
            if (orders[i].getStatus() == status) {
                s = s + orders[i].toString() + "\n";
            }
        }
        return s;
    }

}
