package com.company;

public class Main {

    public static void main(String[] args) {
	    String color = "Красный";

	    switch (color){
            case "Красный":
                System.out.println("Вы грубый и агресивный");
                break;
            case "Зеленый":
                System.out.println("Нет ответа");
                break;
            case "Белый":
                System.out.println("Вы добрый и мягкий");
                break;
            default:
                System.out.println("404 error");


	    }
    }
}
