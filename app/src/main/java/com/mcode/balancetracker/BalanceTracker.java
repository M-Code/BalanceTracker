package com.mcode.balancetracker;

import com.mcode.balancetracker.com.mcode.balancetracker.data.BalanceEntry;
import com.mcode.balancetracker.com.mcode.balancetracker.data.BalanceSummary;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ming on 12/6/2014.
 */
public class BalanceTracker {

    private List<BalanceEntry> balanceEntryList = new LinkedList<BalanceEntry>();
    public BalanceSummary generateBalanceSummary() {
        return null;
    }
    public void insertEntry(BalanceEntry entry) {
        balanceEntryList.add(entry);
    }
}
