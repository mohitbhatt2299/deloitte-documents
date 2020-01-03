package signup.SignupDAO;
import java.sql.*;
import java.util.ArrayList;


import signup.model.SignUpModel;
public class SignUpDatabase {
	public static Connection connectToDB() {
		// register driver
		Connection connection = null;
		try {// step 1 register deriver

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// step 2 create connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			return null;
		}

}
	public static void addUser(SignUpModel personalDetails) {

		try {
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select UserId.NEXTVAL from dual");
			ResultSet rs=stmt.executeQuery();
			rs.next();
			int Userid=rs.getInt(1);
			stmt = con.prepareStatement("insert into personalDetails values (?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1,Userid);
			stmt.setString(2,personalDetails.getEmail());
			stmt.setString(3,personalDetails.getName());
			stmt.setString(4,personalDetails.getFatherName());
			stmt.setString(5,personalDetails.getMotherName());
			stmt.setString(6,personalDetails.getAddress());
			stmt.setLong(7,personalDetails.getContact());
			stmt.setString(8,personalDetails.getGender());
			stmt.setString(9,personalDetails.getPassword());
			int affectedRows = stmt.executeUpdate();
			System.out.println("affected rows " + affectedRows);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	public static ArrayList<SignUpModel> displayAllUser() {

		try {
			ArrayList<SignUpModel> Alist = new ArrayList<SignUpModel>();

			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select * from personalDetails");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				SignUpModel personalDetail = new SignUpModel();
				personalDetail.setUserId(rs.getInt(1));
				personalDetail.setEmail(rs.getString(2));
				personalDetail.setName(rs.getString(3));
				personalDetail.setFatherName(rs.getString(4));
				personalDetail.setMotherName(rs.getString(5));
				personalDetail.setAddress(rs.getString(6));
				personalDetail.setContact(rs.getLong(7));
				personalDetail.setGender(rs.getString(8));
				personalDetail.setPassword(rs.getString(9));
				Alist.add(personalDetail);
			}
			con.close();
			return Alist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}