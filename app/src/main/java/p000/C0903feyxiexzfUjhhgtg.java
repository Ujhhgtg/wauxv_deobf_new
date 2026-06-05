package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ要点脸ᛴ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0903feyxiexzfUjhhgtg implements InterfaceC0156Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C0179Ujhhgtgfeyxiexzf f3470Ujhhgtgfeyxiexzf = new C0179Ujhhgtgfeyxiexzf(50);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0271Ujhhgtgfeyxiexzf f3471Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC0156Ujhhgtgfeyxiexzf f3472Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC0156Ujhhgtgfeyxiexzf f3473Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f3474Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f3475Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Class f3476Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C1471feyxiexzfUjhhgtg f3477Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final InterfaceC1765feyxiexzfUjhhgtg f3478Ujhhgtgfeyxiexzf;

    public C0903feyxiexzfUjhhgtg(C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf, InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf2, int i, int i2, InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtg, Class cls, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        this.f3471Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf;
        this.f3472Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf;
        this.f3473Ujhhgtgfeyxiexzf = interfaceC0156Ujhhgtgfeyxiexzf2;
        this.f3474Ujhhgtgfeyxiexzf = i;
        this.f3475Ujhhgtgfeyxiexzf = i2;
        this.f3478Ujhhgtgfeyxiexzf = interfaceC1765feyxiexzfUjhhgtg;
        this.f3476Ujhhgtgfeyxiexzf = cls;
        this.f3477Ujhhgtgfeyxiexzf = c1471feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final boolean equals(Object obj) {
        if (obj instanceof C0903feyxiexzfUjhhgtg) {
            C0903feyxiexzfUjhhgtg c0903feyxiexzfUjhhgtg = (C0903feyxiexzfUjhhgtg) obj;
            if (this.f3475Ujhhgtgfeyxiexzf == c0903feyxiexzfUjhhgtg.f3475Ujhhgtgfeyxiexzf && this.f3474Ujhhgtgfeyxiexzf == c0903feyxiexzfUjhhgtg.f3474Ujhhgtgfeyxiexzf && AbstractC1860Ujhhgtgfeyxiexzf.m3193Ujhhgtgfeyxiexzf(this.f3478Ujhhgtgfeyxiexzf, c0903feyxiexzfUjhhgtg.f3478Ujhhgtgfeyxiexzf) && this.f3476Ujhhgtgfeyxiexzf.equals(c0903feyxiexzfUjhhgtg.f3476Ujhhgtgfeyxiexzf) && this.f3472Ujhhgtgfeyxiexzf.equals(c0903feyxiexzfUjhhgtg.f3472Ujhhgtgfeyxiexzf) && this.f3473Ujhhgtgfeyxiexzf.equals(c0903feyxiexzfUjhhgtg.f3473Ujhhgtgfeyxiexzf) && this.f3477Ujhhgtgfeyxiexzf.equals(c0903feyxiexzfUjhhgtg.f3477Ujhhgtgfeyxiexzf)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    public final int hashCode() {
        int iHashCode = ((((this.f3473Ujhhgtgfeyxiexzf.hashCode() + (this.f3472Ujhhgtgfeyxiexzf.hashCode() * 31)) * 31) + this.f3474Ujhhgtgfeyxiexzf) * 31) + this.f3475Ujhhgtgfeyxiexzf;
        InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtg = this.f3478Ujhhgtgfeyxiexzf;
        if (interfaceC1765feyxiexzfUjhhgtg != null) {
            iHashCode = (iHashCode * 31) + interfaceC1765feyxiexzfUjhhgtg.hashCode();
        }
        return this.f3477Ujhhgtgfeyxiexzf.f5110Ujhhgtgfeyxiexzf.hashCode() + ((this.f3476Ujhhgtgfeyxiexzf.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f3472Ujhhgtgfeyxiexzf + ", signature=" + this.f3473Ujhhgtgfeyxiexzf + ", width=" + this.f3474Ujhhgtgfeyxiexzf + ", height=" + this.f3475Ujhhgtgfeyxiexzf + ", decodedResourceClass=" + this.f3476Ujhhgtgfeyxiexzf + ", transformation='" + this.f3478Ujhhgtgfeyxiexzf + "', options=" + this.f3477Ujhhgtgfeyxiexzf + '}';
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC0156Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1203Ujhhgtgfeyxiexzf(MessageDigest messageDigest) {
        Object objM1465Ujhhgtgfeyxiexzf;
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = this.f3471Ujhhgtgfeyxiexzf;
        synchronized (c0271Ujhhgtgfeyxiexzf) {
            C0272Ujhhgtgfeyxiexzf c0272Ujhhgtgfeyxiexzf = (C0272Ujhhgtgfeyxiexzf) c0271Ujhhgtgfeyxiexzf.f1670Ujhhgtgfeyxiexzf;
            InterfaceC1436feyxiexzfUjhhgtg interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = (InterfaceC1436feyxiexzfUjhhgtg) ((ArrayDeque) c0272Ujhhgtgfeyxiexzf.f7994Ujhhgtgfeyxiexzf).poll();
            if (interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf == null) {
                interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf = c0272Ujhhgtgfeyxiexzf.m1468Ujhhgtgfeyxiexzf();
            }
            C0276Ujhhgtgfeyxiexzf c0276Ujhhgtgfeyxiexzf = (C0276Ujhhgtgfeyxiexzf) interfaceC1436feyxiexzfUjhhgtgM1468Ujhhgtgfeyxiexzf;
            c0276Ujhhgtgfeyxiexzf.f1687Ujhhgtgfeyxiexzf = 8;
            c0276Ujhhgtgfeyxiexzf.f1688Ujhhgtgfeyxiexzf = byte[].class;
            objM1465Ujhhgtgfeyxiexzf = c0271Ujhhgtgfeyxiexzf.m1465Ujhhgtgfeyxiexzf(c0276Ujhhgtgfeyxiexzf, byte[].class);
        }
        byte[] bArr = (byte[]) objM1465Ujhhgtgfeyxiexzf;
        ByteBuffer.wrap(bArr).putInt(this.f3474Ujhhgtgfeyxiexzf).putInt(this.f3475Ujhhgtgfeyxiexzf).array();
        this.f3473Ujhhgtgfeyxiexzf.mo1203Ujhhgtgfeyxiexzf(messageDigest);
        this.f3472Ujhhgtgfeyxiexzf.mo1203Ujhhgtgfeyxiexzf(messageDigest);
        messageDigest.update(bArr);
        InterfaceC1765feyxiexzfUjhhgtg interfaceC1765feyxiexzfUjhhgtg = this.f3478Ujhhgtgfeyxiexzf;
        if (interfaceC1765feyxiexzfUjhhgtg != null) {
            interfaceC1765feyxiexzfUjhhgtg.mo1203Ujhhgtgfeyxiexzf(messageDigest);
        }
        this.f3477Ujhhgtgfeyxiexzf.mo1203Ujhhgtgfeyxiexzf(messageDigest);
        C0179Ujhhgtgfeyxiexzf c0179Ujhhgtgfeyxiexzf = f3470Ujhhgtgfeyxiexzf;
        Class cls = this.f3476Ujhhgtgfeyxiexzf;
        byte[] bytes = (byte[]) c0179Ujhhgtgfeyxiexzf.m1245Ujhhgtgfeyxiexzf(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC0156Ujhhgtgfeyxiexzf.f1329Ujhhgtgfeyxiexzf);
            c0179Ujhhgtgfeyxiexzf.m1248Ujhhgtgfeyxiexzf(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f3471Ujhhgtgfeyxiexzf.m1467Ujhhgtgfeyxiexzf(bArr);
    }
}
