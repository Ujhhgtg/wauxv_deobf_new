package com.umeng.analytics.pro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class da {
    private static final String a = "yyyy-MM-dd HH:mm";

    public static int a() {
        int i = Calendar.getInstance().get(7);
        if (i == 1) {
            return 7;
        }
        return i - 1;
    }

    public static int b() {
        return Calendar.getInstance().get(11);
    }

    public static long a(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).parse(str);
                if (date != null) {
                    return date.getTime();
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return 0L;
    }

    public static String a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(j));
    }
}
