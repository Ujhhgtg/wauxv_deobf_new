package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2570 implements InterfaceC1749 {

    public static final C1870 f8155 = new C1870(50);

    public final C1867 f8156;

    public final InterfaceC1749 f8157;

    public final InterfaceC1749 f8158;

    public final int f8159;

    public final int f8160;

    public final Class f8161;

    public final C2303 f8162;

    public final InterfaceC3427 f8163;

    public C2570(C1867 c1867, InterfaceC1749 interfaceC1749, InterfaceC1749 interfaceC17410, int i, int i2, InterfaceC3427 interfaceC3427, Class cls, C2303 c2303) {
        this.f8156 = c1867;
        this.f8157 = interfaceC1749;
        this.f8158 = interfaceC17410;
        this.f8159 = i;
        this.f8160 = i2;
        this.f8163 = interfaceC3427;
        this.f8161 = cls;
        this.f8162 = c2303;
    }

    @Override // p000.InterfaceC1749
    public final boolean equals(Object obj) {
        if (obj instanceof C2570) {
            C2570 c2570 = (C2570) obj;
            if (this.f8160 == c2570.f8160 && this.f8159 == c2570.f8159 && AbstractC3522.m5105(this.f8163, c2570.f8163) && this.f8161.equals(c2570.f8161) && this.f8157.equals(c2570.f8157) && this.f8158.equals(c2570.f8158) && this.f8162.equals(c2570.f8162)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1749
    public final int hashCode() {
        int iHashCode = ((((this.f8158.hashCode() + (this.f8157.hashCode() * 31)) * 31) + this.f8159) * 31) + this.f8160;
        InterfaceC3427 interfaceC3427 = this.f8163;
        if (interfaceC3427 != null) {
            iHashCode = (iHashCode * 31) + interfaceC3427.hashCode();
        }
        return this.f8162.f7419.hashCode() + ((this.f8161.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f8157 + ", signature=" + this.f8158 + ", width=" + this.f8159 + ", height=" + this.f8160 + ", decodedResourceClass=" + this.f8161 + ", transformation='" + this.f8163 + "', options=" + this.f8162 + '}';
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
    @Override // p000.InterfaceC1749
    public final void mo2001(MessageDigest messageDigest) {
        Object objM3643;
        C1867 c1867 = this.f8156;
        synchronized (c1867) {
            C1866 c1866 = (C1866) c1867.f6202;
            InterfaceC2376 interfaceC2376M3637 = (InterfaceC2376) ((ArrayDeque) c1866.f1760).poll();
            if (interfaceC2376M3637 == null) {
                interfaceC2376M3637 = c1866.m3637();
            }
            C1865 c1865 = (C1865) interfaceC2376M3637;
            c1865.f6194 = 8;
            c1865.f6195 = byte[].class;
            objM3643 = c1867.m3643(c1865, byte[].class);
        }
        byte[] bArr = (byte[]) objM3643;
        ByteBuffer.wrap(bArr).putInt(this.f8159).putInt(this.f8160).array();
        this.f8158.mo2001(messageDigest);
        this.f8157.mo2001(messageDigest);
        messageDigest.update(bArr);
        InterfaceC3427 interfaceC3427 = this.f8163;
        if (interfaceC3427 != null) {
            interfaceC3427.mo2001(messageDigest);
        }
        this.f8162.mo2001(messageDigest);
        C1870 c1870 = f8155;
        Class cls = this.f8161;
        byte[] bytes = (byte[]) c1870.m3649(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC1749.f5849);
            c1870.m3652(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f8156.m3645(bArr);
    }
}
