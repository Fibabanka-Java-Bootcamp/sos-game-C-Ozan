package org.kodluyoruz;

public  class Player {

    private String nickName;
    private int score;

    public Player() {

    }

    public Player(String nickName) {
        
        this.nickName = nickName;

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score ;
    }

}
