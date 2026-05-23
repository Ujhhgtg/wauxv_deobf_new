package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲇᲀᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0692 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2579;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2580;

    public /* synthetic */ C0692(int i, Object obj) {
        this.f2579 = i;
        this.f2580 = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f2579) {
            case 0:
                C0695 c0695 = ((Chip) this.f2580).f685;
                if (c0695 == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c0695.getOutline(outline);
                }
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C1961) this.f2580).f6495.f6507);
                break;
        }
    }
}
