import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LugarTest {
    @Test
   public void deveExibirAcademia() {
        Academia academia = new Academia("Fibratech", "5","Rua Sao matheus", "Academia de 3 andares com piscina");

        LugarVisitor visitor = new LugarVisitor();
        assertEquals("Academia{Nome = Fibratech,Descrição = Academia de 3 andares com piscina,Avaliação = 5,Localização ='Rua Sao matheus'}", visitor.exibir(academia));
    }

    @Test
    public void deveExibirRestaurante() {
        Restaurante restaurante = new Restaurante("Delicias Mexicanas", "5", "Rua Doutor Jose Barbosa", "Mexicano", "Comida deliciosa para voce e sua familia ");

        LugarVisitor visitor = new LugarVisitor();
        assertEquals("Restaurante{Nome=Delicias Mexicanas,Categoria = Mexicano,Descrição = Comida deliciosa para voce e sua familia ,Avaliação = 5,Localização = 'Rua Doutor Jose Barbosa'}", visitor.exibir(restaurante));
    }

    @Test
    public void deveExibirPraca() {
        Praca praca = new Praca("Praça Halfed", "3" , "Avenida rio branco", "A praça mais antiga de Juiz de fora!");

        LugarVisitor visitor = new LugarVisitor();
        assertEquals("Praça{Nome = Praça Halfed,Categoria = Praça Halfed,Descrição = A praça mais antiga de Juiz de fora!,Avaliação = 3,Localização = 'Avenida rio branco'}", visitor.exibir(praca));
    }




}
