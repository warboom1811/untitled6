package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Question question[] = new Question[4];
        question[0] = new Question("84-100", "-16", "100-84 со знаком минус");
        question[1] = new Question("К..РОВА", "о", "к..рова даёт мОлоко");
        question[2] = new Question("sin90", "1", "посмотрите в интернете");
        question[3] = new Question("П..ЖИЛОЙ", "о", "п..жилой как мОлодой");
        Scanner scan = new Scanner(System.in);
        int correct = 0;
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i].getTitle());
            String otvet = scan.next();
            if (otvet.equals(question[i].getAnswer())) {
                System.out.println("Верно:" + question[i].getAnswer());
                correct++;
            } else {
                System.out.println("подсказка:" + question[i].getHelp());
                String zanovo = scan.next();
                if (zanovo.equals(question[i].getAnswer())) {
                    System.out.println("Верно:" + question[i].getAnswer());
                    correct++;
                } else {
                    System.out.println("Неверно!!!");

                }


            }
        }
        System.out.println("Всего правильных ответов:" + correct);
    }
}

