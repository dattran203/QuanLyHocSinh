package Quanlydiem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class Process_Student {

	Connection cn;
	
	public static Connection getCon()
	{
		Connection cn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/db_qlhs?useSSL=False", "root", "11022003");
		}
		catch(ClassNotFoundException | SQLException e) {
		}
		return cn;
	}
	
	public ArrayList<Student> getListStudent(){
		Connection cn = getCon();
		String sql = "SELECT *  FROM db_qlhs.tb_student";
		ArrayList<Student> lsStudent = new ArrayList<>();
		try {
			
			PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student t = new Student();
				t.setID(rs.getString("ID"));
				t.setName(rs.getString("Name"));
				t.setClassID(rs.getString("ClassID"));
				t.setMark(rs.getDouble("Mark"));
				t.setKhoi(rs.getInt("Khoi"));
				t.setHanhKiem(rs.getString("HanhKiem"));
				lsStudent.add(t);
			}
		}
		catch(SQLException e) {
		}
		return lsStudent;
	}
	public ArrayList<Account> getListAccount(){
		Connection cn = getCon();
		String sql = "SELECT *  FROM db_qlhs.taikhoan";
		ArrayList<Account> lsAccount = new ArrayList<>();
		try {
			
			PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Account a = new Account();
				a.setTK(rs.getString("tk"));
				a.setMK(rs.getString("mk"));
				lsAccount.add(a);
			}
		}
		catch(SQLException e) {
		}
		return lsAccount;
	}
	
	public ArrayList<Student> getListStudentbykhoi(String khoi) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE Khoi = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, khoi);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					t.setHanhKiem(rs.getString("HanhKiem"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	
	public ArrayList<Student> getListStudentbyClassID(String ClassID) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE ClassID = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, ClassID);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					t.setHanhKiem(rs.getString("HanhKiem"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public ArrayList<Student> getListStudentbyID(String text_mhs) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE ID = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, text_mhs);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					t.setHanhKiem(rs.getString("HanhKiem"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public ArrayList<Student> getListStudentbyName(String text_ten) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE Name = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, text_ten);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					t.setHanhKiem(rs.getString("HanhKiem"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public ArrayList<Student> getListStudentbydtb(String text_diem) {
		// TODO Auto-generated method stub
			Connection cn = getCon();
			String sql = "SELECT *  FROM db_qlhs.tb_student WHERE Mark = ?";
			ArrayList<Student> lsStudent = new ArrayList<>();
			try {
				PreparedStatement ps = (PreparedStatement)cn.prepareStatement(sql);
				ps.setString(1, text_diem);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Student t = new Student();
					t.setID(rs.getString("ID"));
					t.setName(rs.getString("Name"));
					t.setClassID(rs.getString("ClassID"));
					t.setMark(rs.getDouble("Mark"));
					t.setKhoi(rs.getInt("Khoi"));
					t.setHanhKiem(rs.getString("HanhKiem"));
					lsStudent.add(t);
				}
			}
			catch(SQLException e) {
				
			}
			return lsStudent;
	}
	public static boolean Update_getlistStudent(String ID, String Name, String ClassID, double Mark,String khoi,String HanhKiem) {
		// TODO Auto-generated method stub
		Connection cn=getCon();
		String sql="Update tb_student set Name=?,ClassID=?,Mark=?,Khoi=?,HanhKiem=? where ID=?";
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ps.setString(1,Name);
			ps.setString(2,ClassID);
			ps.setDouble(3, Mark);
			ps.setString(4,khoi);
			ps.setString(5,HanhKiem);
			ps.setString(6, ID);
			ps.executeUpdate();
			cn.close();
			return true;
			
		}
		catch(SQLException e) {
			System.out.println(e);
			return false;
		}
	}
	public boolean Insert_getlistStudent (String ID,String Name,String ClassID,  double Mark,String Khoi,String HanhKiem){
		Connection cn=getCon();
		String sql=" insert into db_qlhs.tb_student(ID,Name,ClassID,Mark,Khoi,HanhKiem) values (?, ?,?, ?, ?,?) ";
		
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ps.setString(1, ID);
			ps.setString(2, Name);
			ps.setString(3, ClassID);
			ps.setDouble(4, Mark); 
			ps.setString(5, Khoi);
			ps.setString(6, HanhKiem);
			ps.executeUpdate();
			cn.close();
			return true;
			
		}
		catch(SQLException e) {
			System.out.println(e);
			return false;
		}
	}
	public boolean delStudent(String ID) {
		// TODO Auto-generated method stub
		Connection cn = getCon();
		String sql = "delete from tb_student where ID= ?";
		int n=0;
		try {
			PreparedStatement ps = (PreparedStatement) cn.prepareStatement(sql);
			ps.setString(1, ID);
			n=ps.executeUpdate();
		} catch (SQLException e) {
			
		}
		return n>0;
	}
	public static void main(String[] args) {
		System.out.println(getCon());
	}
}

	
