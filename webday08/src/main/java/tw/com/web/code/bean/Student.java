package tw.com.web.code.bean;

public class Student {
	
	private int sid;
	private String sName;
	private String sEmail;
	private String sAge;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int sid, String sName, String sEmail, String sAge) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sEmail = sEmail;
		this.sAge = sAge;
	}
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getsAge() {
		return sAge;
	}
	public void setsAge(String sAge) {
		this.sAge = sAge;
	}



	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sEmail=" + sEmail + ", sAge=" + sAge + "]";
	}
	
	
	
	
	
	
}
