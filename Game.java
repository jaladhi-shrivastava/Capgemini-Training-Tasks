package DigitalCom;

public class Game {
    String gameName;
    String authorName;
    float price;

    Game(){
    }

    Game(String gameName,String authorName,float price){
        this.gameName = gameName;
        this.authorName = authorName;
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public float getPrice() {
        return price;
    }

    public String toString(){
        return gameName +"|"+ authorName +"|"+ price;
    }
}
