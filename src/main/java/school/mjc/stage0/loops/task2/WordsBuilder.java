package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    
    public static void main(String[] args) {
        WordsBuilder g = new WordsBuilder();
        g.buildPhrase('q','w');
    }
    
    public void buildPhrase(char... chars) {
        String s = "";
        int i; 
        for(i = 0; i < chars.length; i++){
            s = s + chars[i];
        }
        System.out.print(s);
    }
}
