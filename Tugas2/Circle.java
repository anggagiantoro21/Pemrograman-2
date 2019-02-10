/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base;

/**
 *
 * @author admin
 */
public class Circle extends Shape {

    public Circle(String name, String area) {
        super(name, area);
    }

        @Override
        public String getArea() {
            return super.getArea() + "( Area Circle )"; 
        }

        @Override
        public String getName() {
            return super.getName() + "( Circle )"; 
        }
}
