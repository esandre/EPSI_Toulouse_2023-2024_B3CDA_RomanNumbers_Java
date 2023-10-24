import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {

    @Test
    void testUn() {
        // ETANT DONNE le chiffre 1
        final int chiffreArabe = 1;

        // QUAND on le convertit en nombres romains
        String nombreRomain = ConvertisseurNombresRomains.Convertir(chiffreArabe);

        // ALORS on obtient "I"
        assertEquals("I", nombreRomain);
    }
}
