package ru.job4j.di;

import org.springframework.stereotype.*;

import java.util.*;

@Component
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
