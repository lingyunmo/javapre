package System.dangyuan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<DangYuan> dangYuanList = new ArrayList<>();
        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    print(dangYuanList);
                    break;
                case 2:
                    search(dangYuanList);
                    break;
                case 3:
                    add(dangYuanList);
                    break;
                case 4:
                    update(dangYuanList);
                    break;
                case 5:
                    delete(dangYuanList);
                    break;
                case 6:
                    System.out.println("感谢您使用本系统");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("-----欢迎进入\"七一勋章\"管理系统-----");
        System.out.println("1.显示全部");
        System.out.println("2.查询");
        System.out.println("3.添加");
        System.out.println("4.修改");
        System.out.println("5.删除");
        System.out.println("6.退出");
        System.out.println("请输入要执行的操作序号：");
    }

    public static void print(ArrayList<DangYuan> dangYuanList) {
        if (dangYuanList.isEmpty())
            System.out.println("没有数据");
        else {
            System.out.println("序号\t\t\t姓名\t\t\t\t性别\t\t\t事迹");
            for (DangYuan dangYuan : dangYuanList) {
                System.out.println(dangYuan);
            }
        }
    }

    public static void search(ArrayList<DangYuan> dangYuanList) {
        System.out.println("请输入要查询的序号：");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (DangYuan dangYuan : dangYuanList) {
            if (dangYuan.getId() == id) {
                System.out.println("序号\t\t\t姓名\t\t\t\t性别\t\t\t事迹");
                System.out.println(dangYuan);
                return;
            }
        }
        System.out.println("没有找到该人员");
    }

    public static void add(ArrayList<DangYuan> dangYuanList) {
        System.out.println("请输入编号");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (DangYuan dangYuan : dangYuanList) {
            if (dangYuan.getId() == id) {
                System.out.println("该编号已存在,添加失败");
                return;
            }
        }
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("请输入性别");
        String sex = scanner.next();
        System.out.println("请输入事迹");
        String introduce = scanner.next();
        dangYuanList.add(new DangYuan(id, name, sex, introduce));
        System.out.println("添加成功");
    }

    public static void update(ArrayList<DangYuan> dangYuanList) {
        System.out.println("请输入您想要修改的勋章党员的编号:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (DangYuan dangYuan : dangYuanList) {
            if (dangYuan.getId() == id) {
                System.out.println("请输入新的姓名");
                String name = scanner.next();
                System.out.println("请输入新的性别");
                String sex = scanner.next();
                System.out.println("请输入新的事迹");
                String introduce = scanner.next();
                dangYuan.setName(name);
                dangYuan.setSex(sex);
                dangYuan.setIntroduce(introduce);
                System.out.println("修改成功");
                return;
            }
            System.out.println("需要修改的勋章党员不存在");
        }
    }

    public static void delete(ArrayList<DangYuan> dangYuanList) {
        System.out.println("请输入您想要删除的勋章党员的编号:");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for (DangYuan dangYuan : dangYuanList) {
            if (dangYuan.getId() == id) {
                dangYuanList.remove(dangYuan);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("需要删除的勋章党员不存在");
    }
}
