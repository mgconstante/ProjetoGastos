package org.example.DAO;

import org.example.classes.TipoDinheiro;
import org.example.classes.TipoFinanceiro;
import org.example.conexao.Conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TipoDAO {
    public void insertTipo(TipoFinanceiro tpfinanceiro) {
        String sql = "INSERT INTO tipo_financeiro (DS_TP_FINANCEIRO) VALUES (?) ";
        PreparedStatement stmt = null;
        try{
            stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1,tpfinanceiro.getDs_tipo());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
