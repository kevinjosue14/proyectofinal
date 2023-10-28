/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros2;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
class Seguridaduser {
    String res;
    void ValidadUsuario(String[] usuN, String pass, String usu, int intuse) {
         boolean encontrado= false;
    
        for (int i=0; i<usuN.length; i++) {
            if ((usuN[i].equalsIgnoreCase(usu)&& usuN [i+1].equals(pass))){
                res= "BIENVENIDO    " + usu;
               encontrado=true;
               JOptionPane.showMessageDialog(null, res,"inicio de session", JOptionPane.INFORMATION_MESSAGE);
               intuse=0;
               
               break;  
            }
         
        }
    if (encontrado==false) {
            res= "clave y/o usuarios erroneos con"+intuse+"intentos fallidos";
            JOptionPane.showMessageDialog(null, res, "inicio de Seccion",JOptionPane.ERROR_MESSAGE);
    }
    if (intuse>2) {
            JOptionPane.showMessageDialog(null, "3 intentos fallidos, se cerrar el sistema", "inicio de seccion", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
    
    
    
    
    
    }
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
