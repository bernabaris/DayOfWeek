package com.github.bernabaris.dayofweek;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class DayOfWeekService {


    public String DayOfWeekIf(int day){
        if(day==1){
            return "Pazartesi";
        } else if (day==2) {
            return "Salı";
        } else if (day==3) {
            return "Çarşamba";
        } else if (day==4) {
            return "Perşembe";
        } else if (day==5) {
            return "Cuma";
        } else if (day==6) {
            return "Cumartesi";
        } else if (day==7) {
            return "Pazar";
        }
        else {
            return "Hata";

        }
    }
    public String DayOfWeekSwitch(int day) {
        switch (day) {
            case 1:
                return "Pazartesi";
            case 2:
                return "Salı";
            case 3:
                return "Çarşamba";
            case 4:
                return "Perşembe";
            case 5:
                return "Cuma";
            case 6:
                return "Cumartesi";
            case 7:
                return "Pazar";
            default:
                return "Hata";
        }
    }
}
