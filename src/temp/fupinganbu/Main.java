package temp.fupinganbu;

public class Main {
    public static void main(String[] args) {
        Poor h1 = new Poor("王五", "女", 45, "123456789", "潍坊", "农民", "暂未脱贫", 6);
        h1.setPoorApplyS("商品滞销严重，请帮帮我们");
        h1.introduce();
        h1.poorApply();
        Helper h2 = new Helper("刘六", "男", 32, "987654321", "青岛", "扶贫员", "王五", "提供高新科技产品以及技术支持", "潍坊");
        h2.setFunctionIntroduceS("通过直播带货形式打开贫困户的销路");
        h2.introduce();
        h2.functionIntroduce();
    }
}
