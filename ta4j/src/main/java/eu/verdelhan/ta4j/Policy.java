/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.verdelhan.ta4j;

import java.util.*;

/**
 *
 * @author sunzhu
 */
public interface Policy {
    
    /**
     * @param index the tick index
     * @param tradingRecord the potentially needed trading history
     * @return true to recommend an order, false otherwise (no recommendation)
     */
    List<Order> shouldOrder(int index, TradingRecord tradingRecord);    
}
