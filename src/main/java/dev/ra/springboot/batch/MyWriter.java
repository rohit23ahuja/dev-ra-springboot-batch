package dev.ra.springboot.batch;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class MyWriter implements ItemWriter<Integer> {
    @Override
    public void write(Chunk<? extends Integer> chunk) throws Exception {
        for (Integer item : chunk) {
          System.out.println("Double of input :"+item*2);
        }
    }
}
