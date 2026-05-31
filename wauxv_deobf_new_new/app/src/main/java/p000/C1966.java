package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲀᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1966 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6492;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1958 f6493;

    public /* synthetic */ C1966(C1958 c1958, int i) {
        this.f6492 = i;
        this.f6493 = c1958;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        switch (this.f6492) {
            case 0:
                C2013 c2013 = new C2013((Method) ((Member) obj));
                Object obj2 = this.f6493.f6470;
                if (obj2 != null) {
                    c2013.mo3125(obj2);
                }
                return c2013;
            case 1:
                C0797 c0797 = new C0797((Constructor) ((Member) obj));
                Object obj3 = this.f6493.f6470;
                return c0797;
            case 2:
                C1316 c1316 = new C1316((Field) ((Member) obj));
                Object obj4 = this.f6493.f6470;
                if (obj4 != null) {
                    c1316.mo3125(obj4);
                }
                return c1316;
            case 3:
                C2013 c2014 = new C2013((Method) ((Member) obj));
                Object obj5 = this.f6493.f6470;
                if (obj5 != null) {
                    c2014.mo3125(obj5);
                }
                return c2014;
            case 4:
                C0797 c0798 = new C0797((Constructor) ((Member) obj));
                Object obj6 = this.f6493.f6470;
                return c0798;
            case 5:
                C1316 c1317 = new C1316((Field) ((Member) obj));
                Object obj7 = this.f6493.f6470;
                if (obj7 != null) {
                    c1317.mo3125(obj7);
                }
                return c1317;
            case 6:
                C2013 c2015 = new C2013((Method) ((Member) obj));
                Object obj8 = this.f6493.f6470;
                if (obj8 != null) {
                    c2015.mo3125(obj8);
                }
                return c2015;
            case 7:
                C0797 c0799 = new C0797((Constructor) ((Member) obj));
                Object obj9 = this.f6493.f6470;
                return c0799;
            default:
                C1316 c1318 = new C1316((Field) ((Member) obj));
                Object obj10 = this.f6493.f6470;
                if (obj10 != null) {
                    c1318.mo3125(obj10);
                }
                return c1318;
        }
    }
}
