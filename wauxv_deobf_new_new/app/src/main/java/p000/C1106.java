package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0027;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᲈᤞᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1106 implements InterfaceC3484 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC3484 f4137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f4138;

    public C1106(InterfaceC3484 interfaceC3484, boolean z) {
        this.f4137 = interfaceC3484;
        this.f4138 = z;
    }

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        if (obj instanceof C1106) {
            return this.f4137.equals(((C1106) obj).f4137);
        }
        return false;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        return this.f4137.hashCode();
    }

    @Override // p000.InterfaceC3484
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2624 mo1736(Context context, InterfaceC2624 interfaceC2624, int i, int i2) {
        InterfaceC0399 interfaceC0399 = ComponentCallbacks2C0027.m757(context).f589;
        Drawable drawable = (Drawable) interfaceC2624.get();
        C0400 c0400M4226 = AbstractC2236.m4226(interfaceC0399, drawable, i, i2);
        if (c0400M4226 != null) {
            InterfaceC2624 interfaceC2624Mo1736 = this.f4137.mo1736(context, c0400M4226, i, i2);
            if (!interfaceC2624Mo1736.equals(c0400M4226)) {
                return new C0400(context.getResources(), interfaceC2624Mo1736);
            }
            interfaceC2624Mo1736.mo1352();
            return interfaceC2624;
        }
        if (!this.f4138) {
            return interfaceC2624;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        this.f4137.mo2098(messageDigest);
    }
}
