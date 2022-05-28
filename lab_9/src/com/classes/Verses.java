package com.classes;

public class Verses {
 String book_id;
 String book_name;
 int chapter;
 int verse;
 String text;

 public Verses() {
 }

 public Verses(String book_id, String book_name, int chapter, int verse, String text) {
  this.book_id = book_id;
  this.book_name = book_name;
  this.chapter = chapter;
  this.verse = verse;
  this.text = text;
 }

 public String getBook_id() {
  return book_id;
 }

 public void setBook_id(String book_id) {
  this.book_id = book_id;
 }

 public String getBook_name() {
  return book_name;
 }

 public void setBook_name(String book_name) {
  this.book_name = book_name;
 }

 public int getChapter() {
  return chapter;
 }

 public void setChapter(int chapter) {
  this.chapter = chapter;
 }

 public int getVerse() {
  return verse;
 }

 public void setVerse(int verse) {
  this.verse = verse;
 }

 public String getText() {
  return text;
 }

 public void setText(String text) {
  this.text = text;
 }

 //{"reference":"John 3:16","verses":[{"book_id":"JHN","book_name":"John","chapter":3,"verse":16,
   //      "text":"\nFor God so loved the world, that he gave his one and only Son, that whoever believes in him should not " +
     //    "perish, but have eternal life.\n\n"}],"text":"\nFor God so loved the world, that he gave his one and only Son, " +
     //    "that whoever believes in him should not perish, but have eternal life.\n\n",
      //   "translation_id":"web","translation_name":"World English Bible","translation_note":"Public Domain"}
}