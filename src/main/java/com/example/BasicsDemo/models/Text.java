package com.example.BasicsDemo.models;

public class Text {
    private String nameText;

    public Text(String nameText) {
        super();
        this.nameText = nameText;
    }

    public String getNameText() {
        return nameText;

    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }

    @Override
    public String toString() {
        return String.format("Text [nameText=%s]", nameText);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameText == null) ? 0 : nameText.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Text other = (Text) obj;
        if (nameText == null) {
            if (other.nameText != null)
                return false;
        } else if (!nameText.equals(other.nameText))
            return false;
        return true;
    }
}