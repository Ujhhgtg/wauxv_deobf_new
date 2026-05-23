package p000;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1948 implements PopupWindow.OnDismissListener {

    public final /* synthetic */ C1949 f6456;

    public C1948(C1949 c1949) {
        this.f6456 = c1949;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f6456.mo1135();
    }
}
