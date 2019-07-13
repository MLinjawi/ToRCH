package Controller;

import java.sql.Connection;
//import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Robots;
import java.sql.PreparedStatement;
/**
 * Adding robot to the database  
 */
/*public class AddRobot extends DataBaseConn
{ /*
	/**
	 * Method Insert robot value to the DB sample 
	 * @param Robot object contain all values to be inserted  
	 * @return  nothing 
	 * @author MLinjawi
	 *
	public void InsertRobot(Robots ROB) 
	{	 PreparedStatement statement = null;
		 Connection con = connectToDatabase();
		 try 
		 {
			//statement = con.prepareStatement( "insert into RETWEET( TweetID, RetweetUserID)  values( ?, ?)");
			 statement = con.prepareStatement( "INSERT INTO ROBOT (name, socialtype, mobile, manipulating, proximity_inter, embodiment, identify, learn, aim, inter_structure, social_comm, behaviour, emotions)"
			+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,? )"); 
			 //		+ "+ 'AHPR-4 Kawada', 'sociable'                        , '10',  '10',  '10',  '8',  '10',  '10', '10',  '10',  '10',   '10',  '10' );
			statement.setString(1,ROB.getname());
			statement.setString(2, ROB.getsocialtype());
			statement.setInt(3, ROB.getmobile());
			statement.setInt(4, ROB.getmanipulating());
			statement.setInt(5, ROB.getproximity_inter());
			statement.setInt(6, ROB.getembodiment());
			statement.setInt(7, ROB.getidentify());
			statement.setInt(8, ROB.getlearn());
			statement.setInt(9, ROB.getaim());
			statement.setInt(10, ROB.getinter_structure());
			statement.setInt(11, ROB.getsocial_comm());
			statement.setInt(12, ROB.getbehaviour());
			statement.setInt(13, ROB.getemotion());
			int affectedRows = statement.executeUpdate();
			if (affectedRows <= 0) 
				{ 	throw new SQLException(" no rows affected.");}
			statement.close();
			con.close();
		 }
	 	catch (SQLException e) 
		{	e.printStackTrace();		}
	} 
}*/

