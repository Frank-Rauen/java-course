package com.company;

public class Main {

    public static void main(String[] args) {
	ITelephone franksPhone;
	franksPhone = new DeskPhone(123456789);
	franksPhone.powerOn();
	franksPhone.callPhone(123456789);
	franksPhone.answer();

	franksPhone = new CellPhone(123456789);
	franksPhone.powerOn();
	franksPhone.callPhone(123456789);
	franksPhone.answer();
    }
}
