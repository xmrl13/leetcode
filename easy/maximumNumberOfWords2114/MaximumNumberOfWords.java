package easy.maximumNumberOfWords2114;

class MaximumNumberOfWords {

    public static void main(String[] args) {

    }

    public int mostWordsFound(String[] sentences) {

        var numberOfWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].split(" ").length > numberOfWords) {
                numberOfWords = sentences[i].split(" ").length;
            }
        }
        return numberOfWords;
    }
}
