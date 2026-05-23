package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤞᛸᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2861 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2873 f9168 = new C2873(C1619.f5491);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final void m4864(InterfaceC1414 interfaceC1414) {
        if (AbstractC2207.m4087(Looper.myLooper(), Looper.getMainLooper())) {
            interfaceC1414.invoke();
        } else {
            ((Handler) f9168.getValue()).post(new RunnableC0563(interfaceC1414));
        }
    }
}
