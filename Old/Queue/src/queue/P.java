/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author oV nauT
 */
public class P{
        String name;
        int state;

        public P(int state) {
            this.state = state;
            name = "h";
        }

    @Override
    public String toString() {
        return "P{" + "name=" + name + ", state=" + state + '}';
    }
        
       
    }
