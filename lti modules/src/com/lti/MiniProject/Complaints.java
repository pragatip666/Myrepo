package com.lti.MiniProject;

import java.time.LocalDate;

public class Complaints {
	private String Date_received;
	private String Product;
	private String SubProduct;
	private String Issue;
	private String SubIssue;
	private String Company;
	private String State;
	private String ZipCode;
	private String SubmittedVia;
	private String Data_Sent_To_Company;
	private String Company_Response_To_Customer;
	private String Timely_Response;
	private String Consumer_Disputed;
	private String Complaint_id;

	public Complaints(String date_received, String product, String subProduct, String issue, String subIssue,
			String company, String state, String zipCode, String submittedVia, String data_Sent_To_Company,
			String company_Response_To_Customer, String timely_Response, String consumer_Disputed, String complaintID) {
		
		super();
		this.Date_received = date_received;
		this.Product = product;
		this.SubProduct = subProduct;
		this.Issue = issue;
		this.SubIssue = subIssue;
		this.Company = company;
		this.State = state;
		this.ZipCode = zipCode;
		this.SubmittedVia = submittedVia;
		this.Data_Sent_To_Company = data_Sent_To_Company;
		this.Company_Response_To_Customer = company_Response_To_Customer;
		this.Timely_Response = timely_Response;
		this.Consumer_Disputed = consumer_Disputed;
		this.Complaint_id = complaintID;
	}

	

	public String getDate_received() {
		return Date_received;
	}

	public void setDate_received(String date_received) {
		Date_received = date_received;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getSubProduct() {
		return SubProduct;
	}

	public void setSubProduct(String subProduct) {
		SubProduct = subProduct;
	}

	public String getIssue() {
		return Issue;
	}

	public void setIssue(String issue) {
		Issue = issue;
	}

	public String getSubIssue() {
		return SubIssue;
	}

	public void setSubIssue(String subIssue) {
		SubIssue = subIssue;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getSubmittedVia() {
		return SubmittedVia;
	}

	public void setSubmittedVia(String submittedVia) {
		SubmittedVia = submittedVia;
	}

	public String getData_Sent_To_Company() {
		return Data_Sent_To_Company;
	}

	public void setData_Sent_To_Company(String data_Sent_To_Company) {
		Data_Sent_To_Company = data_Sent_To_Company;
	}

	public String getCompany_Response_To_Customer() {
		return Company_Response_To_Customer;
	}

	public void setCompany_Response_To_Customer(String company_Response_To_Customer) {
		Company_Response_To_Customer = company_Response_To_Customer;
	}

	public String getTimely_Response() {
		return Timely_Response;
	}

	public void setTimely_Response(String timely_Response) {
		Timely_Response = timely_Response;
	}

	public String getConsumer_Disputed() {
		return Consumer_Disputed;
	}

	public void setConsumer_Disputed(String consumer_Disputed) {
		Consumer_Disputed = consumer_Disputed;
	}

	public String getComplaint_id() {
		return Complaint_id;
	}

	public void setComplaint_id(String complaint_id) {
		Complaint_id = complaint_id;
	}
}
