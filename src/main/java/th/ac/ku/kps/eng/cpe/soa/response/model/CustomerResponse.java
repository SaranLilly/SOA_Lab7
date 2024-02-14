package th.ac.ku.kps.eng.cpe.soa.response.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class CustomerResponse {
	private String status;
	private String customer;
	private String msg;

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
