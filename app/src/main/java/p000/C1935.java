package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1935 implements InterfaceC1425 {

    public final /* synthetic */ int f6387;

    public final /* synthetic */ C1927 f6388;

    public /* synthetic */ C1935(C1927 c1927, int i) {
        this.f6387 = i;
        this.f6388 = c1927;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        switch (this.f6387) {
            case 0:
                C1982 c1982 = new C1982((Method) ((Member) obj));
                Object obj2 = this.f6388.f6365;
                if (obj2 != null) {
                    c1982.mo3022(obj2);
                }
                return c1982;
            case 1:
                C0798 c0798 = new C0798((Constructor) ((Member) obj));
                Object obj3 = this.f6388.f6365;
                return c0798;
            case 2:
                C1315 c1315 = new C1315((Field) ((Member) obj));
                Object obj4 = this.f6388.f6365;
                if (obj4 != null) {
                    c1315.mo3022(obj4);
                }
                return c1315;
            case 3:
                C1982 c1983 = new C1982((Method) ((Member) obj));
                Object obj5 = this.f6388.f6365;
                if (obj5 != null) {
                    c1983.mo3022(obj5);
                }
                return c1983;
            case 4:
                C0798 c0799 = new C0798((Constructor) ((Member) obj));
                Object obj6 = this.f6388.f6365;
                return c0799;
            case 5:
                C1315 c1316 = new C1315((Field) ((Member) obj));
                Object obj7 = this.f6388.f6365;
                if (obj7 != null) {
                    c1316.mo3022(obj7);
                }
                return c1316;
            case 6:
                C1982 c1984 = new C1982((Method) ((Member) obj));
                Object obj8 = this.f6388.f6365;
                if (obj8 != null) {
                    c1984.mo3022(obj8);
                }
                return c1984;
            case 7:
                C0798 c07910 = new C0798((Constructor) ((Member) obj));
                Object obj9 = this.f6388.f6365;
                return c07910;
            default:
                C1315 c1317 = new C1315((Field) ((Member) obj));
                Object obj10 = this.f6388.f6365;
                if (obj10 != null) {
                    c1317.mo3022(obj10);
                }
                return c1317;
        }
    }
}
