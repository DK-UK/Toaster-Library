package com.developer.dk.toastmessage;

import android.content.Context;
import android.widget.Toast;

public class ToasterMsg {

    public static void showMessage(Context context, String message){

        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
