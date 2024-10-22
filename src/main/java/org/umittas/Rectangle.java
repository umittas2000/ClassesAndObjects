package org.umittas;

public class Rectangle implements Cloneable {
    /**
     *Rectangle class has 2 fields
     * name, length, width and memoryAddress
     * Field are private so, Direct access is prohibited
     * instead, Getter and setter methods used to access length and width fields
     * The purpose of getter and setter methods are controlling the access
     * if you have a logic like length cannot be negative value, you can apply that logic into setter method
     * This is called encapsulation
     */
    private String name;
    private int length;
    private int width;
    private Long memoryAddress;

    //Default constructor
    public Rectangle(){
        this.name="";
        this.length=10;
        this.width=5;

    }
    public Rectangle(String name){
        this.name=name;
        this.length=10;
        this.width=5;
    }

    //Overloaded constructor
    public Rectangle(String name, int length, int width){
        this.name=name;
        this.length = length;
        this.width = width;
    }


    //Getter and Setter methods
    // Encapsulation of the class to control access to class data
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMemoryAddress() {
        return memoryAddress;
    }

    public void setMemoryAddress(Long memoryAddress) {
        this.memoryAddress = memoryAddress;
    }

    //This is an example action method in class
    //You dont need to repeat your code to print something belongs to this class
    public String toString(){
        return "Rectangle [name="+name+", length=" + length + ", width=" + width + ", MemoryAddress=" + memoryAddress+"]";
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
