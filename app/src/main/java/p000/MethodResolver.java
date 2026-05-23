package p000;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲀᤝᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class MethodResolver extends AbstractC1240 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public Object returnType;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public InterfaceC1425 f6544;

    @Override // p000.AbstractC1240, p000.AbstractC1928
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Map mo2886() {
        Map mapMo2886 = super.mo2886();
        Map mapM3694 = AbstractC1898.m3694(new C2315("returnType", this.returnType), new C2315("returnTypeCondition", this.f6544), new C2315("isBridge", null), new C2315("isBridgeNot", null), new C2315("isDefault", null), new C2315("isDefaultNot", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo2886);
        linkedHashMap.putAll(mapM3694);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List resolve() {
        C1927 c1927 = this.f6369;
        if (c1927 != null) {
            return AbstractC1937.m3748(this, c1927, c1927.f6364, new C1936(this, c1927, 0));
        }
        throw new IllegalArgumentException("You must provide a configuration to resolve the member use build(configuration).");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3800(EnumC1999... enumC1999Arr) {
        AbstractC0750.m2218(this.f6372, (EnumC1999[]) Arrays.copyOf(enumC1999Arr, enumC1999Arr.length));
    }
}
