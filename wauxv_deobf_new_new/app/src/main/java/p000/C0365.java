package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0365 implements Handler.Callback {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1839;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1839) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                if (i != 1) {
                    return false;
                }
                message.obj.getClass();
                throw new ClassCastException();
            default:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC2624) message.obj).mo1352();
                return true;
        }
    }
}
