package Controle.Banco;

import Modelo.login;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginControle {
    public ArrayList<login> buscarLoginSenha() throws SQLException,ClassNotFoundException {
        return loginBanco.buscarLogin();
    }
}
