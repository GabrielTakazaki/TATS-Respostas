package atividade04;

public class CalculadoraSalarios {
    
    public void calculoSalario(Funcionario f) {
        validarCampos(f);
        validarCargo(f);
        
    }
    
    public void validarCampos(Funcionario f) {
        if (f.getNome().equals("")) {
            f.setMsgErro("Nome vazio\n");
        }
        if (f.getEmail() == null||f.getEmail().equals("")) {
            f.setMsgErro("Email vazio\n");
        }
        if (f.getSalariobase() == 0f) {
            f.setMsgErro("Salario base vazio\n");
        }
    }
    
    public void validarCargo(Funcionario f) {
        if (f.getCargo().equals("DESENVOLVEDOR")) {
            if (f.getSalariobase() < 3000f) {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.10f));
            } else {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.20f));
            }
        } else if (f.getCargo().equals("DBA")) {
            if (f.getSalariobase() < 2000f) {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.15f));
            } else {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.25f));
            }
        } else if (f.getCargo().equals("TESTADOR")) {
            if (f.getSalariobase() < 2000f) {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.15f));
            } else {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.25f));
            }
        } else if (f.getCargo().equals("GERENTE")) {
            if (f.getSalariobase() < 5000f) {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.20f));
            } else {
                f.setSalarioLiquido(f.getSalariobase() - (f.getSalariobase() * 0.30f));
            }
        } else {
            f.setSalarioLiquido(0f);
            f.setMsgErro("Cargo inexistente\n");
        }
    }
    
}
