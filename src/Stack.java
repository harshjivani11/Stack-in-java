/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harsh
 */
public class Stack {
    private int[] objects;
    private int top;
    private int stackSize;
    

public Stack() {
stackSize = 1;
top = -1;
objects =new int[stackSize];

}
public void push(int item)
{
if(top >= stackSize - 1)
resize();
objects[++top] = item;
}
public Integer pop() {
    if(top<0)
        return null;
    return objects[top--];
}
private void resize(){
int[] temp = objects;
stackSize = stackSize*2;
objects= new int[stackSize];
for(int i=0 ; i <= top ; i++)
objects[i]=temp[i];
}
}