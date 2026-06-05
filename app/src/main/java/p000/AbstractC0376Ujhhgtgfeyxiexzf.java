package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ能不能要点脸ᛲᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0376Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static volatile boolean f2083Ujhhgtgfeyxiexzf = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final boolean m1623Ujhhgtgfeyxiexzf(Member member) {
        Object c0919feyxiexzfUjhhgtg;
        boolean zBooleanValue;
        AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
        if (accessibleObject == null) {
            return false;
        }
        if (f2083Ujhhgtgfeyxiexzf) {
            try {
                c0919feyxiexzfUjhhgtg = Boolean.valueOf(accessibleObject.trySetAccessible());
            } catch (Throwable th) {
                c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
            }
            if (C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg) != null) {
                f2083Ujhhgtgfeyxiexzf = false;
                c0919feyxiexzfUjhhgtg = Boolean.valueOf(m1624Ujhhgtgfeyxiexzf(accessibleObject));
            }
            zBooleanValue = ((Boolean) c0919feyxiexzfUjhhgtg).booleanValue();
        } else {
            zBooleanValue = m1624Ujhhgtgfeyxiexzf(accessibleObject);
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final boolean m1624Ujhhgtgfeyxiexzf(AccessibleObject accessibleObject) {
        Object c0919feyxiexzfUjhhgtg;
        try {
            if (!accessibleObject.isAccessible()) {
                accessibleObject.setAccessible(true);
            }
            c0919feyxiexzfUjhhgtg = Boolean.TRUE;
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Object obj = Boolean.FALSE;
        if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
            c0919feyxiexzfUjhhgtg = obj;
        }
        return ((Boolean) c0919feyxiexzfUjhhgtg).booleanValue();
    }
}
