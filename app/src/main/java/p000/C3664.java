package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3664 extends C3662 {
    public C3664(C3669 c3669, WindowInsets windowInsets) {
        super(c3669, windowInsets);
    }

    @Override // p000.AbstractC3656, p000.C3665
    public List<Rect> mo5263(int i) {
        return this.f11433.getBoundingRects(AbstractC3668.m5297(i));
    }

    @Override // p000.AbstractC3656, p000.C3665
    public List<Rect> mo5264(int i) {
        return this.f11433.getBoundingRectsIgnoringVisibility(AbstractC3668.m5297(i));
    }

    @Override // p000.AbstractC3656, p000.C3665
    public void mo5268() {
    }
}
