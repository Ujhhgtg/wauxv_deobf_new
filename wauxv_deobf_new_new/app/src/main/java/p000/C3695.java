package p000;

import android.app.Application;
import android.app.Instrumentation;
import java.util.Arrays;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲁᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3695 extends AbstractC3743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C3695 f11521;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C2933 f11522;

    static {
        AbstractC1471.m3394(-75329431403139L);
        f11521 = new C3695();
        f11522 = new C2933(new C3413(9));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m5227() {
        String[] strArr = AbstractC1471.f5234;
        String str = "initDexObfKey";
        String str2 = "";
        C0519 c0519 = AbstractC0738.f2837;
        if (c0519 != null) {
            return AbstractC1469.m3322(c0519.m1985().getString(str, str2), (String) f11522.getValue());
        }
        throw new IllegalArgumentException("DexDescConfig must be init".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static void m5228() {
        for (AbstractC1569 abstractC1569 : (List) AbstractC0964.f3503.getValue()) {
            if (abstractC1569 instanceof InterfaceC1587) {
                C0589.f2398.getClass();
                C0589.f2399.add((InterfaceC1587) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1588) {
                C0634.f2494.getClass();
                C0634.f2495.add((InterfaceC1588) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1589) {
                C0638.f2499.getClass();
                C0638.f2500.add((InterfaceC1589) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1590) {
                C0640.f2502.getClass();
                C0640.f2503.add((InterfaceC1590) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1591) {
                C0820.f3219.getClass();
                C0820.f3220.add((InterfaceC1591) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1592) {
                C0839.f3247.getClass();
                C0839.f3248.add((InterfaceC1592) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1593) {
                C0852.f3274.getClass();
                C0852.f3275.add((InterfaceC1593) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1595) {
                C1262.f4590.getClass();
                C1262.f4591.add((InterfaceC1595) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1596) {
                C1291.f4702.getClass();
                C1291.f4703.add((InterfaceC1596) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1597) {
                C1295.f4708.getClass();
                C1295.f4709.add((InterfaceC1597) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1599) {
                C1343.f4809.getClass();
                C1343.f4810.add((InterfaceC1599) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1598) {
                C1339.f4801.getClass();
                C1339.f4802.add((InterfaceC1598) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1600) {
                C1566.f5451.getClass();
                C1566.f5452.add((InterfaceC1600) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1602) {
                C1912.f6306.getClass();
                C1912.f6307.add((InterfaceC1602) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1603) {
                C2063.f6911.getClass();
                C2063.f6912.add((InterfaceC1603) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1604) {
                C2093.f6979.getClass();
                C2093.f6980.add((InterfaceC1604) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1605) {
                C2095.f6982.getClass();
                C2095.f6983.add((InterfaceC1605) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1606) {
                C2264.f7350.getClass();
                C2264.f7351.add((InterfaceC1606) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1610) {
                C2327.f7511.getClass();
                C2327.f7512.add((InterfaceC1610) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1611) {
                C2384.f7646.getClass();
                C2384.f7647.add((InterfaceC1611) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1612) {
                C2602.f8255.getClass();
                C2602.f8256.add((InterfaceC1612) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1613) {
                C2807.f8989.getClass();
                C2807.f8990.add((InterfaceC1613) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1614) {
                C2860.f9092.getClass();
                C2860.f9093.add((InterfaceC1614) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1615) {
                C2869.f9160.getClass();
                C2869.f9161.add((InterfaceC1615) abstractC1569);
            }
            if (abstractC1569 instanceof InterfaceC1616) {
                C2932.f9379.getClass();
                C2932.f9380.add((InterfaceC1616) abstractC1569);
            }
            if (abstractC1569.mo3445() && !abstractC1569.f5457) {
                String[] strArrMo1384 = abstractC1569.mo1384();
                String[] strArr = (String[]) Arrays.copyOf(strArrMo1384, strArrMo1384.length);
                if (strArr.length == 0) {
                    throw new IllegalStateException("withProcess method need a \"name\" param".toString());
                }
                for (String str : strArr) {
                    C3695 c3695 = f11521;
                    if (AbstractC1469.m3322(str, c3695.m4302())) {
                        c3695.m4304(abstractC1569);
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static C3504 m5229(String str) {
        List listM4875 = AbstractC2901.m4875(str, new char[]{'|'});
        if (listM4875.size() >= 3) {
            return new C3504((String) listM4875.get(0), (String) listM4875.get(1), (String) listM4875.get(2));
        }
        String[] strArr = AbstractC1471.f5234;
        return new C3504("", "", "");
    }

    @Override // p000.AbstractC3743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final void mo3442() {
        int i = AbstractC1768.f5906;
        C2004 c2004M3560 = AbstractC2727.m4711(AbstractC2574.m4549(Instrumentation.class)).m3560();
        c2004M3560.f6475 = "callApplicationOnCreate";
        C3752 c3752M4303 = f11521.m4303((C2013) AbstractC2844.m4777(new Object[]{AbstractC2574.m4549(Application.class)}, 1, c2004M3560), 1);
        c3752M4303.m5358(new C3681(7));
        c3752M4303.m5360();
    }
}
