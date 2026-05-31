package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class al {
    private String a;
    private ArrayList<am> b = new ArrayList<>();

    public al(String str) {
        this.a = "";
        this.a = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a();
    }

    private void a() {
        try {
            if (!this.a.contains(",")) {
                String str = this.a;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String strTrim = str.trim();
                if (this.b != null) {
                    this.b.add(new am(strTrim));
                    return;
                }
                return;
            }
            for (String str2 : this.a.split(",")) {
                if (!TextUtils.isEmpty(str2)) {
                    String strTrim2 = str2.trim();
                    if (this.b != null) {
                        this.b.add(new am(strTrim2));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public boolean a(int i) {
        try {
            ArrayList<am> arrayList = this.b;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    am amVar = this.b.get(i2);
                    if (amVar != null && amVar.a(i)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
