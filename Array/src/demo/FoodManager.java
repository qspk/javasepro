package demo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class FoodManager {
    private final ArrayList<Food> foods = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("==菜单后台管理界面==");
            System.out.println("0.离开系统");
            System.out.println("1.添加菜品");
            System.out.println("2.查看菜单");
            System.out.println("3.根据菜品名查询单个菜品信息");
            System.out.println("4.修改菜品信息");
            System.out.println("5.删除一个菜品");

            System.out.println("请输入您的操作命令: ");
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                switch (choice) {
                    case 0:
                        System.out.println("即将离开该系统,谢谢您的使用~~~");
                        return;
                    case 1:
                        //添加菜单
                        add();
                        break;
                    case 2:
                        //查看所有菜单
                        printAllFoods();
                        break;
                    case 3:
                        //查看单个菜品
                        System.out.println("请输入菜品名: ");
                        String name = sc.next();
                        printFood(name);
                        break;
                    case 4:
                        //修改菜品信息
                        update();
                        break;
                    case 5:
                        //删除一个菜品
                        deleteByName();
                        break;
                    default:
                        System.out.println("没有该指令!");
                        break;
                }
            } else {
                System.out.println("输入指令不合法!");
                sc.nextLine();
            }

        }
    }

    private void deleteByName() {
        System.out.println("请输入要删除的菜品名");
        Food food = findByName(sc.next());
        if (!Objects.isNull(food)) {
            foods.remove(food);
            System.out.println("删除成功");
        } else {
            System.out.println("没有找到菜品");
        }
    }

    private void update() {
        System.out.println("请输入需要修改的菜品名称:");
        String name = sc.next();
        printFood(name);
        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getName().equals(name)) {
                System.out.println("请选择需要修改的信息: ");
                System.out.println("0.退出修改系统");
                System.out.println("1.菜品名");
                System.out.println("2.菜品原价");
                System.out.println("3.菜品折扣价");
                System.out.println("4.菜品介绍");
                System.out.println("5.全部修改");
                if (sc.hasNextInt()) {
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 0:
                            System.out.println("已退出菜品修改系统");
                            return;
                        case 1:
                            System.out.println("请输入新的菜品名: ");
                            foods.get(i).setName(sc.next());
                            System.out.println("修改成功");
                            return;
                        case 2:
                            System.out.println("请输入新的菜品原价: ");
                            foods.get(i).setOriginalPrice(sc.nextDouble());
                            System.out.println("修改成功");
                            return;
                        case 3:
                            System.out.println("请输入新的菜品优惠价 ");
                            foods.get(i).setSpecialPrice(sc.nextDouble());
                            System.out.println("修改成功");
                            return;
                        case 4:
                            System.out.println("请输入新的商品介绍");
                            foods.get(i).setInfo(sc.next());
                            System.out.println("修改成功");
                            return;
                        case 5:
                            System.out.println("请输入新的菜品名: ");
                            foods.get(i).setName(sc.next());
                            System.out.println("请输入新的菜品原价: ");
                            foods.get(i).setOriginalPrice(sc.nextDouble());
                            System.out.println("请输入新的菜品优惠价 ");
                            foods.get(i).setSpecialPrice(sc.nextDouble());
                            System.out.println("请输入新的商品介绍");
                            foods.get(i).setInfo(sc.next());
                            System.out.println("修改成功");
                            return;
                        default:
                            System.out.println("没有该指令!");
                            return;
                    }
                } else {
                    System.out.println("输入指令不合法!");
                    sc.nextLine();
                    return;
                }
            }
        }
        System.out.println("没有找到菜品");
    }

    private Food findByName(String name) {
        for (Food food : foods) {
            if (food.getName().equals(name)) {
                return food;
            }
        }
        return null;
    }

    private void printFood(String name) {
        Food food = findByName(name);
        if (food == null) {
            System.out.println("没有找到该菜品信息,请检查后重试");
            return;
        }
        System.out.println("==菜品 " + food.getName() + " 的信息如下==");
        System.out.println("菜品名: " + food.getName());
        System.out.println("菜品原价: " + food.getOriginalPrice());
        System.out.println("菜品折扣价: " + food.getSpecialPrice());
        System.out.println("菜品介绍: " + food.getInfo());
        System.out.println("-----------------------");
    }

    private void printAllFoods() {
        System.out.println("==所有菜品信息如下==");
        for (Food food : foods) {
            System.out.println("菜品名: " + food.getName());
            System.out.println("菜品原价: " + food.getOriginalPrice());
            System.out.println("菜品折扣价: " + food.getSpecialPrice());
            System.out.println("菜品介绍: " + food.getInfo());
            System.out.println("-----------------------");
        }
    }

    private void add() {
        System.out.println("==添加菜单页面==");
        Food food = new Food();
        System.out.println("请输入菜品名: ");
        food.setName(sc.next());
        System.out.println("请输入菜品原价: ");
        food.setOriginalPrice(sc.nextDouble());
        System.out.println("请输入菜品优惠价格: ");
        food.setSpecialPrice(sc.nextDouble());
        System.out.println("请输入菜品其他信息: ");
        food.setInfo(sc.next());

        foods.add(food);
        System.out.println("新菜品添加成功");

    }
}
