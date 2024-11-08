import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.ucp.jdbc.PoolDataSourceFactory;
import oracle.ucp.jdbc.PoolDataSource;

public class BasicConnectionExample {
   public static void main(String args[]) throws SQLException {
      try 
      {
         //Crea la instancia con el pool.
         
         PoolDataSource  pds = PoolDataSourceFactory.getPoolDataSource();
         
         //introduce las condiciones de la conexión.
         
         pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
         pds.setURL("jdbc:oracle:thin:@//localhost:1521/XE");
         pds.setUser("<user>");
         pds.setPassword("<password>");     
         
         //Pripiedades del pool.
         
         pds.setInitialPoolSize(5);
         
         //Obtener la conexión con la base de datos.
         
         Connection conn = pds.getConnection();
         
         System.out.println("\nConnection obtained from " +
          "UniversalConnectionPool\n");
         
         //se ejecutan las operaciones con las bases de datos
         Statement stmt = conn.createStatement ();
         stmt.execute("select * from foo");
         
         //Se cierra la conexion.
         
         conn.close();
         conn=null;
         
         System.out.println("Connection returned to the " +
          "UniversalConnectionPool\n");
         
      }
      catch(SQLException e)
      {
         System.out.println("BasicConnectionExample - " +
          "main()-SQLException occurred : "
              + e.getMessage());
      }
   }
}