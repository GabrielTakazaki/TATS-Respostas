package tdd01;

import java.util.List;

public class SimularPropostasPM {
    String nome;
    float salario;
    int idade;
    float valor;
    String MsgDeErro;
    Calculadora c = new Calculadora();
    
    public MostrarPropostasPM pressionarBotaoElaborar() {        
        validar();
        
        if (MsgDeErro.equals("")) {
            
            List<Proposta> propostas = c.calcular(salario, valor);

            return new MostrarPropostasPM(propostas);
        } else {
            return null;
        }
    }

    public void validar() {
        MsgDeErro = "";
        if (nome.equals("")) {
            MsgDeErro += "nome vazio\n";
        }
        if (salario <= 0) {
            MsgDeErro += "salario vazio\n";
        }
        if (idade <= 0) {
            MsgDeErro += "idade vazio\n";
        } else if (idade < 18 || idade > 70) {
            MsgDeErro += "idade invalida\n";
        }
        if (valor <= 0) {
            MsgDeErro += "valor vazio\n";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMsgDeErro() {
        return MsgDeErro;
    }

    public void setMsgDeErro(String MsgDeErro) {
        this.MsgDeErro = MsgDeErro;
    }
}
