package org.example.DAO;

import org.example.classes.Grupo;
import org.example.classes.TipoDinheiro;
import org.example.conexao.Conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GrupoDAO {
    public void insertGrupo(Grupo grupo) {
        String sql = "INSERT INTO GRUPO (DS_GRUPO) VALUES (?) ";
        PreparedStatement stmt = null;
        try{
            stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1,grupo.getDs_grupo());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void viewGrupo() {
        String sql = "SELECT * FROM GRUPO";
        PreparedStatement stmt = null;
        try{
            stmt = Conexao.getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("ID_GRUPO");
                String nome_classe = rs.getString("DS_GRUPO");
                System.out.println("ID:" + id + " GRUPO: " + nome_classe);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
