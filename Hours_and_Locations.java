
public class Hours_and_Locations {

	private String Address;
	private int hoursOfOpration;
	private int phone_no;
	private String srore_name;
	private int store_id;
	public User m_User;

	public Hours_and_Locations(){

	}

	public Hours_and_Locations(String address, int hoursOfOpration, int phone_no, String srore_name, int store_id, User m_User) {
		Address = address;
		hoursOfOpration = hoursOfOpration;
		this.phone_no = phone_no;
		this.srore_name = srore_name;
		this.store_id = store_id;
		this.m_User = m_User;
	}

	public int calculate_distance(){
		return 0;
	}

}