package Day26_ClassesContractors;

import CustomClasses.CarClass;
import CustomClasses.EmployeeClass;

public class Topic1_PublicClasses {

    public static void main(String[] args) {

        // How to define an Object
        // DataType VariableName = new Constructor;

        CarClass MyElectricCar = new CarClass();
        MyElectricCar.Make="Tesla";
        MyElectricCar.Colour ="Red";
        MyElectricCar.Model="Model3";
        MyElectricCar.ModelYear=2023;

        EmployeeClass MyEmployee = new EmployeeClass();
        MyEmployee.Name="Fahrettin";
        MyEmployee.Department="QA";
        MyEmployee.Surname="Fahrettin";






    }
}
