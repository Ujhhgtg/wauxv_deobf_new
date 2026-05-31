package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C0026;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0509 implements InterfaceC0965 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2187;

    public /* synthetic */ C0509(int i) {
        this.f2187 = i;
    }

    @Override // p000.InterfaceC0965
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Class mo1955() {
        switch (this.f2187) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.InterfaceC0965
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC0966 mo1956(Object obj) {
        switch (this.f2187) {
            case 0:
                return new C0482(1, (ByteBuffer) obj);
            case 1:
                return new C0099(obj, 2);
            default:
                return new C0026((ParcelFileDescriptor) obj);
        }
    }
}
