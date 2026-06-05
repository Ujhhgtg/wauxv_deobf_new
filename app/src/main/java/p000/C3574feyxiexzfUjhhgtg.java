package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱfeyxiexzfᛱᛳ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3574feyxiexzfUjhhgtg implements InterfaceC0901feyxiexzfUjhhgtg, InterfaceC0649Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Drawable f11107Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f11108Ujhhgtgfeyxiexzf;

    public C3574feyxiexzfUjhhgtg(Drawable drawable, int i) {
        this.f11108Ujhhgtgfeyxiexzf = i;
        AbstractC3593Ujhhgtgfeyxiexzf.m5151Ujhhgtgfeyxiexzf(drawable, "Argument must not be null");
        this.f11107Ujhhgtgfeyxiexzf = drawable;
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    public final Object get() {
        Drawable drawable = this.f11107Ujhhgtgfeyxiexzf;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // p000.InterfaceC0649Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public void mo1912Ujhhgtgfeyxiexzf() {
        switch (this.f11108Ujhhgtgfeyxiexzf) {
            case 0:
                ((C3580feyxiexzfUjhhgtg) ((C3571feyxiexzfUjhhgtg) this.f11107Ujhhgtgfeyxiexzf).f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf).f11136Ujhhgtgfeyxiexzf.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f11107Ujhhgtgfeyxiexzf;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C3571feyxiexzfUjhhgtg) {
                    ((C3580feyxiexzfUjhhgtg) ((C3571feyxiexzfUjhhgtg) drawable).f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf).f11136Ujhhgtgfeyxiexzf.prepareToDraw();
                }
                break;
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1444Ujhhgtgfeyxiexzf() {
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf;
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf2;
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf3;
        switch (this.f11108Ujhhgtgfeyxiexzf) {
            case 0:
                C3571feyxiexzfUjhhgtg c3571feyxiexzfUjhhgtg = (C3571feyxiexzfUjhhgtg) this.f11107Ujhhgtgfeyxiexzf;
                c3571feyxiexzfUjhhgtg.stop();
                c3571feyxiexzfUjhhgtg.f11098Ujhhgtgfeyxiexzf = true;
                C3580feyxiexzfUjhhgtg c3580feyxiexzfUjhhgtg = (C3580feyxiexzfUjhhgtg) c3571feyxiexzfUjhhgtg.f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf;
                ComponentCallbacks2C0894feyxiexzfUjhhgtg componentCallbacks2C0894feyxiexzfUjhhgtg = c3580feyxiexzfUjhhgtg.f11128Ujhhgtgfeyxiexzf;
                c3580feyxiexzfUjhhgtg.f11127Ujhhgtgfeyxiexzf.clear();
                Bitmap bitmap = c3580feyxiexzfUjhhgtg.f11136Ujhhgtgfeyxiexzf;
                if (bitmap != null) {
                    c3580feyxiexzfUjhhgtg.f11129Ujhhgtgfeyxiexzf.mo1472Ujhhgtgfeyxiexzf(bitmap);
                    c3580feyxiexzfUjhhgtg.f11136Ujhhgtgfeyxiexzf = null;
                }
                c3580feyxiexzfUjhhgtg.f11130Ujhhgtgfeyxiexzf = false;
                C3582feyxiexzfUjhhgtg c3582feyxiexzfUjhhgtg = c3580feyxiexzfUjhhgtg.f11133Ujhhgtgfeyxiexzf;
                if (c3582feyxiexzfUjhhgtg != null) {
                    componentCallbacks2C0894feyxiexzfUjhhgtg.m2370Ujhhgtgfeyxiexzf(c3582feyxiexzfUjhhgtg);
                    c3580feyxiexzfUjhhgtg.f11133Ujhhgtgfeyxiexzf = null;
                }
                C3582feyxiexzfUjhhgtg c3582feyxiexzfUjhhgtg2 = c3580feyxiexzfUjhhgtg.f11135Ujhhgtgfeyxiexzf;
                if (c3582feyxiexzfUjhhgtg2 != null) {
                    componentCallbacks2C0894feyxiexzfUjhhgtg.m2370Ujhhgtgfeyxiexzf(c3582feyxiexzfUjhhgtg2);
                    c3580feyxiexzfUjhhgtg.f11135Ujhhgtgfeyxiexzf = null;
                }
                C3582feyxiexzfUjhhgtg c3582feyxiexzfUjhhgtg3 = c3580feyxiexzfUjhhgtg.f11137Ujhhgtgfeyxiexzf;
                if (c3582feyxiexzfUjhhgtg3 != null) {
                    componentCallbacks2C0894feyxiexzfUjhhgtg.m2370Ujhhgtgfeyxiexzf(c3582feyxiexzfUjhhgtg3);
                    c3580feyxiexzfUjhhgtg.f11137Ujhhgtgfeyxiexzf = null;
                }
                C1125feyxiexzfUjhhgtg c1125feyxiexzfUjhhgtg = c3580feyxiexzfUjhhgtg.f11125Ujhhgtgfeyxiexzf;
                C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = c1125feyxiexzfUjhhgtg.f4257Ujhhgtgfeyxiexzf;
                c1125feyxiexzfUjhhgtg.f4266Ujhhgtgfeyxiexzf = null;
                byte[] bArr = c1125feyxiexzfUjhhgtg.f4263Ujhhgtgfeyxiexzf;
                if (bArr != null && (c0271Ujhhgtgfeyxiexzf3 = (C0271Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf) != null) {
                    c0271Ujhhgtgfeyxiexzf3.m1467Ujhhgtgfeyxiexzf(bArr);
                }
                int[] iArr = c1125feyxiexzfUjhhgtg.f4264Ujhhgtgfeyxiexzf;
                if (iArr != null && (c0271Ujhhgtgfeyxiexzf2 = (C0271Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf) != null) {
                    c0271Ujhhgtgfeyxiexzf2.m1467Ujhhgtgfeyxiexzf(iArr);
                }
                Bitmap bitmap2 = c1125feyxiexzfUjhhgtg.f4267Ujhhgtgfeyxiexzf;
                if (bitmap2 != null) {
                    ((InterfaceC2512feyxiexzfUjhhgtg) c2629Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).mo1472Ujhhgtgfeyxiexzf(bitmap2);
                }
                c1125feyxiexzfUjhhgtg.f4267Ujhhgtgfeyxiexzf = null;
                c1125feyxiexzfUjhhgtg.f4258Ujhhgtgfeyxiexzf = null;
                c1125feyxiexzfUjhhgtg.f4273Ujhhgtgfeyxiexzf = null;
                byte[] bArr2 = c1125feyxiexzfUjhhgtg.f4259Ujhhgtgfeyxiexzf;
                if (bArr2 != null && (c0271Ujhhgtgfeyxiexzf = (C0271Ujhhgtgfeyxiexzf) c2629Ujhhgtgfeyxiexzf.f8462Ujhhgtgfeyxiexzf) != null) {
                    c0271Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr2);
                }
                c3580feyxiexzfUjhhgtg.f11134Ujhhgtgfeyxiexzf = true;
                break;
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1445Ujhhgtgfeyxiexzf() {
        switch (this.f11108Ujhhgtgfeyxiexzf) {
            case 0:
                C3580feyxiexzfUjhhgtg c3580feyxiexzfUjhhgtg = (C3580feyxiexzfUjhhgtg) ((C3571feyxiexzfUjhhgtg) this.f11107Ujhhgtgfeyxiexzf).f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf;
                C1125feyxiexzfUjhhgtg c1125feyxiexzfUjhhgtg = c3580feyxiexzfUjhhgtg.f11125Ujhhgtgfeyxiexzf;
                return (c1125feyxiexzfUjhhgtg.f4264Ujhhgtgfeyxiexzf.length * 4) + c1125feyxiexzfUjhhgtg.f4258Ujhhgtgfeyxiexzf.limit() + c1125feyxiexzfUjhhgtg.f4263Ujhhgtgfeyxiexzf.length + c3580feyxiexzfUjhhgtg.f11138Ujhhgtgfeyxiexzf;
            default:
                Drawable drawable = this.f11107Ujhhgtgfeyxiexzf;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // p000.InterfaceC0901feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final Class mo1446Ujhhgtgfeyxiexzf() {
        switch (this.f11108Ujhhgtgfeyxiexzf) {
            case 0:
                return C3571feyxiexzfUjhhgtg.class;
            default:
                return this.f11107Ujhhgtgfeyxiexzf.getClass();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    private final void m5111Ujhhgtgfeyxiexzf() {
    }
}
