

import java.util.Objects;


class OrderList {
    private final int ORDER_LIST_MAX = 10;
    private int totalOrders = 0;
    private Order[] orders = new Order[ORDER_LIST_MAX];
    private Order[] matching = new Order[ORDER_LIST_MAX];

    public void add(Order order) {
        if (totalOrders < ORDER_LIST_MAX) {
            orders[totalOrders] = order;
            totalOrders++;
        }
    }

    public void find(String status) {
        for (int i = 0; i < totalOrders; i++) {
            if (Objects.equals(orders[i].getDescription(), status)) {
                  matching [i] = orders[i] ;
            }
        }
    }
    public String info() {
        String s = "Lista zamowien ze statusem "+matching[0].getDescription()+"\n";

        for(int i = 0; i<ORDER_LIST_MAX;i++){
            if (matching[i]!=null)
           s = s + matching[i] + "\n";
        }return s;
    }
}
