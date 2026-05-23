package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᤞᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1447 implements InterfaceC2568, InterfaceC1635 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Drawable f5124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5125;

    public C1447(Drawable drawable, int i) {
        this.f5125 = i;
        AbstractC1460.m3210(drawable, "Argument must not be null");
        this.f5124 = drawable;
    }

    @Override // p000.InterfaceC2568
    public final Object get() {
        Drawable drawable = this.f5124;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // p000.InterfaceC1635
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo1629() {
        switch (this.f5125) {
            case 0:
                ((C1453) ((C1446) this.f5124).f5114.f1179).f5158.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f5124;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C1446) {
                    ((C1453) ((C1446) drawable).f5114.f1179).f5158.prepareToDraw();
                }
                break;
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1206() {
        C1867 c1867;
        C1867 c1868;
        C1867 c1869;
        switch (this.f5125) {
            case 0:
                C1446 c1446 = (C1446) this.f5124;
                c1446.stop();
                c1446.f5117 = true;
                C1453 c1453 = (C1453) c1446.f5114.f1179;
                ComponentCallbacks2C2563 componentCallbacks2C2563 = c1453.f5150;
                c1453.f5149.clear();
                Bitmap bitmap = c1453.f5158;
                if (bitmap != null) {
                    c1453.f5151.mo1504(bitmap);
                    c1453.f5158 = null;
                }
                c1453.f5152 = false;
                C1450 c1450 = c1453.f5155;
                if (c1450 != null) {
                    componentCallbacks2C2563.m4575(c1450);
                    c1453.f5155 = null;
                }
                C1450 c1451 = c1453.f5157;
                if (c1451 != null) {
                    componentCallbacks2C2563.m4575(c1451);
                    c1453.f5157 = null;
                }
                C1450 c1452 = c1453.f5159;
                if (c1452 != null) {
                    componentCallbacks2C2563.m4575(c1452);
                    c1453.f5159 = null;
                }
                C2807 c2807 = c1453.f5147;
                C0542 c0542 = c2807.f8961;
                c2807.f8970 = null;
                byte[] bArr = c2807.f8967;
                if (bArr != null && (c1869 = (C1867) c0542.f2253) != null) {
                    c1869.m3645(bArr);
                }
                int[] iArr = c2807.f8968;
                if (iArr != null && (c1868 = (C1867) c0542.f2253) != null) {
                    c1868.m3645(iArr);
                }
                Bitmap bitmap2 = c2807.f8971;
                if (bitmap2 != null) {
                    ((InterfaceC0424) c0542.f2252).mo1504(bitmap2);
                }
                c2807.f8971 = null;
                c2807.f8962 = null;
                c2807.f8977 = null;
                byte[] bArr2 = c2807.f8963;
                if (bArr2 != null && (c1867 = (C1867) c0542.f2253) != null) {
                    c1867.m3645(bArr2);
                }
                c1453.f5156 = true;
                break;
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1207() {
        switch (this.f5125) {
            case 0:
                C1453 c1453 = (C1453) ((C1446) this.f5124).f5114.f1179;
                C2807 c2807 = c1453.f5147;
                return (c2807.f8968.length * 4) + c2807.f8962.limit() + c2807.f8967.length + c1453.f5160;
            default:
                Drawable drawable = this.f5124;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final Class mo1208() {
        switch (this.f5125) {
            case 0:
                return C1446.class;
            default:
                return this.f5124.getClass();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    private final void m3144() {
    }
}
