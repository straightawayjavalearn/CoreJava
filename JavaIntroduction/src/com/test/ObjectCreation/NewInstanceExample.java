
package com.test.ObjectCreation;

import java.lang.reflect.Constructor;

public class NewInstanceExample
{
    private String name;
    NewInstanceExample()
    {
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public static void main(String[] args)
    {
        try
        {
            Constructor<NewInstanceExample> constructor
                = NewInstanceExample.class.getDeclaredConstructor();
            NewInstanceExample r = constructor.newInstance();
            r.setName("DataTest");
            System.out.println(r.name);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}