package tw.com.web.code.model;

/*
 * 會員機制
 * Login 
 * Register
 * 新增
 *  此結構為 javabean
 */



public class Number {
	
	private Integer nId;
	private String nName;
	private String nEmail;
	private String nPass;
	private String nSex;

	public Number() {
		super();
	}
	

	public Number(Integer nId, String nName, String nEmail, String nPass, String nSex) {
		super();
		this.nId = nId;
		this.nName = nName;
		this.nEmail = nEmail;
		this.nPass = nPass;
		this.nSex = nSex;
	}
	
	public Number(String nName, String nEmail, String nPass, String nSex) {
		super();
		this.nName = nName;
		this.nEmail = nEmail;
		this.nPass = nPass;
		this.nSex = nSex;
	}

	public Integer getnId() {
		return nId;
	}
	public void setnId(Integer nId) {
		this.nId = nId;
	}
	public String getnName() {
		return nName;
	}
	public void setnName(String nName) {
		this.nName = nName;
	}
	public String getnEmail() {
		return nEmail;
	}
	public void setnEmail(String nEmail) {
		this.nEmail = nEmail;
	}
	public String getnPass() {
		return nPass;
	}
	public void setnPass(String nPass) {
		this.nPass = nPass;
	}
	public String getnSex() {
		return nSex;
	}
	public void setnSex(String nSex) {
		this.nSex = nSex;
	}


	@Override
	public String toString() {
		return "Number [nId=" + nId + ", nName=" + nName + ", nEmail=" + nEmail + ", nPass=" + nPass + ", nSex=" + nSex
				+ "]";
	}
	
	
	
	
	

}
