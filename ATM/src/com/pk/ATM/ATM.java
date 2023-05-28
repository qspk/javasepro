package com.pk.ATM;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * ATM的操作类
 */
public class ATM {
    private final ArrayList<Account> accounts = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
    int flag = 0;

    /**
     * 启动ATM系统,展示欢迎页面
     */
    public void start() throws InterruptedException {
        if (flag == 0) {
            Account account = new Account("12345678", "李四", '男',
                    "123", 5000, 10000);
            Account account2 = new Account("11111111", "王五", '男',
                    "123", 10000, 10000);
            accounts.add(account);
            accounts.add(account2);
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
                    System.out.println("谢谢您的使用,下次再见~~");
                    return;
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
            System.out.println(account.getUsername() + "您好");
            System.out.println("当前用余额:" + account.getMoney());
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.转账");
            System.out.println("4.修改密码");
            System.out.println("5.查询账户");
            System.out.println("6.销户");
            System.out.println("7.离开");
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
                    //查询账户
                    printAccount(account);
                    break;
                case 6:
                    //销户
                    if (unsubscribe(account)) {
                        return;
                    }
                    break;
                case 7:
                    //离开
                    return;
                default:
                    System.out.println("输入有误,请重新输入");
                    break;
            }
        }

    }

    //查询个人账户
    private void printAccount(Account account) {
        System.out.println("===正在展示您的个人信息===");
        System.out.println("账号:\t" + account.getCardId());
        System.out.println("姓名:\t" + account.getName());
        System.out.println("性别:\t" + account.getSex());
        System.out.println("密码:\t" + "******");
        System.out.println("余额:   \t" + account.getMoney() + "元");
        System.out.println("取款限额:\t" + account.getLimit() + "元");
    }

    //修改密码
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
    private Boolean unsubscribe(Account account) {
        System.out.println("是否确认销户\n" + "y/n");
        char ch = sc.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.println("确认销户,开始销户");
            for (int i = 0; i < accounts.size(); i++) {
                if (Objects.equals(account.getCardId(), accounts.get(i).getCardId())) {
                    accounts.remove(account);
                    System.out.println(account.getCardId() + "用户销户成功!");
                    return true;
                }
            }
        } else {
            System.out.println("已取消销户,即将返回个人账户界面");
        }
        return false;
    }

    //转账
    private void transferAccount(Account account) throws InterruptedException {
        if (accounts.size() == 1) {
            System.out.println("该银行目前只有您一位用户,没有转账目标");
            return;
        }
        while (true) {
            System.out.println("请输入转账对象的卡号(输入'0'退出):");
            String cardId = sc.next();
            if (Objects.equals(cardId, "0")) {
                return;
            }
            if (cardId.equals(account.getCardId())) {
                System.out.println("无法给自己转账");
                return;
            }
            for (Account account1 : accounts) {
                if (Objects.equals(cardId, account1.getCardId())) {
                    String name = account1.getName();
                    String firstName = String.valueOf(name.charAt(0));
                    name = name.replace(firstName, "*");
                    System.out.println("请输入转账对象 " + name + " 的姓氏");
                    if (!firstName.equals(sc.next())) {
                        System.out.println("验证失败,请检查后重新转账");
                        return;
                    }
                    System.out.println("验证成功");
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
            System.out.println("查不到此卡号相关信息,请检查后重新尝试");

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
        String cardId = creatCardId();
        Account account = new Account();
        account.setCardId(cardId);
        account.setName(name);
        account.setSex(sex);
        account.setPassWord(passWord);
        account.setLimit(limit);
        accounts.add(account);
        System.out.println("开户成功,您的账号为: " + cardId);
        System.out.println("是否直接进入个人账户界面:'y' 确定 任意键拒绝");
        String command = sc.next();
        if (command.equals("y") || command.equals("Y")) {
            personal(account);
        } else {
            System.out.println("即将返回主界面");
        }

    }

    //生成账号
    private String creatCardId() {
        Random r = new Random();
        boolean flag = true;
        while (true) {
            int ci = r.nextInt(100000000);
            /*String cardId = Integer.toString(ci);*/
            String cardId = String.format("%08d", ci);  //整型转换为8位字符串,不足位补 0
            if (accounts.isEmpty()) {
                return cardId;
            }
            for (Account account : accounts) {
                if (account.getCardId().equals(cardId)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return cardId;
            }
        }
    }

    //登录功能
    private void signIn() throws InterruptedException {
        System.out.println("==用户登录操作==");
        if (accounts.isEmpty()) {
            System.out.println("该银行系统没有用户,请先开户");
            return;
        }
        while (true) {
            System.out.println("请输入您的银行账户:");
            String cardId = sc.next();
            for (Account account : accounts) {
                if (Objects.equals(cardId, account.getCardId())) {
                    System.out.println(account.getUsername() + " 欢迎您,请您输入密码:");
                    String passWord = sc.next();
                    while (!Objects.equals(passWord, account.getPassWord())) {
                        System.out.println("密码错误,请检查后重新输入!");
                        System.out.println("请重新输入密码:");
                        passWord = sc.next();
                    }
                    //进入用户业务管理界面
                    System.out.println("登录成功,进入个人账户界面");
                    System.out.println("-------------------------");
                    personal(account);
                    return;
                }
            }
            System.out.println("没有该账号信息,请检查账号后重试");
        }
    }
}



