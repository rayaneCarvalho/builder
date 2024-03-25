package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrinkBuilderTest {
    @Test
    void deveRetornarExcecaoParaDrinkSemCodigo() {
        try {
            DrinkBuilder drinkBuilder = new DrinkBuilder();
            Drink drink = drinkBuilder
                    .setNome("Caipirinha")
                    .setDisponivel(true)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Drink Indisponível", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaDrinkSemNome() {
        try {
            DrinkBuilder drinkBuilder = new DrinkBuilder();
            Drink drink = drinkBuilder
                    .setCodigo(1)
                    .setDisponivel(true)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarDrinkValido() {
        DrinkBuilder drinkBuilder = new DrinkBuilder();
        Drink drink = drinkBuilder
                .setCodigo(1)
                .setNome("Caipirinha")
                .setDisponivel(true)
                .build();

        assertNotNull(drink);
    }
}