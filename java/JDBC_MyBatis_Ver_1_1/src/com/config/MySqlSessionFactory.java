package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MySqlSessionFactory {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        String resource = "Configuration.xml";
        InputStream inputStream = null;
        try{
            inputStream = Resources.getResourceAsStream(resource);
            System.out.println("초기화 Configuration.xml 등록 성공");
        }catch(Exception e){
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSqlSession(){
        SqlSession session = sqlSessionFactory.openSession();
        return session;
    }
    
}
