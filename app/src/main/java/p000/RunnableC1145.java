package p000;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1145 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = AbstractC3422.f10794;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C1142.f4236 != null) {
                C1142.m2753().m2755();
            }
        } finally {
            Method method2 = AbstractC3422.f10794;
            Trace.endSection();
        }
    }
}
