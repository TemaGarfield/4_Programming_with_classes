package by.kotik.task1.logic;

import by.kotik.task1.entity.Sentence;
import by.kotik.task1.entity.Text;

public class TextLogic {
	
	public static void showTextHead(Text text) {
		SentenceLogic.showSentence(text.getHead());
	}
	
	public static void addSentence(Text text, Sentence sentence) {
		text.getText().add(sentence);
	}
	
	public static void showText(Text text) {
		for (Sentence sentence:text.getText()) {
			SentenceLogic.showSentence(sentence);
		}
	}
}
