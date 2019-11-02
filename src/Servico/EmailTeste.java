
package Servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class EmailTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        Email email = new Email(
                "Assunto da barberia",
                "Menssagem padrão",
                "cassiano2709@gmail.com");
        
        email.enviar();
        

    }
    
}
