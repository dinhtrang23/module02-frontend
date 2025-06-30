package baitap06;

import baitap04.Manage;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager implements Manage<Order> {
    public ArrayList<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    @Override
    public void add(Order order) {
        orders.add(order);
    }

    @Override
    public void update(int index, Order order) {
        if (index >= 0 && index < orders.size()) {
            orders.set(index, order);
        } else {
            throw new IndexOutOfBoundsException("Mã đơn hàng không tồn tại.");
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < orders.size()) {
            orders.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Mã đơn hàng không tồn tại.");
        }
    }

    @Override
    public void display() {
        if (orders.isEmpty()) {
            System.out.println("Chưa có đơn hàng nào trong danh sách.");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                System.out.println((i + 1) + ". " + orders.get(i));
            }
        }
    }


}
