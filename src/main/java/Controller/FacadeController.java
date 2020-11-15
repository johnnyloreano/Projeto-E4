package Controller;

import Model.Cart;
import View.Interface;

public class FacadeController {
    Controller controller;
    public FacadeController(Interface anInterface, Cart cart){
        this.controller = new Controller(anInterface, cart);
    }
    public Controller controller(){
        return this.controller;
    }
}