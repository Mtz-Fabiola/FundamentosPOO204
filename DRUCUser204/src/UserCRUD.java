import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD{
    
    private Connection conexion;
    
    //Constructor de la clase arranca la conexion BD
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean InsertUsuario(String nombre, String correo, String contra){
        
        //Preparamos la sentencia SQL para INSERT
        String insertSQL = " INSERT INTO usuarios(nombre,correo,contrasena) VALUES(?,?,?)";
        
        try {
            //Asignamos  la sentencia y parametros para su ejecucion 
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contra);
            return ps.executeUpdate()>0;
        }
        catch(SQLException e){
            //Imprime en consola en caso de que no se ejecute el INSERT
            System.out.println("Existe un error al crear el usuario "+ e.getMessage());
            return false;
            
        }
        
    }//Fin del Insert
    
    //Metodo para Consultar por ID
    public ResultSet buscarPorID(int id){
        String sqlBuscar = "SELECT * FROM usuarios WHERE id = ?";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setInt(1, id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por ID "+ e.getMessage());
            return null;
        }
    }//Fin del Consulta ID
    
    public ResultSet obtenerTodos(){
        String sqlTodos = "SELECT * FROM usuarios";
        
        try{
            PreparedStatement ps =conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar todos"+s.getMessage());
            return null;
        }
        
    }//fin de obtener todos 
    
    
}