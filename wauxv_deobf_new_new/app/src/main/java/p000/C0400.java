package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲈᤞᲇᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0400 implements InterfaceC2624, InterfaceC1648 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1952 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1953;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1954;

    public C0400(InterfaceC0399 interfaceC0399, Bitmap bitmap) {
        AbstractC2727.m4693(bitmap, "Bitmap must not be null");
        this.f1953 = bitmap;
        AbstractC2727.m4693(interfaceC0399, "BitmapPool must not be null");
        this.f1954 = interfaceC0399;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C0400 m1734(InterfaceC0399 interfaceC0399, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0400(interfaceC0399, bitmap);
    }

    @Override // p000.InterfaceC2624
    public final Object get() {
        switch (this.f1952) {
            case 0:
                return (Bitmap) this.f1953;
            default:
                return new BitmapDrawable((Resources) this.f1953, (Bitmap) ((InterfaceC2624) this.f1954).get());
        }
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo1735() {
        switch (this.f1952) {
            case 0:
                ((Bitmap) this.f1953).prepareToDraw();
                break;
            default:
                InterfaceC2624 interfaceC2624 = (InterfaceC2624) this.f1954;
                if (interfaceC2624 instanceof InterfaceC1648) {
                    ((InterfaceC1648) interfaceC2624).mo1735();
                }
                break;
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo1352() {
        switch (this.f1952) {
            case 0:
                ((InterfaceC0399) this.f1954).mo1609((Bitmap) this.f1953);
                break;
            default:
                ((InterfaceC2624) this.f1954).mo1352();
                break;
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1353() {
        switch (this.f1952) {
            case 0:
                return AbstractC3580.m5118((Bitmap) this.f1953);
            default:
                return ((InterfaceC2624) this.f1954).mo1353();
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final Class mo1354() {
        switch (this.f1952) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public C0400(Resources resources, InterfaceC2624 interfaceC2624) {
        AbstractC2727.m4693(resources, "Argument must not be null");
        this.f1953 = resources;
        AbstractC2727.m4693(interfaceC2624, "Argument must not be null");
        this.f1954 = interfaceC2624;
    }
}
