package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲀᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0156 implements InterfaceC0873 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0873 f1224;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final float f1225;

    public C0156(float f, InterfaceC0873 interfaceC0873) {
        while (interfaceC0873 instanceof C0156) {
            interfaceC0873 = ((C0156) interfaceC0873).f1224;
            f += ((C0156) interfaceC0873).f1225;
        }
        this.f1224 = interfaceC0873;
        this.f1225 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0156)) {
            return false;
        }
        C0156 c0156 = (C0156) obj;
        return this.f1224.equals(c0156.f1224) && this.f1225 == c0156.f1225;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1224, Float.valueOf(this.f1225)});
    }

    @Override // p000.InterfaceC0873
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final float mo1060(RectF rectF) {
        return Math.max(0.0f, this.f1224.mo1060(rectF) + this.f1225);
    }
}
