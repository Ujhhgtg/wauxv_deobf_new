package com.uyumao;

import android.content.Context;
import android.text.TextUtils;
import p000.AbstractC1225feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class o {
    public static volatile o a;
    public final Context b;
    public final a c = new a(this, "AZX");

    public o(Context context) {
        this.b = context.getApplicationContext();
    }

    public void a(long j) {
        this.c.b("smart_interval", j);
        this.c.b("smart_ts", System.currentTimeMillis());
    }

    public final boolean a(String str) {
        long jA = this.c.a(str + "interval", 0L);
        if (jA <= 0) {
            return true;
        }
        a aVar = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("ts");
        return Math.abs(System.currentTimeMillis() - aVar.a(sb.toString(), 0L)) / 1000 >= jA;
    }

    public long a() {
        return this.c.a("smart_lc", 0L);
    }

    /* JADX INFO: compiled from: obf */
    public class a {
        public final String a;

        public a(o oVar, String str) {
            this.a = TextUtils.isEmpty(str) ? str : AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(str, "_");
        }

        public final void a(String str, String str2) {
            try {
                if (n.c(e.a)) {
                    m mVarA = m.a();
                    mVarA.getClass();
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    mVarA.b.edit().putString(str, str2).apply();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void b(String str, long j) {
            a(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), this.a, str), String.valueOf(j));
        }

        public long a(String str, long j) {
            String strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder(), this.a, str);
            String strValueOf = String.valueOf(j);
            try {
                if (n.c(e.a)) {
                    strValueOf = m.a().b.getString(strM2706Ujhhgtgfeyxiexzf, strValueOf);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                return Long.parseLong(strValueOf);
            } catch (Exception unused) {
                return j;
            }
        }
    }
}
