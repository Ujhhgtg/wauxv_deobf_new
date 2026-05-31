package p000;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲇᲈᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1151 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = AbstractC3480.f10955;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C1148.f4248 != null) {
                C1148.m2897().m2899();
            }
        } finally {
            Method method2 = AbstractC3480.f10955;
            Trace.endSection();
        }
    }
}
