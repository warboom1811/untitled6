package com.company;

public class Question {
    private String title;
    private String answer;
    private String help;
    Question(String t, String a, String h){
        this.title=t;
        this.answer=a;
        this.help=h;
    }
    public String getAnswer(){
        return answer;
    }
    public String getTitle(){
        return title;
    }
    public String getHelp(){
        return help;
    }
}
