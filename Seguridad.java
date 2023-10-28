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
class Seguridad {
    String res;

    void ValidadUsuario(String[] usuarios, String pwd, String user, int intentos) {
        
    boolean encontrado= false;
    
        for (int i=0; i<usuarios.length; i++) {
            if ((usuarios[i].equalsIgnoreCase(user)&& usuarios [i+1].equals(pwd))){
                res= "BIENVENIDO    " + user;
               encontrado=true;
               JOptionPane.showMessageDialog(null, res,"inicio de session", JOptionPane.INFORMATION_MESSAGE);
               menuadmin nF = new menuadmin();
               nF.setVisible(true);
               
               intentos=0;
               break;  
            }
        }
    if (encontrado==false) {
            res= "clave y/o usuarios erroneos con "  + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res, "inicio de Seccion",JOptionPane.ERROR_MESSAGE);
    }
    if (intentos>2) {
            JOptionPane.showMessageDialog(null, "3 intentos fallidos, se cerrar el sistema", "inicio de seccion", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
    }
    

