package com;

import java.util.ArrayList;

public class AllMethods {

    public ArrayList<SimpleEntity> generateList()
    {
        SimpleEntity entity1 = new SimpleEntity("vanya", 20, true);
        SimpleEntity entity2 = new SimpleEntity("makaka", 30, false);
        SimpleEntity entity3 = new SimpleEntity("sea holidays", 50, true);
        SimpleEntity entity4 = new SimpleEntity("snake", 666, false);
        SimpleEntity entity5 = new SimpleEntity("kitty", 1, true);
        SimpleEntity entity6 = new SimpleEntity("ice cream", 2, true);
        SimpleEntity entity7 = new SimpleEntity("f1", 65, true);
        ArrayList<SimpleEntity> list = new ArrayList<SimpleEntity>();
        list.add(entity1);
        list.add(entity2);
        list.add(entity3);
        list.add(entity4);
        list.add(entity5);
        list.add(entity6);
        list.add(entity7);
        return list;
    }

}
