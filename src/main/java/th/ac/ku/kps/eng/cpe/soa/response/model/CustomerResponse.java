package th.ac.ku.kps.eng.cpe.soa.response.model;



import th.ac.ku.kps.eng.cpe.soa.model.Customer;

public class CustomerResponse {
	private String status;
	private String customer;
	private String msg;
	private Customer result;

	public Customer getResult() {
		return result;
	}

	public void setResult(Customer customer2) {
		this.result = customer2;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
