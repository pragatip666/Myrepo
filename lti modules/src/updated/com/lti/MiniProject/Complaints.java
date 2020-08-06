package updated.com.lti.MiniProject;

public class Complaints {
	private String Date_recieved;
	private String Product;
	private String SubProduct;
	private String Issue;
	private String SubIssue;
	private String Company;
	private String State;
	private String ZipCode;
	private String SubmittedD;
	private String DataClosed;
	private String CompanyResponse;
	private String TimelyResponse;
	private String ConsumerDisputed;
	private String ComplaintId;
	
	
	
	public Complaints(String date_recieved, String product, String subProduct, String issue, String subIssue,
			String company, String state, String zipCode, String submittedD, String dataClosed,
			String companyResponse, String timelyResponse, String consumerDisputed, String complaintId) {
		super();
		Date_recieved = date_recieved;
		Product = product;
		SubProduct = subProduct;
		Issue = issue;
		SubIssue = subIssue;
		Company = company;
		State = state;
		ZipCode = zipCode;
		SubmittedD = submittedD;
		DataClosed = dataClosed;
		CompanyResponse = companyResponse;
		TimelyResponse = timelyResponse;
		ConsumerDisputed = consumerDisputed;
		ComplaintId = complaintId;
	}

	   public Complaints() {
		// TODO Auto-generated constructor stub
	}

	public String getDate_recieved() {
		return Date_recieved;
	}



	public void setDate_recieved(String date_recieved) {
		Date_recieved = date_recieved;
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



	public String getSubmittedD() {
		return SubmittedD;
	}



	public void setSubmittedD(String submittedD) {
		SubmittedD = submittedD;
	}



	public String getDataClosed() {
		return DataClosed;
	}



	public void setDataClosed(String dataClosed) {
		DataClosed = dataClosed;
	}



	public String getCompanyResponse() {
		return CompanyResponse;
	}



	public void setCompanyResponse(String companyResponse) {
		CompanyResponse = companyResponse;
	}



	public String getTimelyResponse() {
		return TimelyResponse;
	}



	public void setTimelyResponse(String timelyResponse) {
		TimelyResponse = timelyResponse;
	}



	public String getConsumerDisputed() {
		return ConsumerDisputed;
	}



	public void setConsumerDisputed(String consumerDisputed) {
		ConsumerDisputed = consumerDisputed;
	}



	public String getComplaintId() {
		return ComplaintId;
	}



	public void setComplaintId(String complaintId) {
		ComplaintId = complaintId;
	}



	
}
