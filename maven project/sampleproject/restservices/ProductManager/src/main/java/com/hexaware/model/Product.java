class Product{
	private int prod_id;
	private String prod_name;
        private double price;
	private int in_stock;
	private Date mfg_date;
	private int inv_id;

	Product[] pList = new Product[5];

	static int counter;

	//getters and setters
	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIn_stock() {
		return in_stock;
	}

	public void setIn_stock(int in_stock) {
		this.in_stock = in_stock;
	}

	public Date getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(Date mfg_date) {
		this.mfg_date = mfg_date;
	}

	public int getInv_id() {
		return inv_id;
	}

	public void setInv_id(int inv_id) {
		this.inv_id = inv_id;
	}

	//hashcode method
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + in_stock;
		result = prime * result + inv_id;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + prod_id;
		result = prime * result + ((prod_name == null) ? 0 : prod_name.hashCode());
		return result;
	}

	//equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (in_stock != other.in_stock)
			return false;
		if (inv_id != other.inv_id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (prod_id != other.prod_id)
			return false;
		if (prod_name == null) {
			if (other.prod_name != null)
				return false;
		} else if (!prod_name.equals(other.prod_name))
			return false;
		return true;
	}

	//toString method
	@Override
	public String toString() {
		return "Product [in_stock=" + in_stock + ", inv_id=" + inv_id + ", price=" + price + ", prod_id="
				+ prod_id + ", prod_name=" + prod_name + "]";
	}

	//constructor
	public Product(){

	}

	public Product(int prod_id, String prod_name, double price, int in_stock, int inv_id) {
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.price = price;
		this.in_stock = in_stock;
		this.inv_id = inv_id;
	}

	static void addProduct(){
		Product p = new Product();
		p.setProd_id(1);
		p.setProd_name("prod_name");
		p.setPrice(23.00);
		p.setIn_stock(12);
		p.setMfg_date("2019-12-01");
		p.setInv_id(1);

		p.pList[counter++] = p;
	}

	void listProducts(){
		Product x = new Product();
		for(int i=0;i<5;i++){
			addProduct();
		}
		System.out.println("Product List");
		for(int i; i<5;i++){
			System.out.println(x.prod_id + " " + x.prod_name);
		}
	} 

}