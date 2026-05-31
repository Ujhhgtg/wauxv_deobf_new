package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC1796;
import p000.C0253;
import p000.C1191;
import p000.C1795;
import p000.C2458;
import p000.C2460;
import p000.EnumC1792;
import p000.InterfaceC1650;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1650 {
    @Override // p000.InterfaceC1650
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final List mo92() {
        return C1191.f4326;
    }

    @Override // p000.InterfaceC1650
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo93(Context context) {
        if (!((HashSet) C0253.m1452(context).f1479).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC1796.f5953.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1795());
        }
        C2460 c2460 = C2460.f7827;
        c2460.getClass();
        c2460.f7832 = new Handler();
        c2460.f7833.m100(EnumC1792.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2458(c2460));
        return c2460;
    }
}
