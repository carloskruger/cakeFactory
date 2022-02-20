package com.cakefactory.service;

import com.cakefactory.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryCatalog implements Catalog{
    private List<Item> itemsList = new ArrayList<>();
    
    
    @Override
    public List<Item> getItemsList() {
        Item a = new Item("abc", "Chocolate Cake", 20.50);
        Item b = new Item("zzw", "Strawberry Cake", 19.50);
        Item c = new Item("rew", "Grapes Cake", 15.50);
        Item d = new Item("tre", "Carrots Cake", 10.50);
        Item e = new Item("nov", "Pineapple Cake", 8.50);
        Item f = new Item("fkd", "Wedding Cake", 28.50);

        itemsList.add(a);
        itemsList.add(b);
        itemsList.add(c);
        itemsList.add(d);
        itemsList.add(e);
        itemsList.add(f);

        
        return itemsList;
    }
}
