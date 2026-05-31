package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᛸᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2626 implements InterfaceC1772 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C1896 f8308 = new C1896(50);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1893 f8309;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC1772 f8310;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1772 f8311;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f8312;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f8313;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Class f8314;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2336 f8315;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final InterfaceC3484 f8316;

    public C2626(C1893 c1893, InterfaceC1772 interfaceC1772, InterfaceC1772 interfaceC1773, int i, int i2, InterfaceC3484 interfaceC3484, Class cls, C2336 c2336) {
        this.f8309 = c1893;
        this.f8310 = interfaceC1772;
        this.f8311 = interfaceC1773;
        this.f8312 = i;
        this.f8313 = i2;
        this.f8316 = interfaceC3484;
        this.f8314 = cls;
        this.f8315 = c2336;
    }

    @Override // p000.InterfaceC1772
    public final boolean equals(Object obj) {
        if (obj instanceof C2626) {
            C2626 c2626 = (C2626) obj;
            if (this.f8313 == c2626.f8313 && this.f8312 == c2626.f8312 && AbstractC3580.m5117(this.f8316, c2626.f8316) && this.f8314.equals(c2626.f8314) && this.f8310.equals(c2626.f8310) && this.f8311.equals(c2626.f8311) && this.f8315.equals(c2626.f8315)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC1772
    public final int hashCode() {
        int iHashCode = ((((this.f8311.hashCode() + (this.f8310.hashCode() * 31)) * 31) + this.f8312) * 31) + this.f8313;
        InterfaceC3484 interfaceC3484 = this.f8316;
        if (interfaceC3484 != null) {
            iHashCode = (iHashCode * 31) + interfaceC3484.hashCode();
        }
        return this.f8315.f7541.hashCode() + ((this.f8314.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f8310 + ", signature=" + this.f8311 + ", width=" + this.f8312 + ", height=" + this.f8313 + ", decodedResourceClass=" + this.f8314 + ", transformation='" + this.f8316 + "', options=" + this.f8315 + '}';
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
    @Override // p000.InterfaceC1772
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final void mo2098(MessageDigest messageDigest) {
        Object objM3821;
        C1893 c1893 = this.f8309;
        synchronized (c1893) {
            C1892 c1892 = (C1892) c1893.f6276;
            InterfaceC2429 interfaceC2429M3815 = (InterfaceC2429) ((ArrayDeque) c1892.f1731).poll();
            if (interfaceC2429M3815 == null) {
                interfaceC2429M3815 = c1892.m3815();
            }
            C1891 c1891 = (C1891) interfaceC2429M3815;
            c1891.f6268 = 8;
            c1891.f6269 = byte[].class;
            objM3821 = c1893.m3821(c1891, byte[].class);
        }
        byte[] bArr = (byte[]) objM3821;
        ByteBuffer.wrap(bArr).putInt(this.f8312).putInt(this.f8313).array();
        this.f8311.mo2098(messageDigest);
        this.f8310.mo2098(messageDigest);
        messageDigest.update(bArr);
        InterfaceC3484 interfaceC3484 = this.f8316;
        if (interfaceC3484 != null) {
            interfaceC3484.mo2098(messageDigest);
        }
        this.f8315.mo2098(messageDigest);
        C1896 c1896 = f8308;
        Class cls = this.f8314;
        byte[] bytes = (byte[]) c1896.m3827(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC1772.f5911);
            c1896.m3830(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f8309.m3823(bArr);
    }
}
