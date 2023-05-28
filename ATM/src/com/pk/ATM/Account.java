package com.pk.ATM;

public class Account {
    private String cardId;
    private String name;
    private char sex;
    private String passWord;
    private double money;
    private double limit;  //取款限额

    public Account() {
    }

    public Account(String cardId, String name, char sex, String passWord, double money, double limit) {
        this.cardId = cardId;
        this.name = name;
        this.sex = sex;
        this.passWord = passWord;
        this.money = money;
        this.limit = limit;
    }

    public String getUsername() {
        return name + (sex == '男' ? "先生" : "女士");
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

}
