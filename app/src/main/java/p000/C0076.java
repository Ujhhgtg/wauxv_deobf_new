package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0076 extends ClickableSpan {

    public final int f1019;

    public final C0092 f1020;

    public final int f1021;

    public C0076(int i, C0092 c0092, int i2) {
        this.f1019 = i;
        this.f1020 = c0092;
        this.f1021 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1019);
        this.f1020.f1045.performAction(this.f1021, bundle);
    }
}
