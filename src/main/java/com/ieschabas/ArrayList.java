package com.ieschabas;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayList {
    static void main() {

        LinkedHashMap<String, String> configuraciones = new LinkedHashMap<>(); //Host - Puerto

        configuraciones.put("Host", "LocalHost");
        configuraciones.put("Port", "8080");
        configuraciones.put("Timeout", "5000");

        System.out.println("Elementos:");
        for (Map.Entry<String, String> config : configuraciones.entrySet()) {
            System.out.println(config.getKey() + " - " + config.getValue());

        }
        System.out.println();

        System.out.println("Elimino Port");
            configuraciones.remove("Port");

        for (Map.Entry<String, String> config : configuraciones.entrySet()) {
            System.out.println(config.getKey() + " - " + config.getValue());

        }

        System.out.println();

       /** System.out.println("Vacio lista:");
            configuraciones.clear();
        for (Map.Entry<String, String> config : configuraciones.entrySet()) {
            System.out.println(config.getKey() + " - " + config.getValue());

        }
        */

        System.out.println("Muestro elemnto 500");
       configuraciones.get(500);
        }
    }
