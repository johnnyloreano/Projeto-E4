package Controller;

import Model.Cart;
import View.Interface;

public class FacadeController {
    Controller controller;
    public FacadeController(Interface anInterface){
        this.controller = new Controller(anInterface, Cart.instance());
    }
    public Controller controller(){
        return this.controller;
    }
}