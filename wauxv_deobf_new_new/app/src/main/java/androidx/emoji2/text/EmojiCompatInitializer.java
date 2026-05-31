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
import p000.AbstractC0768;
import p000.C0253;
import p000.C1047;
import p000.C1148;
import p000.C1382;
import p000.InterfaceC1002;
import p000.InterfaceC1650;
import p000.InterfaceC1800;
import p000.RunnableC1151;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1650 {
    @Override // p000.InterfaceC1650
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List mo92() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p000.InterfaceC1650
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object mo93(Context context) {
        Object objM1464;
        C1382 c1382 = new C1382(new C1047(context));
        c1382.f4244 = 1;
        if (C1148.f4248 == null) {
            synchronized (C1148.f4247) {
                try {
                    if (C1148.f4248 == null) {
                        C1148.f4248 = new C1148(c1382);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0253 c0253M1452 = C0253.m1452(context);
        c0253M1452.getClass();
        synchronized (C0253.f1476) {
            try {
                objM1464 = ((HashMap) c0253M1452.f1478).get(ProcessLifecycleInitializer.class);
                if (objM1464 == null) {
                    objM1464 = c0253M1452.m1464(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final C0000 c0000Mo894 = ((InterfaceC1800) objM1464).mo894();
        c0000Mo894.m97(new InterfaceC1002(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // p000.InterfaceC1002
            /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
            public final void mo94() {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0768.m2363(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1151(), 500L);
                c0000Mo894.m102(this);
            }
        });
        return Boolean.TRUE;
    }
}
