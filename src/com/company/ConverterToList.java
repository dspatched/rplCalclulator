package com.company;

import java.util.ArrayList;

public class ConverterToList {

    private String input;

    public ConverterToList(String input) {
        this.input = input;
    }

    public ArrayList<String> toList() {
        String input = this.input;
        ArrayList<String> output = new ArrayList<>();
        String tmp = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '+': if (tmp!="") output.add(tmp); tmp=""; output.add(c+""); break;
                case '-': if (tmp!="") output.add(tmp); tmp=""; output.add(c+""); break;
                case '*': if (tmp!="") output.add(tmp); tmp=""; output.add(c+""); break;
                case '/': if (tmp!="") output.add(tmp); tmp=""; output.add(c+""); break;
                case '(': if (tmp!="") output.add(tmp); tmp=""; output.add(c+""); break;
                case ')': if (tmp!="") output.add(tmp); tmp=""; output.add(c+""); break;
                default: tmp += c;
            }
            if (i == input.length()-1 && tmp!="") output.add(tmp);
        }
        return unaryFix(output);
    }

    private ArrayList<String> unaryFix(ArrayList<String> input) {
        ArrayList<String> fixedOutput = new ArrayList<>();
        int max = input.size();
        for (int i = 0; i < max; i++) {
            String cur = input.get(i);
            if (cur.equals("-")) {
                if (i == 0 || input.get(i-1).equals("(")) {
                    fixedOutput.add("(");
                    fixedOutput.add("0");
                    fixedOutput.add("-");
                    fixedOutput.add("1");
                    fixedOutput.add(")");
                    fixedOutput.add("*");
                } else {fixedOutput.add(cur); }
            } else {fixedOutput.add(cur); }
        }
        return fixedOutput;
    }


}
