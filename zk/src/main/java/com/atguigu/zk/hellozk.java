package com.atguigu.zk;

import org.apache.zookeeper.ZooKeeper;

public class hellozk {


    private String name = "to";
    private int age = 10;

    /**
     *
     * @param name
     */
    public hellozk(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "hellozk{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        int[] i = {1, 2, 2, 5, 60};
        for (int i1 : i) {
            System.out.println(i1);
        }

    }


}
