package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.config.d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldManager {
    private static final String a = "cfgfd";
    private static b b = b.b();
    private static boolean c = false;
    private static Object d = new Object();

    /* JADX INFO: compiled from: obf */
    public static class a {
        private static final FieldManager a = new FieldManager();

        private a() {
        }
    }

    public static FieldManager a() {
        return a.a;
    }

    public static boolean allow(String str) {
        synchronized (d) {
            try {
                if (!c) {
                    return false;
                }
                return b.a(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean b() {
        boolean z;
        synchronized (d) {
            z = c;
        }
        return z;
    }

    private FieldManager() {
    }

    public void a(Context context) {
        String str;
        String str2 = "1001@3749699455,2130669566,262139,1983";
        String[] strArr = {d.a.class.getName(), d.b.class.getName(), d.c.class.getName(), d.EnumC0042d.class.getName()};
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "cfgfd", "1001@3749699455,2130669566,262139,1983");
        synchronized (d) {
            try {
                Pair<Long, String> pairA = a(strImprintProperty);
                if (((Long) pairA.first).longValue() > 1000 && (str = (String) pairA.second) != null && str.length() > 0) {
                    str2 = str;
                }
                String[] strArrSplit = str2.split(",");
                int length = strArrSplit.length;
                if (length > 0) {
                    ArrayList arrayList = new ArrayList();
                    g gVar = new g();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(gVar);
                        ((e) arrayList.get(i)).a(strArrSplit[i], b, d.b(strArr[i]));
                    }
                }
                c = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Context context, String str) {
        String str2;
        String str3 = "1001@3749699455,2130669566,262139,1983";
        String[] strArr = {d.a.class.getName(), d.b.class.getName(), d.c.class.getName(), d.EnumC0042d.class.getName()};
        synchronized (d) {
            try {
                b.a();
                if (str != null) {
                    Pair<Long, String> pairA = a(str);
                    if (((Long) pairA.first).longValue() > 1000 && (str2 = (String) pairA.second) != null && str2.length() > 0) {
                        str3 = str2;
                    }
                }
                String[] strArrSplit = str3.split(",");
                int length = strArrSplit.length;
                if (length > 0) {
                    ArrayList arrayList = new ArrayList();
                    g gVar = new g();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(gVar);
                        ((e) arrayList.get(i)).a(strArrSplit[i], b, d.b(strArr[i]));
                    }
                }
                c = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Pair<Long, String> a(String str) {
        Pair<Long, String> pair = new Pair<>(-1L, null);
        if (str != null && str.length() >= 2) {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length >= 2) {
                try {
                    long j = Long.parseLong(strArrSplit[0]);
                    return new Pair<>(Long.valueOf(j), strArrSplit[1]);
                } catch (Throwable unused) {
                }
            }
        }
        return pair;
    }
}
