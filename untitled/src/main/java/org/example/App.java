package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.controller.SystemController;
import org.example.wiseSaying.controller.WiseSayingController;
import org.example.wiseSaying.entity.WiseSaying;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("==명언 앱==");

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController(sc);

        while (true) {
            System.out.print("명령)");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {

                systemController.exit();
                break;

            } else if (command.equals("등록")) {

                wiseSayingController.write();

            } else if (command.equals("목록")) {
                wiseSayingController.list();
                }
            }
        }
    }

