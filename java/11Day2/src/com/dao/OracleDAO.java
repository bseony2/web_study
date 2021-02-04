package com.dao;

import java.util.HashSet;

public class OracleDAO {
    
    public HashSet<String> select(){
        HashSet<String> set = new HashSet<String>();
        set.add("홍길동");
        set.add("이순신");
        set.add("유관순");
        return set;
    }
}
