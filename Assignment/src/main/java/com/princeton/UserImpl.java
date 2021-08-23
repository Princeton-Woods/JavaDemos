package com.princeton;
import java.io.PrintWriter;
import java.sql.*;

public class UserImpl implements UserDAO{
	private static Statement statement = null;
	Connection connection;// = null;
    	
    public UserImpl()  {
    	try {
    		this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Override
    public void addUser(User user) throws SQLException {

        
        String sql = "insert into usersweb (userEmail,userCountry,userGender,userName) values (?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getEmail());
        preparedStatement.setString(2, user.getCountry());
        preparedStatement.setString(3, user.getGender());
        preparedStatement.setString(4, user.getName());
        int count = preparedStatement.executeUpdate();
        if(count > 0) {
            System.out.println("User saved");            
        }
        else {
            System.out.println("Error");
        }
    }
    @Override
    public void updateUser(User user) throws SQLException {
        String sql = "update usersweb set userName = ?, userEmail = ?, userCountry = ? , userGender = ? where userId = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getEmail());
        preparedStatement.setString(3, user.getCountry());
        preparedStatement.setString(4, user.getGender());
        preparedStatement.setInt(5, user.getId());
        int count = preparedStatement.executeUpdate();
        if(count > 0) {
            System.out.println("User updated");
                    }
        else {
            System.out.println("Error ");
                    }
        
    }
    @Override
    public void deleteUser(String email) throws SQLException {
        String sql = "delete from usersweb where userEmail = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        int count = preparedStatement.executeUpdate();
        if(count > 0) {
            System.out.println("User deleted");
        }
        else {
            System.out.println("Invalid id zero rows affected.");
        }
    }
    @Override
	public void getUsers(PrintWriter out)  throws SQLException{
		String sql = "select * from usersweb";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);		
		
		ResultSet resset = preparedStatement.executeQuery();
		
		out.println("<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Test</title>\r\n"
				+ "    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n"
				+ "    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n"
				+ "    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n"
				+ "</head>");
		out.println("<body>");
		
		out.println("<table style=\"width:65%\">");
		out.println("<tr><th>Name</th><th>Email</th><th>Country</th><th>Gender</th> </tr>");
		while(resset.next()) { //convert to string for user	
			out.println("<tr><td>	" + resset.getString(2)+ "</td><td>		" +resset.getString(3) + "</td><td>		" + resset.getString(4) + "</td><td>	" + resset.getString(5) + 
					"</td><td><button class=\"editbtn\">Update</button></td>" + "<td><button class=\"editbtn\">Delete</button></td></tr>");
		}
		out.println("</body>");
		
	}

}
