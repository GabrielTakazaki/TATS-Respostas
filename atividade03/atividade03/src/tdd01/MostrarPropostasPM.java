package tdd01;

import java.util.List;

public class MostrarPropostasPM {

    List<Proposta> propostas;

    public MostrarPropostasPM(List<Proposta> pPropostas) {
        propostas = pPropostas;
    }

    public List<Proposta> getProposta() {
       return propostas;
    }
}
