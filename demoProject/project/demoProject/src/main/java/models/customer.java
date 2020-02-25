package models;

enum Gender {
	M, F
}

class customer{
      private int customerId;
      private String customerName;
      private Gender g; 
      private String address;

      //getters and setters
      public int getCustomerId(){
	      return customerId;
      }

      public String getCustomerName(){
	      return customerName;
      }

      public Gender getGender(){
	      return g;
      }

      public String getAddress(){
	      return address;
      }

      public void setCustomerId(int id){
	      this.customerId = id;
      }

      public void setCustomerName(String name){
	      this.customerName = name;
      }

      public void setGender(Gender g){
	      this.g = g;
      }

      public void setAddress(String address){
	      this.address = address;
      }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((g == null) ? 0 : g.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		customer other = (customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (g != other.g)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "customer [address=" + address + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", g=" + g + "]";
	}

	public customer(){}

	public customer(int customerId, String customerName, Gender g, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.g = g;
		this.address = address;
	}

	
      
}