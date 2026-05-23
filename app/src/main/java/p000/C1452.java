package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1452 implements Handler.Callback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5145;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f5146;

    public /* synthetic */ C1452(int i, Object obj) {
        this.f5145 = i;
        this.f5146 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f5145) {
            case 0:
                C1453 c1453 = (C1453) this.f5146;
                int i = message.what;
                if (i == 1) {
                    c1453.m3146((C1450) message.obj);
                    return true;
                }
                if (i == 2) {
                    c1453.f5150.m4575((C1450) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                C0091 c0091 = (C0091) this.f5146;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (c0091.f1044) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
