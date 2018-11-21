package com.universal.dao;

import com.universal.entity.Card;

import java.util.List;

public interface CardDAO {

//    void insertCard(String number, Long bankAccountsID);

    void insertCard(Card card, Long bankAccountsID);

    void updateCard(String number, Long idCard);

    void deleteCard(Long idCard);

    Card getCardByNumber(String number);

    List<Card> getAllCards();


}
