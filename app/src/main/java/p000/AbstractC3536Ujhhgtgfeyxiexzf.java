package p000;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.Request;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3536Ujhhgtgfeyxiexzf {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m5085Ujhhgtgfeyxiexzf(Request request) throws NoSuchAlgorithmException {
        AbstractC3317feyxiexzfUjhhgtg.m4808Ujhhgtgfeyxiexzf(request.tag(AbstractC1264feyxiexzfUjhhgtg.class));
        byte[] bytes = (request.method() + request.url()).getBytes(AbstractC2689Ujhhgtgfeyxiexzf.f8581Ujhhgtgfeyxiexzf);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bytes, 0, bytes.length);
        return new C2633Ujhhgtgfeyxiexzf(messageDigest.digest()).mo2579Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m5086Ujhhgtgfeyxiexzf(C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg) throws IOException {
        try {
            long jMo2111Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg.mo2111Ujhhgtgfeyxiexzf();
            String strMo2112Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg.mo2112Ujhhgtgfeyxiexzf(Long.MAX_VALUE);
            if (jMo2111Ujhhgtgfeyxiexzf >= 0 && jMo2111Ujhhgtgfeyxiexzf <= 2147483647L && strMo2112Ujhhgtgfeyxiexzf.length() <= 0) {
                return (int) jMo2111Ujhhgtgfeyxiexzf;
            }
            throw new IOException("expected an int but was \"" + jMo2111Ujhhgtgfeyxiexzf + strMo2112Ujhhgtgfeyxiexzf + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
