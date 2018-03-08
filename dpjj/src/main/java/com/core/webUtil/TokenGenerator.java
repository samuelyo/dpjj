package main.java.com.core.webUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import Decoder.BASE64Encoder;

public class TokenGenerator {
	
	 /* 
     *�������ģʽ����֤��Ķ������ڴ���ֻ��һ���� 
     *1������Ĺ��캯��˽�� 
     *2���Լ�����һ����Ķ��� 
     *3�������ṩһ�������ķ�����������Ķ��� 
     *  
     */  
    private TokenGenerator(){}  
      
    private static final TokenGenerator instance = new TokenGenerator();  
      
    public static TokenGenerator getInstance(){  
        return instance;  
    }  
      
      
    public String makeToken(String ip,String userid){  //checkException  
          
        //  7346734837483  834u938493493849384  43434384  
        String token = (System.currentTimeMillis() + new Random().nextInt(999999999)) + ip + userid;  
          
        //����ָ��   128λ��   16���ֽ�  md5  
        try {  
            MessageDigest md = MessageDigest.getInstance("md5");  
            byte md5[] =  md.digest(token.getBytes());  
              
            //base64����--��������Ʊ��������ַ�   adfsdfsdfsf  
            BASE64Encoder encoder = new BASE64Encoder();  
            return encoder.encode(md5);  
              
        } catch (NoSuchAlgorithmException e) {  
            throw new RuntimeException(e);  
        }  
          
    }  
}
