

/**
 * @author HP
 * @version 1.0
 * @created 27-Jun-2024 9:46:15 PM
 */
public class User {

	private char Address;
	private char Email;
	private char FirstName;
	private char LastName;
	private int Password;
	private int Phone_no;
	private int User_Id;
	private char User_Name;
	public Review m_Review;
	public Order m_Order;
	public Cart m_Cart;

	public User(){

	}

	public void finalize() throws Throwable {

	}

	public int get_orders(){
		return 0;
	}

	public boolean login(){
		return 0;
	}

}