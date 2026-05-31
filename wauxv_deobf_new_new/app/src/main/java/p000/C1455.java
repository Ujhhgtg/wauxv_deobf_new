package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᤞᲀᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1455 implements InterfaceC2624, InterfaceC1648 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Drawable f5153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5154;

    public C1455(Drawable drawable, int i) {
        this.f5154 = i;
        AbstractC2727.m4693(drawable, "Argument must not be null");
        this.f5153 = drawable;
    }

    @Override // p000.InterfaceC2624
    public final Object get() {
        Drawable drawable = this.f5153;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1735() {
        switch (this.f5154) {
            case 0:
                ((C1461) ((C1454) this.f5153).f5143.f1247).f5187.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f5153;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C1454) {
                    ((C1461) ((C1454) drawable).f5143.f1247).f5187.prepareToDraw();
                }
                break;
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1352() {
        C1893 c1893;
        C1893 c1894;
        C1893 c1895;
        switch (this.f5154) {
            case 0:
                C1454 c1454 = (C1454) this.f5153;
                c1454.stop();
                c1454.f5146 = true;
                C1461 c1461 = (C1461) c1454.f5143.f1247;
                ComponentCallbacks2C2619 componentCallbacks2C2619 = c1461.f5179;
                c1461.f5178.clear();
                Bitmap bitmap = c1461.f5187;
                if (bitmap != null) {
                    c1461.f5180.mo1609(bitmap);
                    c1461.f5187 = null;
                }
                c1461.f5181 = false;
                C1458 c1458 = c1461.f5184;
                if (c1458 != null) {
                    componentCallbacks2C2619.m4597(c1458);
                    c1461.f5184 = null;
                }
                C1458 c1459 = c1461.f5186;
                if (c1459 != null) {
                    componentCallbacks2C2619.m4597(c1459);
                    c1461.f5186 = null;
                }
                C1458 c14510 = c1461.f5188;
                if (c14510 != null) {
                    componentCallbacks2C2619.m4597(c14510);
                    c1461.f5188 = null;
                }
                C2866 c2866 = c1461.f5176;
                C0519 c0519 = c2866.f9122;
                c2866.f9131 = null;
                byte[] bArr = c2866.f9128;
                if (bArr != null && (c1895 = (C1893) c0519.f2209) != null) {
                    c1895.m3823(bArr);
                }
                int[] iArr = c2866.f9129;
                if (iArr != null && (c1894 = (C1893) c0519.f2209) != null) {
                    c1894.m3823(iArr);
                }
                Bitmap bitmap2 = c2866.f9132;
                if (bitmap2 != null) {
                    ((InterfaceC0399) c0519.f2208).mo1609(bitmap2);
                }
                c2866.f9132 = null;
                c2866.f9123 = null;
                c2866.f9138 = null;
                byte[] bArr2 = c2866.f9124;
                if (bArr2 != null && (c1893 = (C1893) c0519.f2209) != null) {
                    c1893.m3823(bArr2);
                }
                c1461.f5185 = true;
                break;
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1353() {
        switch (this.f5154) {
            case 0:
                C1461 c1461 = (C1461) ((C1454) this.f5153).f5143.f1247;
                C2866 c2866 = c1461.f5176;
                return (c2866.f9129.length * 4) + c2866.f9123.limit() + c2866.f9128.length + c1461.f5189;
            default:
                Drawable drawable = this.f5153;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final Class mo1354() {
        switch (this.f5154) {
            case 0:
                return C1454.class;
            default:
                return this.f5153.getClass();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    private final void m3251() {
    }
}
