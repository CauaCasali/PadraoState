package padraoState;

public class FuncionarioEstadoSuspenso extends FuncionarioEstado {

    private FuncionarioEstadoSuspenso() {};
    private static FuncionarioEstadoSuspenso instance = new FuncionarioEstadoSuspenso();
    public static FuncionarioEstadoSuspenso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspenso";
    }

    public boolean demitir(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        return true;
    }
}
