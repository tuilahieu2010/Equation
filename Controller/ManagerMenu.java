/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Manager;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ManagerMenu  extends Menu<String> {

    static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation","Exit"};

    public  ManagerMenu() {
        super("\n MAIN MENU", mc);
       
    }

    public void execute(int n) {
        switch (n) {
                   case 1:
                    Manager.superlativeEquation();
                    break;
                case 2:
                    Manager.quadraticEquation();
                    break;
                case 3:
                    return;
        }
    }
}