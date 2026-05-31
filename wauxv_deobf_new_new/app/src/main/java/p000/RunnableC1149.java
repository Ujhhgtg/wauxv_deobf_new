package p000;

import android.content.SharedPreferences;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᛸᲇᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1149 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4258;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4259;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4260;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4261;

    public /* synthetic */ RunnableC1149(Object obj, Object obj2, Object obj3, int i) {
        this.f4258 = i;
        this.f4259 = obj;
        this.f4260 = obj2;
        this.f4261 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4258) {
            case 0:
                C1047 c1047 = (C1047) this.f4259;
                AbstractC2240 abstractC2240 = (AbstractC2240) this.f4260;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f4261;
                try {
                    C1382 c1382M5093 = AbstractC3528.m5093(c1047.f3815);
                    if (c1382M5093 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C1381 c1381 = (C1381) ((InterfaceC1147) c1382M5093.f4245);
                    synchronized (c1381.f4977) {
                        c1381.f4979 = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC1147) c1382M5093.f4245).mo2738(new C1150(abstractC2240, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC2240.mo2878(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                SharedPreferencesC1271 sharedPreferencesC1271 = (SharedPreferencesC1271) this.f4259;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.f4260;
                String str = (String) this.f4261;
                sharedPreferencesC1271.getClass();
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC1271, str);
                return;
        }
    }
}
