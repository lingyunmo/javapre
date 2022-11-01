package temp.poor;

public class Poor extends Person {
    String idNumber, familyAddress, poorReason, poorCondition, poorApplyS;
    long familyNumber;

    public Poor(String name, String sex, long age, long phoneNumber, String idNumber, String familyAddress, String poorReason, String poorCondition, long familyNumber) {
        super(name, sex, age, phoneNumber);
        this.idNumber = idNumber;
        this.familyAddress = familyAddress;
        this.poorReason = poorReason;
        this.poorCondition = poorCondition;
        this.familyNumber = familyNumber;
    }

    public Poor() {
        super();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getPoorReason() {
        return poorReason;
    }

    public void setPoorReason(String poorReason) {
        this.poorReason = poorReason;
    }

    public String getPoorCondition() {
        return poorCondition;
    }

    public void setPoorCondition(String poorCondition) {
        this.poorCondition = poorCondition;
    }

    public long getFamilyNumber() {
        return familyNumber;
    }

    public void setFamilyNumber(long familyNumber) {
        this.familyNumber = familyNumber;
    }

    public String getPoorApplyS() {
        return poorApplyS;
    }

    public void setPoorApplyS(String poorApplyS) {
        this.poorApplyS = poorApplyS;
    }

    @Override
    public void getBaseInfo() {
        super.getBaseInfo();
        System.out.println("身份证号码:" + idNumber + " " + "家庭住址:" + familyAddress + " " +
                "家庭人口:" + familyNumber + " " + "致贫原因:" + poorReason + " " + "脱贫状态:" + poorCondition);
    }

    public void poorApply() {
        System.out.println(poorApplyS);
    }
}
