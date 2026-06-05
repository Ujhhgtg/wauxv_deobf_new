package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲ要点脸能不能ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1169feyxiexzfUjhhgtg implements InterfaceC0902feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ArrayList f4411Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2620feyxiexzfUjhhgtg f4412Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0271Ujhhgtgfeyxiexzf f4413Ujhhgtgfeyxiexzf;

    public C1169feyxiexzfUjhhgtg(ArrayList arrayList, C2620feyxiexzfUjhhgtg c2620feyxiexzfUjhhgtg, C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf) {
        this.f4411Ujhhgtgfeyxiexzf = arrayList;
        this.f4412Ujhhgtgfeyxiexzf = c2620feyxiexzfUjhhgtg;
        this.f4413Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo2362Ujhhgtgfeyxiexzf(Object obj, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        return !((Boolean) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(AbstractC3608Ujhhgtgfeyxiexzf.f11225Ujhhgtgfeyxiexzf)).booleanValue() && AbstractC1243feyxiexzfUjhhgtg.m2737Ujhhgtgfeyxiexzf(this.f4411Ujhhgtgfeyxiexzf, (InputStream) obj, this.f4413Ujhhgtgfeyxiexzf) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // p000.InterfaceC0902feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final InterfaceC0901feyxiexzfUjhhgtg mo2363Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f4412Ujhhgtgfeyxiexzf.mo2363Ujhhgtgfeyxiexzf(ByteBuffer.wrap(byteArray), i, i2, c1471feyxiexzfUjhhgtg);
    }
}
