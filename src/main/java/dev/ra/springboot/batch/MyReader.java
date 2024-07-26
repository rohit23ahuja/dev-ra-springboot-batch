package dev.ra.springboot.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class MyReader implements ItemReader<Integer> {
    private static String [] messages = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
    int count = 0;
    @Override
    public Integer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        if(count< messages.length){
            return Integer.valueOf(messages[count++]);
        }
        return null;
    }
}
