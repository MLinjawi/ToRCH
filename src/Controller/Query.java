package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Robots;

/**
 * Querying the database database class
 */
public class Query extends DataBaseConn {
	/**
	 * Method getRobots from DB
	 * 
	 * @param sqlQ : Select statement
	 * @return list of Robot names
	 * @author MLinjawi
	 */
	public List<String> getRobots(String sqlQ) {
		List<String> result = new ArrayList<String>();
		Connection conn = connectToDatabase();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			
			
			sqlQ = "SELECT * FROM ROB;";
		
			System.out.println(sqlQ);
			rs = stmt.executeQuery(sqlQ);			// rs = stmt.executeQuery(" SELECT * FROM ROBOTS;");
			
			
			// System.out.println(rs);
			// int rowCount = rs.last() ? rs.getRow() : 0;
			// System.out.println("rowCount"+ " "+rowCount);
			
			System.out.println("The list is :");
			
			// System.out.println(" first "+ rs.first());
			// System.out.println("next" + rs.next());
			
			while (rs.next()) {
				String S = rs.getString("Name");
				result.add(S);
				System.out.println(S);

			}
			// result.add(rs.getString("Id")); }

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectFromDatabase(conn);
		}
		return result;
	}

//////////////////////////////////////////////////////////////////	
	/**
	 * Method getRobots from DB
	 * 
	 * @param sqlQ : Select statement
	 * @return list of robot objects
	 * @author MLinjawi
	 */
	public List<Robots> getRobotsObjectList(String sqlQ) {
		List<Robots> result = new ArrayList<Robots>();
		Connection conn = connectToDatabase();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			System.out.println(sqlQ);
			// sqlQ= "SELECT * FROM ROB;";
			rs = stmt.executeQuery(sqlQ);
			System.out.println("The list is :");
			while (rs.next()) {
				Robots r = new Robots();
				// int Id;
				r.setID(rs.getInt("Id"));
				// String Name;
				r.setname(rs.getString("Name"));
				// int PObj;
				r.setPObj(rs.getInt("PObj"));
				// int PDigInfo;
				r.setPDigInfo(rs.getInt("PDigInfo"));
				// int PSoAg;
				r.setPSoAg(rs.getInt("PSoAg"));
				// int PEm;
				r.setPEm(rs.getInt("PEm"));
				// int PSoBeh;
				r.setPSoBeh(rs.getInt("PSoBeh"));
				// int PGen;
				r.setPGen(rs.getInt("PGen"));
				// int PEnviro;
				r.setPEnviro(rs.getInt("PEnviro"));
				// int PSelfLoc;
				r.setPSelfLoc(rs.getInt("PSelfLoc"));
				// int PObjLoc;
				r.setPObjLoc(rs.getInt("PObjLoc"));
				// int PSoAgLoc;
				r.setPSoAgLoc(rs.getInt("PSoAgLoc"));
				// int PTrace;
				r.setPTrace(rs.getInt("PTrace"));
				// String PMod;
				r.setPMod(rs.getString("PMod"));
				// int PhyObjInter;
				r.setPhyObjInter(rs.getInt("PhyObjInter"));
				// int CogInterp;
				r.setCogInterp(rs.getInt("CogInterp"));
				// int SoInterp;
				r.setSoInterp(rs.getInt("SoInterp"));
				// int UnConsMo;
				r.setUnConsMo(rs.getInt("UnConsMo"));
				// int ConsMo;
				r.setConsMo(rs.getInt("ConsMo"));
				// int Grap;
				r.setGrap(rs.getInt("Grap"));
				// int Hold;
				r.setHold(rs.getInt("Hold"));
				// int Handle;
				r.setHandle(rs.getInt("Handle"));
				// int Knowl;
				r.setKnowl(rs.getInt("Knowl"));
				// int Cog;
				r.setCog(rs.getInt("Cog"));
				// int EmExp;
				r.setEmExp(rs.getInt("EmExp"));
				// int SoBehExp;
				r.setSoBehExp(rs.getInt("SoBehExp"));
				// int SoSkill;
				r.setSoSkill(rs.getInt("SoSkill"));
				// int GenAction;
				r.setGenAction(rs.getInt("GenAction"));
				// int ActPurObj;
				r.setActPurObj(rs.getInt("ActPurObj"));
				// int ActPurPpl;
				r.setActPurPpl(rs.getInt("ActPurPpl"));
				// int ActPurInfo;
				r.setActPurInfo(rs.getInt("ActPurInfo"));
				// int EnvPhysi;
				r.setEnvPhysi(rs.getInt("EnvPhysi"));
				// int EnvSo;
				r.setEnvSo(rs.getInt("EnvSo"));
				// int EnvInfo;
				r.setEnvInfo(rs.getInt("EnvInfo"));
				// int EnvCog;
				r.setEnvCog(rs.getInt("EnvCog"));
				// int DeciAuto;
				r.setDeciAuto(rs.getInt("DeciAuto"));
				// int TaskAdap;
				r.setTaskAdap(rs.getInt("TaskAdap"));
				// int SysDepen;
				r.setSysDepen(rs.getInt("SysDepen"));
				// int HRIFeedBack;
				r.setHRIFeedBack(rs.getInt("HRIFeedBack"));
				// int HRIModel;
				r.setHRIModel(rs.getInt("HRIModel"));
				// int SoHRILevel;
				r.setSoHRILevel(rs.getInt("SoHRILevel"));
				// int ObjInter;
				r.setObjInter(rs.getInt("ObjInter"));
				// int RToR;
				r.setRToR(rs.getInt("RToR"));
				// int RToD;
				r.setRToD(rs.getInt("RToD"));
				// int PhyMotionInter;
				r.setPhyMotionInter(rs.getInt("PhyMotionInter"));
				// int SoCogInter;
				r.setSoCogInter(rs.getInt("SoCogInter"));
				// int LearnInter;
				r.setLearnInter(rs.getInt("LearnInter"));
				// int CogInter;
				r.setCogInter(rs.getInt("CogInter"));
				// int MethodInter;
				r.setMethodInter(rs.getInt("MethodInter"));
				// int HRIProximity;
				r.setHRIProximity(rs.getInt("HRIProximity"));
				// String TalSkil;
				r.setTalSkil(rs.getString("TalSkil"));
				// String Intel;
				r.setIntel(rs.getString("Intel"));
				result.add(r);
				r.Display();
				System.out.println(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectFromDatabase(conn);
		}
		return result;
	}
//////////////////////////////////////////////////////////////////
/**
* Method getRobots from DB
* 
* @param sqlQ : Select statement
* @return list of robot objects
* @author MLinjawi
*/
	
	public List<String> getRobotSkills() {
		String query = "SELECT SkillName FROM SKILL";
		List<String> result = new ArrayList<String>();
		Connection conn = connectToDatabase();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				result.add(rs.getString("SkillName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			disconnectFromDatabase(conn);
		}

//		result.add("Other");
		return result;
	}
//////////////////////////////////////////////////////////////////
/**
* Method getRobots from DB
* 
* @param sqlQ : Select statement
* @return list of robot objects
* @author MLinjawi
*/
	
	public boolean insertRecord(String query) {
		boolean success=false;
		
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = connectToDatabase();
			stmt = conn.createStatement();
			System.out.println("From class Query, the INSERT QUERY command is:" + query);
			
			stmt.executeUpdate(query);
			success=true;
		} catch (SQLException e) {
			System.out.println("From class Query, the SQLException message is:" + e.getMessage());
		} finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			disconnectFromDatabase(conn);
		}
		
		return success;

	}

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
	
//////////////////////////////////////////////////////////////////
	/**
	* Method getRobots from DB
	* 
	* @param sqlQ : Select statement
	* @return list of robot objects
	* @author MLinjawi
	*/

		public void Command(){
		boolean success=false;
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = connectToDatabase();
			stmt = conn.createStatement();
			
			String sqlQ;
			sqlQ = "DELETE FROM ROB WHERE ID > 23;";
			
			stmt.executeUpdate(sqlQ);
			success=true;
			} 
		catch (SQLException e) 
			{
			System.out.println("From class Query, the SQLException message is:" + e.getMessage());
			} 
		finally {
			if (stmt != null) 
				{
				try {
					stmt.close();
					} 
				catch (SQLException e)
					{
					e.printStackTrace();
					}
				}
			disconnectFromDatabase(conn);
			}
		
	//	return success;
		
		}
	
	
	
	

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
	

	public static void main(String[] args)

	{
		System.out.println("I am in Main of the Query class");
		// TODO Auto-generated method stub
		Query q = new Query();
		q.getRobots("SELECT * FROM ROB;");
	//	q.Command();
		q.getRobotsObjectList("SELECT * FROM ROB;");
	}

}
//************************************************************************
//  Use q.command to delete all added robot for testing the program 
// comment the command after deleting the robots and to execute the robot capabilities file 
// 
//