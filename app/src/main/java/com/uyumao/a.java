package com.uyumao;

import android.content.Context;
import com.uyumao.j;
import org.json.JSONArray;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ Context a;

    public a(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Context context = this.a;
            if (j.a == null && context != null) {
                j.a = context.getApplicationContext();
            }
            c.a(this.a, c.a(this.a, j.a.a.a(), (JSONArray) null), false);
        } catch (Throwable unused) {
        }
    }
}
