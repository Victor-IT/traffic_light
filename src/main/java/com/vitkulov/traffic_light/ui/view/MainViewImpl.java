package com.vitkulov.traffic_light.ui.view;

import com.vitkulov.traffic_light.ui.controller.MainController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainViewImpl implements MainView {
    private MainController controller;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public MainViewImpl(MainController controller) {
        this.controller = controller;
        controller.setMainView(this);
    }

    @Override
    public void setController(MainController controller) {
        this.controller = controller;
    }

    /**
     * Задаём время для светофора
     *
     * @param number Номер светофора
     */
    @Override
    public void programTrafficLight(int number) {
        System.out.println("Введите длительность работы цветов светофора (в секундах):");

        int greenTime = inputInteger("Зеленый");
        controller.setGreenTime(number, greenTime);

        int yellowTime = inputInteger("Желтый");
        controller.setYellowTime(number, yellowTime);

        int redTime = inputInteger("Красный");
        controller.setRedTime(number, redTime);
    }

    public void turnOnTrafficLight(int number) {
        controller.turnOnTrafficLight(number);
    }

    /**
     * Приглашение на ввод строки (в нашем случае на ввод времени в секундах для цвета светофора)
     *
     * @param prompt Строка запрос.
     * @return Возвращает преобразованное из строки число.
     */
    private int inputInteger(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + ": ");
                String number = reader.readLine();
                return Integer.parseInt(number);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number");
            }
        }
    }
}
