package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0398 implements InterfaceC2953 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ImageView f1945;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3651 f1946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ViewOnAttachStateChangeListenerC0546 f1947;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f1948;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f1949;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Animatable f1950;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1951;

    public C0398(ImageView imageView, int i) {
        this.f1951 = i;
        this.f1945 = imageView;
        this.f1946 = new C3651(imageView);
    }

    public final String toString() {
        return "Target for: " + this.f1945;
    }

    @Override // p000.InterfaceC2953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1722(C2769 c2769) {
        this.f1946.f11375.remove(c2769);
    }

    @Override // p000.InterfaceC2953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1723(C2769 c2769) throws Throwable {
        C3651 c3651 = this.f1946;
        ArrayList arrayList = c3651.f11375;
        ImageView imageView = c3651.f11374;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iM5209 = c3651.m5209(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int iM52010 = c3651.m5209(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM5209 > 0 || iM5209 == Integer.MIN_VALUE) && (iM52010 > 0 || iM52010 == Integer.MIN_VALUE)) {
            c2769.m4751(iM5209, iM52010);
            return;
        }
        if (!arrayList.contains(c2769)) {
            arrayList.add(c2769);
        }
        if (c3651.f11376 == null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC0864 viewTreeObserverOnPreDrawListenerC0864 = new ViewTreeObserverOnPreDrawListenerC0864(c3651);
            c3651.f11376 = viewTreeObserverOnPreDrawListenerC0864;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0864);
        }
    }

    @Override // p000.InterfaceC2953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1724(InterfaceC2610 interfaceC2610) {
        this.f1945.setTag(R.id.glide_custom_view_target_tag, interfaceC2610);
    }

    @Override // p000.InterfaceC2953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo1725(Object obj) {
        m1733(obj);
        if (!(obj instanceof Animatable)) {
            this.f1950 = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f1950 = animatable;
        animatable.start();
    }

    @Override // p000.InterfaceC2953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1727(Drawable drawable) {
        m1733(null);
        this.f1950 = null;
        this.f1945.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void mo1728() {
        Animatable animatable = this.f1950;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p000.InterfaceC2953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void mo1729(Drawable drawable) {
        ViewOnAttachStateChangeListenerC0546 viewOnAttachStateChangeListenerC0546 = this.f1947;
        ImageView imageView = this.f1945;
        if (viewOnAttachStateChangeListenerC0546 != null && !this.f1949) {
            imageView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0546);
            this.f1949 = true;
        }
        m1733(null);
        this.f1950 = null;
        imageView.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC2953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final InterfaceC2610 mo1730() {
        Object tag = this.f1945.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC2610) {
            return (InterfaceC2610) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p000.InterfaceC2953
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void mo1731(Drawable drawable) {
        ViewOnAttachStateChangeListenerC0546 viewOnAttachStateChangeListenerC0546;
        C3651 c3651 = this.f1946;
        ViewTreeObserver viewTreeObserver = c3651.f11374.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c3651.f11376);
        }
        c3651.f11376 = null;
        c3651.f11375.clear();
        boolean z = this.f1948;
        ImageView imageView = this.f1945;
        if (!z && (viewOnAttachStateChangeListenerC0546 = this.f1947) != null && this.f1949) {
            imageView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0546);
            this.f1949 = false;
        }
        Animatable animatable = this.f1950;
        if (animatable != null) {
            animatable.stop();
        }
        m1733(null);
        this.f1950 = null;
        imageView.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo1732() {
        Animatable animatable = this.f1950;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m1733(Object obj) {
        switch (this.f1951) {
            case 0:
                this.f1945.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f1945.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p000.InterfaceC1798
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo1726() {
    }
}
