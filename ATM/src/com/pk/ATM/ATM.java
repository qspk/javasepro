package com.pk.ATM;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    int flag = 0;

    /**
     * 启动ATM系统,展示欢迎页面
     */
    public void start() throws InterruptedException {
        if (flag == 0) {
            Account account = new Account("12345678", "李四", '男',
                    "123", 5000, 10000);
            accounts.add(account);
            flag = 1;
        }
        while (true) {
            System.out.println("===欢迎您进入ATM系统===");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("3.离开");
            System.out.println("请选择需办理业务:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    signIn();
                    //用户登录
                    break;
                case 2:
                    //用户开户
                    signUp();
                    break;
                case 3:
                    //离开
                    exitAtmSystem();
                    break;
                default:
                    System.out.println("输入有误,请重新输入");
                    break;
            }
        }
    }

    /**
     * 展示用户操作页面
     */
    public void personal(Account account) throws InterruptedException {
        while (true) {
            System.out.println("==个人操作页面==");
            System.out.println(account.getName() + "用户您好");
            System.out.println("当前用余额:" + account.getMoney());
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.转账");
            System.out.println("4.修改密码");
            System.out.println("5.销户");
            System.out.println("6.离开");
            System.out.println("请输入需要操作的业务序号:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //存款
                    deposit(account);
                    break;
                case 2:
                    //取款
                    withdraw(account);
                    break;
                case 3:
                    //转账
                    transferAccount(account);
                    break;
                case 4:
                    //修改密码
                    updatePassword(account);
                    break;
                case 5:
                    //销户
                    unsubscribe(account);
                case 6:
                    start();
                    break;
                default:
                    System.out.println("输入有误,请重新输入");
                    break;
            }
        }

    }

    private void updatePassword(Account account) throws InterruptedException {
        System.out.println("请输入当前密码:");
        String passWord = sc.next();
        while (!Objects.equals(passWord, account.getPassWord())) {
            System.out.println("输入密码错误,请检查后重试:");
            passWord = sc.next();
        }
        System.out.println("请输入新密码:");
        passWord = sc.next();
        System.out.println("请再次输入新密码");
        String passWord2 = sc.next();
        while (!Objects.equals(passWord, passWord2)) {
            System.out.println("两次密码不一致,请重新输入:");
            passWord2 = sc.next();
        }
        account.setPassWord(passWord);
        System.out.println("修改密码成功,即将返回主界面,请重新登录!");
        Thread.sleep(2000);
        start();
    }

    //销户
    private void unsubscribe(Account account) throws InterruptedException {
        System.out.println("是否确认销户\n" + "y/n");
        char ch = sc.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.println("确认销户,开始销户");
        } else {
            personal(account);
        }
        for (int i = 0; i < accounts.size(); i++) {
            if (Objects.equals(account.getCardId(), accounts.get(i).getCardId())) {
                //Account remove = accounts.remove(i);
                accounts.remove(account);
                System.out.println(account.getCardId() + "用户销户成功!");
                start();
            }
        }
    }

    //转账
    private void transferAccount(Account account) throws InterruptedException {
        System.out.println("请输入转账对象的卡号(输入'0'退出):");
        String cardId = sc.next();
        if (Objects.equals(cardId,"0")) {
            personal(account);
        }
        int flag = 0;
        while (flag == 0) {
            for (Account account1 : accounts) {
                if (Objects.equals(cardId, account1.getCardId())) {
                    flag = 1;
                    System.out.println("请输入转账金额(输入'0'退出):");
                    double money = sc.nextDouble();
                    while (money < 0) {
                        System.out.println("无效数值,请重新输入一个大于0的数值(输入'0'退出):");
                        money = sc.nextDouble();
                    }
                    if (money == 0) {
                        personal(account);
                    }
                    account.setMoney(account.getMoney() - money);
                    account1.setMoney(account1.getMoney() + money);
                    System.out.println("转账成功,当前余额:" + account.getMoney());
                    return;
                }
            }
            System.out.println("查不到此卡号相关信息,请检查后重新尝试(输入'0'退出):");
            cardId = sc.next();
            if (Objects.equals(cardId,"0")) {
                personal(account);
            }
        }
    }

    //取款
    private void withdraw(Account account) throws InterruptedException {
        System.out.println("请输入取款金额(输入'0'退出):");
        double money = sc.nextDouble();
        while (money < 0) {
            System.out.println("无效数值,请重新输入一个大于0的数值(输入'0'退出):");
            money = sc.nextDouble();
        }
        if (money == 0) {
            personal(account);
        }
        account.setMoney(account.getMoney() - money);
        System.out.println("取款成功,当前余额:" + account.getMoney());
    }

    //存款
    private void deposit(Account account) throws InterruptedException {
        System.out.println("存款金额(输入'0'退出):");
        double money = sc.nextDouble();
        while (money < 0) {
            System.out.println("无效数值,请重新输入一个大于0的数值(输入'0'退出):");
            money = sc.nextDouble();
        }
        if (money == 0) {
            personal(account);
        }
        account.setMoney(account.getMoney() + money);
        System.out.println("存款成功,当前余额:" + account.getMoney());
    }


    //离开系统
    private void exitAtmSystem() {
        System.out.println("感谢您的使用,再见!");
        System.exit(0);
    }

    //开户功能
    private void signUp() throws InterruptedException {
        System.out.println("==欢迎使用开户功能==");
        System.out.println("请输入您的姓名:");
        String name = sc.next();
        System.out.println("请输入您的性别:");
        char sex = sc.next().charAt(0);
        while (sex != '男' && sex != '女') {
            System.out.println("性别输入有误,请重新输入您的性别:");
            sex = sc.next().charAt(0);
        }
        String cardId;
        System.out.println("请您输入密码:");
        String passWord = sc.next();
        System.out.println("请您确认密码(再次输入密码):");
        String passWord2 = sc.next();
        while (!(passWord.equals(passWord2))) {
            System.out.println("两次密码不一致,请重试");
            passWord2 = sc.next();
        }
        System.out.println("请输入您的取款限额:");
        double limit = sc.nextDouble();
        while (limit < 100) {
            System.out.println("限额太小,请重新输入:");
            limit = sc.nextDouble();
        }
        cardId = creatCardId();
        System.out.println("开户成功,您的账号为: " + cardId + ",即将返回主界面");
        Account account = new Account();
        account.setCardId(cardId);
        account.setName(name);
        account.setSex(sex);
        account.setPassWord(passWord);
        account.setLimit(limit);
        accounts.add(account);
        start();
    }

    //生成账号
    private String creatCardId() {
        Random r = new Random();
        while (true) {
            int i;
            int ci = r.nextInt(100000000);
            String cardId = Integer.toString(ci);
            if (accounts.isEmpty()) {
                return cardId;
            }
            for (i = 0; i < accounts.size(); i++) {
                Account account = accounts.get(i);
                if (cardId.equals(account.getCardId())) {
                    break;
                }
            }
            return cardId;
        }
    }

    //登录功能
    private void signIn() throws InterruptedException {
        System.out.println("==用户登录操作==");
        if (accounts.isEmpty()) {
            System.out.println("该银行系统没有用户,请先开户");
            return;
        }
        System.out.println("请输入您的银行账户:");
        String cardId = sc.next();
        for (Account account : accounts) {
            if (Objects.equals(cardId, account.getCardId())) {
                System.out.println("欢迎您" + account.getName() + "用户,请您输入密码:");
                String passWord = sc.next();
                while (!Objects.equals(passWord, account.getPassWord())) {
                    System.out.println("密码错误,请检查后重新输入!");
                    System.out.println("请重新输入密码:");
                    passWord = sc.next();
                }
                //进入用户业务管理界面
                personal(account);
            }
        }
        System.out.println("没有该账号信息,请检查账号后重试");
        start();
    }
}



