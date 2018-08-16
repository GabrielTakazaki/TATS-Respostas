package atividade04;

public class CalculadoraSalarios {

    public void calculoSalario(Funcionario f) {
        
        if (f.getCargo().equals("DESENVOLVEDOR")) {
            if (f.getSalariobase() < 3000f) {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.10f));
            } else {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.20f));
            }
        }
        if (f.getCargo().equals("DBA")) {
            if (f.getSalariobase() < 2000f) {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.15f));
            } else {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.25f));
            }
        }
        if (f.getCargo().equals("TESTADOR")) {
            if (f.getSalariobase() < 2000f) {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.15f));
            } else {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.25f));
            }
        }
        if (f.getCargo().equals("GERENTE")) {
            if (f.getSalariobase() < 5000f) {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.20f));
            } else {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.30f));
            }
        }

    }
}
