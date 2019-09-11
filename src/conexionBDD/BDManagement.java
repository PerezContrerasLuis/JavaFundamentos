package conexionBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BDManagement {
	//creamos nuestra constantes de conexion
	public final static String dr   = "com.mysql.jdbc.Driver";
	public final static String bd   = "jdbc:mysql://localhost/bdJavatest";
	public final static String user = "root";
	public final static String pass = "1234567";
	
	private Connection ct;
	private Statement st;
	
	public BDManagement() {
		//creamos nuesta conexion ala base de datos
		try {
			Class.forName(dr);
			ct = DriverManager.getConnection(bd,user,pass);
			st = ct.createStatement();
			System.out.println("Conexion con exito");
			
		}catch(Exception e) {
			System.out.println("Error en la conexion a la Base de datos "+e.getMessage());
		}
		
		
	}
	
	public void getAll() {
		try {
			ResultSet rt = st.executeQuery("select * from  usuarios");
			while(rt.next()) {
				System.out.println("id :"+rt.getString(1)+" Nombre :"+rt.getString(2)+" Apellido :"+rt.getString(3));
			}
		}catch(Exception e){
			System.out.println("Error en la consulta de la base de datos");
		}
	}
}
