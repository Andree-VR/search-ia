package ControladorUsuario;

import ControladorUsuario.*;
import Entidad.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.UsuarioDAO;

public class eliminarAccion extends AccionUsuario {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Usuario u = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        int id=Integer.parseInt(request.getParameter("id"));
        u.setIdUsuario(id);
        dao.eliminar(id);
        request.getRequestDispatcher("/listarUsuario.jsp").forward(request, response);
        
        return "";
    }
}
