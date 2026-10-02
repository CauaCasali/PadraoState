package padraoState;

public class Funcionario {

    private String nome;
    private FuncionarioEstado estado;

    public Funcionario() {
        this.estado = FuncionarioEstadoAtivo.getInstance();
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean afastar() {
        return estado.afastar(this);
    }

    public boolean demitir() {
        return estado.demitir(this);
    }

    public boolean aposentar() {
        return estado.aposentar(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }
}
