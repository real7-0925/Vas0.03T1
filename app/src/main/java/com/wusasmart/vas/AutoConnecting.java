package com.wusasmart.vas;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import android.bluetooth.BluetoothDevice;
import android.util.Log;

public class AutoConnecting extends BroadcastReceiver {
    public static final String TAG = "AutoConnecting";
    String strPsw = "0";
    @Override
    public void onReceive(Context context, Intent intent) {
        //TODO Auto-generated method stub
        if(intent.getAction().equals("android.bluetooth.device.action.PARING_REQUEST")){
            BluetoothDevice btDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);

            //byte[] pinBytes = BluetoothDevice.convertPinToBytes("1234");
            //device.setPin(pinBytes);
            Log.i(TAG,"Get Action");

        }
    }


    public class ClsUtils{


    }


}
