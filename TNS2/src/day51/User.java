package day51;

/*Create a class "user" storing the information like username and password.
 * Give appropriate constructors and functions.If password length is less than eight characters,
 * user defined exception should thrown and appropriate message should be shown
 */

public class User {
	private String user_id;
	private String password;
	public User(String id,String pass)
	{
		user_id=id;
		password=pass;
	}
	
	public void validatepass() throws LessCharacterException
	{
		if(password.length()<8)
		{
			throw new LessCharacterException("you need to write minimum 8character foe password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User("dfdf","1fd54");
		try {
			u.validatepass();
		} catch (LessCharacterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
