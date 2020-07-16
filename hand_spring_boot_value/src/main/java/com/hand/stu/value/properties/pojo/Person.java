package com.hand.stu.value.properties.pojo;

import com.sun.istack.internal.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.*;

@Component
@ConfigurationProperties(prefix = "person")
@Validated  //对数据进行校验
public class Person {

    //简单数据类型
    @NotNull
    private String name;

    private int age;
    private Date birthday;
    private boolean boss;

    //复杂数据类型
    private Map<String,Object> map = new HashMap<>();
    private List<Object> list = new ArrayList<>();
    private String[] arr;
    private Stu stu;

    public Stu getStu() {
        return stu;
    }

    public void setStu(Stu stu) {
        this.stu = stu;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        String str = " ";
        for(int i = 0;i<arr.length;i++){
            str = str + arr[i];
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", boss=" + boss +
                ", map=" + map +
                ", list=" + list +
                ", arr=" + str +
                ", arr=" + stu.toString() +
                '}';
    }
}
