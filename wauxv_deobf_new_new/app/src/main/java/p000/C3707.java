package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᤝᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC3706 f11565;

    public C3707(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f11565 = new C3705(AbstractC0092.m1187(i, interpolator, j));
        } else {
            this.f11565 = new C3703(i, interpolator, j);
        }
    }
}
