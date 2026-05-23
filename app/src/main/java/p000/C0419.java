package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0419 implements InterfaceC2571 {

    public final /* synthetic */ int f1963;

    public final Object f1964;

    public final Object f1965;

    public /* synthetic */ C0419(Object obj, int i, Object obj2) {
        this.f1963 = i;
        this.f1964 = obj;
        this.f1965 = obj2;
    }

    @Override // p000.InterfaceC2571
    public final boolean mo1209(Object obj, C2303 c2303) {
        switch (this.f1963) {
            case 0:
                return ((InterfaceC2571) this.f1964).mo1209(obj, c2303);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    @Override // p000.InterfaceC2571
    public final InterfaceC2568 mo1210(Object obj, int i, int i2, C2303 c2303) {
        boolean z;
        C2479 c2479;
        C1237 c1237;
        switch (this.f1963) {
            case 0:
                InterfaceC2568 interfaceC2568Mo1210 = ((InterfaceC2571) this.f1964).mo1210(obj, i, i2, c2303);
                Resources resources = (Resources) this.f1965;
                if (interfaceC2568Mo1210 == null) {
                    return null;
                }
                return new C0425(resources, interfaceC2568Mo1210);
            case 1:
                InterfaceC2568 interfaceC2568M4584 = ((C2573) this.f1964).m4584((Uri) obj, c2303);
                if (interfaceC2568M4584 == null) {
                    return null;
                }
                return AbstractC2205.m4051((InterfaceC0424) this.f1965, (Drawable) ((C1447) interfaceC2568M4584).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C2479) {
                    c2479 = (C2479) inputStream;
                    z = false;
                } else {
                    z = true;
                    c2479 = new C2479(inputStream, (C1867) this.f1965);
                }
                ArrayDeque arrayDeque = C1237.f4468;
                synchronized (arrayDeque) {
                    c1237 = (C1237) arrayDeque.poll();
                    break;
                }
                if (c1237 == null) {
                    c1237 = new C1237();
                }
                C1237 c1238 = c1237;
                c1238.f4469 = c2479;
                C1899 c1899 = new C1899(c1238);
                C2825 c2825 = new C2825(c2479, 0, c1238);
                try {
                    C1098 c1098 = (C1098) this.f1964;
                    C0425 c0425M2669 = c1098.m2669(new C0243(c1899, c1098.f4124, c1098.f4123), i, i2, c2303, c2825);
                    c1238.f4470 = null;
                    c1238.f4469 = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c1238);
                        break;
                    }
                    return c0425M2669;
                } finally {
                    c1238.f4470 = null;
                    c1238.f4469 = null;
                    ArrayDeque arrayDeque2 = C1237.f4468;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c1238);
                        if (z) {
                            c2479.m4432();
                        }
                    }
                }
        }
    }

    public C0419(Resources resources, InterfaceC2571 interfaceC2571) {
        this.f1963 = 0;
        this.f1965 = resources;
        this.f1964 = interfaceC2571;
    }
}
