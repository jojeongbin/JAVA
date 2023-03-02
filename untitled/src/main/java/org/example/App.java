package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.controller.SystemController;
import org.example.wiseSaying.controller.WiseSayingController;
import org.example.wiseSaying.entity.WiseSaying;

public class App {

    public void run() {
        System.out.println("==명언 앱==");

        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();

        while (true) {
            System.out.print("명령)");
            String command = Container.getScanner().nextLine().trim();

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

