package blog.example.blog.service;

import org.springframework.stereotype.Service;

@Service
public class Converter {

    public static String convert(String content){
        return content.replace("_"," ");
    }
}
