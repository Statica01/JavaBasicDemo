package com.example.BasicsDemo.services;

import com.example.BasicsDemo.models.Text;

import java.util.ArrayList;
import java.util.List;

public class TextService {

    private static List<Text> texts = new ArrayList<Text>();

    static {
        texts.add(new Text("Random hard coded text with a &#x1F408 (<- that´s a cat emoji)"));
    }

    public List<Text> retrieveTexts() {
        return texts;
    }

    public void addText(Text text) {
        texts.add(text);
    }

    public void deleteText(Text text) {
        texts.remove(text);
    }
}

