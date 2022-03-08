package com.casetrue.copy_objects_40;

public class Car {
    private String mark;
    private String model;
    private int year;

    Car(String mark, String madel, int year) {
        this.setMark(mark);
        this.setModel(madel);
        this.setYear(year);
    }

    Car(Car car){
        /**
         * extract all attributes or use copy method that's bellow
         */
        copy(car);
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car car) {
        this.setMark(car.getMark());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
}
