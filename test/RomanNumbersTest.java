import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testUnité(int chiffreArabe) {
        // ETANT DONNE le chiffre <chiffre> compris entre 1 et 3
        // QUAND on le convertit en nombres romains
        String nombreRomain = ConvertisseurNombresRomains.Convertir(chiffreArabe);

        // ALORS on obtient "I" répété <chiffre> fois
        String attendu = "I".repeat(chiffreArabe);
        assertEquals(attendu, nombreRomain);
    }

    @Test
    void testQuatre(){
        // ETANT DONNE le chiffre 4
        final int chiffreArabe = 4;

        // QUAND on le convertit en nombres romains
        String nombreRomain = ConvertisseurNombresRomains.Convertir(chiffreArabe);

        // ALORS on obtient "IV"
        String attendu = "IV";
        assertEquals(attendu, nombreRomain);
    }
}
