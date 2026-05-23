package p000;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2638 implements InterfaceC2639 {

    public final ScrollFeedbackProvider f8531;

    public C2638(NestedScrollView nestedScrollView) {
        this.f8531 = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p000.InterfaceC2639
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f8531.onScrollLimit(i, i2, i3, z);
    }

    @Override // p000.InterfaceC2639
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f8531.onScrollProgress(i, i2, i3, i4);
    }
}
