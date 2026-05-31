package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤝᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0394 implements InterfaceC2627 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1935;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f1936;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f1937;

    public /* synthetic */ C0394(Object obj, int i, Object obj2) {
        this.f1935 = i;
        this.f1936 = obj;
        this.f1937 = obj2;
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final boolean mo1355(Object obj, C2336 c2336) {
        switch (this.f1935) {
            case 0:
                return ((InterfaceC2627) this.f1936).mo1355(obj, c2336);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC2624 mo1356(Object obj, int i, int i2, C2336 c2336) {
        boolean z;
        C2534 c2534;
        C1239 c1239;
        switch (this.f1935) {
            case 0:
                InterfaceC2624 interfaceC2624Mo1356 = ((InterfaceC2627) this.f1936).mo1356(obj, i, i2, c2336);
                Resources resources = (Resources) this.f1937;
                if (interfaceC2624Mo1356 == null) {
                    return null;
                }
                return new C0400(resources, interfaceC2624Mo1356);
            case 1:
                InterfaceC2624 interfaceC2624M4606 = ((C2629) this.f1936).m4606((Uri) obj, c2336);
                if (interfaceC2624M4606 == null) {
                    return null;
                }
                return AbstractC2236.m4226((InterfaceC0399) this.f1937, (Drawable) ((C1455) interfaceC2624M4606).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C2534) {
                    c2534 = (C2534) inputStream;
                    z = false;
                } else {
                    z = true;
                    c2534 = new C2534(inputStream, (C1893) this.f1937);
                }
                ArrayDeque arrayDeque = C1239.f4467;
                synchronized (arrayDeque) {
                    c1239 = (C1239) arrayDeque.poll();
                    break;
                }
                if (c1239 == null) {
                    c1239 = new C1239();
                }
                C1239 c12310 = c1239;
                c12310.f4468 = c2534;
                C1925 c1925 = new C1925(c12310);
                C2885 c2885 = new C2885(c2534, 0, c12310);
                try {
                    C1104 c1104 = (C1104) this.f1936;
                    C0400 c0400M2818 = c1104.m2818(new C0253(c1925, c1104.f4135, c1104.f4134), i, i2, c2336, c2885);
                    c12310.f4469 = null;
                    c12310.f4468 = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c12310);
                        break;
                    }
                    return c0400M2818;
                } finally {
                    c12310.f4469 = null;
                    c12310.f4468 = null;
                    ArrayDeque arrayDeque2 = C1239.f4467;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c12310);
                        if (z) {
                            c2534.m4453();
                        }
                    }
                }
        }
    }

    public C0394(Resources resources, InterfaceC2627 interfaceC2627) {
        this.f1935 = 0;
        this.f1937 = resources;
        this.f1936 = interfaceC2627;
    }
}
