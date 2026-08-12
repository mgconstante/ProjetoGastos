package org.example;

import org.example.DAO.FinanceiroDAO;
import org.example.classes.Financeiro;

import java.util.Scanner;

public class AdicionarFinanceiros {
    public static void main(String[] args) {
        int continuar = 1;
        Financeiro financeiro;
        FinanceiroDAO fDao = new FinanceiroDAO();

        Scanner sc = new Scanner(System.in);

        while(continuar != 0){
            System.out.println("Adicionar Financeiro?");
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
                financeiro = new Financeiro(nome,tipo,dinheiro,valor);
                fDao.insertFinanceiro(financeiro);
                System.out.println("Adicionado com sucesso!");
            }else {
                System.out.println("Lancamentos Finalizados");
            }

    }

    }
}
