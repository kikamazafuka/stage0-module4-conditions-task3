package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (isVowel(character)){
            System.out.println("Vowel");
        } else if (((character>96 && character<123) || (character>64 && character<91)) && !isVowel(character)){
            System.out.println("Consonant");
        } else System.out.println("wrong alphabet!");
    }

    private static boolean isVowel (char character){
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U'){
            return true;
        }
        return false;
    }
}
