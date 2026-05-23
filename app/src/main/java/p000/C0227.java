package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲁᲇᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0227 extends AbstractC3681 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1361;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1362;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ WeakReference f1363;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ C0232 f1364;

    public C0227(C0232 c0232, int i, int i2, WeakReference weakReference) {
        this.f1364 = c0232;
        this.f1361 = i;
        this.f1362 = i2;
        this.f1363 = weakReference;
    }

    @Override // p000.AbstractC3681
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void mo1281(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f1361) != -1) {
            typeface = AbstractC0231.m1288(typeface, i, (this.f1362 & 2) != 0);
        }
        C0232 c0232 = this.f1364;
        if (c0232.f1381) {
            c0232.f1380 = typeface;
            TextView textView = (TextView) this.f1363.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0228(textView, typeface, c0232.f1378));
                } else {
                    textView.setTypeface(typeface, c0232.f1378);
                }
            }
        }
    }

    @Override // p000.AbstractC3681
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final void mo1280(int i) {
    }
}
