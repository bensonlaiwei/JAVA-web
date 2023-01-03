package tw.com.web.code.bean;

public class Product {
	private String name ;
	private String doc;
	private String image;
	private String pay;
	
	public Product() {
		
	}

	public Product(String name, String doc, String image, String pay) {
		super();
		this.name = name;
		this.doc = doc;
		this.image = image;
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", doc=" + doc + ", image=" + image + ", pay=" + pay + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
