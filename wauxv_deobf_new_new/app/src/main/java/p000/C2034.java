package p000;

import android.app.Application;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᲁᛸᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2034 extends ClassLoader {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2034 f6774;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f6775;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f6776;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f6775 = linkedHashSet;
        f6776 = new LinkedHashSet();
        linkedHashSet.add("androidx.lifecycle.ReportFragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2034() {
        super(C0261.m1482());
        C0261.f1489.getClass();
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
        Object c2641;
        Class<?> cls;
        Class<?> clsLoadClass;
        Iterator it;
        boolean z2 = C3755.f11758;
        if (!C3755.m5365()) {
            C0261.f1489.getClass();
            return C0261.m1482().loadClass(str);
        }
        C0261.f1489.getClass();
        Application applicationM1483 = C0261.m1483();
        if (applicationM1483 != null && (classLoader = applicationM1483.getClassLoader()) != null) {
            LinkedHashSet linkedHashSet2 = f6775;
            if (linkedHashSet2.isEmpty()) {
                linkedHashSet2 = null;
            }
            if (linkedHashSet2 != null) {
                Iterator it2 = linkedHashSet2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        linkedHashSet = f6776;
                        if (linkedHashSet.isEmpty()) {
                            linkedHashSet = null;
                        }
                        if (linkedHashSet != null) {
                            it = linkedHashSet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    try {
                                        try {
                                            C0261.f1489.getClass();
                                            clsLoadClass = C0261.m1482().loadClass(str);
                                        } catch (Throwable th) {
                                            c2641 = new C2641(th);
                                            cls = (Class) (c2641 instanceof C2641 ? null : c2641);
                                            if (cls == null) {
                                                clsLoadClass = classLoader.loadClass(str);
                                            } else {
                                                clsLoadClass = cls;
                                            }
                                        }
                                    } catch (Throwable unused) {
                                        C0261.f1489.getClass();
                                        c2641 = C0261.m1482().loadClass(str);
                                        cls = (Class) (c2641 instanceof C2641 ? null : c2641);
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
                                } else if (AbstractC1469.m3322(str, (String) it.next())) {
                                    C0261.f1489.getClass();
                                    clsLoadClass = C0261.m1482().loadClass(str);
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            C0261.f1489.getClass();
                            clsLoadClass = C0261.m1482().loadClass(str);
                        }
                    } else if (AbstractC1469.m3322(str, (String) it2.next())) {
                        clsLoadClass = classLoader.loadClass(str);
                    } else {
                        continue;
                    }
                }
            } else {
                linkedHashSet = f6776;
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                if (linkedHashSet != null) {
                    it = linkedHashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C0261.f1489.getClass();
                            clsLoadClass = C0261.m1482().loadClass(str);
                        } else if (AbstractC1469.m3322(str, (String) it.next())) {
                            C0261.f1489.getClass();
                            clsLoadClass = C0261.m1482().loadClass(str);
                        } else {
                            continue;
                        }
                    }
                } else {
                    C0261.f1489.getClass();
                    clsLoadClass = C0261.m1482().loadClass(str);
                }
            }
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
        }
        return super.loadClass(str, z);
    }
}
