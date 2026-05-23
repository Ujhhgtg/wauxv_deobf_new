package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᲈᤞᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0425 implements InterfaceC2568, InterfaceC1635 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1980 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1981;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f1982;

    public C0425(InterfaceC0424 interfaceC0424, Bitmap bitmap) {
        AbstractC1460.m3210(bitmap, "Bitmap must not be null");
        this.f1981 = bitmap;
        AbstractC1460.m3210(interfaceC0424, "BitmapPool must not be null");
        this.f1982 = interfaceC0424;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C0425 m1628(InterfaceC0424 interfaceC0424, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0425(interfaceC0424, bitmap);
    }

    @Override // p000.InterfaceC2568
    public final Object get() {
        switch (1) {
            case 0:
                return (Bitmap) this.f1981;
            default:
                return new BitmapDrawable((Resources) this.f1981, (Bitmap) ((InterfaceC2568) this.f1982).get());
        }
    }

    @Override // p000.InterfaceC1635
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1629() {
        switch (1) {
            case 0:
                ((Bitmap) this.f1981).prepareToDraw();
                break;
            default:
                InterfaceC2568 interfaceC2568 = (InterfaceC2568) this.f1982;
                if (interfaceC2568 instanceof InterfaceC1635) {
                    ((InterfaceC1635) interfaceC2568).mo1629();
                }
                break;
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1206() {
        switch (1) {
            case 0:
                ((InterfaceC0424) this.f1982).mo1504((Bitmap) this.f1981);
                break;
            default:
                ((InterfaceC2568) this.f1982).mo1206();
                break;
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1207() {
        switch (1) {
            case 0:
                return AbstractC3522.m5106((Bitmap) this.f1981);
            default:
                return ((InterfaceC2568) this.f1982).mo1207();
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final Class mo1208() {
        switch (1) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public C0425(Resources resources, InterfaceC2568 interfaceC2568) {
        AbstractC1460.m3210(resources, "Argument must not be null");
        this.f1981 = resources;
        AbstractC1460.m3210(interfaceC2568, "Argument must not be null");
        this.f1982 = interfaceC2568;
    }
}
