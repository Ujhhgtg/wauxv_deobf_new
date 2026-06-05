package com.uyumao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class l {
    public static l a;
    public ExecutorService b;

    public static l a() {
        if (a == null) {
            synchronized (l.class) {
                try {
                    if (a == null) {
                        a = new l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a;
    }

    public ExecutorService b() {
        if (this.b == null) {
            synchronized (l.class) {
                try {
                    if (this.b == null) {
                        this.b = Executors.newSingleThreadExecutor();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }
}
