package blog.example.blog.converter;

import blog.example.blog.service.Converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void converterSetNonString(){
        Assert.assertEquals(" ", Converter.convert("_"));
    }
}
