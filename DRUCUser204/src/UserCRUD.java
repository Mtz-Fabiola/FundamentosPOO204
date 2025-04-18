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
  
    
    public boolean actualizar_nombre_usuario(String nombre, String id_usuario){
        
        String insertSQL="UPDATE usuarios SET nombre=? WHERE id_usuario=?";
        
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, nombre);
            ps.setString(2, id_usuario);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al actualizar el nombre del usuario"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ACTUALIZACIÓN del nombre
    
    public boolean actualizar_correo_usuario(String correo, String id_usuario){
        
        String insertSQL="UPDATE usuarios SET correo=? WHERE id_usuario=?";
        
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, correo);
            ps.setString(2, id_usuario);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al actualizar el nombre del usuario"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ACTUALIZACIÓN del correo
   public boolean actualizar_contrasena_usuario(String contrasena, String id_usuario){
        
        String insertSQL="UPDATE usuarios SET contrasena=? WHERE id_usuario=?";
        
        
        try{ //Se asigna la sentencia y los parámetros para su ejecución
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            
            ps.setString(1, contrasena);
            ps.setString(2, id_usuario);
            return ps.executeUpdate()>0;
           
        }
        
        catch(SQLException e){
            //Se imprime en consola un mensaje en caso de que no se ejecute el INSERT
            System.out.println("Error al actualizar la contraseña del usuario"+e.getMessage());//Las excepciones son para observar donde está el error
            return false;
        }
        
    }//Fin de la ACTUALIZACIÓN de la contraseña
    
}
