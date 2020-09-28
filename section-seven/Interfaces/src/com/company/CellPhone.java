package com.company;

public class CellPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public CellPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Cell Phone On.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now Ringing " + phoneNumber + "on desk phone");
        } else {
            System.out.println("Phone is off.");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering this phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Ringringring Ringringring");
        } else {
            isRinging = false;
            System.out.println("Cell phone is off or number different");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
