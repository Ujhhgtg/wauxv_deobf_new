package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2509feyxiexzfUjhhgtg implements InterfaceC1984Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ImageView f8190Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2302feyxiexzfUjhhgtg f8191Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg f8192Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f8193Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f8194Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public Animatable f8195Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8196Ujhhgtgfeyxiexzf;

    public C2509feyxiexzfUjhhgtg(ImageView imageView, int i) {
        this.f8196Ujhhgtgfeyxiexzf = i;
        this.f8190Ujhhgtgfeyxiexzf = imageView;
        this.f8191Ujhhgtgfeyxiexzf = new C2302feyxiexzfUjhhgtg(imageView);
    }

    public final String toString() {
        return "Target for: " + this.f8190Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo3331Ujhhgtgfeyxiexzf(C1046feyxiexzfUjhhgtg c1046feyxiexzfUjhhgtg) {
        this.f8191Ujhhgtgfeyxiexzf.f7536Ujhhgtgfeyxiexzf.remove(c1046feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo3332Ujhhgtgfeyxiexzf(C1046feyxiexzfUjhhgtg c1046feyxiexzfUjhhgtg) throws Throwable {
        C2302feyxiexzfUjhhgtg c2302feyxiexzfUjhhgtg = this.f8191Ujhhgtgfeyxiexzf;
        ArrayList arrayList = c2302feyxiexzfUjhhgtg.f7536Ujhhgtgfeyxiexzf;
        ImageView imageView = c2302feyxiexzfUjhhgtg.f7535Ujhhgtgfeyxiexzf;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iM3508Ujhhgtgfeyxiexzf = c2302feyxiexzfUjhhgtg.m3508Ujhhgtgfeyxiexzf(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int iM3508Ujhhgtgfeyxiexzf2 = c2302feyxiexzfUjhhgtg.m3508Ujhhgtgfeyxiexzf(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM3508Ujhhgtgfeyxiexzf > 0 || iM3508Ujhhgtgfeyxiexzf == Integer.MIN_VALUE) && (iM3508Ujhhgtgfeyxiexzf2 > 0 || iM3508Ujhhgtgfeyxiexzf2 == Integer.MIN_VALUE)) {
            c1046feyxiexzfUjhhgtg.m2547Ujhhgtgfeyxiexzf(iM3508Ujhhgtgfeyxiexzf, iM3508Ujhhgtgfeyxiexzf2);
            return;
        }
        if (!arrayList.contains(c1046feyxiexzfUjhhgtg)) {
            arrayList.add(c1046feyxiexzfUjhhgtg);
        }
        if (c2302feyxiexzfUjhhgtg.f7537Ujhhgtgfeyxiexzf == null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf viewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf = new ViewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf(c2302feyxiexzfUjhhgtg);
            c2302feyxiexzfUjhhgtg.f7537Ujhhgtgfeyxiexzf = viewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3727Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo3333Ujhhgtgfeyxiexzf(InterfaceC0994feyxiexzfUjhhgtg interfaceC0994feyxiexzfUjhhgtg) {
        this.f8190Ujhhgtgfeyxiexzf.setTag(R.id.glide_custom_view_target_tag, interfaceC0994feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo3334Ujhhgtgfeyxiexzf(Object obj) {
        m3788Ujhhgtgfeyxiexzf(obj);
        if (!(obj instanceof Animatable)) {
            this.f8195Ujhhgtgfeyxiexzf = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f8195Ujhhgtgfeyxiexzf = animatable;
        animatable.start();
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo3335Ujhhgtgfeyxiexzf(Drawable drawable) {
        m3788Ujhhgtgfeyxiexzf(null);
        this.f8195Ujhhgtgfeyxiexzf = null;
        this.f8190Ujhhgtgfeyxiexzf.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo1053Ujhhgtgfeyxiexzf() {
        Animatable animatable = this.f8195Ujhhgtgfeyxiexzf;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final void mo3336Ujhhgtgfeyxiexzf(Drawable drawable) {
        ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg = this.f8192Ujhhgtgfeyxiexzf;
        ImageView imageView = this.f8190Ujhhgtgfeyxiexzf;
        if (viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg != null && !this.f8194Ujhhgtgfeyxiexzf) {
            imageView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg);
            this.f8194Ujhhgtgfeyxiexzf = true;
        }
        m3788Ujhhgtgfeyxiexzf(null);
        this.f8195Ujhhgtgfeyxiexzf = null;
        imageView.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final InterfaceC0994feyxiexzfUjhhgtg mo3337Ujhhgtgfeyxiexzf() {
        Object tag = this.f8190Ujhhgtgfeyxiexzf.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC0994feyxiexzfUjhhgtg) {
            return (InterfaceC0994feyxiexzfUjhhgtg) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p000.InterfaceC1984Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo3338Ujhhgtgfeyxiexzf(Drawable drawable) {
        ViewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg;
        C2302feyxiexzfUjhhgtg c2302feyxiexzfUjhhgtg = this.f8191Ujhhgtgfeyxiexzf;
        ViewTreeObserver viewTreeObserver = c2302feyxiexzfUjhhgtg.f7535Ujhhgtgfeyxiexzf.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c2302feyxiexzfUjhhgtg.f7537Ujhhgtgfeyxiexzf);
        }
        c2302feyxiexzfUjhhgtg.f7537Ujhhgtgfeyxiexzf = null;
        c2302feyxiexzfUjhhgtg.f7536Ujhhgtgfeyxiexzf.clear();
        boolean z = this.f8193Ujhhgtgfeyxiexzf;
        ImageView imageView = this.f8190Ujhhgtgfeyxiexzf;
        if (!z && (viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg = this.f8192Ujhhgtgfeyxiexzf) != null && this.f8194Ujhhgtgfeyxiexzf) {
            imageView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2784feyxiexzfUjhhgtg);
            this.f8194Ujhhgtgfeyxiexzf = false;
        }
        Animatable animatable = this.f8195Ujhhgtgfeyxiexzf;
        if (animatable != null) {
            animatable.stop();
        }
        m3788Ujhhgtgfeyxiexzf(null);
        this.f8195Ujhhgtgfeyxiexzf = null;
        imageView.setImageDrawable(drawable);
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final void mo1054Ujhhgtgfeyxiexzf() {
        Animatable animatable = this.f8195Ujhhgtgfeyxiexzf;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m3788Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f8196Ujhhgtgfeyxiexzf) {
            case 0:
                this.f8190Ujhhgtgfeyxiexzf.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f8190Ujhhgtgfeyxiexzf.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p000.InterfaceC0049Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo1052Ujhhgtgfeyxiexzf() {
    }
}
