package atividade04;

public class Funcionario {
    
    String nome;
    String email;
    float salariobase;
    String cargo;
    float salarioLiquido;

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(float salariobase) {
        this.salariobase = salariobase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
