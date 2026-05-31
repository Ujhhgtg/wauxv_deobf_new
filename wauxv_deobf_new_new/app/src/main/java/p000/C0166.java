package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᲁᲇᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0166 implements InterfaceC2624 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1237;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1238;

    public /* synthetic */ C0166(Object obj, int i) {
        this.f1237 = i;
        this.f1238 = obj;
    }

    @Override // p000.InterfaceC2624
    public final Object get() {
        switch (this.f1237) {
            case 0:
                return (AnimatedImageDrawable) this.f1238;
            case 1:
                return (byte[]) this.f1238;
            case 2:
                return (File) this.f1238;
            default:
                return (Bitmap) this.f1238;
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1352() {
        switch (this.f1237) {
            case 0:
                ((AnimatedImageDrawable) this.f1238).stop();
                ((AnimatedImageDrawable) this.f1238).clearAnimationCallbacks();
                break;
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int mo1353() {
        switch (this.f1237) {
            case 0:
                return AbstractC3580.m5119(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f1238).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f1238).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.f1238).length;
            case 2:
                return 1;
            default:
                return AbstractC3580.m5118((Bitmap) this.f1238);
        }
    }

    @Override // p000.InterfaceC2624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Class mo1354() {
        switch (this.f1237) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.f1238).getClass();
            default:
                return Bitmap.class;
        }
    }

    public C0166(byte[] bArr) {
        this.f1237 = 1;
        AbstractC2727.m4693(bArr, "Argument must not be null");
        this.f1238 = bArr;
    }

    public C0166(File file) {
        this.f1237 = 2;
        AbstractC2727.m4693(file, "Argument must not be null");
        this.f1238 = file;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final void m1349() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    private final void m1350() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    private final void m1351() {
    }
}
