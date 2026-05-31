package p000;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤝᲁᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2699 implements InterfaceC2700 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ScrollFeedbackProvider f8696;

    public C2699(NestedScrollView nestedScrollView) {
        this.f8696 = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p000.InterfaceC2700
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f8696.onScrollLimit(i, i2, i3, z);
    }

    @Override // p000.InterfaceC2700
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f8696.onScrollProgress(i, i2, i3, i4);
    }
}
