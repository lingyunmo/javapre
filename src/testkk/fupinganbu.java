package testkk;

public class fupinganbu {
    public static void main(String[] args) {
        Poor h1 = new Poor("王五", "男", 40, "987654321", "inNumber", "济南", "Poorreason", "农民", "暂未脱贫", 8);
        h1.setPoorApplys("商品滞销，请帮帮我们");
        h1.introduce();
        h1.poorApplys();
        Helper h2 = new Helper("张三", "男", 31, "000098765", "潍坊", "扶贫员", "王五", "提供技术支持", "济南");
        h2.setFunctionIntroduces("通过直播带货售卖");
        h2.introduce();
        h2.functionIntroduce();


    }

}
