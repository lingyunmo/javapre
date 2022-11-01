package reflect;

public class Test {
    private int age;
    private String introduce;

    public Test(int age, String introduce) {
        this.age = age;
        this.introduce = introduce;
    }

    public Test() {
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
