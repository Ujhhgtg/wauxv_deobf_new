package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1299 extends AbstractC1928 {

    public Object fieldType;

    public InterfaceC1425 f4726;

    @Override // p000.AbstractC1928
    public final Map mo2886() {
        Map mapMo2886 = super.mo2886();
        Map mapM3694 = AbstractC1898.m3694(new C2315("isEnumConstant", null), new C2315("isEnumConstantNot", null), new C2315("type", this.fieldType), new C2315("typeCondition", this.f4726), new C2315("genericType", null), new C2315("genericTypeCondition", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo2886);
        linkedHashMap.putAll(mapM3694);
        return linkedHashMap;
    }

    public final List resolve() {
        C1927 c1927 = this.f6369;
        if (c1927 != null) {
            return AbstractC1937.m3748(this, c1927, c1927.f6364, new C1936(this, c1927, 2));
        }
        throw new IllegalArgumentException("You must provide a configuration to resolve the member use build(configuration).");
    }
}
