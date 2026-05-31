package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0027;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᤞᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1456 implements InterfaceC3484 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC3484 f5155;

    public C1456(InterfaceC3484 interfaceC3484) {
        AbstractC2727.m4693(interfaceC3484, "Argument must not be null");
        this.f5155 = interfaceC3484;
    }

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        if (obj instanceof C1456) {
            return this.f5155.equals(((C1456) obj).f5155);
        }
        return false;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return this.f5155.hashCode();
    }

    @Override // p000.InterfaceC3484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2624 mo1736(Context context, InterfaceC2624 interfaceC2624, int i, int i2) {
        C1454 c1454 = (C1454) interfaceC2624.get();
        InterfaceC2624 c0400 = new C0400(ComponentCallbacks2C0027.m757(context).f589, ((C1461) c1454.f5143.f1247).f5187);
        InterfaceC3484 interfaceC3484 = this.f5155;
        InterfaceC2624 interfaceC2624Mo1736 = interfaceC3484.mo1736(context, c0400, i, i2);
        if (!c0400.equals(interfaceC2624Mo1736)) {
            c0400.mo1352();
        }
        ((C1461) c1454.f5143.f1247).m3254(interfaceC3484, (Bitmap) interfaceC2624Mo1736.get());
        return interfaceC2624;
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        this.f5155.mo2098(messageDigest);
    }
}
