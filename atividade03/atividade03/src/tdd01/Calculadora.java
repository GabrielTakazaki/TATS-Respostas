/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Calculadora {

    public List<Proposta> calcular(float valorDoEmprestimo) {
        ArrayList<Proposta> propostas = new ArrayList<>();
        
        Proposta p1 = new Proposta();
        p1.setTotal(2 * valorDoEmprestimo);
        p1.setNumeroParcelas(2);
        propostas.add(p1);
        
        Proposta p2 = new Proposta();
        p2.setTotal(2 * valorDoEmprestimo);
        p2.setNumeroParcelas(3);
        propostas.add(p2);
        
        return propostas;
    }
    
}
