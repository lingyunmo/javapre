package testkk;

public class Poor extends Person {
	String inNumber,familyAdress,poorReason,poorCondition,poorApplys;
	long familyNumber;
	public Poor(String name, String sex, long age, String phonenumber, String inNumber, String familyAdress,
			String poorReason, String poorCondition, String poorApplys, long familyNumber) {
		super(name, sex, age, phonenumber);
		this.inNumber = inNumber;
		this.familyAdress = familyAdress;
		this.poorReason = poorReason;
		this.poorCondition = poorCondition;
		this.poorApplys = poorApplys;
		this.familyNumber = familyNumber;
	}
	public Poor() {
		super();
	}
	public String getInNumber() {
		return inNumber;
	}
	public void setInNumber(String inNumber) {
		this.inNumber = inNumber;
	}
	public String getFamilyAdress() {
		return familyAdress;
	}
	public void setFamilyAdress(String familyAdress) {
		this.familyAdress = familyAdress;
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
	public String getPoorApplys() {
		return poorApplys;
	}
	public void setPoorApplys(String poorApplys) {
		this.poorApplys = poorApplys;
	}
	public long getFamilyNumber() {
		return familyNumber;
	}
	public void setFamilyNumber(long familyNumber) {
		this.familyNumber = familyNumber;
	}
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("家庭地址："+familyAdress+" "+"家庭人口："+familyNumber+" "+"致贫原因："+poorReason+" "+"脱贫状态："+poorCondition);
		
	}
	public void poorApplys() {
		System.out.println("贫困申请："+poorApplys);
		}
	

}
