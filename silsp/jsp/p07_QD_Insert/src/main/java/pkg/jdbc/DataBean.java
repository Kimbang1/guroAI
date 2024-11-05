package pkg.jdbc;

public class DataBean {
	
	private String goodsCode;
	private String goodsName;
	private int price;
	private int count;
	
	//생성자
	public DataBean(String goodsCode, String goodsName, int price, int count) {
		this.goodsCode=goodsCode;
		this.goodsName=goodsName;
		this.price=price;
		this.count=count;
	}
	
	
	
	
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
