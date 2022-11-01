package temp.poor;

public class Main {
    public static void main(String[] args) {
        Poor h1 = new Poor("张三", "男", 18, 123456789, "37XXXXXXXXXXXXXXXX", "火星", "无业游民", "暂未脱贫", 5);
        h1.setPoorApplyS("贫困原因：陨石破坏房子，需要帮助重建房屋以及基础设施");
        h1.getBaseInfo();
        h1.poorApply();
        Helper h2 = new Helper("李四", "女", 18, 987654321, "木星", "球长", "张三", "提供饮食", "火星");
        h2.setFunctionIntroduceS("扶贫政策：帮助修建房屋，给予经济援助");
        h2.getBaseInfo();
        h2.functionIntroduce();
    }
}