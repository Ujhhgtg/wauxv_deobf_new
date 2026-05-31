package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲇᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0237 extends AbstractC1469 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1435;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1436;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ WeakReference f1437;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0242 f1438;

    public C0237(C0242 c0242, int i, int i2, WeakReference weakReference) {
        this.f1438 = c0242;
        this.f1435 = i;
        this.f1436 = i2;
        this.f1437 = weakReference;
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final void mo1427(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f1435) != -1) {
            typeface = AbstractC0241.m1434(typeface, i, (this.f1436 & 2) != 0);
        }
        C0242 c0242 = this.f1438;
        if (c0242.f1455) {
            c0242.f1454 = typeface;
            TextView textView = (TextView) this.f1437.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0238(textView, typeface, c0242.f1452));
                } else {
                    textView.setTypeface(typeface, c0242.f1452);
                }
            }
        }
    }

    @Override // p000.AbstractC1469
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void mo1426(int i) {
    }
}
