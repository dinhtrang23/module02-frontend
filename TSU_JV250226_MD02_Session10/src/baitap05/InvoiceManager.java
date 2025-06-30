package baitap05;

import baitap04.Manage;
import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceManager implements Manage<Invoice> {
    public ArrayList<Invoice> invoices;
    public InvoiceManager() {
        invoices = new ArrayList<>();
    }

    @Override
    public void add(Invoice invoice) {
        invoices.add(invoice);
    }

    @Override
    public void update(int index, Invoice invoice) {
        if (index >= 0 && index < invoices.size()) {
            invoices.set(index, invoice);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < invoices.size()) {
            invoices.remove(index);
        }
    }

    @Override
    public void display() {
        if (invoices.isEmpty()) {
            System.out.println("Chưa có hóa đơn nào trong danh sách.");
        } else {
            for (int i = 0; i < invoices.size(); i++) {
                System.out.println((i + 1) + ". " + invoices.get(i));
            }
        }
    }


}
