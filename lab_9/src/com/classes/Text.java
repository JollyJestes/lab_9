package com.classes;

public class Text {
    private String reference;
    private Verses verses;
    private String text;
    private String translation_id;
    private String translation_name;
    private String translation_note;


    public Text(String reference, Verses verses, String text, String translation_id, String translation_name, String translation_note) {
        this.reference = reference;
        this.verses = verses;
        this.text = text;
        this.translation_id = translation_id;
        this.translation_name = translation_name;
        this.translation_note = translation_note;
    }

    public Text() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Verses getVerses() {
        return verses;
    }

    public void setVerses(Verses verses) {
        this.verses = verses;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTranslation_id() {
        return translation_id;
    }

    public void setTranslation_id(String translation_id) {
        this.translation_id = translation_id;
    }

    public String getTranslation_name() {
        return translation_name;
    }

    public void setTranslation_name(String translation_name) {
        this.translation_name = translation_name;
    }

    public String getTranslation_note() {
        return translation_note;
    }

    public void setTranslation_note(String translation_note) {
        this.translation_note = translation_note;
    }

    @Override
    public String toString() {
        return  "reference -> " + reference
                + "\n" +
                "book id -> " + verses.getBook_id()
                + "\n" +
                "book name -> " + verses.getBook_name()
                + "\n" +
                "chapter -> " + verses.getChapter()
                + "\n" +
                "verse -> " + verses.getVerse()
                + "\n" +
                "text -> " + text.replaceAll("\n", "")
                + "\n\n";
    }
}
