package com.lddat.samsung.coex.model;

public class CoexDetail {
    String nameCoex;
    String linkImage;
    int money;
    boolean freeWifi,drink,printer,conversionCall,airConditioning;

    public CoexDetail(String nameCoex, String linkImage, int money, boolean freeWifi, boolean drink, boolean printer, boolean conversionCall, boolean airConditioning) {
        this.nameCoex = nameCoex;
        this.linkImage = linkImage;
        this.money = money;
        this.freeWifi = freeWifi;
        this.drink = drink;
        this.printer = printer;
        this.conversionCall = conversionCall;
        this.airConditioning = airConditioning;
    }

    public String getNameCoex() {
        return nameCoex;
    }

    public void setNameCoex(String nameCoex) {
        this.nameCoex = nameCoex;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isFreeWifi() {
        return freeWifi;
    }

    public void setFreeWifi(boolean freeWifi) {
        this.freeWifi = freeWifi;
    }

    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }

    public boolean isPrinter() {
        return printer;
    }

    public void setPrinter(boolean printer) {
        this.printer = printer;
    }

    public boolean isConversionCall() {
        return conversionCall;
    }

    public void setConversionCall(boolean conversionCall) {
        this.conversionCall = conversionCall;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }
}
