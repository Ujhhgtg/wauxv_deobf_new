package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᤝᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0683 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2577;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2578;

    public /* synthetic */ C0683(Object obj, int i) {
        this.f2577 = i;
        this.f2578 = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f2577) {
            case 0:
                C0686 c0686 = ((Chip) this.f2578).f744;
                if (c0686 == null) {
                    outline.setAlpha(0.0f);
                } else {
                    c0686.getOutline(outline);
                }
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((C1992) this.f2578).f6600.f6612);
                break;
        }
    }
}
