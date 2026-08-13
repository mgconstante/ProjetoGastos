package org.example;

import org.example.DAO.FinanceiroDAO;
import org.example.DAO.GrupoDAO;
import org.example.classes.Financeiro;
import org.example.classes.Grupo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AdicionarFinanceiros {
    public static void main(String[] args) {
        int continuar = 1;
        Financeiro financeiro;
        Grupo grupo;
        GrupoDAO gDAO = new GrupoDAO();
        FinanceiroDAO fDao = new FinanceiroDAO();

        Scanner sc = new Scanner(System.in);

        while(continuar != 0){
            System.out.println("Adicionar Financeiro- 1");
            System.out.println("Adicionar Grupo - 2");
            System.out.println("Parar - 0");
            continuar = sc.nextInt();
            if(continuar == 1){
                System.out.println("Digite o nome do financeiro: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Tipo de financeiro: 1 - Receita / 2 - Despesa");
                int tipo = sc.nextInt();
                System.out.println("Tipo de dinheiro: 1 - Conta Corrente / 2 - Credito");
                int dinheiro = sc.nextInt();
                System.out.println("Valor: ");
                double valor = sc.nextDouble();
                System.out.println("Grupo: ");
                GrupoDAO.viewGrupo();
                int id_grupo = sc.nextInt();
                System.out.println("Data: ");
                String entrada = sc.next();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate data = LocalDate.parse(entrada, formato);

                financeiro = new Financeiro(nome,tipo,dinheiro,valor,id_grupo,data);
                fDao.insertFinanceiro(financeiro);
                System.out.println("Adicionado com sucesso!");
            } else if (continuar == 2) {
                System.out.println("Nome do Grupo: ");
                sc.nextLine();
                String nome = sc.nextLine();
                grupo = new Grupo(nome);
                gDAO.insertGrupo(grupo);


            } else {
                System.out.println("Lancamentos Finalizados");
            }

    }

    }
}
