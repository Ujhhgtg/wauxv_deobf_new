package p000;

import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤞᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ConcurrentHashMap f2145 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ConcurrentHashMap f2146 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m1743(String str, String str2, ClassLoader classLoader) {
        return str + "#" + str2 + "#" + System.identityHashCode(classLoader);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Class m1744(final String str, final byte[] bArr) {
        String strM2973;
        final ClassLoader classLoader = AbstractC0499.class.getClassLoader();
        try {
            strM2973 = AbstractC1270.m2973(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByBytes: " + e);
            strM2973 = null;
        }
        if (strM2973 == null) {
            return null;
        }
        return (Class) f2145.computeIfAbsent(m1743(str, strM2973, classLoader), new Function() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲈᤝᲀᤞ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = str;
                try {
                    return AbstractC2202.m4000(str2, bArr, classLoader).loadClass(str2);
                } catch (Exception e2) {
                    System.err.println("[BeanShell] getClassByCode: " + e2);
                    return null;
                }
            }
        });
    }
}
