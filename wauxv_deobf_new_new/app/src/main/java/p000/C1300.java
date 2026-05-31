package p000;

import com.umeng.analytics.pro.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲈᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1300 extends AbstractC1959 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public Object f4724;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public InterfaceC1433 f4725;

    @Override // p000.AbstractC1959
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Map mo3005() {
        Map mapMo3005 = super.mo3005();
        Map mapM3873 = AbstractC1924.m3873(new C2348("isEnumConstant", null), new C2348("isEnumConstantNot", null), new C2348(g.y, this.f4724), new C2348("typeCondition", this.f4725), new C2348("genericType", null), new C2348("genericTypeCondition", null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo3005);
        linkedHashMap.putAll(mapM3873);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List m3117() {
        C1958 c1958 = this.f6474;
        if (c1958 != null) {
            return AbstractC1968.m3942(this, c1958, c1958.f6469, new C1967(this, c1958, 2));
        }
        throw new IllegalArgumentException("You must provide a configuration to resolve the member use build(configuration).");
    }
}
