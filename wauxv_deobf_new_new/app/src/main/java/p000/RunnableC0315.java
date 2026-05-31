package p000;

import android.os.Handler;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤝᲈᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0315 extends AbstractC2927 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final RunnableC0315 f1597;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final String f1598;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final String f1599;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final String f1600;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C0207 f1601;

    static {
        String[] strArr = AbstractC1471.f5234;
        f1597 = new RunnableC0315("AutoCleanHook");
        f1598 = "杂项";
        f1599 = "自动瘦身";
        f1600 = "致敬瘦身模块 'KitsunePie-QQCleaner' ";
        f1601 = new C0207(26);
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0313 c0313 = C0313.f1595;
        if (jCurrentTimeMillis - c0313.m2663() > C0312.f1594.m2663() * 1000) {
            c0313.m2670(System.currentTimeMillis());
            C1006 c1006 = AbstractC1080.f3904;
            ExecutorC0994 executorC0994 = ExecutorC0994.f3625;
            C0314 c0314 = new C0314(2, null, 0);
            InterfaceC0876 interfaceC0876M4165 = AbstractC2234.m4165(C1189.f4324, executorC0994, true);
            C1006 c1007 = AbstractC1080.f3904;
            if (interfaceC0876M4165 != c1007 && interfaceC0876M4165.mo1086(C1139.f4214) == null) {
                interfaceC0876M4165 = interfaceC0876M4165.mo1085(c1007);
            }
            AbstractC0064 c1008 = new C1008(interfaceC0876M4165, true, 1);
            c1008.m1082(1, c1008, c0314);
        }
        ((Handler) AbstractC1483.f5277.getValue()).postDelayed(this, 600000L);
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
        ((Handler) AbstractC1483.f5277.getValue()).postDelayed(this, 30000L);
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ */
    public final String mo1273() {
        return f1600;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ */
    public final String mo1274() {
        return f1599;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ */
    public final String mo1275() {
        return f1598;
    }

    @Override // p000.AbstractC2927
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final InterfaceC1433 mo1276() {
        return f1601;
    }
}
