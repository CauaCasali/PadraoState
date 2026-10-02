package padraoState;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    // Funcionario ativo

    @Test
    public void naoDeveReativarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertFalse(funcionario.ativar());
    }

    @Test
    public void deveAfastarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.afastar());
        assertEquals(FuncionarioEstadoAfastado.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveDemitirFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveAposentarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.aposentar());
        assertEquals(FuncionarioEstadoAposentado.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveSuspenderFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.suspender());
        assertEquals(FuncionarioEstadoSuspenso.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveTransferirFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.transferir());
        assertEquals(FuncionarioEstadoTransferido.getInstance(), funcionario.getEstado());
    }

    // Funcionario afastado

    @Test
    public void deveReativarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertTrue(funcionario.ativar());
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveAfastarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void deveDemitirFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveAposentarFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void deveSuspenderFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertTrue(funcionario.suspender());
        assertEquals(FuncionarioEstadoSuspenso.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveTransferirFuncionarioAfastado() {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        assertFalse(funcionario.transferir());
    }

    // Funcionario aposentado

    @Test
    public void naoDeveReativarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.ativar());
    }

    @Test
    public void naoDeveAfastarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void naoDeveDemitirFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.demitir());
    }

    @Test
    public void naoDeveAposentarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void naoDeveSuspenderFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.suspender());
    }

    @Test
    public void naoDeveTransferirFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.transferir());
    }

    // Funcionario demitido

    @Test
    public void naoDeveReativarFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.ativar());
    }

    @Test
    public void naoDeveAfastarFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void naoDeveDemitirFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.demitir());
    }

    @Test
    public void naoDeveAposentarFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void naoDeveSuspenderFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.suspender());
    }

    @Test
    public void naoDeveTransferirFuncionarioDemitido() {
        funcionario.setEstado(FuncionarioEstadoDemitido.getInstance());
        assertFalse(funcionario.transferir());
    }

    // Funcionario suspenso

    @Test
    public void naoDeveReativarFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertFalse(funcionario.ativar());
    }

    @Test
    public void naoDeveAfastarFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void deveDemitirFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertTrue(funcionario.demitir());
        assertEquals(FuncionarioEstadoDemitido.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveAposentarFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void naoDeveSuspenderFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertFalse(funcionario.suspender());
    }

    @Test
    public void naoDeveTransferirFuncionarioSuspenso() {
        funcionario.setEstado(FuncionarioEstadoSuspenso.getInstance());
        assertFalse(funcionario.transferir());
    }

    // Funcionario transferido

    @Test
    public void naoDeveReativarFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.ativar());
    }

    @Test
    public void naoDeveAfastarFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.afastar());
    }

    @Test
    public void naoDeveDemitirFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.demitir());
    }

    @Test
    public void naoDeveAposentarFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void naoDeveSuspenderFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.suspender());
    }

    @Test
    public void naoDeveTransferirFuncionarioTransferido() {
        funcionario.setEstado(FuncionarioEstadoTransferido.getInstance());
        assertFalse(funcionario.transferir());
    }
}
