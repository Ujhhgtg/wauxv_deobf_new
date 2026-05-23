package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲇᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0423 implements InterfaceC2894 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ImageView f1973;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3591 f1974;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public ViewOnAttachStateChangeListenerC0569 f1975;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f1976;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public boolean f1977;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public Animatable f1978;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1979;

    public C0423(ImageView imageView, int i) {
        this.f1979 = i;
        this.f1973 = imageView;
        this.f1974 = new C3591(imageView);
    }

    public final String toString() {
        return "Target for: " + this.f1973;
    }

    @Override // p000.InterfaceC2894
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1616(C2708 c2708) {
        this.f1974.f11226.remove(c2708);
    }

    @Override // p000.InterfaceC2894
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1617(C2708 c2708) throws Throwable {
        C3591 c3591 = this.f1974;
        ArrayList arrayList = c3591.f11226;
        ImageView imageView = c3591.f11225;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iM5203 = c3591.m5203(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int iM5204 = c3591.m5203(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM5203 > 0 || iM5203 == Integer.MIN_VALUE) && (iM5204 > 0 || iM5204 == Integer.MIN_VALUE)) {
            c2708.m4717(iM5203, iM5204);
            return;
        }
        if (!arrayList.contains(c2708)) {
            arrayList.add(c2708);
        }
        if (c3591.f11227 == null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC0865 viewTreeObserverOnPreDrawListenerC0865 = new ViewTreeObserverOnPreDrawListenerC0865(c3591);
            c3591.f11227 = viewTreeObserverOnPreDrawListenerC0865;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0865);
        }
    }

    @Override // p000.InterfaceC2894
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void mo1618(InterfaceC2554 interfaceC2554) {
        this.f1973.setTag(R.id.glide_custom_view_target_tag, interfaceC2554);
    }

    @Override // p000.InterfaceC2894
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo1619(Object obj) {
        m1627(obj);
        if (!(obj instanceof Animatable)) {
            this.f1978 = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f1978 = animatable;
        animatable.start();
    }

    @Override // p000.InterfaceC2894
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo1621(Drawable drawable) {
        m1627(null);
        this.f1978 = null;
        this.f1973.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void mo1622() {
        Animatable animatable = this.f1978;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p000.InterfaceC2894
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final void mo1623(Drawable drawable) {
        ViewOnAttachStateChangeListenerC0569 viewOnAttachStateChangeListenerC0569 = this.f1975;
        ImageView imageView = this.f1973;
        if (viewOnAttachStateChangeListenerC0569 != null && !this.f1977) {
            imageView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0569);
            this.f1977 = true;
        }
        m1627(null);
        this.f1978 = null;
        imageView.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC2894
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final InterfaceC2554 mo1624() {
        Object tag = this.f1973.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC2554) {
            return (InterfaceC2554) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p000.InterfaceC2894
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void mo1625(Drawable drawable) {
        ViewOnAttachStateChangeListenerC0569 viewOnAttachStateChangeListenerC0569;
        C3591 c3591 = this.f1974;
        ViewTreeObserver viewTreeObserver = c3591.f11225.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c3591.f11227);
        }
        c3591.f11227 = null;
        c3591.f11226.clear();
        boolean z = this.f1976;
        ImageView imageView = this.f1973;
        if (!z && (viewOnAttachStateChangeListenerC0569 = this.f1975) != null && this.f1977) {
            imageView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0569);
            this.f1977 = false;
        }
        Animatable animatable = this.f1978;
        if (animatable != null) {
            animatable.stop();
        }
        m1627(null);
        this.f1978 = null;
        imageView.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo1626() {
        Animatable animatable = this.f1978;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m1627(Object obj) {
        switch (this.f1979) {
            case 0:
                this.f1973.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f1973.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p000.InterfaceC1775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo1620() {
    }
}
