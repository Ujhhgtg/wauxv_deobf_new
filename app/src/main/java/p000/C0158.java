package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0158 implements InterfaceC2568 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1170;

    public /* synthetic */ C0158(int i, Object obj) {
        this.f1169 = i;
        this.f1170 = obj;
    }

    @Override // p000.InterfaceC2568
    public final Object get() {
        switch (this.f1169) {
            case 0:
                return (AnimatedImageDrawable) this.f1170;
            case 1:
                return (byte[]) this.f1170;
            case 2:
                return (File) this.f1170;
            default:
                return (Bitmap) this.f1170;
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1206() {
        switch (this.f1169) {
            case 0:
                ((AnimatedImageDrawable) this.f1170).stop();
                ((AnimatedImageDrawable) this.f1170).clearAnimationCallbacks();
                break;
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo1207() {
        switch (this.f1169) {
            case 0:
                return AbstractC3522.m5107(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f1170).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f1170).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.f1170).length;
            case 2:
                return 1;
            default:
                return AbstractC3522.m5106((Bitmap) this.f1170);
        }
    }

    @Override // p000.InterfaceC2568
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Class mo1208() {
        switch (this.f1169) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.f1170).getClass();
            default:
                return Bitmap.class;
        }
    }

    public C0158(byte[] bArr) {
        this.f1169 = 1;
        AbstractC1460.m3210(bArr, "Argument must not be null");
        this.f1170 = bArr;
    }

    public C0158(File file) {
        this.f1169 = 2;
        AbstractC1460.m3210(file, "Argument must not be null");
        this.f1170 = file;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final void m1203() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    private final void m1204() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    private final void m1205() {
    }
}
