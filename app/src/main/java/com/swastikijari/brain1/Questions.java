package com.swastikijari.brain1;


public class Questions {

    public String Appti[] ={

            "Two ships are sailing in the sea on the two sides of a lighthouse.The angle of elevation of the top of the lighthouse is observed from the ships are 30° and 45° respectively. If the lighthouse is 100 m high, the distance between the two ships is",
            "A sum of money at simple interest amounts to Rs. 815 in 3 years and to Rs. 854 in 4 years. The sum is:",
            "The cost price of 20 articles is the same as the selling price of x articles. If the profit is 25%, then the value of x is:",
            "The percentage increase in the area of a rectangle, if each of its sides is increased by 20% is:",
            "A towel, when bleached, was found to have lost 20% of its length and 10% of its breadth. The percentage of decrease in area is:",
            "A man walked diagonally across a square lot. Approximately, what was the percent saved by not walking along the edges?",
            "What is the least number of squares tiles required to pave the floor of a room 15 m 17 cm long and 9 m 2 cm broad?"

    };

    public String Options[][]={{"273","500","656","787"},
            {"898","747","698","784"},
            {"14","16","45","74"},{"44","55","78","6"},{"45","28","10","5"},{"23","48","30","87"},{"878","820","784","466"}

    };

    public String Answer[]={"273","698","16","44","28","30","820"

    };
    public String getQuestion(int a){
        String question = Appti[a];
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
    }

}

