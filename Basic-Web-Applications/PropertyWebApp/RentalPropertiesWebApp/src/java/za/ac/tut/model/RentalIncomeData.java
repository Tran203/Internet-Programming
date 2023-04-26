/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author Admin
 */
public class RentalIncomeData {

    //data in rows(areaCode) and columns(monthData)
    private static final Double[][] MONTHLY_INCOME_DATA = {{120000.00, 100000.00, 110000.00}, {200000.00, 170000.00, 190000.00}, {150000.00, 180000.00, 100000.00}};

    public RentalIncomeData() {
    }

    public String MonthData(String monthCode) {
        //get Index of the month
        int indexArea = 0;
        int indexMonth = getMonthIndex(monthCode);
        //using columns determine the row 
        Double highest = MONTHLY_INCOME_DATA[0][indexMonth];
        for (int i = 0; i < 3; i++) {
            if (highest < MONTHLY_INCOME_DATA[i][indexMonth]) {
                highest = MONTHLY_INCOME_DATA[i][indexMonth];
                //get area index
                indexArea = i;
            }
        }
        //String value of area
        String strArea="";
        switch(indexArea){
        case 0:
            strArea = "GA";
        break;
        case 1:
            strArea = "SO";
        break;
        case 2:
            strArea = "MA";
        break;
        }       
        
        //return result
        String result = "The area at which month(" + monthCode + ") produced higest Income" + "\n"
                + "Area: " + strArea + "\n"
                + "Income Generated: R" + highest;
        return result;
    }

    public String areaCodeData(String areaCode) {
        //declar
        int indexMonth = 0;
        int indexArea = getAreaIndex(areaCode);
        //get the lowest from that particular row
        Double lowest = MONTHLY_INCOME_DATA[indexArea][0];
        //iterate throuh && get lowest
        for (int i = 0; i < 3; i++) {
            //if lowest (is not the lowest)
            if (lowest > MONTHLY_INCOME_DATA[indexArea][i]) {
                //then assign new lowest
                lowest = MONTHLY_INCOME_DATA[indexArea][i];
                //get the month using the value of the index
                indexMonth = i;
            }
        }
        //get the string value of month
        String strMonth = "";
        switch (indexMonth) {
            case 0:
                strMonth = "JAN";
                break;
            case 1:
                strMonth = "Feb";
                break;
            case 2:
                strMonth = "Mar";
                break;
        }
        //return result
        String result = "The month at which area code(" + areaCode + ") produced lowest Income" + "\n"
                + "Month: " + strMonth + "\n"
                + "Income Generated: R" + lowest;
        return result;
    }

    private int getAreaIndex(String areaCode) {
        int index = 0;
        switch (areaCode.toUpperCase()) {
            case "GA":
                index = 0;
                break;
            case "SO":
                index = 1;
                break;
            case "MA":
                index = 2;
                break;
            default:
                index = 0;
        }
        return index;
    }

    private int getMonthIndex(String monthCode) {
        int indexMonth;

        switch (monthCode) {
            case "JAN":
                indexMonth = 0;
                break;
            case "FEB":
                indexMonth = 1;
                break;
            case "MAR":
                indexMonth = 2;
                break;
            default:
                indexMonth = 0;
        }

        return indexMonth;
    }
}
