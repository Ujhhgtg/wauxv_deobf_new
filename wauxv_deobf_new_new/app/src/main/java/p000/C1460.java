package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1460 implements Handler.Callback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f5174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f5175;

    public /* synthetic */ C1460(Object obj, int i) {
        this.f5174 = i;
        this.f5175 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f5174) {
            case 0:
                C1461 c1461 = (C1461) this.f5175;
                int i = message.what;
                if (i == 1) {
                    c1461.m3253((C1458) message.obj);
                    return true;
                }
                if (i == 2) {
                    c1461.f5179.m4597((C1458) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                C0099 c0099 = (C0099) this.f5175;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (c0099.f1112) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
