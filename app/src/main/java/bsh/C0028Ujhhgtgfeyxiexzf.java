package bsh;

import bsh.This;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import p000.AbstractC0695Ujhhgtgfeyxiexzf;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C0168Ujhhgtgfeyxiexzf;
import p000.C0407Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C0958feyxiexzfUjhhgtg;
import p000.C1862Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2571Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C2809Ujhhgtgfeyxiexzf;
import p000.C2810Ujhhgtgfeyxiexzf;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.InterfaceC1087feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0028Ujhhgtgfeyxiexzf implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final Pattern f524Ujhhgtgfeyxiexzf = Pattern.compile("eval|assert");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0029Ujhhgtgfeyxiexzf f525Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public String f526Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public String f527Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public String f528Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public Object f529Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f530Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Class f531Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public Class f532Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int m346Ujhhgtgfeyxiexzf(String str) {
        if (str == null) {
            return 0;
        }
        return C0407Ujhhgtgfeyxiexzf.m1687Ujhhgtgfeyxiexzf(str).f2195Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C0029Ujhhgtgfeyxiexzf m347Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf) {
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf2;
        if (c0029Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        if (c0029Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf) {
            return c0029Ujhhgtgfeyxiexzf;
        }
        if (c0029Ujhhgtgfeyxiexzf.f548Ujhhgtgfeyxiexzf && (c0029Ujhhgtgfeyxiexzf2 = c0029Ujhhgtgfeyxiexzf.f535Ujhhgtgfeyxiexzf) != null && c0029Ujhhgtgfeyxiexzf2.f549Ujhhgtgfeyxiexzf) {
            return c0029Ujhhgtgfeyxiexzf2;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static boolean m348Ujhhgtgfeyxiexzf(String str) {
        return m346Ujhhgtgfeyxiexzf(str) > 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static String m349Ujhhgtgfeyxiexzf(int i, String str) {
        if (str == null) {
            return null;
        }
        C0407Ujhhgtgfeyxiexzf c0407UjhhgtgfeyxiexzfM1687Ujhhgtgfeyxiexzf = C0407Ujhhgtgfeyxiexzf.m1687Ujhhgtgfeyxiexzf(str);
        String[] strArr = c0407UjhhgtgfeyxiexzfM1687Ujhhgtgfeyxiexzf.f2192Ujhhgtgfeyxiexzf;
        if (1 > i || c0407UjhhgtgfeyxiexzfM1687Ujhhgtgfeyxiexzf.f2195Ujhhgtgfeyxiexzf < i) {
            return null;
        }
        if (strArr[i] == null) {
            strArr[i] = String.join(".", c0407UjhhgtgfeyxiexzfM1687Ujhhgtgfeyxiexzf.f2194Ujhhgtgfeyxiexzf.subList(0, i));
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static String m350Ujhhgtgfeyxiexzf(int i, String str) {
        int i2;
        if (str == null) {
            return null;
        }
        C0407Ujhhgtgfeyxiexzf c0407UjhhgtgfeyxiexzfM1687Ujhhgtgfeyxiexzf = C0407Ujhhgtgfeyxiexzf.m1687Ujhhgtgfeyxiexzf(str);
        String[] strArr = c0407UjhhgtgfeyxiexzfM1687Ujhhgtgfeyxiexzf.f2193Ujhhgtgfeyxiexzf;
        if (1 > i || (i2 = c0407UjhhgtgfeyxiexzfM1687Ujhhgtgfeyxiexzf.f2195Ujhhgtgfeyxiexzf) < i) {
            return null;
        }
        if (strArr[i] == null) {
            strArr[i] = String.join(".", c0407UjhhgtgfeyxiexzfM1687Ujhhgtgfeyxiexzf.f2194Ujhhgtgfeyxiexzf.subList(i2 - i, i2));
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static String m351Ujhhgtgfeyxiexzf(String str) {
        return m350Ujhhgtgfeyxiexzf(m346Ujhhgtgfeyxiexzf(str) - 1, str);
    }

    public final String toString() {
        return this.f526Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m352Ujhhgtgfeyxiexzf(String str, String str2, Object obj) {
        if (obj == null) {
            throw new C0712Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("lastEvalName = ", str));
        }
        this.f528Ujhhgtgfeyxiexzf = str;
        this.f527Ujhhgtgfeyxiexzf = str2;
        this.f529Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object m353Ujhhgtgfeyxiexzf(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, boolean z, boolean z2) throws C1863Ujhhgtgfeyxiexzf {
        Object objM355Ujhhgtgfeyxiexzf;
        String str = this.f526Ujhhgtgfeyxiexzf;
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f525Ujhhgtgfeyxiexzf;
        Object objM537Ujhhgtgfeyxiexzf = null;
        if (this.f529Ujhhgtgfeyxiexzf == null && !m348Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf) && !z && (objM355Ujhhgtgfeyxiexzf = m355Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, c0029Ujhhgtgfeyxiexzf, runnableC0026Ujhhgtgfeyxiexzf, this.f527Ujhhgtgfeyxiexzf, false)) != Primitive.VOID) {
            m352Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf, null, objM355Ujhhgtgfeyxiexzf);
            return objM355Ujhhgtgfeyxiexzf;
        }
        String strM349Ujhhgtgfeyxiexzf = m349Ujhhgtgfeyxiexzf(1, this.f527Ujhhgtgfeyxiexzf);
        Object obj = this.f529Ujhhgtgfeyxiexzf;
        if ((obj == null || (obj instanceof This)) && !z) {
            Object objM355Ujhhgtgfeyxiexzf2 = obj == null ? m355Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, c0029Ujhhgtgfeyxiexzf, runnableC0026Ujhhgtgfeyxiexzf, strM349Ujhhgtgfeyxiexzf, false) : m355Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, ((This) obj).namespace, runnableC0026Ujhhgtgfeyxiexzf, strM349Ujhhgtgfeyxiexzf, true);
            if (objM355Ujhhgtgfeyxiexzf2 != Primitive.VOID) {
                m352Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf, m351Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf), objM355Ujhhgtgfeyxiexzf2);
                return objM355Ujhhgtgfeyxiexzf2;
            }
        } else {
            c0029Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
        }
        if (this.f529Ujhhgtgfeyxiexzf == null) {
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("trying class: ", this.f527Ujhhgtgfeyxiexzf);
            Class clsM362Ujhhgtgfeyxiexzf = null;
            String strM349Ujhhgtgfeyxiexzf2 = null;
            int i = 1;
            while (i <= m346Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf) && (clsM362Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m362Ujhhgtgfeyxiexzf((strM349Ujhhgtgfeyxiexzf2 = m349Ujhhgtgfeyxiexzf(i, this.f527Ujhhgtgfeyxiexzf)))) == null) {
                i++;
            }
            if (clsM362Ujhhgtgfeyxiexzf != null) {
                String str2 = this.f527Ujhhgtgfeyxiexzf;
                String strM350Ujhhgtgfeyxiexzf = m350Ujhhgtgfeyxiexzf(m346Ujhhgtgfeyxiexzf(str2) - i, str2);
                C2810Ujhhgtgfeyxiexzf c2810Ujhhgtgfeyxiexzf = new C2810Ujhhgtgfeyxiexzf(clsM362Ujhhgtgfeyxiexzf);
                m352Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf2, strM350Ujhhgtgfeyxiexzf, c2810Ujhhgtgfeyxiexzf);
                return c2810Ujhhgtgfeyxiexzf;
            }
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("not a class, trying var prefix ", this.f527Ujhhgtgfeyxiexzf);
        }
        Object obj2 = this.f529Ujhhgtgfeyxiexzf;
        if ((obj2 == null || (obj2 instanceof This)) && !z && z2) {
            C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf2 = obj2 == null ? c0029Ujhhgtgfeyxiexzf : ((This) obj2).namespace;
            This thisMo299Ujhhgtgfeyxiexzf = new C0029Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf2, null, AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("auto: ", strM349Ujhhgtgfeyxiexzf)).mo299Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf);
            c0029Ujhhgtgfeyxiexzf2.mo303feyxiexzfUjhhgtg(strM349Ujhhgtgfeyxiexzf, thisMo299Ujhhgtgfeyxiexzf, this.f529Ujhhgtgfeyxiexzf == null);
            m352Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf, m351Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf), thisMo299Ujhhgtgfeyxiexzf);
            return thisMo299Ujhhgtgfeyxiexzf;
        }
        if (obj2 == null) {
            if (m348Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf)) {
                throw new C1863Ujhhgtgfeyxiexzf("Class or variable not found: " + this.f527Ujhhgtgfeyxiexzf);
            }
            Object objM374Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m374Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf, runnableC0026Ujhhgtgfeyxiexzf);
            m352Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf, null, objM374Ujhhgtgfeyxiexzf);
            return objM374Ujhhgtgfeyxiexzf;
        }
        if (obj2 == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Null Pointer while evaluating: ", str));
            throw new C1862Ujhhgtgfeyxiexzf(nullPointerException.getMessage(), nullPointerException);
        }
        if (obj2 == Primitive.VOID) {
            throw new C1863Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Undefined variable or class name while evaluating: ", str));
        }
        if (obj2 instanceof Primitive) {
            throw new C1863Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Can't treat primitive like an object. Error while evaluating: ", str));
        }
        if (!(obj2 instanceof C2810Ujhhgtgfeyxiexzf)) {
            if (z) {
                throw new C1863Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(str, " does not resolve to a class name."));
            }
            String strM349Ujhhgtgfeyxiexzf3 = m349Ujhhgtgfeyxiexzf(1, this.f527Ujhhgtgfeyxiexzf);
            RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1216Ujhhgtgfeyxiexzf();
            if (strM349Ujhhgtgfeyxiexzf3.equals("length") && this.f529Ujhhgtgfeyxiexzf.getClass().isArray()) {
                Primitive primitive = new Primitive(Array.getLength(this.f529Ujhhgtgfeyxiexzf));
                m352Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf3, m351Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf), primitive);
                return primitive;
            }
            try {
                Object objM535Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m535Ujhhgtgfeyxiexzf(this.f529Ujhhgtgfeyxiexzf, strM349Ujhhgtgfeyxiexzf3);
                m352Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf3, m351Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf), objM535Ujhhgtgfeyxiexzf);
                return objM535Ujhhgtgfeyxiexzf;
            } catch (C0958feyxiexzfUjhhgtg unused) {
                Object objM537Ujhhgtgfeyxiexzf2 = AbstractC0033Ujhhgtgfeyxiexzf.m537Ujhhgtgfeyxiexzf(this.f529Ujhhgtgfeyxiexzf, strM349Ujhhgtgfeyxiexzf3);
                m352Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf3, m351Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf), objM537Ujhhgtgfeyxiexzf2);
                return objM537Ujhhgtgfeyxiexzf2;
            }
        }
        Class<?> cls = ((C2810Ujhhgtgfeyxiexzf) obj2).f8945Ujhhgtgfeyxiexzf;
        String strM349Ujhhgtgfeyxiexzf4 = m349Ujhhgtgfeyxiexzf(1, this.f527Ujhhgtgfeyxiexzf);
        if (strM349Ujhhgtgfeyxiexzf4.equals("this")) {
            while (c0029Ujhhgtgfeyxiexzf != null) {
                Object obj3 = c0029Ujhhgtgfeyxiexzf.f553Ujhhgtgfeyxiexzf;
                if (obj3 != null && obj3.getClass() == cls) {
                    String strM351Ujhhgtgfeyxiexzf = m351Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf);
                    Object obj4 = c0029Ujhhgtgfeyxiexzf.f553Ujhhgtgfeyxiexzf;
                    m352Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf4, strM351Ujhhgtgfeyxiexzf, obj4);
                    return obj4;
                }
                c0029Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.f535Ujhhgtgfeyxiexzf;
            }
            throw new C1863Ujhhgtgfeyxiexzf(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(cls, "Can't find enclosing 'this' instance of class: "));
        }
        RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1217Ujhhgtgfeyxiexzf(cls, strM349Ujhhgtgfeyxiexzf4);
        try {
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Name call to getStaticFieldValue, class: ", cls, ", field:", strM349Ujhhgtgfeyxiexzf4);
            objM537Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m530Ujhhgtgfeyxiexzf(cls, null, strM349Ujhhgtgfeyxiexzf4, true);
        } catch (C0958feyxiexzfUjhhgtg e) {
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("field reflect error: ", e);
        }
        if (objM537Ujhhgtgfeyxiexzf == null) {
            Class clsM362Ujhhgtgfeyxiexzf2 = c0029Ujhhgtgfeyxiexzf.m362Ujhhgtgfeyxiexzf(cls.getName() + "$" + strM349Ujhhgtgfeyxiexzf4);
            if (c0029Ujhhgtgfeyxiexzf.f553Ujhhgtgfeyxiexzf == null && AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(clsM362Ujhhgtgfeyxiexzf2) && !AbstractC0033Ujhhgtgfeyxiexzf.m526Ujhhgtgfeyxiexzf(clsM362Ujhhgtgfeyxiexzf2).hasModifier("static")) {
                throw new C1863Ujhhgtgfeyxiexzf("an enclosing instance that contains " + cls.getName() + "." + strM349Ujhhgtgfeyxiexzf4 + " is required");
            }
            if (clsM362Ujhhgtgfeyxiexzf2 != null) {
                objM537Ujhhgtgfeyxiexzf = new C2810Ujhhgtgfeyxiexzf(clsM362Ujhhgtgfeyxiexzf2);
            }
        }
        if (objM537Ujhhgtgfeyxiexzf == null) {
            objM537Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m537Ujhhgtgfeyxiexzf(cls, strM349Ujhhgtgfeyxiexzf4);
        }
        m352Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf4, m351Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf), objM537Ujhhgtgfeyxiexzf);
        return objM537Ujhhgtgfeyxiexzf;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object m354Ujhhgtgfeyxiexzf(RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, Object[] objArr, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node) throws C1863Ujhhgtgfeyxiexzf, C3353Ujhhgtgfeyxiexzf {
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf;
        C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM369Ujhhgtgfeyxiexzf;
        C1863Ujhhgtgfeyxiexzf c1863Ujhhgtgfeyxiexzf;
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf;
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg2;
        Object obj;
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf2 = this.f525Ujhhgtgfeyxiexzf;
        String str = this.f526Ujhhgtgfeyxiexzf;
        String strM350Ujhhgtgfeyxiexzf = m350Ujhhgtgfeyxiexzf(1, str);
        C2809Ujhhgtgfeyxiexzf c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf();
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
        Class cls = this.f532Ujhhgtgfeyxiexzf;
        if (cls != null) {
            RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1219Ujhhgtgfeyxiexzf(cls, strM350Ujhhgtgfeyxiexzf, objArr);
            return AbstractC0033Ujhhgtgfeyxiexzf.m544feyxiexzfUjhhgtg(c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf, this.f532Ujhhgtgfeyxiexzf, strM350Ujhhgtgfeyxiexzf, objArr, node);
        }
        if (m348Ujhhgtgfeyxiexzf(str)) {
            String strM349Ujhhgtgfeyxiexzf = m349Ujhhgtgfeyxiexzf(m346Ujhhgtgfeyxiexzf(str) - 1, str);
            if (strM349Ujhhgtgfeyxiexzf.equals("super") && m346Ujhhgtgfeyxiexzf(str) == 2) {
                C0029Ujhhgtgfeyxiexzf nameSpace = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf).getNameSpace();
                nameSpace.f547Ujhhgtgfeyxiexzf = node;
                C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM347Ujhhgtgfeyxiexzf = m347Ujhhgtgfeyxiexzf(nameSpace);
                if (c0029UjhhgtgfeyxiexzfM347Ujhhgtgfeyxiexzf != null) {
                    Object objM363Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM347Ujhhgtgfeyxiexzf.m363Ujhhgtgfeyxiexzf();
                    Class cls2 = c0029UjhhgtgfeyxiexzfM347Ujhhgtgfeyxiexzf.f552Ujhhgtgfeyxiexzf;
                    RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1218Ujhhgtgfeyxiexzf(objM363Ujhhgtgfeyxiexzf, strM350Ujhhgtgfeyxiexzf, objArr);
                    if (C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf == null) {
                        C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf = new C0023Ujhhgtgfeyxiexzf();
                    }
                    C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf.getClass();
                    Class superclass = cls2.getSuperclass();
                    AbstractC0695Ujhhgtgfeyxiexzf abstractC0695UjhhgtgfeyxiexzfM550feyxiexzfUjhhgtg = AbstractC0033Ujhhgtgfeyxiexzf.m550feyxiexzfUjhhgtg(objM363Ujhhgtgfeyxiexzf.getClass(), This.Keys.BSHSUPER + superclass.getSimpleName() + strM350Ujhhgtgfeyxiexzf, AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr), false);
                    return abstractC0695UjhhgtgfeyxiexzfM550feyxiexzfUjhhgtg != null ? abstractC0695UjhhgtgfeyxiexzfM550feyxiexzfUjhhgtg.mo1969Ujhhgtgfeyxiexzf(objM363Ujhhgtgfeyxiexzf, objArr) : AbstractC0033Ujhhgtgfeyxiexzf.m549feyxiexzfUjhhgtg(c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf, superclass, objM363Ujhhgtgfeyxiexzf, strM350Ujhhgtgfeyxiexzf, objArr, false).mo1969Ujhhgtgfeyxiexzf(objM363Ujhhgtgfeyxiexzf, objArr);
                }
            }
            C0028Ujhhgtgfeyxiexzf c0028UjhhgtgfeyxiexzfM371Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.m371Ujhhgtgfeyxiexzf(strM349Ujhhgtgfeyxiexzf);
            Object objM358Ujhhgtgfeyxiexzf = c0028UjhhgtgfeyxiexzfM371Ujhhgtgfeyxiexzf.m358Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, false);
            if (objM358Ujhhgtgfeyxiexzf == Primitive.VOID) {
                throw new C1863Ujhhgtgfeyxiexzf("Attempt to resolve method: " + strM350Ujhhgtgfeyxiexzf + "() on undefined variable or class name: " + c0028UjhhgtgfeyxiexzfM371Ujhhgtgfeyxiexzf);
            }
            if (objM358Ujhhgtgfeyxiexzf instanceof C2810Ujhhgtgfeyxiexzf) {
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("invokeMethod: trying static - ", c0028UjhhgtgfeyxiexzfM371Ujhhgtgfeyxiexzf);
                Class cls3 = ((C2810Ujhhgtgfeyxiexzf) objM358Ujhhgtgfeyxiexzf).f8945Ujhhgtgfeyxiexzf;
                this.f532Ujhhgtgfeyxiexzf = cls3;
                RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1219Ujhhgtgfeyxiexzf(cls3, strM350Ujhhgtgfeyxiexzf, objArr);
                return AbstractC0033Ujhhgtgfeyxiexzf.m544feyxiexzfUjhhgtg(c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf, cls3, strM350Ujhhgtgfeyxiexzf, objArr, node);
            }
            if ((objM358Ujhhgtgfeyxiexzf instanceof Primitive) && objM358Ujhhgtgfeyxiexzf == Primitive.NULL) {
                NullPointerException nullPointerException = new NullPointerException("Null Pointer in Method Invocation of " + strM350Ujhhgtgfeyxiexzf + "() on variable: " + c0028UjhhgtgfeyxiexzfM371Ujhhgtgfeyxiexzf);
                throw new C1862Ujhhgtgfeyxiexzf(nullPointerException.getMessage(), nullPointerException);
            }
            if (objM358Ujhhgtgfeyxiexzf.getClass().isEnum() && (c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m539Ujhhgtgfeyxiexzf(objM358Ujhhgtgfeyxiexzf)) != null && (c0021UjhhgtgfeyxiexzfM369Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.m369Ujhhgtgfeyxiexzf(strM350Ujhhgtgfeyxiexzf, AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr), true)) != null) {
                return c0021UjhhgtgfeyxiexzfM369Ujhhgtgfeyxiexzf.m316Ujhhgtgfeyxiexzf(objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node, false, null);
            }
            RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1218Ujhhgtgfeyxiexzf(objM358Ujhhgtgfeyxiexzf, strM350Ujhhgtgfeyxiexzf, objArr);
            return AbstractC0033Ujhhgtgfeyxiexzf.m543Ujhhgtgfeyxiexzf(objM358Ujhhgtgfeyxiexzf, strM350Ujhhgtgfeyxiexzf, objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node);
        }
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("invokeLocalMethod: ", str);
        String str2 = this.f526Ujhhgtgfeyxiexzf;
        Class[] clsArrM563Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr);
        try {
            C0168Ujhhgtgfeyxiexzf c0168Ujhhgtgfeyxiexzf = RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf;
            c0168Ujhhgtgfeyxiexzf.getClass();
            Primitive.unwrap(objArr);
            Iterator it = c0168Ujhhgtgfeyxiexzf.f1352Ujhhgtgfeyxiexzf.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC1087feyxiexzfUjhhgtg) it.next()).getClass();
                } catch (C1863Ujhhgtgfeyxiexzf e) {
                    c1863Ujhhgtgfeyxiexzf = e;
                    throw c1863Ujhhgtgfeyxiexzf.mo2569Ujhhgtgfeyxiexzf(node, c2637feyxiexzfUjhhgtg);
                }
            }
            C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM366Ujhhgtgfeyxiexzf = null;
            try {
                Object objM355Ujhhgtgfeyxiexzf = m355Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, c0029Ujhhgtgfeyxiexzf2, runnableC0026Ujhhgtgfeyxiexzf, "this", false);
                c0029Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf2;
                c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
                try {
                    if (objM355Ujhhgtgfeyxiexzf instanceof This) {
                        objM355Ujhhgtgfeyxiexzf = Primitive.unwrap(objM355Ujhhgtgfeyxiexzf);
                    }
                    obj = objM355Ujhhgtgfeyxiexzf;
                } catch (C1863Ujhhgtgfeyxiexzf unused) {
                    obj = null;
                }
            } catch (C1863Ujhhgtgfeyxiexzf unused2) {
                c0029Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf2;
                c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
            }
            if (obj != null) {
                try {
                    if (obj != Primitive.NULL && obj != Primitive.VOID) {
                        c0021UjhhgtgfeyxiexzfM366Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m366Ujhhgtgfeyxiexzf(AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(obj, false), str2, clsArrM563Ujhhgtgfeyxiexzf);
                    }
                } catch (C1863Ujhhgtgfeyxiexzf e2) {
                    throw e2.mo2570Ujhhgtgfeyxiexzf("Local method invocation", node, c2637feyxiexzfUjhhgtg2);
                }
            }
            if (c0021UjhhgtgfeyxiexzfM366Ujhhgtgfeyxiexzf == null) {
                c0021UjhhgtgfeyxiexzfM366Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m369Ujhhgtgfeyxiexzf(str2, clsArrM563Ujhhgtgfeyxiexzf, false);
            }
            C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf = c0021UjhhgtgfeyxiexzfM366Ujhhgtgfeyxiexzf;
            if (c0021Ujhhgtgfeyxiexzf != null) {
                return c0021Ujhhgtgfeyxiexzf.m316Ujhhgtgfeyxiexzf(objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg2, node, (c0029Ujhhgtgfeyxiexzf.f548Ujhhgtgfeyxiexzf || c0021Ujhhgtgfeyxiexzf.f480Ujhhgtgfeyxiexzf || !c0029Ujhhgtgfeyxiexzf.m381feyxiexzfUjhhgtg(c0021Ujhhgtgfeyxiexzf.f467Ujhhgtgfeyxiexzf) || c0029Ujhhgtgfeyxiexzf.f535Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf || f524Ujhhgtgfeyxiexzf.matcher(c0021Ujhhgtgfeyxiexzf.m310Ujhhgtgfeyxiexzf()).matches()) ? false : true, obj);
            }
            return c0029Ujhhgtgfeyxiexzf.m379feyxiexzfUjhhgtg(str2, objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node, false);
        } catch (C1863Ujhhgtgfeyxiexzf e3) {
            c1863Ujhhgtgfeyxiexzf = e3;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Object m355Ujhhgtgfeyxiexzf(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, String str, boolean z) throws C1863Ujhhgtgfeyxiexzf {
        Object objM375Ujhhgtgfeyxiexzf;
        if (str.equals("this")) {
            for (C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf2 = c0029Ujhhgtgfeyxiexzf; c0029Ujhhgtgfeyxiexzf2 != null; c0029Ujhhgtgfeyxiexzf2 = c0029Ujhhgtgfeyxiexzf2.f535Ujhhgtgfeyxiexzf) {
                Object objM375Ujhhgtgfeyxiexzf2 = c0029Ujhhgtgfeyxiexzf2.m375Ujhhgtgfeyxiexzf(This.Keys.BSHEXTENSIONMETHODRECEIVER.toString(), false);
                if (objM375Ujhhgtgfeyxiexzf2 != Primitive.VOID && objM375Ujhhgtgfeyxiexzf2 != Primitive.NULL) {
                    return objM375Ujhhgtgfeyxiexzf2;
                }
                if (c0029Ujhhgtgfeyxiexzf2.f549Ujhhgtgfeyxiexzf) {
                    break;
                }
            }
            if (z) {
                throw new C1863Ujhhgtgfeyxiexzf("Redundant to call .this on This type");
            }
            This thisMo299Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf);
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM347Ujhhgtgfeyxiexzf = m347Ujhhgtgfeyxiexzf(thisMo299Ujhhgtgfeyxiexzf.getNameSpace());
            if (c0029UjhhgtgfeyxiexzfM347Ujhhgtgfeyxiexzf != null) {
                return m348Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf) ? c0029UjhhgtgfeyxiexzfM347Ujhhgtgfeyxiexzf.mo299Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf) : c0029UjhhgtgfeyxiexzfM347Ujhhgtgfeyxiexzf.m363Ujhhgtgfeyxiexzf();
            }
            return thisMo299Ujhhgtgfeyxiexzf;
        }
        if (str.equals("super")) {
            This thisMo298Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.mo298Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf);
            C0029Ujhhgtgfeyxiexzf nameSpace = thisMo298Ujhhgtgfeyxiexzf.getNameSpace();
            C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf3 = nameSpace.f535Ujhhgtgfeyxiexzf;
            return (c0029Ujhhgtgfeyxiexzf3 == null || !c0029Ujhhgtgfeyxiexzf3.f549Ujhhgtgfeyxiexzf) ? thisMo298Ujhhgtgfeyxiexzf : nameSpace.mo298Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf);
        }
        Object objM367Ujhhgtgfeyxiexzf = str.equals("global") ? c0029Ujhhgtgfeyxiexzf.m367Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf) : null;
        if (objM367Ujhhgtgfeyxiexzf == null && z) {
            if (str.equals("namespace")) {
                objM367Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
            } else if (str.equals("variables")) {
                objM367Ujhhgtgfeyxiexzf = (String[]) c0029Ujhhgtgfeyxiexzf.f536Ujhhgtgfeyxiexzf.keySet().stream().toArray(new C2571Ujhhgtgfeyxiexzf(5));
            } else if (str.equals("methods")) {
                objM367Ujhhgtgfeyxiexzf = (String[]) c0029Ujhhgtgfeyxiexzf.f537Ujhhgtgfeyxiexzf.keySet().stream().toArray(new C2571Ujhhgtgfeyxiexzf(7));
            } else if (str.equals("interpreter")) {
                if (!this.f528Ujhhgtgfeyxiexzf.equals("this")) {
                    throw new C1863Ujhhgtgfeyxiexzf("Can only call .interpreter on literal 'this'");
                }
                objM367Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf;
            }
        }
        if (objM367Ujhhgtgfeyxiexzf == null && z && str.equals("caller")) {
            if (!this.f528Ujhhgtgfeyxiexzf.equals("this") && !this.f528Ujhhgtgfeyxiexzf.equals("caller")) {
                throw new C1863Ujhhgtgfeyxiexzf("Can only call .caller on literal 'this' or literal '.caller'");
            }
            if (c2637feyxiexzfUjhhgtg == null) {
                throw new C0712Ujhhgtgfeyxiexzf("no callstack");
            }
            int i = this.f530Ujhhgtgfeyxiexzf + 1;
            this.f530Ujhhgtgfeyxiexzf = i;
            Stack stack = c2637feyxiexzfUjhhgtg.f8478Ujhhgtgfeyxiexzf;
            int size = stack.size();
            return (i >= size ? C0029Ujhhgtgfeyxiexzf.f533Ujhhgtgfeyxiexzf : ((C0029Ujhhgtgfeyxiexzf[]) stack.toArray(new C0029Ujhhgtgfeyxiexzf[size]))[(size - 1) - i]).mo299Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf);
        }
        if (objM367Ujhhgtgfeyxiexzf == null && z && str.equals("callstack")) {
            if (!this.f528Ujhhgtgfeyxiexzf.equals("this")) {
                objM375Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg;
                throw new C1863Ujhhgtgfeyxiexzf("Can only call .callstack on literal 'this'");
            }
            if (c2637feyxiexzfUjhhgtg == null) {
                throw new C0712Ujhhgtgfeyxiexzf("no callstack");
            }
        } else {
            objM375Ujhhgtgfeyxiexzf = objM367Ujhhgtgfeyxiexzf;
        }
        if (objM375Ujhhgtgfeyxiexzf == null) {
            objM375Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m375Ujhhgtgfeyxiexzf(str, this.f529Ujhhgtgfeyxiexzf == null);
        }
        return objM375Ujhhgtgfeyxiexzf == null ? Primitive.NULL : objM375Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final synchronized Class m356Ujhhgtgfeyxiexzf() {
        Class cls = this.f531Ujhhgtgfeyxiexzf;
        if (cls != null) {
            return cls;
        }
        String str = this.f526Ujhhgtgfeyxiexzf;
        this.f527Ujhhgtgfeyxiexzf = str;
        Object objM358Ujhhgtgfeyxiexzf = null;
        this.f529Ujhhgtgfeyxiexzf = null;
        this.f530Ujhhgtgfeyxiexzf = 0;
        if (!str.equals("var") && !this.f527Ujhhgtgfeyxiexzf.equals("val")) {
            Class clsM362Ujhhgtgfeyxiexzf = this.f525Ujhhgtgfeyxiexzf.m362Ujhhgtgfeyxiexzf(this.f527Ujhhgtgfeyxiexzf);
            if (clsM362Ujhhgtgfeyxiexzf == null) {
                try {
                    objM358Ujhhgtgfeyxiexzf = m358Ujhhgtgfeyxiexzf(null, null, true);
                } catch (C1863Ujhhgtgfeyxiexzf unused) {
                }
                if (objM358Ujhhgtgfeyxiexzf instanceof C2810Ujhhgtgfeyxiexzf) {
                    clsM362Ujhhgtgfeyxiexzf = ((C2810Ujhhgtgfeyxiexzf) objM358Ujhhgtgfeyxiexzf).f8945Ujhhgtgfeyxiexzf;
                }
            }
            if (clsM362Ujhhgtgfeyxiexzf != null) {
                this.f531Ujhhgtgfeyxiexzf = clsM362Ujhhgtgfeyxiexzf;
                return clsM362Ujhhgtgfeyxiexzf;
            }
            throw new ClassNotFoundException("Class: " + this.f526Ujhhgtgfeyxiexzf + " not found in namespace");
        }
        this.f531Ujhhgtgfeyxiexzf = null;
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final synchronized C0151Ujhhgtgfeyxiexzf m357Ujhhgtgfeyxiexzf(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        try {
            String str = this.f526Ujhhgtgfeyxiexzf;
            this.f527Ujhhgtgfeyxiexzf = str;
            Object objM353Ujhhgtgfeyxiexzf = null;
            this.f529Ujhhgtgfeyxiexzf = null;
            this.f530Ujhhgtgfeyxiexzf = 0;
            if (!m348Ujhhgtgfeyxiexzf(str)) {
                if (this.f527Ujhhgtgfeyxiexzf.equals("this")) {
                    throw new C1863Ujhhgtgfeyxiexzf("Can't assign to 'this'.");
                }
                C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f525Ujhhgtgfeyxiexzf;
                return c0029Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf ? new C0151Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf, this.f527Ujhhgtgfeyxiexzf) : new C0151Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf, this.f527Ujhhgtgfeyxiexzf, false);
            }
            while (true) {
                try {
                    String str2 = this.f527Ujhhgtgfeyxiexzf;
                    if (str2 == null || !m348Ujhhgtgfeyxiexzf(str2)) {
                        break;
                    }
                    objM353Ujhhgtgfeyxiexzf = m353Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, false, true);
                } catch (C1863Ujhhgtgfeyxiexzf e) {
                    throw new C1863Ujhhgtgfeyxiexzf("LHS evaluation: " + e.getMessage(), e);
                }
            }
            String str3 = this.f527Ujhhgtgfeyxiexzf;
            if (str3 == null && (objM353Ujhhgtgfeyxiexzf instanceof C2810Ujhhgtgfeyxiexzf)) {
                throw new C1863Ujhhgtgfeyxiexzf("Can't assign to class: " + this.f526Ujhhgtgfeyxiexzf);
            }
            if (objM353Ujhhgtgfeyxiexzf == null) {
                throw new C1863Ujhhgtgfeyxiexzf("Error in LHS: " + this.f526Ujhhgtgfeyxiexzf);
            }
            if (!(objM353Ujhhgtgfeyxiexzf instanceof This)) {
                if (str3 == null) {
                    throw new C0712Ujhhgtgfeyxiexzf("Internal error in lhs...");
                }
                try {
                    if (objM353Ujhhgtgfeyxiexzf instanceof C2810Ujhhgtgfeyxiexzf) {
                        return AbstractC0033Ujhhgtgfeyxiexzf.m532Ujhhgtgfeyxiexzf(((C2810Ujhhgtgfeyxiexzf) objM353Ujhhgtgfeyxiexzf).f8945Ujhhgtgfeyxiexzf, str3);
                    }
                    return AbstractC0033Ujhhgtgfeyxiexzf.m531Ujhhgtgfeyxiexzf(objM353Ujhhgtgfeyxiexzf, str3);
                } catch (C0958feyxiexzfUjhhgtg unused) {
                    return new C0151Ujhhgtgfeyxiexzf(objM353Ujhhgtgfeyxiexzf, this.f527Ujhhgtgfeyxiexzf);
                }
            }
            if (!str3.equals("namespace") && !this.f527Ujhhgtgfeyxiexzf.equals("variables") && !this.f527Ujhhgtgfeyxiexzf.equals("methods") && !this.f527Ujhhgtgfeyxiexzf.equals("caller")) {
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("found This reference evaluating LHS");
                return new C0151Ujhhgtgfeyxiexzf(((This) objM353Ujhhgtgfeyxiexzf).namespace, this.f527Ujhhgtgfeyxiexzf, !this.f528Ujhhgtgfeyxiexzf.equals("super"));
            }
            throw new C1863Ujhhgtgfeyxiexzf("Can't assign to special variable: " + this.f527Ujhhgtgfeyxiexzf);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final synchronized Object m358Ujhhgtgfeyxiexzf(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, boolean z) {
        Object objM353Ujhhgtgfeyxiexzf;
        this.f527Ujhhgtgfeyxiexzf = this.f526Ujhhgtgfeyxiexzf;
        objM353Ujhhgtgfeyxiexzf = null;
        this.f529Ujhhgtgfeyxiexzf = null;
        this.f530Ujhhgtgfeyxiexzf = 0;
        while (this.f527Ujhhgtgfeyxiexzf != null) {
            objM353Ujhhgtgfeyxiexzf = m353Ujhhgtgfeyxiexzf(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf, z, false);
        }
        if (objM353Ujhhgtgfeyxiexzf == null) {
            throw new C0712Ujhhgtgfeyxiexzf("null value in toObject()");
        }
        return objM353Ujhhgtgfeyxiexzf;
    }
}
