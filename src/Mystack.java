/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harsh
 */
public class Mystack {
    public static void main(String[] args) { 
            Stack stack = new Stack();
            stack.push(11);
            stack.push(19);
            stack.push(60);
            System.out.println(stack.pop());
            stack.push(3);
            System.out.println(stack.pop());
            stack.push(10);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
}
}
