package com.cochecrud.test;

import com.cochecrud.CocheCRUDImpl;

public class TestCocheCRUD {
    public static void main(String[] args) {
        CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
