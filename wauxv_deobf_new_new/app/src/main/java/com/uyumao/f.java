package com.uyumao;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.uyumao.g;
import java.util.HashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Handler {
    public f(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 256) {
            return;
        }
        int i = message.arg1;
        Object obj = message.obj;
        Integer numValueOf = Integer.valueOf(i / 100);
        HashMap<Integer, g.a> map = g.c;
        if (map == null) {
            return;
        }
        g.a aVar = map.containsKey(numValueOf) ? g.c.get(numValueOf) : null;
        if (aVar != null) {
            aVar.a(obj, i);
        }
    }
}
