package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
    static SqlSessionFactory sqlSessionFactory = null;
    static{//초기화
        String resource = "Configuration.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);//Configuration.xml을 읽어올 수 있도록 Java IO연결
            System.out.println("초기화 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//Configuration 
        //.xml을이용하여 SqlSesison을 만들어 주는 SqlSessionFactory 생성
    }//end static

    //sqlsession 반환
    public static SqlSession getSqlSession(){ //Connection과 비슷한 sql을 사용할 수 있도록 하는 객체
        SqlSession session = sqlSessionFactory.openSession();
        return session;
    }
}
