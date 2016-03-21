package app07a.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import app07a.domain.Product;

@Component
public class ProcuctConverter implements  Converter<String, Date>
{

   /* @Override
    public Product convert(String source)
    {
        if(source != null)
        {
            Product product = new Product();
            //java-javabase-12.0-2011.12.12
            String[] values = source.split("-");
            if(values != null && values.length==4)
            {
                product.setName(values[0]);
                product.setDescription(values[1]);
                product.setPrice(Float.parseFloat(values[2]));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                product.setProductionDate(new Date());
                System.out.println(source + "--converter"+product);
             return product;   
            }
            
            
        }
        return null;
    }
*/
    @Override
    public Date convert(String source)
    {
        try
        {
            SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd");
            dateFormate.setLenient(false);
            return dateFormate.parse(source);
        } catch (ParseException e)
        {
            //现在有一个问题就是Spring 中如果有多个converter不同的日期格式那么Spring是如何决定用那个的，其次还是
            //就是这个格式可以利用js插件来完善，但是一个系统中如果有两个日期格式那么该怎么确定
            //这里可以看看Spring学习指南里面的知识
            //这里抛出一个异常之后,页面就可以会返回在i18n.properties的文件中的错误信息
            //如果这里返回null，那么就会转到ｖalidator,然后提示ｖalidator的提示信息，这应该是一个完整的流程了
            throw new IllegalArgumentException("invalid 1234567");
        }
    }
 

}
