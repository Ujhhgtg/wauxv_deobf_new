package p000;

import android.content.SharedPreferences;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲇᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1143 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4246;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4247;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4248;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f4249;

    public /* synthetic */ RunnableC1143(Object obj, Object obj2, Object obj3, int i) {
        this.f4246 = i;
        this.f4247 = obj;
        this.f4248 = obj2;
        this.f4249 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4246) {
            case 0:
                C1044 c1044 = (C1044) this.f4247;
                AbstractC1458 abstractC1458 = (AbstractC1458) this.f4248;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f4249;
                try {
                    C1374 c1374M3178 = AbstractC1459.m3178(c1044.f3808);
                    if (c1374M3178 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C1373 c1373 = (C1373) ((InterfaceC1141) c1374M3178.f4233);
                    synchronized (c1373.f4948) {
                        c1373.f4950 = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC1141) c1374M3178.f4233).mo2614(new C1144(abstractC1458, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC1458.mo2734(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                SharedPreferencesC1269 sharedPreferencesC1269 = (SharedPreferencesC1269) this.f4247;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.f4248;
                String str = (String) this.f4249;
                sharedPreferencesC1269.getClass();
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC1269, str);
                return;
        }
    }
}
