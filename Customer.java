package day5;

import java.io.Serializable;

public class Customer  implements Serializable{

		 private int custId;
		private String custname;
		private double commn;

		public Customer() {
			super();		
		}
	public Customer(int custId, String custname, double commn) {
			super();
			this.custId = custId;
			this.custname = custname;
			this.commn = commn;
		}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getCommn() {
		return commn;
	}
	public void setCommn(double commn) {
		this.commn = commn;
	}

	

}
