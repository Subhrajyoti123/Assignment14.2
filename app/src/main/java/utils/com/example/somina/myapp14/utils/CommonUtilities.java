package com.example.somina.myapp14.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;

public class CommonUtilities {

    private static ProgressDialog dialog;

    public enum SERVICE_TYPE {
        GET_DATA, ERROR_REPORT
    }

    public static ProgressDialog showLoading(Context context, String message, boolean cancealable) {
        dialog = new ProgressDialog(context);
        dialog.setMessage(message);
        dialog.setCancelable(cancealable);
        return dialog;
    }

    public static void hideLoading() {
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public static void showToast(Context context, String message) {
        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }
}