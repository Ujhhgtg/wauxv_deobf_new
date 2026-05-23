package p000;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okhttp3.Request;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1386 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m3097(Request request) throws NoSuchAlgorithmException {
        AbstractC1194.m2791(request.tag(AbstractC2201.class));
        byte[] bytes = (request.method() + request.url()).getBytes(AbstractC0599.f2413);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bytes, 0, bytes.length);
        return new C0539(messageDigest.digest()).mo1871();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m3098(C2477 c2477) throws IOException {
        try {
            long jMo1771 = c2477.mo1771();
            String strMo1773 = c2477.mo1773(Long.MAX_VALUE);
            if (jMo1771 >= 0 && jMo1771 <= 2147483647L && strMo1773.length() <= 0) {
                return (int) jMo1771;
            }
            throw new IOException("expected an int but was \"" + jMo1771 + strMo1773 + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
