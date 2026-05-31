package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᤝᤞᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2921 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2933 f9338 = new C2933(C1631.f5524);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final void m4925(InterfaceC1422 interfaceC1422) {
        if (AbstractC1469.m3322(Looper.myLooper(), Looper.getMainLooper())) {
            interfaceC1422.invoke();
        } else {
            ((Handler) f9338.getValue()).post(new RunnableC0541(interfaceC1422));
        }
    }
}
