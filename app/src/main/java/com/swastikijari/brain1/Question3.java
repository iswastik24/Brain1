package com.swastikijari.brain1;

/**
 * Created by swastik ijari on 19-04-2018.
 */

public class Question3 {
    public String Appti3[] ={


            "Which of the following special symbol allowed in a variable name?",
            "How would you round off a value from 1.66 to 2.0?",
            "By default a real number is treated as a",
            "is the following statement a declaration or definition extern int i;",
            "When we mention the prototype of a function?",
            "Which header file should be included to use functions like malloc() and calloc()?"


    };

    public String Options3[][]={
            {"astrick","underscore","hypen","dot"},
            {"ceil","roundoff","roundto","none"},
            {"double","float","int","char"},
            {"declaration","defination","error","function"},
            {"declaring","defining","prototyping","calling"},
            {"stdlib","math.h","stdio.h","none"}





    };

    public String Answer3[]={"underscore","ceil","double","declaration","declaring","stdlib"

    };
    public String getQuestion(int a){
        String question = Appti3[a];
        return question;
    }
    public String Choice1(int a){
        String choice1 = Options3[a][0];
        return choice1;
    }
    public String Choice2(int a){
        String choice2 = Options3[a][1];
        return choice2;
    }
    public String Choice3(int a){
        String choice3 = Options3[a][2];
        return choice3;
    }
    public String Choice4(int a){
        String choice4 = Options3[a][3];
        return choice4;
    }
    public String Answers(int a){
        String ans = Answer3[a];
        return ans;
    }}
