package com.example.Hospital.Service;

import com.example.Hospital.entities.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemService {
    private final Map<Integer, Item> itemMap = new HashMap<>();
    private static final int INTEM_PER_PAGE =10;

    public ItemService(){
        for (int i=0; i<100; i++){
            itemMap.put(i,new Item(i,"Item"+i));
        }
    }
    public List<Item> getItemsByPage(int page){
        int offset = (page-1)*INTEM_PER_PAGE;
        List<Item> items = new ArrayList<>(itemMap.values());

        return items.subList(offset,Math.min(items.size(), offset+INTEM_PER_PAGE));
    }
    public int getItemCount(){
        return itemMap.size();
    }

}
