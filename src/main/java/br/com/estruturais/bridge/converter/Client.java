package br.com.estruturais.bridge.converter;

import br.com.estruturais.bridge.converter.converters.CSVConverter;
import br.com.estruturais.bridge.converter.converters.Converter;
import br.com.estruturais.bridge.converter.converters.JsonConverter;
import br.com.estruturais.bridge.converter.employees.ITGuy;
import br.com.estruturais.bridge.converter.employees.ProjectManager;

public class Client {

    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();

        ITGuy it = new ITGuy("Maurice Moss", 32, 4000d);
        ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);

        System.out.println(csvConverter.getEmployeeFormated(it));
        System.out.println(jsonConverter.getEmployeeFormated(it));
        System.out.println(csvConverter.getEmployeeFormated(pm));
        System.out.println(jsonConverter.getEmployeeFormated(pm));
    }
}
