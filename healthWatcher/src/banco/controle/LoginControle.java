package banco.controle;

import banco.LoginBanco;
import banco.entidades.Login;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginControle {
    public ArrayList<Login> buscarLoginSenha() throws SQLException,ClassNotFoundException {
        return LoginBanco.buscarLogin();
    }
}
