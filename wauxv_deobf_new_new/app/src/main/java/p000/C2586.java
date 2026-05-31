package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2586 implements InterfaceC0873 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final float f8221;

    public C2586(float f) {
        this.f8221 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2586) && this.f8221 == ((C2586) obj).f8221;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8221)});
    }

    @Override // p000.InterfaceC0873
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final float mo1060(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f8221;
    }
}
