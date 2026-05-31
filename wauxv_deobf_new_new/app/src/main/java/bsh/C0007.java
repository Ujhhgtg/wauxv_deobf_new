package bsh;

import p000.AbstractC1687;
import p000.C0527;
import p000.C1231;
import p000.C1684;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0007 extends BshMethod {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f491;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final BSHReturnType f492;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String[] f493;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final BSHFormalParameters f494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final transient C0527 f495;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final transient RunnableC0008 f496;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public BSHArguments f497;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public AbstractC1687 f498;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public Object[] f499;

    public C0007(String str, String str2, BSHReturnType bSHReturnType, String[] strArr, String[] strArr2, BSHFormalParameters bSHFormalParameters, BSHBlock bSHBlock, C0012 c0012, Modifiers modifiers, boolean z, C0527 c0527, RunnableC0008 runnableC0008) {
        super(str, null, strArr, null, null, bSHBlock, c0012, modifiers, z);
        this.f497 = null;
        this.f498 = null;
        this.f499 = null;
        this.f491 = str2;
        this.f492 = bSHReturnType;
        this.f493 = strArr2;
        this.f494 = bSHFormalParameters;
        this.f495 = c0527;
        this.f496 = runnableC0008;
    }

    @Override // bsh.BshMethod
    public final boolean equals(Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C0007.class) {
            return false;
        }
        C0007 c0007 = (C0007) obj;
        if (!getName().equals(c0007.getName()) || getParameterCount() != c0007.getParameterCount() || (z = this.isExtension) != c0007.isExtension) {
            return false;
        }
        if ((z && !BshMethod.equal(this.receiverType, c0007.receiverType)) || this.isVarArgs != c0007.isVarArgs) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.f493;
            if (i >= strArr.length) {
                return true;
            }
            if (!BshMethod.equal(strArr[i], c0007.f493[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // bsh.BshMethod
    public final Class[] getParameterTypes() {
        AbstractC1687 abstractC1687 = this.f498;
        if (abstractC1687 != null) {
            return abstractC1687.mo3009();
        }
        try {
            return this.f494.eval(this.f495, this.f496);
        } catch (C1231 e) {
            throw new C1684("can't eval param types: " + e, e);
        }
    }

    @Override // bsh.BshMethod
    public final Class getReturnType() {
        BSHReturnType bSHReturnType = this.f492;
        if (bSHReturnType == null) {
            return null;
        }
        try {
            return bSHReturnType.evalReturnType(this.f495, this.f496);
        } catch (C1231 e) {
            throw new C1684("can't eval return type: " + e, e);
        }
    }

    @Override // bsh.BshMethod
    public final int hashCode() {
        int iHashCode = (Boolean.hashCode(this.isExtension) + ((C0007.class.hashCode() + getName().hashCode()) * 31)) * 31;
        Class<?> cls = this.receiverType;
        int iHashCode2 = Boolean.hashCode(this.isVarArgs) + ((iHashCode + (cls == null ? 0 : cls.hashCode())) * 31);
        String[] strArr = this.f493;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            iHashCode2 += (str == null ? 0 : str.hashCode()) + 3;
        }
        return getParameterCount() + iHashCode2;
    }
}
