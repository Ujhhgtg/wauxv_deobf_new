package p000;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤝᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2701 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2700 f8697;

    public C2701(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f8697 = new C2699(nestedScrollView);
        } else {
            this.f8697 = new C2135(13);
        }
    }
}
