package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0020;
import java.security.MessageDigest;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1448 implements InterfaceC3427 {

    public final InterfaceC3427 f5126;

    public C1448(InterfaceC3427 interfaceC3427) {
        AbstractC1460.m3210(interfaceC3427, "Argument must not be null");
        this.f5126 = interfaceC3427;
    }

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        if (obj instanceof C1448) {
            return this.f5126.equals(((C1448) obj).f5126);
        }
        return false;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        return this.f5126.hashCode();
    }

    @Override // p000.InterfaceC3427
    public final InterfaceC2568 mo1630(Context context, InterfaceC2568 interfaceC2568, int i, int i2) {
        C1446 c1446 = (C1446) interfaceC2568.get();
        InterfaceC2568 c0425 = new C0425(ComponentCallbacks2C0020.m614(context).f537, ((C1453) c1446.f5114.f1179).f5158);
        InterfaceC3427 interfaceC3427 = this.f5126;
        InterfaceC2568 interfaceC2568Mo1630 = interfaceC3427.mo1630(context, c0425, i, i2);
        if (!c0425.equals(interfaceC2568Mo1630)) {
            c0425.mo1206();
        }
        ((C1453) c1446.f5114.f1179).m3147(interfaceC3427, (Bitmap) interfaceC2568Mo1630.get());
        return interfaceC2568;
    }

    @Override // p000.InterfaceC1749
    public final void mo2001(MessageDigest messageDigest) {
        this.f5126.mo2001(messageDigest);
    }
}
