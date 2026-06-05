package p000;

import android.app.Application;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ要点脸能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0294Ujhhgtgfeyxiexzf extends ClassLoader {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C0294Ujhhgtgfeyxiexzf f1740Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final LinkedHashSet f1741Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final LinkedHashSet f1742Ujhhgtgfeyxiexzf;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f1741Ujhhgtgfeyxiexzf = linkedHashSet;
        f1742Ujhhgtgfeyxiexzf = new LinkedHashSet();
        linkedHashSet.add("androidx.lifecycle.ReportFragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0294Ujhhgtgfeyxiexzf() {
        super(C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf());
        C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EXC_TOP_SPLITTER, PHI: r0
      0x0080: PHI (r0v7 java.lang.ClassLoader) = (r0v6 java.lang.ClassLoader), (r0v14 java.lang.ClassLoader) binds: [B:27:0x005a, B:30:0x0064] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        ClassLoader classLoader;
        LinkedHashSet linkedHashSet;
        Object c0919feyxiexzfUjhhgtg;
        Class<?> cls;
        Class<?> clsLoadClass;
        Iterator it;
        boolean z2 = C2283feyxiexzfUjhhgtg.f7478Ujhhgtgfeyxiexzf;
        if (!C2283feyxiexzfUjhhgtg.m3480Ujhhgtgfeyxiexzf()) {
            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
            return C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf().loadClass(str);
        }
        C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
        Application applicationM3616Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.m3616Ujhhgtgfeyxiexzf();
        if (applicationM3616Ujhhgtgfeyxiexzf != null && (classLoader = applicationM3616Ujhhgtgfeyxiexzf.getClassLoader()) != null) {
            LinkedHashSet linkedHashSet2 = f1741Ujhhgtgfeyxiexzf;
            if (linkedHashSet2.isEmpty()) {
                linkedHashSet2 = null;
            }
            if (linkedHashSet2 != null) {
                Iterator it2 = linkedHashSet2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        linkedHashSet = f1742Ujhhgtgfeyxiexzf;
                        if (linkedHashSet.isEmpty()) {
                            linkedHashSet = null;
                        }
                        if (linkedHashSet != null) {
                            it = linkedHashSet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    try {
                                        try {
                                            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                                            clsLoadClass = C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf().loadClass(str);
                                        } catch (Throwable th) {
                                            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                                            cls = (Class) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
                                            if (cls == null) {
                                                clsLoadClass = classLoader.loadClass(str);
                                            } else {
                                                clsLoadClass = cls;
                                            }
                                        }
                                    } catch (Throwable unused) {
                                        C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                                        c0919feyxiexzfUjhhgtg = C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf().loadClass(str);
                                        cls = (Class) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
                                        if (cls == null) {
                                            clsLoadClass = classLoader.loadClass(str);
                                        } else {
                                            clsLoadClass = cls;
                                        }
                                        if (clsLoadClass != null) {
                                            return clsLoadClass;
                                        }
                                        return super.loadClass(str, z);
                                    }
                                } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, (String) it.next())) {
                                    C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                                    clsLoadClass = C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf().loadClass(str);
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                            clsLoadClass = C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf().loadClass(str);
                        }
                    } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, (String) it2.next())) {
                        clsLoadClass = classLoader.loadClass(str);
                    } else {
                        continue;
                    }
                }
            } else {
                linkedHashSet = f1742Ujhhgtgfeyxiexzf;
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                if (linkedHashSet != null) {
                    it = linkedHashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                            clsLoadClass = C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf().loadClass(str);
                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, (String) it.next())) {
                            C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                            clsLoadClass = C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf().loadClass(str);
                        } else {
                            continue;
                        }
                    }
                } else {
                    C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                    clsLoadClass = C2374Ujhhgtgfeyxiexzf.m3615Ujhhgtgfeyxiexzf().loadClass(str);
                }
            }
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
        }
        return super.loadClass(str, z);
    }
}
