package p000;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤞᲀᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2966 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public float f9518;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f9519;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final WeakReference f9521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2963 f9522;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TextPaint f9516 = new TextPaint(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0682 f9517 = new C0682(this, 1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f9520 = true;

    public C2966(InterfaceC2965 interfaceC2965) {
        this.f9521 = new WeakReference(null);
        this.f9521 = new WeakReference(interfaceC2965);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final float m4975(String str) {
        if (!this.f9520) {
            return this.f9518;
        }
        m4976(str);
        return this.f9518;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4976(String str) {
        TextPaint textPaint = this.f9516;
        this.f9518 = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f9519 = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f9520 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4977(C2963 c2963, Context context) {
        if (this.f9522 != c2963) {
            this.f9522 = c2963;
            if (c2963 != null) {
                TextPaint textPaint = this.f9516;
                C0682 c0682 = this.f9517;
                c2963.m4973(context, textPaint, c0682);
                InterfaceC2965 interfaceC2965 = (InterfaceC2965) this.f9521.get();
                if (interfaceC2965 != null) {
                    textPaint.drawableState = interfaceC2965.getState();
                }
                c2963.m4972(context, textPaint, c0682);
                this.f9520 = true;
            }
            InterfaceC2965 interfaceC2966 = (InterfaceC2965) this.f9521.get();
            if (interfaceC2966 != null) {
                interfaceC2966.mo1580();
                interfaceC2966.onStateChange(interfaceC2966.getState());
            }
        }
    }
}
