package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲈᛸᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1320 implements InterfaceC2627 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4764;

    public /* synthetic */ C1320(int i) {
        this.f4764 = i;
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final /* bridge */ /* synthetic */ boolean mo1355(Object obj, C2336 c2336) {
        switch (this.f4764) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p000.InterfaceC2627
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final InterfaceC2624 mo1356(Object obj, int i, int i2, C2336 c2336) {
        switch (this.f4764) {
            case 0:
                return new C0166((File) obj);
            case 1:
                return new C0166((Bitmap) obj, 3);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C1455(drawable, 1);
                }
                return null;
        }
    }
}
