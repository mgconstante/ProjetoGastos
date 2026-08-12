package org.example.DAO;

import org.example.classes.TipoDinheiro;
import org.example.conexao.Conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DinheiroDAO {
    public void insertDinheiro(TipoDinheiro dinheiro) {
        String sql = "INSERT INTO tipo_dinheiro (DS_TP_DINHEIRO) VALUES (?) ";
        PreparedStatement stmt = null;
        try{
            stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1,dinheiro.getDs_dinheiro());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
