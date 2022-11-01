package System.dangyuan;

public class DangYuan {
    private int id;
    private String name;
    private String sex;
    private String introduce;

    public DangYuan(int id, String name, String sex, String introduce) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.introduce = introduce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return getId() + "\t\t\t" + getName() + "\t\t\t" + getSex() + "\t\t\t" + getIntroduce();
    }
}
