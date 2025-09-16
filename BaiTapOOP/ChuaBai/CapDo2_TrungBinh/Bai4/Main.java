package BaiTapOOP.ChuaBai.CapDo2_TrungBinh.Bai4;

import static BaiTapOOP.CapDo2_TrungBinh.Bai4.Status.DELIVERED;
import static BaiTapOOP.CapDo2_TrungBinh.Bai4.Status.PROCESSING;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("A12345", "Dorekutevn", new String[]{"Jodarn Max7", "Tất vàng"}, 15500000, PROCESSING );
        Order order2 = new Order("C55566", "BlackHat", new String[]{"PS5@", "LG Monitor 30inches"}, 22500000, PROCESSING);
        Order order3 = new Order("F85566", "Neo", new String[]{"In Defend of Capitalist", "In Defend of Crusades"}, 5500000, DELIVERED);
        Order[] orderList = {order1, order2, order3};

        //Cập nhật đơn hàng
        order1.updateOrderStatus("delivered");
        
    }


}
