package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᲀᤞᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3647 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC3646 f11416;

    public C3647(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f11416 = new C3645(AbstractC0084.m1042(i, interpolator, j));
        } else {
            this.f11416 = new C3643(i, interpolator, j);
        }
    }
}
