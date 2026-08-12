package org.example.DAO;

import org.example.classes.Financeiro;
import org.example.classes.TipoFinanceiro;
import org.example.conexao.Conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FinanceiroDAO {
    public void insertFinanceiro(Financeiro financeiro) {
        String sql = "INSERT INTO financeiro (DS_FINANCEIRO,TP_FINANCEIRO,TP_DINHEIRO,VL_FINANCEIRO) VALUES (?,?,?,?) ";
        PreparedStatement stmt = null;
        try{
            stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1,financeiro.getDs_financeiro());
            stmt.setInt(2,financeiro.getId_tipo());
            stmt.setInt(3,financeiro.getId_dinheiro());
            stmt.setDouble(4,financeiro.getValor());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
