package com.mcode.balancetracker.com.mcode.balancetracker.gui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.mcode.balancetracker.com.mcode.balancetracker.data.BalanceEntry;

/**
 * Created by Ming on 12/6/2014.
 */
public class BalanceTrackerGui {
    private final Context ctx;
    public BalanceTrackerGui(Context ctx) {
        this.ctx = ctx;
    }

    public void displayMessage(String title, String message) {
        new AlertDialog.Builder(ctx)
                .setMessage(message)
                .setTitle(title)
                .setCancelable(true)
                .setNeutralButton(android.R.string.cancel,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton){}
                        })
                .show();
    }

    public BalanceEntry promptBalanceEntry() {
        return null;
    }
}
