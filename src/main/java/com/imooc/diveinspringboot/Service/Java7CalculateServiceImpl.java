package com.imooc.diveinspringboot.Service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Java7")
@Service
public class Java7CalculateServiceImpl implements CalculateService
{
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java7 实现");
        int sum=0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return  sum;
    }
}
