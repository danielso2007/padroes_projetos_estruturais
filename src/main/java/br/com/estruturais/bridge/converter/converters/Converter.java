package br.com.estruturais.bridge.converter.converters;

import br.com.estruturais.bridge.converter.employees.Employee;

public interface Converter {
    String getEmployeeFormated(Employee emp);
}
