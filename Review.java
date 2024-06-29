

/**
 * @author HP
 * @version 1.0
 * @created 27-Jun-2024 9:46:15 PM
 */
public class Review {


	private String Comment;
	private String Product_Name;
	private int Rating;
	private int Review_Id;
	private int ReviewDate;
	private int User_Id;
	public Review(String comment, String product_Name, int rating, int review_Id, int reviewDate, int user_Id) {
		Comment = comment;
		Product_Name = product_Name;
		Rating = rating;
		Review_Id = review_Id;
		ReviewDate = reviewDate;
		User_Id = user_Id;
	}
	public Review(){

	}



	public int submit_review(){
		return 0;
	}

	public String get_comment() {
		return (Comment);
	}

	public int get_rating() {
		return Rating;
	}

}