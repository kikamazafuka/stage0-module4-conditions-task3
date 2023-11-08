package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if ((symbol>96 && symbol<123) || (symbol>64 && symbol<91) ){
            System.out.println("English");
        } else System.out.println("Non English");
    }
}
