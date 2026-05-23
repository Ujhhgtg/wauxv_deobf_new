package p000;

import bsh.AbstractC0010;
import bsh.C0003;
import bsh.C0007;
import bsh.Primitive;
import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲈᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0354 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final int f1664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C0355 f1665;

    public C0354() {
        super(41);
        this.f1665 = null;
        this.f1664 = C0003.f470.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01b3 A[Catch: all -> 0x01da, TryCatch #13 {all -> 0x01da, blocks: (B:102:0x019f, B:104:0x01b3, B:112:0x01d4, B:115:0x01dd, B:120:0x01ec, B:121:0x01ef, B:126:0x01fb, B:128:0x0203, B:134:0x022a, B:136:0x0236, B:138:0x024d, B:140:0x0258, B:142:0x0261, B:144:0x0267, B:145:0x026a, B:139:0x0253, B:146:0x026b, B:147:0x0272, B:131:0x0215, B:107:0x01c4, B:109:0x01cb, B:141:0x025b), top: B:189:0x019f, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c4 A[Catch: all -> 0x01da, TryCatch #13 {all -> 0x01da, blocks: (B:102:0x019f, B:104:0x01b3, B:112:0x01d4, B:115:0x01dd, B:120:0x01ec, B:121:0x01ef, B:126:0x01fb, B:128:0x0203, B:134:0x022a, B:136:0x0236, B:138:0x024d, B:140:0x0258, B:142:0x0261, B:144:0x0267, B:145:0x026a, B:139:0x0253, B:146:0x026b, B:147:0x0272, B:131:0x0215, B:107:0x01c4, B:109:0x01cb, B:141:0x025b), top: B:189:0x019f, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb A[Catch: all -> 0x01da, TryCatch #13 {all -> 0x01da, blocks: (B:102:0x019f, B:104:0x01b3, B:112:0x01d4, B:115:0x01dd, B:120:0x01ec, B:121:0x01ef, B:126:0x01fb, B:128:0x0203, B:134:0x022a, B:136:0x0236, B:138:0x024d, B:140:0x0258, B:142:0x0261, B:144:0x0267, B:145:0x026a, B:139:0x0253, B:146:0x026b, B:147:0x0272, B:131:0x0215, B:107:0x01c4, B:109:0x01cb, B:141:0x025b), top: B:189:0x019f, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ec A[Catch: all -> 0x01da, TryCatch #13 {all -> 0x01da, blocks: (B:102:0x019f, B:104:0x01b3, B:112:0x01d4, B:115:0x01dd, B:120:0x01ec, B:121:0x01ef, B:126:0x01fb, B:128:0x0203, B:134:0x022a, B:136:0x0236, B:138:0x024d, B:140:0x0258, B:142:0x0261, B:144:0x0267, B:145:0x026a, B:139:0x0253, B:146:0x026b, B:147:0x0272, B:131:0x0215, B:107:0x01c4, B:109:0x01cb, B:141:0x025b), top: B:189:0x019f, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fb A[Catch: all -> 0x01da, TryCatch #13 {all -> 0x01da, blocks: (B:102:0x019f, B:104:0x01b3, B:112:0x01d4, B:115:0x01dd, B:120:0x01ec, B:121:0x01ef, B:126:0x01fb, B:128:0x0203, B:134:0x022a, B:136:0x0236, B:138:0x024d, B:140:0x0258, B:142:0x0261, B:144:0x0267, B:145:0x026a, B:139:0x0253, B:146:0x026b, B:147:0x0272, B:131:0x0215, B:107:0x01c4, B:109:0x01cb, B:141:0x025b), top: B:189:0x019f, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0203 A[Catch: all -> 0x01da, TryCatch #13 {all -> 0x01da, blocks: (B:102:0x019f, B:104:0x01b3, B:112:0x01d4, B:115:0x01dd, B:120:0x01ec, B:121:0x01ef, B:126:0x01fb, B:128:0x0203, B:134:0x022a, B:136:0x0236, B:138:0x024d, B:140:0x0258, B:142:0x0261, B:144:0x0267, B:145:0x026a, B:139:0x0253, B:146:0x026b, B:147:0x0272, B:131:0x0215, B:107:0x01c4, B:109:0x01cb, B:141:0x025b), top: B:189:0x019f, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0215 A[Catch: all -> 0x01da, LOOP:4: B:127:0x0201->B:131:0x0215, LOOP_END, TryCatch #13 {all -> 0x01da, blocks: (B:102:0x019f, B:104:0x01b3, B:112:0x01d4, B:115:0x01dd, B:120:0x01ec, B:121:0x01ef, B:126:0x01fb, B:128:0x0203, B:134:0x022a, B:136:0x0236, B:138:0x024d, B:140:0x0258, B:142:0x0261, B:144:0x0267, B:145:0x026a, B:139:0x0253, B:146:0x026b, B:147:0x0272, B:131:0x0215, B:107:0x01c4, B:109:0x01cb, B:141:0x025b), top: B:189:0x019f, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x022a A[Catch: all -> 0x01da, LOOP:3: B:103:0x01b1->B:134:0x022a, LOOP_END, TryCatch #13 {all -> 0x01da, blocks: (B:102:0x019f, B:104:0x01b3, B:112:0x01d4, B:115:0x01dd, B:120:0x01ec, B:121:0x01ef, B:126:0x01fb, B:128:0x0203, B:134:0x022a, B:136:0x0236, B:138:0x024d, B:140:0x0258, B:142:0x0261, B:144:0x0267, B:145:0x026a, B:139:0x0253, B:146:0x026b, B:147:0x0272, B:131:0x0215, B:107:0x01c4, B:109:0x01cb, B:141:0x025b), top: B:189:0x019f, inners: #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x024d A[Catch: all -> 0x01da, ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᛸᤝᤞ -> 0x026b, TRY_ENTER, TryCatch #8 {ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᛸᤝᤞ -> 0x026b, blocks: (B:138:0x024d, B:139:0x0253), top: B:187:0x024b, outer: #13 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0253 A[Catch: all -> 0x01da, ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᛸᤝᤞ -> 0x026b, TRY_LEAVE, TryCatch #8 {ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᛸᤝᤞ -> 0x026b, blocks: (B:138:0x024d, B:139:0x0253), top: B:187:0x024b, outer: #13 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0273 A[PHI: r0
      0x0273: PHI (r0v56 java.lang.Object) = (r0v37 java.lang.Object), (r0v39 java.lang.Object) binds: [B:101:0x019d, B:208:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0289  */
    /* JADX WARN: Code duplicated, block: B:158:0x0293 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:160:0x0296  */
    /* JADX WARN: Code duplicated, block: B:163:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x029e  */
    /* JADX WARN: Code duplicated, block: B:189:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r23v0, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᲁᲀᤞ] */
    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws Throwable {
        int i;
        InterfaceC2225 interfaceC2225;
        ?? M4900;
        Stack stack;
        int i2;
        Throwable thM4900;
        Object objM1448;
        Class<?> cls;
        int size;
        int i3;
        C0347 c0347;
        C2000 c2000;
        int length;
        int i4;
        int i5;
        Class cls2;
        C0007 c0007M1929;
        C0003 c0003;
        Object objM1449;
        Throwable th;
        Class[] clsArr;
        int length2;
        int i6;
        boolean z;
        Object obj;
        Class<?> cls3;
        int i7;
        int i8;
        boolean zM424;
        Object objM14410;
        InterfaceC2225 interfaceC2226 = this.f8721[0];
        int i9 = 1;
        if (interfaceC2226 instanceof C0355) {
            C0355 c0355 = (C0355) interfaceC2226;
            this.f1665 = c0355;
            c0355.mo306(c0550, runnableC1668);
            i = 1;
        } else {
            i = 0;
        }
        int i10 = i + 1;
        C0333 c0333 = (C0333) this.f8721[i];
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length3 = m4710().length;
        while (true) {
            if (i10 >= length3) {
                interfaceC2225 = null;
                break;
            }
            int i11 = i10 + 1;
            interfaceC2225 = this.f8721[i10];
            if (!(interfaceC2225 instanceof C0347)) {
                break;
            }
            arrayList.add((C0347) interfaceC2225);
            i10 += 2;
            arrayList2.add((C0333) this.f8721[i11]);
        }
        C0333 c0334 = interfaceC2225 != null ? (C0333) interfaceC2225 : null;
        Stack stack2 = c0550.f2265;
        int size2 = stack2.size();
        try {
            try {
                try {
                    RunnableC1668.m3389("Evaluate try block");
                    try {
                        objM1448 = c0333.m1448(c0550, runnableC1668, Boolean.FALSE);
                        thM4900 = null;
                        while (thM4900 != null && (thM4900.getCause() instanceof C2895)) {
                            thM4900 = ((C2895) thM4900.getCause()).m4900();
                        }
                        if (this.f1665 != null) {
                            RunnableC1668.m3389("Try with resources: autoClose");
                            for (Throwable th2 : this.f1665.m1465()) {
                                if (thM4900 != null && thM4900 != th2) {
                                    thM4900.addSuppressed(th2);
                                }
                            }
                        }
                    } catch (OutOfMemoryError e) {
                        try {
                            try {
                                stack = stack2;
                                i2 = size2;
                                try {
                                    throw new C2895(e.toString(), e, c0333, c0550, false);
                                } catch (C1230 e2) {
                                    e = e2;
                                    thM4900 = e;
                                    RunnableC1668.m3389("EvalException from try block: ", thM4900);
                                    while (stack.size() > i2) {
                                        c0550.m1926();
                                    }
                                    while (thM4900 != null && (thM4900.getCause() instanceof C2895)) {
                                        thM4900 = ((C2895) thM4900.getCause()).m4900();
                                    }
                                    if (this.f1665 != null) {
                                        RunnableC1668.m3389("Try with resources: autoClose");
                                        for (Throwable th3 : this.f1665.m1465()) {
                                            if (thM4900 != null && thM4900 != th3) {
                                                thM4900.addSuppressed(th3);
                                            }
                                        }
                                    }
                                    objM1448 = null;
                                    if (thM4900 != null) {
                                        try {
                                            RunnableC1668.m3389("Try catch thrown: ", thM4900);
                                            cls = thM4900.getClass();
                                            size = arrayList.size();
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < size) {
                                                    c0347 = (C0347) arrayList.get(i3);
                                                    c2000 = new C2000(4);
                                                    try {
                                                        try {
                                                            if (!c0347.f1647) {
                                                                if (c0347.m4710().length > 0) {
                                                                    length = c0347.m4710().length;
                                                                } else {
                                                                    length = i9;
                                                                }
                                                                if (length > i9) {
                                                                }
                                                                c0347.mo306(c0550, runnableC1668);
                                                                if (c0347.m4710().length == 0) {
                                                                    i4 = i9;
                                                                } else {
                                                                    i4 = 0;
                                                                }
                                                                if (i4 != 0) {
                                                                    runnableC1668.getClass();
                                                                }
                                                                if (c0347.m4710().length == 0) {
                                                                    i5 = i9;
                                                                } else {
                                                                    i5 = 0;
                                                                }
                                                                if (i5 == 0) {
                                                                    clsArr = c0347.f1648;
                                                                    length2 = clsArr.length;
                                                                    i6 = 0;
                                                                    z = false;
                                                                    while (true) {
                                                                        if (i6 < length2) {
                                                                            obj = objM1448;
                                                                            cls3 = cls;
                                                                            i7 = size;
                                                                            i8 = 1;
                                                                            cls2 = null;
                                                                            break;
                                                                        }
                                                                        obj = objM1448;
                                                                        cls2 = clsArr[i6];
                                                                        i7 = size;
                                                                        zM424 = AbstractC0010.m424(cls2, cls);
                                                                        cls3 = cls;
                                                                        i8 = 1;
                                                                        if (true == zM424) {
                                                                            z = zM424;
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                        z = zM424;
                                                                        objM1448 = obj;
                                                                        size = i7;
                                                                        cls = cls3;
                                                                    }
                                                                    if (!z) {
                                                                        i3++;
                                                                        i9 = i8;
                                                                        objM1448 = obj;
                                                                        size = i7;
                                                                        cls = cls3;
                                                                    }
                                                                } else {
                                                                    cls2 = null;
                                                                }
                                                                C0333 c0335 = (C0333) arrayList2.get(i3);
                                                                c0007M1929 = c0550.m1929();
                                                                c0003 = new C0003(c0550.m1929(), this.f1664);
                                                                if (cls2 == null) {
                                                                    c0003.m316(c0347.f1646, thM4900);
                                                                } else {
                                                                    c0003.m367(c0347.f1646, cls2, thM4900, c2000);
                                                                }
                                                                c0550.m1928(c0003);
                                                                objM1449 = c0335.m1448(c0550, runnableC1668, Boolean.TRUE);
                                                                c0550.m1928(c0007M1929);
                                                                th = null;
                                                            }
                                                            objM1449 = c0335.m1448(c0550, runnableC1668, Boolean.TRUE);
                                                            c0550.m1928(c0007M1929);
                                                            th = null;
                                                        } catch (Throwable th4) {
                                                            c0550.m1928(c0007M1929);
                                                            throw th4;
                                                        }
                                                        if (cls2 == null) {
                                                            c0003.m316(c0347.f1646, thM4900);
                                                        } else {
                                                            c0003.m367(c0347.f1646, cls2, thM4900, c2000);
                                                        }
                                                        c0550.m1928(c0003);
                                                    } catch (C3523 unused) {
                                                        throw new C1669("Unable to set var in catch block namespace.");
                                                    }
                                                    c2000.m3860("final");
                                                    c0347.mo306(c0550, runnableC1668);
                                                    if (c0347.m4710().length == 0) {
                                                        i4 = i9;
                                                    } else {
                                                        i4 = 0;
                                                    }
                                                    if (i4 != 0) {
                                                        runnableC1668.getClass();
                                                    }
                                                    if (c0347.m4710().length == 0) {
                                                        i5 = i9;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    if (i5 == 0) {
                                                        clsArr = c0347.f1648;
                                                        length2 = clsArr.length;
                                                        i6 = 0;
                                                        z = false;
                                                        while (true) {
                                                            if (i6 < length2) {
                                                                obj = objM1448;
                                                                cls3 = cls;
                                                                i7 = size;
                                                                i8 = 1;
                                                                cls2 = null;
                                                                break;
                                                            }
                                                            obj = objM1448;
                                                            cls2 = clsArr[i6];
                                                            i7 = size;
                                                            zM424 = AbstractC0010.m424(cls2, cls);
                                                            cls3 = cls;
                                                            i8 = 1;
                                                            if (true == zM424) {
                                                                z = zM424;
                                                                break;
                                                            }
                                                            i6++;
                                                            z = zM424;
                                                            objM1448 = obj;
                                                            size = i7;
                                                            cls = cls3;
                                                        }
                                                        if (!z) {
                                                            i3++;
                                                            i9 = i8;
                                                            objM1448 = obj;
                                                            size = i7;
                                                            cls = cls3;
                                                        }
                                                    } else {
                                                        cls2 = null;
                                                    }
                                                    C0333 c0336 = (C0333) arrayList2.get(i3);
                                                    c0007M1929 = c0550.m1929();
                                                    c0003 = new C0003(c0550.m1929(), this.f1664);
                                                } else {
                                                    th = thM4900;
                                                    objM1449 = objM1448;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            if (c0334 != null) {
                                                Object objM14411 = c0334.m1448(c0550, runnableC1668, Boolean.FALSE);
                                                if (objM14411 instanceof C2588) {
                                                    return objM14411;
                                                }
                                            }
                                            throw th5;
                                        }
                                    } else {
                                        th = thM4900;
                                        objM1449 = objM1448;
                                    }
                                    if (c0334 != null) {
                                        objM14410 = c0334.m1448(c0550, runnableC1668, Boolean.FALSE);
                                        if (objM14410 instanceof C2588) {
                                            return objM14410;
                                        }
                                    }
                                    if (th != null) {
                                        throw new C2895(th, this, c0550);
                                    }
                                    if (objM1449 instanceof C2588) {
                                        return objM1449;
                                    }
                                    return Primitive.VOID;
                                } catch (C2895 e3) {
                                    e = e3;
                                    RunnableC1668.m3389("TargetError from try block: ", e);
                                    thM4900 = e.m4900();
                                    while (stack.size() > i2) {
                                        c0550.m1926();
                                    }
                                    while (thM4900 != null && (thM4900.getCause() instanceof C2895)) {
                                        thM4900 = ((C2895) thM4900.getCause()).m4900();
                                    }
                                    if (this.f1665 != null) {
                                        RunnableC1668.m3389("Try with resources: autoClose");
                                        for (Throwable th6 : this.f1665.m1465()) {
                                            if (thM4900 != null && thM4900 != th6) {
                                                thM4900.addSuppressed(th6);
                                            }
                                        }
                                    }
                                    objM1448 = null;
                                    if (thM4900 != null) {
                                        RunnableC1668.m3389("Try catch thrown: ", thM4900);
                                        cls = thM4900.getClass();
                                        size = arrayList.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < size) {
                                                c0347 = (C0347) arrayList.get(i3);
                                                c2000 = new C2000(4);
                                                if (!c0347.f1647) {
                                                    if (c0347.m4710().length > 0) {
                                                        length = c0347.m4710().length;
                                                    } else {
                                                        length = i9;
                                                    }
                                                    if (length > i9) {
                                                    }
                                                    c0347.mo306(c0550, runnableC1668);
                                                    if (c0347.m4710().length == 0) {
                                                        i4 = i9;
                                                    } else {
                                                        i4 = 0;
                                                    }
                                                    if (i4 != 0) {
                                                        runnableC1668.getClass();
                                                    }
                                                    if (c0347.m4710().length == 0) {
                                                        i5 = i9;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    if (i5 == 0) {
                                                        clsArr = c0347.f1648;
                                                        length2 = clsArr.length;
                                                        i6 = 0;
                                                        z = false;
                                                        while (true) {
                                                            if (i6 < length2) {
                                                                obj = objM1448;
                                                                cls3 = cls;
                                                                i7 = size;
                                                                i8 = 1;
                                                                cls2 = null;
                                                                break;
                                                            }
                                                            obj = objM1448;
                                                            cls2 = clsArr[i6];
                                                            i7 = size;
                                                            zM424 = AbstractC0010.m424(cls2, cls);
                                                            cls3 = cls;
                                                            i8 = 1;
                                                            if (true == zM424) {
                                                                z = zM424;
                                                                break;
                                                            }
                                                            i6++;
                                                            z = zM424;
                                                            objM1448 = obj;
                                                            size = i7;
                                                            cls = cls3;
                                                        }
                                                        if (!z) {
                                                            i3++;
                                                            i9 = i8;
                                                            objM1448 = obj;
                                                            size = i7;
                                                            cls = cls3;
                                                        }
                                                    } else {
                                                        cls2 = null;
                                                    }
                                                    C0333 c0337 = (C0333) arrayList2.get(i3);
                                                    c0007M1929 = c0550.m1929();
                                                    c0003 = new C0003(c0550.m1929(), this.f1664);
                                                    if (cls2 == null) {
                                                        c0003.m316(c0347.f1646, thM4900);
                                                    } else {
                                                        c0003.m367(c0347.f1646, cls2, thM4900, c2000);
                                                    }
                                                    c0550.m1928(c0003);
                                                    objM1449 = c0337.m1448(c0550, runnableC1668, Boolean.TRUE);
                                                    c0550.m1928(c0007M1929);
                                                    th = null;
                                                }
                                                c2000.m3860("final");
                                                c0347.mo306(c0550, runnableC1668);
                                                if (c0347.m4710().length == 0) {
                                                    i4 = i9;
                                                } else {
                                                    i4 = 0;
                                                }
                                                if (i4 != 0) {
                                                    runnableC1668.getClass();
                                                }
                                                if (c0347.m4710().length == 0) {
                                                    i5 = i9;
                                                } else {
                                                    i5 = 0;
                                                }
                                                if (i5 == 0) {
                                                    clsArr = c0347.f1648;
                                                    length2 = clsArr.length;
                                                    i6 = 0;
                                                    z = false;
                                                    while (true) {
                                                        if (i6 < length2) {
                                                            obj = objM1448;
                                                            cls3 = cls;
                                                            i7 = size;
                                                            i8 = 1;
                                                            cls2 = null;
                                                            break;
                                                        }
                                                        obj = objM1448;
                                                        cls2 = clsArr[i6];
                                                        i7 = size;
                                                        zM424 = AbstractC0010.m424(cls2, cls);
                                                        cls3 = cls;
                                                        i8 = 1;
                                                        if (true == zM424) {
                                                            z = zM424;
                                                            break;
                                                        }
                                                        i6++;
                                                        z = zM424;
                                                        objM1448 = obj;
                                                        size = i7;
                                                        cls = cls3;
                                                    }
                                                    if (!z) {
                                                        i3++;
                                                        i9 = i8;
                                                        objM1448 = obj;
                                                        size = i7;
                                                        cls = cls3;
                                                    }
                                                } else {
                                                    cls2 = null;
                                                }
                                                C0333 c0338 = (C0333) arrayList2.get(i3);
                                                c0007M1929 = c0550.m1929();
                                                c0003 = new C0003(c0550.m1929(), this.f1664);
                                                if (cls2 == null) {
                                                    c0003.m316(c0347.f1646, thM4900);
                                                } else {
                                                    c0003.m367(c0347.f1646, cls2, thM4900, c2000);
                                                }
                                                c0550.m1928(c0003);
                                                objM1449 = c0338.m1448(c0550, runnableC1668, Boolean.TRUE);
                                                c0550.m1928(c0007M1929);
                                                th = null;
                                            } else {
                                                th = thM4900;
                                                objM1449 = objM1448;
                                            }
                                        }
                                    } else {
                                        th = thM4900;
                                        objM1449 = objM1448;
                                    }
                                    if (c0334 != null) {
                                        objM14410 = c0334.m1448(c0550, runnableC1668, Boolean.FALSE);
                                        if (objM14410 instanceof C2588) {
                                            return objM14410;
                                        }
                                    }
                                    if (th != null) {
                                        throw new C2895(th, this, c0550);
                                    }
                                    if (objM1449 instanceof C2588) {
                                        return objM1449;
                                    }
                                    return Primitive.VOID;
                                }
                            } catch (C1230 e4) {
                                e = e4;
                                stack = stack2;
                                i2 = size2;
                            } catch (C2895 e5) {
                                e = e5;
                                stack = stack2;
                                i2 = size2;
                            }
                        } catch (C1230 e6) {
                            e = e6;
                            i2 = size2;
                            stack = stack2;
                        } catch (C2895 e7) {
                            e = e7;
                            i2 = size2;
                            stack = stack2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    M4900 = stack2;
                    while (M4900 != 0 && (M4900.getCause() instanceof C2895)) {
                        M4900 = ((C2895) M4900.getCause()).m4900();
                    }
                    if (this.f1665 != null) {
                        RunnableC1668.m3389("Try with resources: autoClose");
                        for (Throwable th8 : this.f1665.m1465()) {
                            if (M4900 != 0 && M4900 != th8) {
                                M4900.addSuppressed(th8);
                            }
                        }
                    }
                    throw th;
                }
            } catch (C1230 e8) {
                e = e8;
                stack = stack2;
                i2 = size2;
            } catch (C2895 e9) {
                e = e9;
                stack = stack2;
                i2 = size2;
            }
            if (thM4900 != null) {
                RunnableC1668.m3389("Try catch thrown: ", thM4900);
                cls = thM4900.getClass();
                size = arrayList.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        c0347 = (C0347) arrayList.get(i3);
                        c2000 = new C2000(4);
                        if (!c0347.f1647) {
                            if (c0347.m4710().length > 0) {
                                length = c0347.m4710().length;
                            } else {
                                length = i9;
                            }
                            if (length > i9) {
                            }
                            c0347.mo306(c0550, runnableC1668);
                            if (c0347.m4710().length == 0) {
                                i4 = i9;
                            } else {
                                i4 = 0;
                            }
                            if (i4 != 0) {
                                runnableC1668.getClass();
                            }
                            if (c0347.m4710().length == 0) {
                                i5 = i9;
                            } else {
                                i5 = 0;
                            }
                            if (i5 == 0) {
                                clsArr = c0347.f1648;
                                length2 = clsArr.length;
                                i6 = 0;
                                z = false;
                                while (true) {
                                    if (i6 < length2) {
                                        obj = objM1448;
                                        cls3 = cls;
                                        i7 = size;
                                        i8 = 1;
                                        cls2 = null;
                                        break;
                                    }
                                    obj = objM1448;
                                    cls2 = clsArr[i6];
                                    i7 = size;
                                    zM424 = AbstractC0010.m424(cls2, cls);
                                    cls3 = cls;
                                    i8 = 1;
                                    if (true == zM424) {
                                        z = zM424;
                                        break;
                                    }
                                    i6++;
                                    z = zM424;
                                    objM1448 = obj;
                                    size = i7;
                                    cls = cls3;
                                }
                                if (!z) {
                                    i3++;
                                    i9 = i8;
                                    objM1448 = obj;
                                    size = i7;
                                    cls = cls3;
                                }
                            } else {
                                cls2 = null;
                            }
                            C0333 c0339 = (C0333) arrayList2.get(i3);
                            c0007M1929 = c0550.m1929();
                            c0003 = new C0003(c0550.m1929(), this.f1664);
                            if (cls2 == null) {
                                c0003.m316(c0347.f1646, thM4900);
                            } else {
                                c0003.m367(c0347.f1646, cls2, thM4900, c2000);
                            }
                            c0550.m1928(c0003);
                            objM1449 = c0339.m1448(c0550, runnableC1668, Boolean.TRUE);
                            c0550.m1928(c0007M1929);
                            th = null;
                        }
                        c2000.m3860("final");
                        c0347.mo306(c0550, runnableC1668);
                        if (c0347.m4710().length == 0) {
                            i4 = i9;
                        } else {
                            i4 = 0;
                        }
                        if (i4 != 0) {
                            runnableC1668.getClass();
                        }
                        if (c0347.m4710().length == 0) {
                            i5 = i9;
                        } else {
                            i5 = 0;
                        }
                        if (i5 == 0) {
                            clsArr = c0347.f1648;
                            length2 = clsArr.length;
                            i6 = 0;
                            z = false;
                            while (true) {
                                if (i6 < length2) {
                                    obj = objM1448;
                                    cls3 = cls;
                                    i7 = size;
                                    i8 = 1;
                                    cls2 = null;
                                    break;
                                }
                                obj = objM1448;
                                cls2 = clsArr[i6];
                                i7 = size;
                                zM424 = AbstractC0010.m424(cls2, cls);
                                cls3 = cls;
                                i8 = 1;
                                if (true == zM424) {
                                    z = zM424;
                                    break;
                                }
                                i6++;
                                z = zM424;
                                objM1448 = obj;
                                size = i7;
                                cls = cls3;
                            }
                            if (!z) {
                                i3++;
                                i9 = i8;
                                objM1448 = obj;
                                size = i7;
                                cls = cls3;
                            }
                        } else {
                            cls2 = null;
                        }
                        C0333 c03310 = (C0333) arrayList2.get(i3);
                        c0007M1929 = c0550.m1929();
                        c0003 = new C0003(c0550.m1929(), this.f1664);
                        if (cls2 == null) {
                            c0003.m316(c0347.f1646, thM4900);
                        } else {
                            c0003.m367(c0347.f1646, cls2, thM4900, c2000);
                        }
                        c0550.m1928(c0003);
                        objM1449 = c03310.m1448(c0550, runnableC1668, Boolean.TRUE);
                        c0550.m1928(c0007M1929);
                        th = null;
                    } else {
                        th = thM4900;
                        objM1449 = objM1448;
                    }
                }
            } else {
                th = thM4900;
                objM1449 = objM1448;
            }
            if (c0334 != null) {
                objM14410 = c0334.m1448(c0550, runnableC1668, Boolean.FALSE);
                if (objM14410 instanceof C2588) {
                    return objM14410;
                }
            }
            if (th != null) {
                throw new C2895(th, this, c0550);
            }
            if (objM1449 instanceof C2588) {
                return objM1449;
            }
            return Primitive.VOID;
        } catch (Throwable th9) {
            th = th9;
            M4900 = 0;
        }
    }
}
