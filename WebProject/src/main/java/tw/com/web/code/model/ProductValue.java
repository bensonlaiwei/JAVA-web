package tw.com.web.code.model;

public class ProductValue {
	private Integer pId;
	private String pName;
	private String pDoc;
	private String pImage;
	private String pPay;
	
	
	public ProductValue() {
		
	}


	public ProductValue(Integer pId, String pName, String pDoc, String pImage, String pPay) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDoc = pDoc;
		this.pImage = pImage;
		this.pPay = pPay;
	}


	public Integer getpId() {
		return pId;
	}


	public void setpId(Integer pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getpDoc() {
		return pDoc;
	}


	public void setpDoc(String pDoc) {
		this.pDoc = pDoc;
	}


	public String getpImage() {
		return pImage;
	}


	public void setpImage(String pImage) {
		this.pImage = pImage;
	}


	public String getpPay() {
		return pPay;
	}


	public void setpPay(String pPay) {
		this.pPay = pPay;
	}


	@Override
	public String toString() {
		return "ProductValue [pId=" + pId + ", pName=" + pName + ", pDoc=" + pDoc + ", pImage=" + pImage + ", pPay="
				+ pPay + "]";
	}

	
	
	
}
