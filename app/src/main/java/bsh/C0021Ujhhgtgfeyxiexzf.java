package bsh;

import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.IntStream;
import p000.AbstractC0695Ujhhgtgfeyxiexzf;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C0168Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C0920feyxiexzfUjhhgtg;
import p000.C0958feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C1985Ujhhgtgfeyxiexzf;
import p000.C2389Ujhhgtgfeyxiexzf;
import p000.C2571Ujhhgtgfeyxiexzf;
import p000.C2574Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.InterfaceC2573Ujhhgtgfeyxiexzf;
import p000.InterfaceC2588feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0021Ujhhgtgfeyxiexzf implements Serializable, Cloneable, InterfaceC2573Ujhhgtgfeyxiexzf {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0029Ujhhgtgfeyxiexzf f467Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public Modifiers f468Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f469Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Class f470Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public String[] f471Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f472Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Class[] f473Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Modifiers[] f474Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final BSHBlock f475Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final AbstractC0695Ujhhgtgfeyxiexzf f476Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final Object f477Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final transient InterfaceC2588feyxiexzfUjhhgtg f478Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f479Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f480Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public boolean f481Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Class f482Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public boolean f483Ujhhgtgfeyxiexzf;

    public C0021Ujhhgtgfeyxiexzf(String str, Class cls, String[] strArr, Class[] clsArr, Modifiers[] modifiersArr, BSHBlock bSHBlock, C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, Modifiers modifiers, boolean z) {
        this.f480Ujhhgtgfeyxiexzf = false;
        this.f481Ujhhgtgfeyxiexzf = false;
        this.f482Ujhhgtgfeyxiexzf = null;
        this.f483Ujhhgtgfeyxiexzf = false;
        this.f469Ujhhgtgfeyxiexzf = str;
        this.f470Ujhhgtgfeyxiexzf = cls;
        this.f471Ujhhgtgfeyxiexzf = strArr;
        this.f474Ujhhgtgfeyxiexzf = modifiersArr;
        if (strArr != null) {
            this.f472Ujhhgtgfeyxiexzf = strArr.length;
        } else if (clsArr != null) {
            this.f472Ujhhgtgfeyxiexzf = clsArr.length;
        }
        this.f473Ujhhgtgfeyxiexzf = clsArr;
        this.f475Ujhhgtgfeyxiexzf = bSHBlock;
        this.f467Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
        this.f468Ujhhgtgfeyxiexzf = modifiers;
        this.f479Ujhhgtgfeyxiexzf = z;
    }

    @Override // p000.InterfaceC2573Ujhhgtgfeyxiexzf
    public final void classLoaderChanged() {
        this.f483Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(this.f470Ujhhgtgfeyxiexzf) || Arrays.asList(this.f473Ujhhgtgfeyxiexzf).stream().anyMatch(new C2574Ujhhgtgfeyxiexzf(2));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b A[LOOP:0: B:29:0x004a->B:39:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x006f A[SYNTHETIC] */
    public boolean equals(Object obj) {
        boolean z;
        int i;
        Class cls;
        Class cls2;
        boolean zEquals;
        if (obj != null) {
            if (obj != this) {
                if (obj.getClass() == getClass()) {
                    C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf = (C0021Ujhhgtgfeyxiexzf) obj;
                    if (this.f469Ujhhgtgfeyxiexzf.equals(c0021Ujhhgtgfeyxiexzf.f469Ujhhgtgfeyxiexzf) && m311Ujhhgtgfeyxiexzf() == c0021Ujhhgtgfeyxiexzf.m311Ujhhgtgfeyxiexzf() && (z = this.f481Ujhhgtgfeyxiexzf) == c0021Ujhhgtgfeyxiexzf.f481Ujhhgtgfeyxiexzf) {
                        if (z) {
                            Class cls3 = this.f482Ujhhgtgfeyxiexzf;
                            Class cls4 = c0021Ujhhgtgfeyxiexzf.f482Ujhhgtgfeyxiexzf;
                            if (cls3 == null ? cls4 == null : cls3.equals(cls4)) {
                                for (i = 0; i < m311Ujhhgtgfeyxiexzf(); i++) {
                                    cls = mo313Ujhhgtgfeyxiexzf()[i];
                                    cls2 = c0021Ujhhgtgfeyxiexzf.mo313Ujhhgtgfeyxiexzf()[i];
                                    if (cls == null) {
                                        zEquals = cls.equals(cls2);
                                    } else if (cls2 == null) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                    if (!zEquals) {
                                    }
                                }
                            }
                        } else {
                            while (i < m311Ujhhgtgfeyxiexzf()) {
                                cls = mo313Ujhhgtgfeyxiexzf()[i];
                                cls2 = c0021Ujhhgtgfeyxiexzf.mo313Ujhhgtgfeyxiexzf()[i];
                                if (cls == null) {
                                    zEquals = cls.equals(cls2);
                                } else if (cls2 == null) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                                if (!zEquals) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (Boolean.hashCode(this.f481Ujhhgtgfeyxiexzf) + ((getClass().hashCode() + this.f469Ujhhgtgfeyxiexzf.hashCode()) * 31)) * 31;
        Class cls = this.f482Ujhhgtgfeyxiexzf;
        int iHashCode2 = iHashCode + (cls == null ? 0 : cls.hashCode());
        Class[] clsArrMo313Ujhhgtgfeyxiexzf = mo313Ujhhgtgfeyxiexzf();
        int length = clsArrMo313Ujhhgtgfeyxiexzf.length;
        for (int i = 0; i < length; i++) {
            Class cls2 = clsArrMo313Ujhhgtgfeyxiexzf[i];
            iHashCode2 += (cls2 == null ? 0 : cls2.hashCode()) + 3;
        }
        return m311Ujhhgtgfeyxiexzf() + iHashCode2;
    }

    public final String toString() {
        return "Method: " + AbstractC3594Ujhhgtgfeyxiexzf.m5186Ujhhgtgfeyxiexzf(this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0021Ujhhgtgfeyxiexzf clone() {
        try {
            return (C0021Ujhhgtgfeyxiexzf) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Modifiers m309Ujhhgtgfeyxiexzf() {
        if (this.f468Ujhhgtgfeyxiexzf == null) {
            this.f468Ujhhgtgfeyxiexzf = new Modifiers(2);
        }
        return this.f468Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String m310Ujhhgtgfeyxiexzf() {
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f476Ujhhgtgfeyxiexzf;
        return abstractC0695Ujhhgtgfeyxiexzf == null ? this.f469Ujhhgtgfeyxiexzf : abstractC0695Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int m311Ujhhgtgfeyxiexzf() {
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f476Ujhhgtgfeyxiexzf;
        return abstractC0695Ujhhgtgfeyxiexzf == null ? this.f472Ujhhgtgfeyxiexzf : abstractC0695Ujhhgtgfeyxiexzf.mo1966Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String[] m312Ujhhgtgfeyxiexzf() {
        if (this.f471Ujhhgtgfeyxiexzf == null) {
            this.f471Ujhhgtgfeyxiexzf = (String[]) IntStream.range(97, m311Ujhhgtgfeyxiexzf() + 97).boxed().map(new C2389Ujhhgtgfeyxiexzf(5)).toArray(new C2571Ujhhgtgfeyxiexzf(2));
        }
        return this.f471Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public Class[] mo313Ujhhgtgfeyxiexzf() {
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f476Ujhhgtgfeyxiexzf;
        if (abstractC0695Ujhhgtgfeyxiexzf != null) {
            return abstractC0695Ujhhgtgfeyxiexzf.mo1967Ujhhgtgfeyxiexzf();
        }
        m318Ujhhgtgfeyxiexzf();
        return this.f473Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Class mo314Ujhhgtgfeyxiexzf() {
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f476Ujhhgtgfeyxiexzf;
        if (abstractC0695Ujhhgtgfeyxiexzf != null) {
            return abstractC0695Ujhhgtgfeyxiexzf.mo1641Ujhhgtgfeyxiexzf();
        }
        m318Ujhhgtgfeyxiexzf();
        return this.f470Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m315Ujhhgtgfeyxiexzf(String str) {
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f476Ujhhgtgfeyxiexzf;
        if (abstractC0695Ujhhgtgfeyxiexzf == null) {
            Modifiers modifiers = this.f468Ujhhgtgfeyxiexzf;
            return modifiers != null && modifiers.hasModifier(str);
        }
        int i = abstractC0695Ujhhgtgfeyxiexzf.f2847Ujhhgtgfeyxiexzf;
        Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
        return Modifier.toString(i).contains(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Object m316Ujhhgtgfeyxiexzf(Object[] objArr, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node, boolean z, Object obj) {
        Object objM363Ujhhgtgfeyxiexzf;
        Object objM317Ujhhgtgfeyxiexzf;
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Bsh method invoke: ", this.f469Ujhhgtgfeyxiexzf, " overrideNameSpace: ", Boolean.valueOf(z));
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    throw new Error("HERE!");
                }
            }
        }
        InterfaceC2588feyxiexzfUjhhgtg interfaceC2588feyxiexzfUjhhgtg = this.f478Ujhhgtgfeyxiexzf;
        if (interfaceC2588feyxiexzfUjhhgtg != null) {
            if (objArr == null) {
                objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            }
            Class[] clsArrMo313Ujhhgtgfeyxiexzf = mo313Ujhhgtgfeyxiexzf();
            if (clsArrMo313Ujhhgtgfeyxiexzf == null || clsArrMo313Ujhhgtgfeyxiexzf.length == 0) {
                return interfaceC2588feyxiexzfUjhhgtg.mo2919Ujhhgtgfeyxiexzf(objArr);
            }
            String[] strArrM312Ujhhgtgfeyxiexzf = m312Ujhhgtgfeyxiexzf();
            for (int i = 0; i < objArr.length; i++) {
                Class cls = clsArrMo313Ujhhgtgfeyxiexzf[i];
                if (cls != null) {
                    try {
                        objArr[i] = Primitive.unwrap(AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(1, cls, objArr[i]));
                    } catch (C1863Ujhhgtgfeyxiexzf e) {
                        throw new C3353Ujhhgtgfeyxiexzf("Invalid argument: `" + strArrM312Ujhhgtgfeyxiexzf[i] + "' for method: " + this.f469Ujhhgtgfeyxiexzf + " : " + e.getMessage(), node, c2637feyxiexzfUjhhgtg);
                    }
                }
            }
            return interfaceC2588feyxiexzfUjhhgtg.mo2919Ujhhgtgfeyxiexzf(objArr);
        }
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f476Ujhhgtgfeyxiexzf;
        if (abstractC0695Ujhhgtgfeyxiexzf == null) {
            Modifiers modifiers = this.f468Ujhhgtgfeyxiexzf;
            if (modifiers == null || !modifiers.hasModifier("synchronized")) {
                return m317Ujhhgtgfeyxiexzf(objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node, z, obj);
            }
            C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f467Ujhhgtgfeyxiexzf;
            if (c0029Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf) {
                try {
                    objM363Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m363Ujhhgtgfeyxiexzf();
                } catch (C1863Ujhhgtgfeyxiexzf unused) {
                    throw new C0712Ujhhgtgfeyxiexzf("Can't get class instance for synchronized method.");
                }
            } else {
                objM363Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf);
            }
            synchronized (objM363Ujhhgtgfeyxiexzf) {
                objM317Ujhhgtgfeyxiexzf = m317Ujhhgtgfeyxiexzf(objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node, z, obj);
            }
            return objM317Ujhhgtgfeyxiexzf;
        }
        try {
            Object[] objArr2 = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            if (Modifier.isStatic(abstractC0695Ujhhgtgfeyxiexzf.getModifiers())) {
                C0168Ujhhgtgfeyxiexzf c0168Ujhhgtgfeyxiexzf = RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf;
                AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf2 = this.f476Ujhhgtgfeyxiexzf;
                c0168Ujhhgtgfeyxiexzf.m1219Ujhhgtgfeyxiexzf(abstractC0695Ujhhgtgfeyxiexzf2.f2848Ujhhgtgfeyxiexzf, abstractC0695Ujhhgtgfeyxiexzf2.f2846Ujhhgtgfeyxiexzf, objArr);
            } else {
                RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1218Ujhhgtgfeyxiexzf(this.f477Ujhhgtgfeyxiexzf, this.f476Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf, objArr);
            }
            return this.f476Ujhhgtgfeyxiexzf.mo1969Ujhhgtgfeyxiexzf(this.f477Ujhhgtgfeyxiexzf, objArr);
        } catch (InvocationTargetException e2) {
            throw new C1985Ujhhgtgfeyxiexzf("Exception invoking imported object method.", e2, node, c2637feyxiexzfUjhhgtg, true);
        } catch (C0958feyxiexzfUjhhgtg e3) {
            throw new C3353Ujhhgtgfeyxiexzf("Error invoking Java method: " + e3, node, c2637feyxiexzfUjhhgtg);
        } catch (C1863Ujhhgtgfeyxiexzf e4) {
            throw e4.mo2569Ujhhgtgfeyxiexzf(node, c2637feyxiexzfUjhhgtg);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Object m317Ujhhgtgfeyxiexzf(Object[] objArr, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node, boolean z, Object obj) throws C3353Ujhhgtgfeyxiexzf {
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf;
        Object objNewInstance;
        C0920feyxiexzfUjhhgtg c0920feyxiexzfUjhhgtg;
        This thisM525Ujhhgtgfeyxiexzf;
        boolean z2;
        Object obj2;
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
        Node node2 = node;
        boolean zM315Ujhhgtgfeyxiexzf = m315Ujhhgtgfeyxiexzf("abstract");
        String str = this.f469Ujhhgtgfeyxiexzf;
        if (zM315Ujhhgtgfeyxiexzf) {
            throw new C3353Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Cannot invoke abstract method ", str), node2, c2637feyxiexzfUjhhgtg2);
        }
        Class clsMo314Ujhhgtgfeyxiexzf = mo314Ujhhgtgfeyxiexzf();
        Class<?>[] clsArrMo313Ujhhgtgfeyxiexzf = mo313Ujhhgtgfeyxiexzf();
        if (c2637feyxiexzfUjhhgtg2 == null) {
            c2637feyxiexzfUjhhgtg2 = new C2637feyxiexzfUjhhgtg(this.f467Ujhhgtgfeyxiexzf);
        }
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg3 = c2637feyxiexzfUjhhgtg2;
        Object[] objArr2 = objArr == null ? AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf : objArr;
        boolean zMo1973Ujhhgtgfeyxiexzf = this.f479Ujhhgtgfeyxiexzf;
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f476Ujhhgtgfeyxiexzf;
        if (!(abstractC0695Ujhhgtgfeyxiexzf == null ? zMo1973Ujhhgtgfeyxiexzf : abstractC0695Ujhhgtgfeyxiexzf.mo1973Ujhhgtgfeyxiexzf()) && objArr2.length != m311Ujhhgtgfeyxiexzf()) {
            throw new C3353Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Wrong number of arguments for local method: ", str), node2, c2637feyxiexzfUjhhgtg3);
        }
        int i = 1;
        if (z) {
            c0029Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg3.m3973Ujhhgtgfeyxiexzf();
        } else {
            c0029Ujhhgtgfeyxiexzf = new C0029Ujhhgtgfeyxiexzf(this.f467Ujhhgtgfeyxiexzf, null, str);
            c0029Ujhhgtgfeyxiexzf.f548Ujhhgtgfeyxiexzf = true;
        }
        if (this.f481Ujhhgtgfeyxiexzf && obj != null) {
            Object objUnwrap = Primitive.unwrap(obj);
            c0029Ujhhgtgfeyxiexzf.f541Ujhhgtgfeyxiexzf.remove(objUnwrap);
            c0029Ujhhgtgfeyxiexzf.f541Ujhhgtgfeyxiexzf.add(0, objUnwrap);
            c0029Ujhhgtgfeyxiexzf.m384feyxiexzfUjhhgtg();
            try {
                c0029Ujhhgtgfeyxiexzf.mo303feyxiexzfUjhhgtg("" + This.Keys.BSHEXTENSIONMETHODRECEIVER, obj, false);
            } catch (C1863Ujhhgtgfeyxiexzf unused) {
            }
        }
        c0029Ujhhgtgfeyxiexzf.f547Ujhhgtgfeyxiexzf = node2;
        int iM311Ujhhgtgfeyxiexzf = m311Ujhhgtgfeyxiexzf() - 1;
        if (abstractC0695Ujhhgtgfeyxiexzf != null) {
            zMo1973Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.mo1973Ujhhgtgfeyxiexzf();
        }
        if (zMo1973Ujhhgtgfeyxiexzf) {
            Class<?> cls = clsArrMo313Ujhhgtgfeyxiexzf[iM311Ujhhgtgfeyxiexzf];
            if (!(m311Ujhhgtgfeyxiexzf() == objArr2.length && ((obj2 = objArr2[iM311Ujhhgtgfeyxiexzf]) == null || (obj2.getClass().isArray() && cls.getComponentType().isAssignableFrom(objArr2[iM311Ujhhgtgfeyxiexzf].getClass().getComponentType())))) && objArr2.length >= m311Ujhhgtgfeyxiexzf() - 1) {
                objNewInstance = Array.newInstance(clsArrMo313Ujhhgtgfeyxiexzf[iM311Ujhhgtgfeyxiexzf].getComponentType(), objArr2.length - iM311Ujhhgtgfeyxiexzf);
            } else {
                objNewInstance = null;
            }
        } else {
            objNewInstance = null;
        }
        int i2 = 0;
        while (i2 < objArr2.length) {
            int i3 = i2 >= iM311Ujhhgtgfeyxiexzf ? iM311Ujhhgtgfeyxiexzf : i2;
            Class<?> componentType = (objNewInstance == null || i3 != iM311Ujhhgtgfeyxiexzf) ? clsArrMo313Ujhhgtgfeyxiexzf[i3] : clsArrMo313Ujhhgtgfeyxiexzf[i3].getComponentType();
            if (componentType != null) {
                try {
                    Object objM558Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(i, componentType, objArr2[i2]);
                    objArr2[i2] = objM558Ujhhgtgfeyxiexzf;
                    if (objNewInstance == null || i2 < iM311Ujhhgtgfeyxiexzf) {
                        c0029Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(this.f471Ujhhgtgfeyxiexzf[i3], componentType, objM558Ujhhgtgfeyxiexzf, this.f474Ujhhgtgfeyxiexzf[i3]);
                    } else {
                        try {
                            Array.set(objNewInstance, i2 - i3, Primitive.unwrap(objM558Ujhhgtgfeyxiexzf));
                        } catch (C1863Ujhhgtgfeyxiexzf e) {
                            throw e.mo2570Ujhhgtgfeyxiexzf("Typed method parameter assignment", node2, c2637feyxiexzfUjhhgtg3);
                        }
                    }
                    z2 = false;
                } catch (C1863Ujhhgtgfeyxiexzf e2) {
                    throw new C3353Ujhhgtgfeyxiexzf("Invalid argument: `" + this.f471Ujhhgtgfeyxiexzf[i3] + "' for method: " + str + " : " + e2.getMessage(), node2, c2637feyxiexzfUjhhgtg3);
                }
            } else {
                objArr2 = objArr2;
                Object obj3 = objArr2[i2];
                if (obj3 == Primitive.VOID) {
                    throw new C3353Ujhhgtgfeyxiexzf("Undefined variable or class name, parameter: " + this.f471Ujhhgtgfeyxiexzf[i3] + " to method: " + str, node2, c2637feyxiexzfUjhhgtg3);
                }
                try {
                    String str2 = this.f471Ujhhgtgfeyxiexzf[i3];
                    runnableC0026Ujhhgtgfeyxiexzf.getClass();
                    z2 = false;
                    c0029Ujhhgtgfeyxiexzf.mo303feyxiexzfUjhhgtg(str2, obj3, false);
                } catch (C1863Ujhhgtgfeyxiexzf e3) {
                    throw e3.mo2570Ujhhgtgfeyxiexzf("Typed method parameter assignment", node2, c2637feyxiexzfUjhhgtg3);
                }
            }
            i2++;
            objArr2 = objArr2;
            i = 1;
        }
        if (objNewInstance != null) {
            try {
                c0029Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(this.f471Ujhhgtgfeyxiexzf[iM311Ujhhgtgfeyxiexzf], clsArrMo313Ujhhgtgfeyxiexzf[iM311Ujhhgtgfeyxiexzf], objNewInstance, this.f474Ujhhgtgfeyxiexzf[iM311Ujhhgtgfeyxiexzf]);
            } catch (C1863Ujhhgtgfeyxiexzf e4) {
                throw e4.mo2570Ujhhgtgfeyxiexzf("Typed method parameter assignment", node2, c2637feyxiexzfUjhhgtg3);
            }
        }
        if (!z) {
            c2637feyxiexzfUjhhgtg3.m3971Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf);
        }
        try {
            Object objEval = this.f475Ujhhgtgfeyxiexzf.eval(c2637feyxiexzfUjhhgtg3, runnableC0026Ujhhgtgfeyxiexzf, Boolean.TRUE);
            C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg4 = new C2637feyxiexzfUjhhgtg();
            c2637feyxiexzfUjhhgtg4.f8478Ujhhgtgfeyxiexzf.addAll(c2637feyxiexzfUjhhgtg3.f8478Ujhhgtgfeyxiexzf);
            if (!z) {
                c2637feyxiexzfUjhhgtg3.m3970Ujhhgtgfeyxiexzf();
            }
            boolean z3 = objEval instanceof C0920feyxiexzfUjhhgtg;
            Class cls2 = Void.TYPE;
            if (z3) {
                c0920feyxiexzfUjhhgtg = (C0920feyxiexzfUjhhgtg) objEval;
                Node node3 = c0920feyxiexzfUjhhgtg.f3740Ujhhgtgfeyxiexzf;
                if (c0920feyxiexzfUjhhgtg.f3737Ujhhgtgfeyxiexzf != 47) {
                    throw new C3354Ujhhgtgfeyxiexzf("'continue' or 'break' in method body", node3, c2637feyxiexzfUjhhgtg4);
                }
                Object obj4 = c0920feyxiexzfUjhhgtg.f3739Ujhhgtgfeyxiexzf;
                if (clsMo314Ujhhgtgfeyxiexzf == cls2 && obj4 != Primitive.VOID) {
                    throw new C3354Ujhhgtgfeyxiexzf("Cannot return value from void method", node3, c2637feyxiexzfUjhhgtg4);
                }
                objEval = obj4;
            } else {
                c0920feyxiexzfUjhhgtg = null;
            }
            if (clsMo314Ujhhgtgfeyxiexzf != null) {
                if (clsMo314Ujhhgtgfeyxiexzf == cls2) {
                    return Primitive.VOID;
                }
                try {
                    objEval = AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(1, clsMo314Ujhhgtgfeyxiexzf, objEval);
                } catch (C1863Ujhhgtgfeyxiexzf e5) {
                    if (c0920feyxiexzfUjhhgtg != null) {
                        node2 = c0920feyxiexzfUjhhgtg.f3740Ujhhgtgfeyxiexzf;
                    }
                    throw e5.mo2570Ujhhgtgfeyxiexzf("Incorrect type returned from method: " + str + e5.getMessage(), node2, c2637feyxiexzfUjhhgtg3);
                }
            }
            return (!"clone".equals(m310Ujhhgtgfeyxiexzf()) || (thisM525Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m525Ujhhgtgfeyxiexzf(objEval, objEval.getClass().getSimpleName())) == null) ? objEval : thisM525Ujhhgtgfeyxiexzf.cloneMethodImpl(node2, c2637feyxiexzfUjhhgtg3, objEval);
        } catch (Throwable th) {
            if (!z) {
                c2637feyxiexzfUjhhgtg3.m3970Ujhhgtgfeyxiexzf();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m318Ujhhgtgfeyxiexzf() {
        Class[] clsArr = this.f473Ujhhgtgfeyxiexzf;
        if (this.f483Ujhhgtgfeyxiexzf) {
            try {
                this.f483Ujhhgtgfeyxiexzf = false;
                if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(this.f470Ujhhgtgfeyxiexzf)) {
                    this.f470Ujhhgtgfeyxiexzf = this.f467Ujhhgtgfeyxiexzf.m362Ujhhgtgfeyxiexzf(this.f470Ujhhgtgfeyxiexzf.getName());
                }
                for (int i = 0; i < clsArr.length; i++) {
                    if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(clsArr[i])) {
                        clsArr[i] = this.f467Ujhhgtgfeyxiexzf.m362Ujhhgtgfeyxiexzf(clsArr[i].getName());
                    }
                }
            } catch (C1863Ujhhgtgfeyxiexzf unused) {
            }
        }
    }

    public C0021Ujhhgtgfeyxiexzf(AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf, Object obj) {
        this(abstractC0695Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf, abstractC0695Ujhhgtgfeyxiexzf.mo1641Ujhhgtgfeyxiexzf(), null, abstractC0695Ujhhgtgfeyxiexzf.mo1967Ujhhgtgfeyxiexzf(), null, null, null, null, abstractC0695Ujhhgtgfeyxiexzf.mo1973Ujhhgtgfeyxiexzf());
        this.f476Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf;
        this.f477Ujhhgtgfeyxiexzf = obj;
    }

    public C0021Ujhhgtgfeyxiexzf(String str, Class[] clsArr, InterfaceC2588feyxiexzfUjhhgtg interfaceC2588feyxiexzfUjhhgtg) {
        this(str, null, null, clsArr, null, null, null, null, false);
        this.f478Ujhhgtgfeyxiexzf = interfaceC2588feyxiexzfUjhhgtg;
    }
}
