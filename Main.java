package Joaircraft.oop;

import java.time.LocalDateTime;
import java.util.List;
import java.lang.String;
import java.util.ArrayList;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        //Partial flight plan
        FlightPlan berlinToBucharest = new FlightPlan("BER", "OTP");

        berlinToBucharest.print();

        System.out.println("1111111111111");
        System.out.println();
        System.out.println("1111111111111");

        //Complete flight plan

        FlightPlan parisToLondon = new FlightPlan(
                "CDG",
                "LHR",
                LocalDateTime.of(2022, 1, 9, 15, 3),
                Arrays.asList("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
                //List.of("CDG", "FARAR", "BAYKA", "DUDES", "LHR")
        );

        parisToLondon.print();

    }


}
