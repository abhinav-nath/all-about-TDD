package com.codecafe.tdd.junit.basics.wordcount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordCounterTest {

	private static WordCounter counter;

	@BeforeEach
	private static void setUp() {
		counter = new WordCounter();
	}

	@Test
	void emptyStringHasNoWords() {
		counter.add("");
		assertEquals(0, counter.getUniqueWordsCount());
	}

	@Test
	void singleWordStringHasOneWord() {
		counter.add("Hello");
		assertEquals(1, counter.getUniqueWordsCount());
	}

	@Test
	void twoSingleWordStringsHaveTwoWords() {
		counter.add("Hello");
		counter.add("World");
		assertEquals(2, counter.getUniqueWordsCount());
	}

	@Test
	void multiWordStringHasCorrectWordCount() {
		counter.add("one two three");
		assertEquals(3, counter.getUniqueWordsCount());
	}

	@Test
	void severalMultiWordStringHasCorrectWordCount() {
		counter.add("one two three");
		counter.add("four five six");
		assertEquals(6, counter.getUniqueWordsCount());
	}

	@Test
	void spacedOutMultiWordStringHasCorrectWordCount() {
		counter.add("    one    two   three   ");
		assertEquals(3, counter.getUniqueWordsCount());
	}

	@Test
	void stringWithDuplicatesHasCorrectWordCount() {
		counter.add("three three three");
		assertEquals(1, counter.getUniqueWordsCount());
	}

	@Test
	void stringWithDuplicates_withDifferentCases_countsTheStringOnlyOnce() {
		counter.add("Three three THREE");
		assertEquals(1, counter.getUniqueWordsCount());
	}

	@Test
	void stringWithPunctuationStillSpotsDuplicates() {
		counter.add("Nine.");
		counter.add("Nine ten.");
		counter.add("Nine, ten, eleven.");
		assertEquals(3, counter.getUniqueWordsCount());
	}

}