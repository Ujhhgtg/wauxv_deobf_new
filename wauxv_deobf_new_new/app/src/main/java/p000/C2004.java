package p000;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲀᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2004 extends AbstractC1242 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public Object f6648;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public InterfaceC1433 f6649;

    @Override // p000.AbstractC1242, p000.AbstractC1959
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Map mo3005() {
        Map mapMo3005 = super.mo3005();
        Map mapM3873 = AbstractC1924.m3873(new C2348("returnType", this.f6648), new C2348("returnTypeCondition", this.f6649), new C2348("isBridge", null), new C2348("isBridgeNot", null), new C2348("isDefault", null), new C2348("isDefaultNot", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo3005);
        linkedHashMap.putAll(mapM3873);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final List m3993() {
        C1958 c1958 = this.f6474;
        if (c1958 != null) {
            return AbstractC1968.m3942(this, c1958, c1958.f6469, new C1967(this, c1958, 0));
        }
        throw new IllegalArgumentException("You must provide a configuration to resolve the member use build(configuration).");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m3994(EnumC2030... enumC2030Arr) {
        AbstractC0745.m2317(this.f6477, (EnumC2030[]) Arrays.copyOf(enumC2030Arr, enumC2030Arr.length));
    }
}
