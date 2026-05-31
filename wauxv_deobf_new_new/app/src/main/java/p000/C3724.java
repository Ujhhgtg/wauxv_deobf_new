package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲀᲈᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3724 extends C3722 {
    public C3724(C3729 c3729, WindowInsets windowInsets) {
        super(c3729, windowInsets);
    }

    @Override // p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public List<Rect> mo5269(int i) {
        return this.f11582.getBoundingRects(AbstractC3728.m5303(i));
    }

    @Override // p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public List<Rect> mo5270(int i) {
        return this.f11582.getBoundingRectsIgnoringVisibility(AbstractC3728.m5303(i));
    }

    @Override // p000.AbstractC3716, p000.C3725
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public void mo5274() {
    }
}
