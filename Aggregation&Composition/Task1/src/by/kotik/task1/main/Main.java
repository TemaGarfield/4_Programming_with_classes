package by.kotik.task1.main;

import java.util.ArrayList;

import by.kotik.task1.entity.Sentence;
import by.kotik.task1.entity.Text;
import by.kotik.task1.entity.Word;
import by.kotik.task1.logic.SentenceLogic;
import by.kotik.task1.logic.TextLogic;

public class Main {
	public static void main(String[] args) {
		ArrayList<Word> sentence = new ArrayList<>();
		
		sentence.add(new Word("Hello"));
		sentence.add(new Word("World"));
		
		Sentence s = new Sentence(sentence);
		
		SentenceLogic.showSentence(s);
		
		SentenceLogic.addWord(new Word("again..."), s);
		
		SentenceLogic.showSentence(s);
		
		ArrayList<Word> sentence2 = new ArrayList<>();
		sentence2.add(new Word("It's"));
		sentence2.add(new Word("to"));
		sentence2.add(new Word("hard"));
		sentence2.add(new Word("to"));
		sentence2.add(new Word("be"));
		sentence2.add(new Word("lizard..."));
		Sentence s2 = new Sentence(sentence2);
		
		ArrayList<Word> headArr = new ArrayList<>();
		headArr.add(new Word("Be"));
		headArr.add(new Word("your"));
		headArr.add(new Word("Demon."));
		
		Sentence head = new Sentence(headArr);
		
		Text text = new Text(head);
		
		TextLogic.addSentence(text, s);
		TextLogic.addSentence(text, s2);
		TextLogic.showTextHead(text);
		TextLogic.showText(text);
		
		
	}
}
