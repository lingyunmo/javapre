package temp.poor;

public class Helper extends Person {
    String workAddress, workPost, helpPoorer, helpFunction, helpAddress, functionIntroduceS;

    public Helper(String name, String sex, long age, long phoneNumber, String workAddress, String workPost, String helpPoorer, String helpFunction, String helpAddress) {
        super(name, sex, age, phoneNumber);
        this.workAddress = workAddress;
        this.workPost = workPost;
        this.helpPoorer = helpPoorer;
        this.helpFunction = helpFunction;
        this.helpAddress = helpAddress;
    }

    public Helper() {
        super();
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

    public String getHelpAddress() {
        return helpAddress;
    }

    public void setHelpAddress(String helpAddress) {
        this.helpAddress = helpAddress;
    }

    public String getFunctionIntroduceS() {
        return functionIntroduceS;
    }

    public void setFunctionIntroduceS(String functionIntroduceS) {
        this.functionIntroduceS = functionIntroduceS;
    }

    @Override
    public void getBaseInfo() {
        super.getBaseInfo();
        System.out.println("单位:" + workAddress + " " + "职务:" + workPost + " " +
                "帮扶对象:" + helpPoorer + " " + "帮扶措施:" + helpFunction + " " + "帮扶地址:" + helpAddress);
    }

    public void functionIntroduce() {
        System.out.println(functionIntroduceS);
    }
}