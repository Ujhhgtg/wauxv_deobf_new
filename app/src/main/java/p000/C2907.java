package p000;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᛸᤞᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2907 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public float f9351;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f9352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final WeakReference f9354;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C2904 f9355;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final TextPaint f9349 = new TextPaint(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0691 f9350 = new C0691(1, this);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f9353 = true;

    public C2907(InterfaceC2906 interfaceC2906) {
        this.f9354 = new WeakReference(null);
        this.f9354 = new WeakReference(interfaceC2906);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final float m4913(String str) {
        if (!this.f9353) {
            return this.f9351;
        }
        m4914(str);
        return this.f9351;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4914(String str) {
        TextPaint textPaint = this.f9349;
        this.f9351 = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f9352 = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f9353 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4915(C2904 c2904, Context context) {
        if (this.f9355 != c2904) {
            this.f9355 = c2904;
            if (c2904 != null) {
                TextPaint textPaint = this.f9349;
                C0691 c0691 = this.f9350;
                c2904.m4911(context, textPaint, c0691);
                InterfaceC2906 interfaceC2906 = (InterfaceC2906) this.f9354.get();
                if (interfaceC2906 != null) {
                    textPaint.drawableState = interfaceC2906.getState();
                }
                c2904.m4910(context, textPaint, c0691);
                this.f9353 = true;
            }
            InterfaceC2906 interfaceC2907 = (InterfaceC2906) this.f9354.get();
            if (interfaceC2907 != null) {
                interfaceC2907.mo1475();
                interfaceC2907.onStateChange(interfaceC2907.getState());
            }
        }
    }
}
