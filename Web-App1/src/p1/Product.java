package p1;


public class Product {

	private String productName;
	private int productCost;
	private String category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, int productCost, String category) {
		super();
		this.productName = productName;
		this.productCost = productCost;
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productCost=" + productCost + ", category=" + category + "]";
	}

	
}
