package by.kotik.task1.logic;

import by.kotik.task1.entity.Sentence;
import by.kotik.task1.entity.Word;

public class SentenceLogic {
	public static void showSentence(Sentence sentence) {
		for (Word word:sentence.getSentence()) {
			System.out.print(word.getWord() + " ");
		}
		System.out.println();
	}
	
	public static void addWord(Word word, Sentence sentence) {
		sentence.getSentence().add(word);
	}
}
