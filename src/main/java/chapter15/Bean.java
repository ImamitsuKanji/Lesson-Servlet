package chapter15;

public class Bean {
	/*product*/
	private String sort;
	private int id;
	private String name;
	private int price;
	
	/*select*/
	private String count;
	private String payment;
	private String review;
	private String mail;

	/*select*/
	public String getCount() {
		return count;
	}

	public String getPayment() {
		return payment;
	}

	public String getReview() {
		return review;
	}

	public String getMail() {
		return mail;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	/*product*/
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getSort() {
		return sort;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

}
