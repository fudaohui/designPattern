package com.fdh.designpattern.builder;

public class Person {

    int id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;

    public static Builder buider() {
        return new Builder();
    }

    public static class Location {
        String street;
        String roomNo;

        public Location(String street, String roomNo) {
            this.street = street;
            this.roomNo = roomNo;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "street='" + street + '\'' +
                    ", roomNo='" + roomNo + '\'' +
                    '}';
        }
    }

    /**
     * 静态内部类。
     * final 表示该类不可以被继承
     * static 表示该类静态的，可直接使用外部类点调用，即不需要外部类的实例即可调用
     */
    public final static class Builder {
        Person p = new Person();

        public Builder basicInfo(int id, String name, int age) {
            p.id = id;
            p.name = name;
            p.age = age;
            return this;
        }

        public Builder weight(double weight) {
            p.weight = weight;
            return this;
        }

        public Builder score(int score) {
            p.score = score;
            return this;
        }

        public Builder loc(String street, String roomNo) {
            p.loc = new Location(street, roomNo);
            return this;
        }


        public Person build() {
            return p;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", score=" + score +
                ", loc=" + loc +
                '}';
    }
}
