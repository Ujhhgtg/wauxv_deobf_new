package p000;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.Ujhhgtgfeyxiexzf;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2619feyxiexzfUjhhgtg implements InterfaceC3105Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8440Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2619feyxiexzfUjhhgtg(int i) {
        this.f8440Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.InterfaceC3105Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Class mo1949Ujhhgtgfeyxiexzf() {
        switch (this.f8440Ujhhgtgfeyxiexzf) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.InterfaceC3105Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC3106Ujhhgtgfeyxiexzf mo1950Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f8440Ujhhgtgfeyxiexzf) {
            case 0:
                return new C2594feyxiexzfUjhhgtg(1, (ByteBuffer) obj);
            case 1:
                return new C2962feyxiexzfUjhhgtg(2, obj);
            default:
                return new Ujhhgtgfeyxiexzf((ParcelFileDescriptor) obj);
        }
    }
}
