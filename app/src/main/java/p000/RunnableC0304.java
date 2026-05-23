package p000;

import android.os.Handler;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0304 extends AbstractC2867 implements Runnable {

    public static final RunnableC0304 f1522;

    public static final String f1523;

    public static final String f1524;

    public static final String f1525;

    public static final C0199 f1526;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1522 = new RunnableC0304("AutoCleanHook");
        f1523 = "杂项";
        f1524 = "自动瘦身";
        f1525 = "致敬瘦身模块 'KitsunePie-QQCleaner' ";
        f1526 = new C0199(21);
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0302 c0302 = C0302.f1520;
        if (jCurrentTimeMillis - c0302.m2539() > C0301.f1519.m2539() * 1000) {
            c0302.m2546(System.currentTimeMillis());
            C1002 c1002 = AbstractC1075.f3893;
            ExecutorC0990 executorC0990 = ExecutorC0990.f3609;
            C0303 c0303 = new C0303(2, null, 0);
            InterfaceC0877 interfaceC0877M4992 = AbstractC3453.m4992(C1187.f4327, executorC0990, true);
            C1002 c1003 = AbstractC1075.f3893;
            if (interfaceC0877M4992 != c1003 && interfaceC0877M4992.mo942(C1133.f4202) == null) {
                interfaceC0877M4992 = interfaceC0877M4992.mo941(c1003);
            }
            AbstractC0057 c1004 = new C1004(interfaceC0877M4992, true, 1);
            c1004.m938(1, c1004, c0303);
        }
        ((Handler) AbstractC1472.f5245.getValue()).postDelayed(this, 600000L);
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        ((Handler) AbstractC1472.f5245.getValue()).postDelayed(this, 30000L);
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1525;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1524;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1523;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f1526;
    }
}
