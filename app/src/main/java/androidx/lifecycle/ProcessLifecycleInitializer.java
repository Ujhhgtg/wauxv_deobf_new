package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import p000.AbstractC1773;
import p000.C0243;
import p000.C1189;
import p000.C1772;
import p000.C2405;
import p000.C2407;
import p000.EnumC1769;
import p000.InterfaceC1636;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1636 {
    @Override // p000.InterfaceC1636
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final List mo92() {
        return C1189.f4329;
    }

    @Override // p000.InterfaceC1636
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo93(Context context) {
        if (!((HashSet) C0243.m1306(context).f1405).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC1773.f5897.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1772());
        }
        C2407 c2407 = C2407.f7683;
        c2407.getClass();
        c2407.f7688 = new Handler();
        c2407.f7689.m100(EnumC1769.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C2405(c2407));
        return c2407;
    }
}
