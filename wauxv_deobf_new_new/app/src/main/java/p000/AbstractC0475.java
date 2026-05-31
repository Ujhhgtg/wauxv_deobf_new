package p000;

import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᲇᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0475 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ConcurrentHashMap f2114 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final ConcurrentHashMap f2115 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m1846(String str, String str2, ClassLoader classLoader) {
        return str + "#" + str2 + "#" + System.identityHashCode(classLoader);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Class m1847(final String str, final byte[] bArr, final ClassLoader classLoader) {
        String strM4240;
        try {
            strM4240 = AbstractC2240.m4240(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByBytes: " + e);
            strM4240 = null;
        }
        if (strM4240 == null) {
            return null;
        }
        return (Class) f2114.computeIfAbsent(m1846(str, strM4240, classLoader), new Function() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᲈᲇᤝ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = str;
                try {
                    return AbstractC1469.m3328(str2, bArr, classLoader).loadClass(str2);
                } catch (Exception e2) {
                    System.err.println("[BeanShell] getClassByCode: " + e2);
                    return null;
                }
            }
        });
    }
}
