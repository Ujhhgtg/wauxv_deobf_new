package p000;

import android.app.Application;
import android.app.Instrumentation;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᤝᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3635 extends AbstractC3680 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C3635 f11372;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2873 f11373;

    static {
        AbstractC1574.m3300(-73048803769012L);
        f11372 = new C3635();
        f11373 = new C2873(new C3369(7));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m5221() {
        String[] strArr = AbstractC1574.f5469;
        String str = "initDexObfKey";
        String str2 = "";
        C0542 c0542 = AbstractC2665.f8589;
        if (c0542 != null) {
            return AbstractC2207.m4087(c0542.m1891().getString("initDexObfKey", ""), (String) f11373.getValue());
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
    public static void m5222() {
        for (AbstractC1557 abstractC1557 : (List) AbstractC0960.f3486.getValue()) {
            if (abstractC1557 instanceof InterfaceC1575) {
                
                C0608.f2433.add((InterfaceC1575) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1576) {
                
                C0641.f2489.add((InterfaceC1576) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1577) {
                
                C0644.f2493.add((InterfaceC1577) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1578) {
                
                C0647.f2497.add((InterfaceC1578) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1579) {
                
                C0821.f3213.add((InterfaceC1579) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1580) {
                
                C0840.f3241.add((InterfaceC1580) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1581) {
                
                C0852.f3267.add((InterfaceC1581) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1583) {
                
                C1260.f4592.add((InterfaceC1583) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1584) {
                
                C1290.f4704.add((InterfaceC1584) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1585) {
                
                C1294.f4710.add((InterfaceC1585) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1587) {
                
                C1342.f4811.add((InterfaceC1587) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1586) {
                
                C1337.f4802.add((InterfaceC1586) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1588) {
                
                C1554.f5421.add((InterfaceC1588) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1590) {
                
                C1886.f6233.add((InterfaceC1590) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1591) {
                
                C2030.f6788.add((InterfaceC1591) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1592) {
                
                C2061.f6857.add((InterfaceC1592) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1593) {
                
                C2075.f6877.add((InterfaceC1593) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1594) {
                
                C2233.f7231.add((InterfaceC1594) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1598) {
                
                C2294.f7390.add((InterfaceC1598) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1599) {
                
                C2546.f8103.add((InterfaceC1599) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1600) {
                
                C2747.f8828.add((InterfaceC1600) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1601) {
                
                C2801.f8932.add((InterfaceC1601) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1602) {
                
                C2809.f8999.add((InterfaceC1602) abstractC1557);
            }
            if (abstractC1557 instanceof InterfaceC1603) {
                
                C2872.f9210.add((InterfaceC1603) abstractC1557);
            }
            if (abstractC1557.mo3264() && !abstractC1557.f5426) {
                String[] strArrMo1238 = abstractC1557.mo1238();
                String[] strArr = (String[]) Arrays.copyOf(strArrMo1238, strArrMo1238.length);
                if (strArr.length == 0) {
                    throw new IllegalStateException("withProcess method need a \"name\" param".toString());
                }
                for (String str : strArr) {
                    C3635 c3635 = f11372;
                    if (AbstractC2207.m4087(str, c3635.m4173())) {
                        c3635.m4175(abstractC1557);
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static C3447 m5223(String str) {
        List listM4842 = AbstractC2841.m4842(str, new char[]{'|'});
        if (listM4842.size() >= 3) {
            return new C3447((String) listM4842.get(0), (String) listM4842.get(1), (String) listM4842.get(2));
        }
        String[] strArr = AbstractC1574.f5469;
        return new C3447("", "", "");
    }

    @Override // p000.AbstractC3680
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final void mo3261() {
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.m2482(AbstractC2519.classToKClass(Instrumentation.class)).m3492();
        c1973M3492.name = "callApplicationOnCreate";
        C3689 c3689M4174 = f11372.m4174((C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(Application.class)}, 1, c1973M3492), 1);
        c3689M4174.m5350(new C3618(15));
        c3689M4174.applyHook();
    }
}
