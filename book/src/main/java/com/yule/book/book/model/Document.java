package com.yule.book.book.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Yule.Paulusha on 4/14/2019.
 */
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private List<Card> cards;

//    private List<Page> pages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

//    public List<Page> getPages() {
//        return pages;
//    }
//
//    public void setPages(List<Page> pages) {
//        this.pages = pages;
//    }
}
