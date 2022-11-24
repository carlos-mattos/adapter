import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void deveRetornarAliquota() {
        Funcionario funcionario = new Funcionario();
        funcionario.setValorAliquota(12);

        assertEquals("12.0%", funcionario.getAliquota());
    }

    @Test
    void deveRetornarFaixaSalarial() {
        Funcionario funcionario = new Funcionario();
        funcionario.setValorAliquota(12);

        assertEquals("Maior que 2437.35 e menor que 3641.03", funcionario.getFaixa());
    }

}