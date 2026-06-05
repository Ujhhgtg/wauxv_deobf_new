package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import bsh.C0029Ujhhgtgfeyxiexzf;
import bsh.Modifiers;
import bsh.Primitive;
import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛴᛲᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0151Ujhhgtgfeyxiexzf implements InterfaceC1407feyxiexzfUjhhgtg, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0029Ujhhgtgfeyxiexzf f1308Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f1309Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f1310Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public String f1311Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Object f1312Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public AbstractC0695Ujhhgtgfeyxiexzf f1313Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public Object f1314Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f1315Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public C1853Ujhhgtgfeyxiexzf f1316Ujhhgtgfeyxiexzf;

    public C0151Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, String str, boolean z) {
        this.f1310Ujhhgtgfeyxiexzf = 0;
        this.f1309Ujhhgtgfeyxiexzf = z;
        this.f1311Ujhhgtgfeyxiexzf = str;
        this.f1308Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object obj = this.f1314Ujhhgtgfeyxiexzf;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        Object obj2 = this.f1314Ujhhgtgfeyxiexzf;
        if (obj2 instanceof Class) {
            cls = (Class) obj2;
        }
        C2570Ujhhgtgfeyxiexzf c2570Ujhhgtgfeyxiexzf = (C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls);
        String str = this.f1311Ujhhgtgfeyxiexzf;
        ConcurrentHashMap concurrentHashMap = c2570Ujhhgtgfeyxiexzf.f8322Ujhhgtgfeyxiexzf;
        this.f1313Ujhhgtgfeyxiexzf = !concurrentHashMap.containsKey(str) ? null : (AbstractC0695Ujhhgtgfeyxiexzf) concurrentHashMap.get(str);
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f1313Ujhhgtgfeyxiexzf;
            if (abstractC0695Ujhhgtgfeyxiexzf != null) {
                this.f1314Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.f2848Ujhhgtgfeyxiexzf;
                this.f1311Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf;
                this.f1313Ujhhgtgfeyxiexzf = null;
            }
            objectOutputStream.defaultWriteObject();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LHS: ");
        String str3 = "";
        if (this.f1313Ujhhgtgfeyxiexzf != null) {
            str = "field = " + this.f1313Ujhhgtgfeyxiexzf.f2845Ujhhgtgfeyxiexzf;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f1311Ujhhgtgfeyxiexzf != null) {
            str2 = " varName = " + this.f1311Ujhhgtgfeyxiexzf;
        } else {
            str2 = "";
        }
        sb.append(str2);
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f1308Ujhhgtgfeyxiexzf;
        if (c0029Ujhhgtgfeyxiexzf != null) {
            str3 = " nameSpace = " + c0029Ujhhgtgfeyxiexzf.toString();
        }
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object m1194Ujhhgtgfeyxiexzf(Object obj, boolean z) {
        Object obj2 = this.f1312Ujhhgtgfeyxiexzf;
        int i = this.f1310Ujhhgtgfeyxiexzf;
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f1308Ujhhgtgfeyxiexzf;
        if (i == 0) {
            if (this.f1309Ujhhgtgfeyxiexzf) {
                c0029Ujhhgtgfeyxiexzf.m387feyxiexzfUjhhgtg(this.f1311Ujhhgtgfeyxiexzf, obj, z, false);
            } else {
                c0029Ujhhgtgfeyxiexzf.m387feyxiexzfUjhhgtg(this.f1311Ujhhgtgfeyxiexzf, obj, z, true);
            }
            return m1196Ujhhgtgfeyxiexzf();
        }
        if (i == 1) {
            try {
                AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f1313Ujhhgtgfeyxiexzf;
                Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
                if (Modifier.isStatic(abstractC0695Ujhhgtgfeyxiexzf.getModifiers())) {
                    C0168Ujhhgtgfeyxiexzf c0168Ujhhgtgfeyxiexzf = RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf;
                    AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf2 = this.f1313Ujhhgtgfeyxiexzf;
                    c0168Ujhhgtgfeyxiexzf.m1221Ujhhgtgfeyxiexzf(obj, abstractC0695Ujhhgtgfeyxiexzf2.f2848Ujhhgtgfeyxiexzf, abstractC0695Ujhhgtgfeyxiexzf2.f2846Ujhhgtgfeyxiexzf);
                } else {
                    RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.m1220Ujhhgtgfeyxiexzf(this.f1314Ujhhgtgfeyxiexzf, this.f1313Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf, obj);
                }
                this.f1313Ujhhgtgfeyxiexzf.mo1969Ujhhgtgfeyxiexzf(this.f1314Ujhhgtgfeyxiexzf, obj);
                return m1196Ujhhgtgfeyxiexzf();
            } catch (ReflectiveOperationException e) {
                throw new C1863Ujhhgtgfeyxiexzf("LHS (" + this.f1313Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf + ") can't access field: " + e, e);
            }
        }
        if (i == 2) {
            try {
                if (!(obj2 instanceof String)) {
                    return AbstractC0033Ujhhgtgfeyxiexzf.m551feyxiexzfUjhhgtg(this.f1314Ujhhgtgfeyxiexzf, obj2, obj);
                }
                Object obj3 = this.f1314Ujhhgtgfeyxiexzf;
                String str = (String) obj2;
                Object[] objArr2 = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
                Map map = AbstractC0034Ujhhgtgfeyxiexzf.f588Ujhhgtgfeyxiexzf;
                return ((obj3 instanceof Map.Entry) && (str.equals("val") || str.equals("value"))) ? ((Map.Entry) obj3).setValue(obj) : AbstractC0033Ujhhgtgfeyxiexzf.m551feyxiexzfUjhhgtg(obj3, str, obj);
            } catch (C0958feyxiexzfUjhhgtg e2) {
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Assignment: " + e2.getMessage());
                throw new C1863Ujhhgtgfeyxiexzf("No such property: " + obj2, e2);
            }
        }
        if (i != 3) {
            if (i != 5) {
                if (i != 6) {
                    throw new C0712Ujhhgtgfeyxiexzf("unknown lhs type");
                }
                Object obj4 = this.f1314Ujhhgtgfeyxiexzf;
                return obj4 instanceof Map.Entry ? ((Map.Entry) obj4).setValue(obj) : new C1933Ujhhgtgfeyxiexzf(this.f1314Ujhhgtgfeyxiexzf, obj);
            }
            Modifiers modifiers = new Modifiers(3);
            modifiers.addModifier("public");
            if (c0029Ujhhgtgfeyxiexzf.f550Ujhhgtgfeyxiexzf) {
                modifiers.setConstant();
            }
            c0029Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(this.f1311Ujhhgtgfeyxiexzf, AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(obj, false), obj, modifiers);
            return obj;
        }
        try {
            if (this.f1314Ujhhgtgfeyxiexzf.getClass().isArray() && obj != null) {
                try {
                    obj = AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(1, AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(this.f1314Ujhhgtgfeyxiexzf.getClass()), obj);
                } catch (Exception unused) {
                }
            }
            AbstractC3516feyxiexzfUjhhgtg.m5071feyxiexzfUjhhgtg(this.f1314Ujhhgtgfeyxiexzf, this.f1315Ujhhgtgfeyxiexzf, obj);
            return obj;
        } catch (C1862Ujhhgtgfeyxiexzf e3) {
            if (!IndexOutOfBoundsException.class.isAssignableFrom(e3.getCause().getClass())) {
                throw e3;
            }
            throw new C1863Ujhhgtgfeyxiexzf("Error array set index: " + e3.getMessage(), e3);
        } catch (Exception e4) {
            throw new C1863Ujhhgtgfeyxiexzf("Assignment: " + e4.getMessage(), e4);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object m1195Ujhhgtgfeyxiexzf() {
        if (this.f1310Ujhhgtgfeyxiexzf == 1) {
            AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f1313Ujhhgtgfeyxiexzf;
            Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            if (Modifier.isStatic(abstractC0695Ujhhgtgfeyxiexzf.getModifiers())) {
                C0168Ujhhgtgfeyxiexzf c0168Ujhhgtgfeyxiexzf = RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf;
                AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf2 = this.f1313Ujhhgtgfeyxiexzf;
                c0168Ujhhgtgfeyxiexzf.m1217Ujhhgtgfeyxiexzf(abstractC0695Ujhhgtgfeyxiexzf2.f2848Ujhhgtgfeyxiexzf, abstractC0695Ujhhgtgfeyxiexzf2.f2846Ujhhgtgfeyxiexzf);
            } else {
                C0168Ujhhgtgfeyxiexzf c0168Ujhhgtgfeyxiexzf2 = RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf;
                String str = this.f1313Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf;
                c0168Ujhhgtgfeyxiexzf2.m1216Ujhhgtgfeyxiexzf();
            }
        }
        return m1196Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object m1196Ujhhgtgfeyxiexzf() throws C1863Ujhhgtgfeyxiexzf {
        Object obj = this.f1312Ujhhgtgfeyxiexzf;
        int i = this.f1310Ujhhgtgfeyxiexzf;
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f1308Ujhhgtgfeyxiexzf;
        if (i == 0) {
            String str = this.f1311Ujhhgtgfeyxiexzf;
            Object objM375Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m375Ujhhgtgfeyxiexzf(str, true);
            return objM375Ujhhgtgfeyxiexzf == Primitive.VOID ? c0029Ujhhgtgfeyxiexzf.m374Ujhhgtgfeyxiexzf(str, null) : objM375Ujhhgtgfeyxiexzf;
        }
        if (i == 1) {
            try {
                return this.f1313Ujhhgtgfeyxiexzf.mo1969Ujhhgtgfeyxiexzf(this.f1314Ujhhgtgfeyxiexzf, new Object[0]);
            } catch (ReflectiveOperationException e) {
                throw new C1863Ujhhgtgfeyxiexzf("Can't read field: " + this.f1313Ujhhgtgfeyxiexzf, e);
            }
        }
        if (i == 2) {
            try {
                return AbstractC0033Ujhhgtgfeyxiexzf.m536Ujhhgtgfeyxiexzf(this.f1314Ujhhgtgfeyxiexzf, obj);
            } catch (C0958feyxiexzfUjhhgtg e2) {
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(e2.getMessage());
                throw new C1863Ujhhgtgfeyxiexzf("No such property: " + obj, e2);
            }
        }
        if (i != 3) {
            if (i == 5) {
                return c0029Ujhhgtgfeyxiexzf.m375Ujhhgtgfeyxiexzf(this.f1311Ujhhgtgfeyxiexzf, true);
            }
            throw new C0712Ujhhgtgfeyxiexzf("LHS type");
        }
        try {
            return AbstractC3516feyxiexzfUjhhgtg.m5060Ujhhgtgfeyxiexzf(this.f1315Ujhhgtgfeyxiexzf, this.f1314Ujhhgtgfeyxiexzf);
        } catch (Exception e3) {
            throw new C1863Ujhhgtgfeyxiexzf("Array access: " + e3, e3);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1853Ujhhgtgfeyxiexzf m1197Ujhhgtgfeyxiexzf() {
        boolean zM3188Ujhhgtgfeyxiexzf;
        String str;
        String str2;
        String str3;
        C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf = this.f1316Ujhhgtgfeyxiexzf;
        if (c1853Ujhhgtgfeyxiexzf != null) {
            return c1853Ujhhgtgfeyxiexzf;
        }
        C1853Ujhhgtgfeyxiexzf c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = null;
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = this.f1308Ujhhgtgfeyxiexzf;
        if (c0029Ujhhgtgfeyxiexzf != null) {
            AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = this.f1313Ujhhgtgfeyxiexzf;
            if (abstractC0695Ujhhgtgfeyxiexzf != null) {
                str3 = abstractC0695Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf;
            } else {
                str3 = c1853Ujhhgtgfeyxiexzf != null ? c1853Ujhhgtgfeyxiexzf.f6220Ujhhgtgfeyxiexzf : this.f1311Ujhhgtgfeyxiexzf;
            }
            Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            try {
                c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(str3, false);
            } catch (Exception unused) {
            }
            this.f1316Ujhhgtgfeyxiexzf = c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf;
        } else {
            AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf2 = this.f1313Ujhhgtgfeyxiexzf;
            if (abstractC0695Ujhhgtgfeyxiexzf2 != null) {
                zM3188Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf2.mo1972Ujhhgtgfeyxiexzf();
            } else {
                zM3188Ujhhgtgfeyxiexzf = c1853Ujhhgtgfeyxiexzf == null ? false : c1853Ujhhgtgfeyxiexzf.m3188Ujhhgtgfeyxiexzf("static");
            }
            if (zM3188Ujhhgtgfeyxiexzf) {
                if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(this.f1313Ujhhgtgfeyxiexzf.f2848Ujhhgtgfeyxiexzf)) {
                    AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf3 = this.f1313Ujhhgtgfeyxiexzf;
                    Class cls = abstractC0695Ujhhgtgfeyxiexzf3.f2848Ujhhgtgfeyxiexzf;
                    if (abstractC0695Ujhhgtgfeyxiexzf3 != null) {
                        str2 = abstractC0695Ujhhgtgfeyxiexzf3.f2846Ujhhgtgfeyxiexzf;
                    } else {
                        C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf2 = this.f1316Ujhhgtgfeyxiexzf;
                        str2 = c1853Ujhhgtgfeyxiexzf2 != null ? c1853Ujhhgtgfeyxiexzf2.f6220Ujhhgtgfeyxiexzf : this.f1311Ujhhgtgfeyxiexzf;
                    }
                    C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m538Ujhhgtgfeyxiexzf(cls);
                    if (c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf != null) {
                        try {
                            c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(str2, false);
                        } catch (Exception unused2) {
                        }
                    }
                    this.f1316Ujhhgtgfeyxiexzf = c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf;
                } else {
                    AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf4 = this.f1313Ujhhgtgfeyxiexzf;
                    this.f1316Ujhhgtgfeyxiexzf = new C1853Ujhhgtgfeyxiexzf(abstractC0695Ujhhgtgfeyxiexzf4.f2846Ujhhgtgfeyxiexzf, abstractC0695Ujhhgtgfeyxiexzf4.mo1641Ujhhgtgfeyxiexzf(), this);
                }
            } else if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(this.f1314Ujhhgtgfeyxiexzf.getClass())) {
                Object obj = this.f1314Ujhhgtgfeyxiexzf;
                AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf5 = this.f1313Ujhhgtgfeyxiexzf;
                if (abstractC0695Ujhhgtgfeyxiexzf5 != null) {
                    str = abstractC0695Ujhhgtgfeyxiexzf5.f2846Ujhhgtgfeyxiexzf;
                } else {
                    C1853Ujhhgtgfeyxiexzf c1853Ujhhgtgfeyxiexzf3 = this.f1316Ujhhgtgfeyxiexzf;
                    str = c1853Ujhhgtgfeyxiexzf3 != null ? c1853Ujhhgtgfeyxiexzf3.f6220Ujhhgtgfeyxiexzf : this.f1311Ujhhgtgfeyxiexzf;
                }
                C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m539Ujhhgtgfeyxiexzf(obj);
                if (c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf != null) {
                    try {
                        c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(str, false);
                    } catch (Exception unused3) {
                    }
                }
                this.f1316Ujhhgtgfeyxiexzf = c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf;
            } else {
                AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf6 = this.f1313Ujhhgtgfeyxiexzf;
                if (abstractC0695Ujhhgtgfeyxiexzf6 != null) {
                    this.f1316Ujhhgtgfeyxiexzf = new C1853Ujhhgtgfeyxiexzf(abstractC0695Ujhhgtgfeyxiexzf6.f2846Ujhhgtgfeyxiexzf, abstractC0695Ujhhgtgfeyxiexzf6.mo1641Ujhhgtgfeyxiexzf(), this);
                }
            }
        }
        return this.f1316Ujhhgtgfeyxiexzf;
    }

    public C0151Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, String str) {
        this.f1310Ujhhgtgfeyxiexzf = 5;
        this.f1311Ujhhgtgfeyxiexzf = str;
        this.f1308Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf;
    }

    public C0151Ujhhgtgfeyxiexzf(AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf) {
        this.f1310Ujhhgtgfeyxiexzf = 1;
        this.f1314Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.f2848Ujhhgtgfeyxiexzf;
        this.f1313Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf;
        this.f1311Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf;
    }

    public C0151Ujhhgtgfeyxiexzf(AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf, Object obj) {
        if (obj != null) {
            this.f1310Ujhhgtgfeyxiexzf = 1;
            this.f1314Ujhhgtgfeyxiexzf = obj;
            this.f1313Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf;
            if (abstractC0695Ujhhgtgfeyxiexzf != null) {
                this.f1311Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf;
                return;
            }
            return;
        }
        throw new NullPointerException("constructed empty LHS");
    }

    public C0151Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        if (obj != null) {
            this.f1310Ujhhgtgfeyxiexzf = 2;
            this.f1314Ujhhgtgfeyxiexzf = obj;
            this.f1312Ujhhgtgfeyxiexzf = obj2;
            return;
        }
        throw new NullPointerException("constructed empty LHS");
    }

    public C0151Ujhhgtgfeyxiexzf(Object obj) {
        this.f1310Ujhhgtgfeyxiexzf = 6;
        this.f1314Ujhhgtgfeyxiexzf = obj;
    }
}
