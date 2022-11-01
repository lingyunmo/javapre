package testkk;

public class Helper extends Person {
    String workAddress, workPost, helpPoorer, helpFunction, helpAdress, functionIntroduces;

    public Helper(String name, String sex, long age, String phonenumber, String workAddress, String workPost, String helpPoorer, String helpFunction, String helpAdress) {
        super(name, sex, age, phonenumber);
        this.workAddress = workAddress;
        this.workPost = workPost;
        this.helpPoorer = helpPoorer;
        this.helpFunction = helpFunction;
        this.helpAdress = helpAdress;
        this.functionIntroduces = functionIntroduces;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkPost() {
        return workPost;
    }

    public void setWorkPost(String workPost) {
        this.workPost = workPost;
    }

    public String getHelpPoorer() {
        return helpPoorer;
    }

    public void setHelpPoorer(String helpPoorer) {
        this.helpPoorer = helpPoorer;
    }

    public String getHelpFunction() {
        return helpFunction;
    }

    public void setHelpFunction(String helpFunction) {
        this.helpFunction = helpFunction;
    }

    public String getHelpAdress() {
        return helpAdress;
    }

    public void setHelpAdress(String helpAdress) {
        this.helpAdress = helpAdress;
    }

    public String getFunctionIntroduces() {
        return functionIntroduces;
    }

    public void setFunctionIntroduces(String functionIntroduces) {
        this.functionIntroduces = functionIntroduces;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("单位：" + workAddress + " " + "职务：" + workPost + " " + "帮扶对象：" + helpPoorer + " " + "帮扶措施" + helpFunction + " " + "帮扶地址：" + helpAdress);


    }

    public void functionIntroduce() {
        System.out.println("扶贫政策介绍：" + functionIntroduces);
    }

}
