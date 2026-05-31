package p000;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.Request;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1394 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m3205(Request request) throws NoSuchAlgorithmException {
        AbstractC1095.m2807(request.tag(AbstractC2234.class));
        byte[] bytes = (request.method() + request.url()).getBytes(AbstractC0580.UTF_8);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bytes, 0, bytes.length);
        return new C0516(messageDigest.digest()).mo1965();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m3206(C2531 c2531) throws IOException {
        try {
            long jMo1865 = c2531.mo1865();
            String strMo1867 = c2531.mo1867(Long.MAX_VALUE);
            if (jMo1865 >= 0 && jMo1865 <= 2147483647L && strMo1867.length() <= 0) {
                return (int) jMo1865;
            }
            throw new IOException("expected an int but was \"" + jMo1865 + strMo1867 + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
