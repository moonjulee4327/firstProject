package student;

public class StudentVO {
	//필드
	private int stuNo;
	private String stuDep;
	private String stuEm;
	private String stuPneNo;
	private int stuGrd;
	private String stuAcdSt;
	private String stuBir;
	
	//생성자
	public StudentVO() {}
	
	//메소드
	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuDep() {
		return stuDep;
	}

	public void setStuDep(String stuDep) {
		this.stuDep = stuDep;
	}

	public String getStuEm() {
		return stuEm;
	}

	public void setStuEm(String stuEm) {
		this.stuEm = stuEm;
	}

	public String getStuPneNo() {
		return stuPneNo;
	}

	public void setStuPneNo(String stuPneNo) {
		this.stuPneNo = stuPneNo;
	}

	public int getStuGrd() {
		return stuGrd;
	}

	public void setStuGrd(int stuGrd) {
		this.stuGrd = stuGrd;
	}

	public String getStuAcdSt() {
		return stuAcdSt;
	}

	public void setStuAcdSt(String stuAcdSt) {
		this.stuAcdSt = stuAcdSt;
	}

	public String getStuBir() {
		return stuBir;
	}

	public void setStuBir(String stuBir) {
		this.stuBir = stuBir;
	}

	@Override
	public String toString() {
		return "StudentVO [stuNo=" + stuNo + ", stuDep=" + stuDep + ", stuEm=" + stuEm + ", stuPneNo=" + stuPneNo
				+ ", stuGrd=" + stuGrd + ", stuAcdSt=" + stuAcdSt + ", stuBir=" + stuBir + "]";
	}
	
	
	
}