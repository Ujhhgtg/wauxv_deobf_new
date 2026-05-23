package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0000;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC0770;
import p000.C0243;
import p000.C1044;
import p000.C1142;
import p000.C1374;
import p000.InterfaceC0998;
import p000.InterfaceC1636;
import p000.InterfaceC1777;
import p000.RunnableC1145;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1636 {
    @Override // p000.InterfaceC1636
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List mo92() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.InterfaceC1636
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object mo93(Context context) {
        Object objM1318;
        C1374 c1374 = new C1374(new C1044(context));
        c1374.f4232 = 1;
        if (C1142.f4236 == null) {
            synchronized (C1142.f4235) {
                try {
                    if (C1142.f4236 == null) {
                        C1142.f4236 = new C1142(c1374);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0243 c0243M1306 = C0243.m1306(context);
        c0243M1306.getClass();
        synchronized (C0243.f1402) {
            try {
                objM1318 = ((HashMap) c0243M1306.f1404).get(ProcessLifecycleInitializer.class);
                if (objM1318 == null) {
                    objM1318 = c0243M1306.m1318(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final C0000 c0000Mo750 = ((InterfaceC1777) objM1318).mo750();
        c0000Mo750.m97(new InterfaceC0998(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // p000.InterfaceC0998
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
            public final void mo94() {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0770.m2262(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1145(), 500L);
                c0000Mo750.m102(this);
            }
        });
        return Boolean.TRUE;
    }
}
