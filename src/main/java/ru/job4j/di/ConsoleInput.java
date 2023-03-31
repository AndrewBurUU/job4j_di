package ru.job4j.di;

import org.springframework.stereotype.*;
import org.springframework.context.annotation.Scope;
import java.util.*;

@Component
@Scope("prototype")
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
