package com.swastikijari.brain1;

/**
 * Created by swastik ijari on 19-04-2018.
 */

public class Question2 {
    public String Appti2[] ={

            "Which state will host the Group of Ministers (GoM) meeting - 2018?",
            "A power plant worth Rs 502 crore will be set up in which state to produce electricity from waste under the Integrated Solid Waste Management Scheme?",
            "As per the recent survey, this state has the highest rate of crimes against SC/ST population.",
            "GNFC started its socio-economic Neem Project in ___________.",
           "Which state celebrated its 71st foundation day recently?",
            "Which state plans to transforming its capital into world class city?",
            "This state is going to set up India's largest 5,000MW solar park."



    };

    public String Options[][]={{"assam","J&k","Goa","Nagaland"},
            {"Haryana","Rajesthan","Punjab","Jharkhand"},
            {"Bihar","MP","WB","Punjab"},{"UP","MP","Goa","Bihar"},{"HP","J&K","Bihar","UP"},{"Andrapradesh","J&k","Goa","Nagaland"},
            {"Haryana","Rajesthan","gujrat","Jharkhand"}


    };

    public String Answer[]={"assam","Haryana","Bihar","UP","HP","Andrapradesh","gujrat"

    };
    public String getQuestion(int a){
        String question = Appti2[a];
        return question;
    }
    public String Choice1(int a){
        String choice1 = Options[a][0];
        return choice1;
    }
    public String Choice2(int a){
        String choice2 = Options[a][1];
        return choice2;
    }
    public String Choice3(int a){
        String choice3 = Options[a][2];
        return choice3;
    }
    public String Choice4(int a){
        String choice4 = Options[a][3];
        return choice4;
    }
    public String Answers(int a){
        String ans = Answer[a];
        return ans;
    }}
