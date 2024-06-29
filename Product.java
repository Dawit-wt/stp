

/**
 * @author HP
 * @version 1.0
 * @created 27-Jun-2024 9:46:14 PM
 */
public class Product {

	private int Category_Id;
	private char Description;
	private int Price;
	private int Product_Id;
	private char Product_Name;
	public Category m_Category;
	public OrderItem m_OrderItem;
	public CartItem m_CartItem;
	public Review m_Review;

	public Product(){

	}

	public void finalize() throws Throwable {

	}

	public int add_to_cart(){
		return 0;
	}

	public int get_reviews(){
		return 0;
	}

}