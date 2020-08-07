package by.kotik.task5.entity;

import java.util.ArrayList;

public class TravelAgency {
    private String name;
    private ArrayList<Voucher> vouchers;

    public TravelAgency(String name) {
        this.name = name;
        this.vouchers = new ArrayList<>();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(ArrayList<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
    
    
}
