package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1368 implements Comparator {

    public final Rect f4929 = new Rect();

    public final Rect f4930 = new Rect();

    public final boolean f4931;

    public final C1227 f4932;

    public C1368(boolean z, C1227 c1227) {
        this.f4931 = z;
        this.f4932 = c1227;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        
        Rect rect = this.f4929;
        ((C0092) obj).m1092(rect);
        Rect rect2 = this.f4930;
        ((C0092) obj2).m1092(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f4931;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
