public class ConvertisseurNombresRomains {
    public static String Convertir(int chiffreArabe) {
        if (chiffreArabe == 1) return "I";
        if (chiffreArabe == 2) return "II";
        if (chiffreArabe == 3) return "III";
        return "IIII";
    }
}
