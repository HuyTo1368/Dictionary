public class DictionaryCommandLine {

    public static void showAllWords(Dictionary dictionary){
        System.out.printf("%-3s|%-25s|%-25s\n","No","English","Vietnamese");
        for(int i = 0; i< dictionary.words.size() ; i++){
            String word_target = dictionary.words.get(i).getWord_target();
            String word_explain = dictionary.words.get(i).getWord_explain();
            System.out.printf("%-3s|%-25s|%-25s\n",i+1, word_target, word_explain);
        }
    }
    public static void dictionaryBasic(Dictionary dictionary) {
        DictionaryManagement.insertFromCommandline(dictionary);
        showAllWords(dictionary);
    }

}