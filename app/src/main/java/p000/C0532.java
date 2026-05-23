package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C0019;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0532 implements InterfaceC0961 {

    public final /* synthetic */ int f2231;

    public /* synthetic */ C0532(int i) {
        this.f2231 = i;
    }

    @Override // p000.InterfaceC0961
    public final Class mo1861() {
        switch (this.f2231) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.InterfaceC0961
    public final InterfaceC0962 mo1862(Object obj) {
        switch (this.f2231) {
            case 0:
                return new C0505(1, (ByteBuffer) obj);
            case 1:
                return new C0091(1, obj);
            default:
                return new C0019((ParcelFileDescriptor) obj);
        }
    }
}
