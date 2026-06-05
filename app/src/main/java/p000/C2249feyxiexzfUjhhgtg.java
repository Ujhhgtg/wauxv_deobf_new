package p000;

import android.app.Application;
import android.app.Instrumentation;
import java.util.Arrays;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱ要点脸ᛴᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2249feyxiexzfUjhhgtg extends AbstractC2292feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C2249feyxiexzfUjhhgtg f7327Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C2065feyxiexzfUjhhgtg f7328Ujhhgtgfeyxiexzf;

    static {
        AbstractC3590Ujhhgtgfeyxiexzf.m5128Ujhhgtgfeyxiexzf(4928236665899582858L);
        f7327Ujhhgtgfeyxiexzf = new C2249feyxiexzfUjhhgtg();
        f7328Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C1795Ujhhgtgfeyxiexzf(10));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static boolean m3417feyxiexzfUjhhgtg() {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        String str = "initDexObfKey";
        String str2 = "";
        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = AbstractC1252feyxiexzfUjhhgtg.f4604Ujhhgtgfeyxiexzf;
        if (c2629Ujhhgtgfeyxiexzf != null) {
            return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c2629Ujhhgtgfeyxiexzf.m3941Ujhhgtgfeyxiexzf().getString(str, str2), (String) f7328Ujhhgtgfeyxiexzf.getValue());
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m3418feyxiexzfUjhhgtg() {
        for (AbstractC0571Ujhhgtgfeyxiexzf abstractC0571Ujhhgtgfeyxiexzf : (List) AbstractC3104Ujhhgtgfeyxiexzf.f9650Ujhhgtgfeyxiexzf.getValue()) {
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0616Ujhhgtgfeyxiexzf) {
                C2705feyxiexzfUjhhgtg.f8634Ujhhgtgfeyxiexzf.getClass();
                C2705feyxiexzfUjhhgtg.f8635Ujhhgtgfeyxiexzf.add((InterfaceC0616Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0617Ujhhgtgfeyxiexzf) {
                C2770feyxiexzfUjhhgtg.f8766Ujhhgtgfeyxiexzf.getClass();
                C2770feyxiexzfUjhhgtg.f8767Ujhhgtgfeyxiexzf.add((InterfaceC0617Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0618Ujhhgtgfeyxiexzf) {
                C2754Ujhhgtgfeyxiexzf.f8726Ujhhgtgfeyxiexzf.getClass();
                C2754Ujhhgtgfeyxiexzf.f8727Ujhhgtgfeyxiexzf.add((InterfaceC0618Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0599Ujhhgtgfeyxiexzf) {
                C2749Ujhhgtgfeyxiexzf.f8720Ujhhgtgfeyxiexzf.getClass();
                C2749Ujhhgtgfeyxiexzf.f8721Ujhhgtgfeyxiexzf.add((InterfaceC0599Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0600Ujhhgtgfeyxiexzf) {
                C3683feyxiexzfUjhhgtg.f11709Ujhhgtgfeyxiexzf.getClass();
                C3683feyxiexzfUjhhgtg.f11710Ujhhgtgfeyxiexzf.add((InterfaceC0600Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0596Ujhhgtgfeyxiexzf) {
                C3702feyxiexzfUjhhgtg.f11737Ujhhgtgfeyxiexzf.getClass();
                C3702feyxiexzfUjhhgtg.f11738Ujhhgtgfeyxiexzf.add((InterfaceC0596Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0595Ujhhgtgfeyxiexzf) {
                C3715feyxiexzfUjhhgtg.f11764Ujhhgtgfeyxiexzf.getClass();
                C3715feyxiexzfUjhhgtg.f11765Ujhhgtgfeyxiexzf.add((InterfaceC0595Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0597Ujhhgtgfeyxiexzf) {
                C3506Ujhhgtgfeyxiexzf.f10919Ujhhgtgfeyxiexzf.getClass();
                C3506Ujhhgtgfeyxiexzf.f10920Ujhhgtgfeyxiexzf.add((InterfaceC0597Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0605Ujhhgtgfeyxiexzf) {
                C3413Ujhhgtgfeyxiexzf.f10635Ujhhgtgfeyxiexzf.getClass();
                C3413Ujhhgtgfeyxiexzf.f10636Ujhhgtgfeyxiexzf.add((InterfaceC0605Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0606Ujhhgtgfeyxiexzf) {
                C3412Ujhhgtgfeyxiexzf.f10633Ujhhgtgfeyxiexzf.getClass();
                C3412Ujhhgtgfeyxiexzf.f10634Ujhhgtgfeyxiexzf.add((InterfaceC0606Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0601Ujhhgtgfeyxiexzf) {
                C3460feyxiexzfUjhhgtg.f10750Ujhhgtgfeyxiexzf.getClass();
                C3460feyxiexzfUjhhgtg.f10751Ujhhgtgfeyxiexzf.add((InterfaceC0601Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0602Ujhhgtgfeyxiexzf) {
                C3461Ujhhgtgfeyxiexzf.f10752Ujhhgtgfeyxiexzf.getClass();
                C3461Ujhhgtgfeyxiexzf.f10753Ujhhgtgfeyxiexzf.add((InterfaceC0602Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0604Ujhhgtgfeyxiexzf) {
                C0575Ujhhgtgfeyxiexzf.f2593Ujhhgtgfeyxiexzf.getClass();
                C0575Ujhhgtgfeyxiexzf.f2594Ujhhgtgfeyxiexzf.add((InterfaceC0604Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0611Ujhhgtgfeyxiexzf) {
                C0163Ujhhgtgfeyxiexzf.f1347Ujhhgtgfeyxiexzf.getClass();
                C0163Ujhhgtgfeyxiexzf.f1348Ujhhgtgfeyxiexzf.add((InterfaceC0611Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0612Ujhhgtgfeyxiexzf) {
                C0348Ujhhgtgfeyxiexzf.f1989Ujhhgtgfeyxiexzf.getClass();
                C0348Ujhhgtgfeyxiexzf.f1990Ujhhgtgfeyxiexzf.add((InterfaceC0612Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0608Ujhhgtgfeyxiexzf) {
                C0480Ujhhgtgfeyxiexzf.f2393Ujhhgtgfeyxiexzf.getClass();
                C0480Ujhhgtgfeyxiexzf.f2394Ujhhgtgfeyxiexzf.add((InterfaceC0608Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0607Ujhhgtgfeyxiexzf) {
                C0475Ujhhgtgfeyxiexzf.f2387Ujhhgtgfeyxiexzf.getClass();
                C0475Ujhhgtgfeyxiexzf.f2388Ujhhgtgfeyxiexzf.add((InterfaceC0607Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0610Ujhhgtgfeyxiexzf) {
                C1276feyxiexzfUjhhgtg.f4660Ujhhgtgfeyxiexzf.getClass();
                C1276feyxiexzfUjhhgtg.f4661Ujhhgtgfeyxiexzf.add((InterfaceC0610Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0741Ujhhgtgfeyxiexzf) {
                C1462feyxiexzfUjhhgtg.f5080Ujhhgtgfeyxiexzf.getClass();
                C1462feyxiexzfUjhhgtg.f5081Ujhhgtgfeyxiexzf.add((InterfaceC0741Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0742Ujhhgtgfeyxiexzf) {
                C1397feyxiexzfUjhhgtg.f4912Ujhhgtgfeyxiexzf.getClass();
                C1397feyxiexzfUjhhgtg.f4913Ujhhgtgfeyxiexzf.add((InterfaceC0742Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0743Ujhhgtgfeyxiexzf) {
                C0980feyxiexzfUjhhgtg.f3878Ujhhgtgfeyxiexzf.getClass();
                C0980feyxiexzfUjhhgtg.f3879Ujhhgtgfeyxiexzf.add((InterfaceC0743Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0744Ujhhgtgfeyxiexzf) {
                C1213feyxiexzfUjhhgtg.f4518Ujhhgtgfeyxiexzf.getClass();
                C1213feyxiexzfUjhhgtg.f4519Ujhhgtgfeyxiexzf.add((InterfaceC0744Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0745Ujhhgtgfeyxiexzf) {
                C1144feyxiexzfUjhhgtg.f4330Ujhhgtgfeyxiexzf.getClass();
                C1144feyxiexzfUjhhgtg.f4331Ujhhgtgfeyxiexzf.add((InterfaceC0745Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0746Ujhhgtgfeyxiexzf) {
                C1126feyxiexzfUjhhgtg.f4275Ujhhgtgfeyxiexzf.getClass();
                C1126feyxiexzfUjhhgtg.f4276Ujhhgtgfeyxiexzf.add((InterfaceC0746Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf instanceof InterfaceC0747Ujhhgtgfeyxiexzf) {
                C2064feyxiexzfUjhhgtg.f6791Ujhhgtgfeyxiexzf.getClass();
                C2064feyxiexzfUjhhgtg.f6792Ujhhgtgfeyxiexzf.add((InterfaceC0747Ujhhgtgfeyxiexzf) abstractC0571Ujhhgtgfeyxiexzf);
            }
            if (abstractC0571Ujhhgtgfeyxiexzf.mo1424feyxiexzfUjhhgtg() && !abstractC0571Ujhhgtgfeyxiexzf.f2585Ujhhgtgfeyxiexzf) {
                String[] strArrMo1423feyxiexzfUjhhgtg = abstractC0571Ujhhgtgfeyxiexzf.mo1423feyxiexzfUjhhgtg();
                String[] strArr = (String[]) Arrays.copyOf(strArrMo1423feyxiexzfUjhhgtg, strArrMo1423feyxiexzfUjhhgtg.length);
                if (strArr.length == 0) {
                    throw new IllegalStateException("withProcess method need a \"name\" param".toString());
                }
                for (String str : strArr) {
                    C2249feyxiexzfUjhhgtg c2249feyxiexzfUjhhgtg = f7327Ujhhgtgfeyxiexzf;
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, c2249feyxiexzfUjhhgtg.m2995Ujhhgtgfeyxiexzf())) {
                        c2249feyxiexzfUjhhgtg.m2997feyxiexzfUjhhgtg(abstractC0571Ujhhgtgfeyxiexzf);
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static C1785feyxiexzfUjhhgtg m3419feyxiexzfUjhhgtg(String str) {
        List listM2637Ujhhgtgfeyxiexzf = AbstractC1152feyxiexzfUjhhgtg.m2637Ujhhgtgfeyxiexzf(str, new char[]{'|'});
        if (listM2637Ujhhgtgfeyxiexzf.size() >= 3) {
            return new C1785feyxiexzfUjhhgtg((String) listM2637Ujhhgtgfeyxiexzf.get(0), (String) listM2637Ujhhgtgfeyxiexzf.get(1), (String) listM2637Ujhhgtgfeyxiexzf.get(2));
        }
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        return new C1785feyxiexzfUjhhgtg("", "", "");
    }

    @Override // p000.AbstractC2292feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ */
    public final void mo1843feyxiexzfUjhhgtg() {
        int i = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
        C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5190feyxiexzfUjhhgtg(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Instrumentation.class)).m2024Ujhhgtgfeyxiexzf();
        c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "callApplicationOnCreate";
        C2285feyxiexzfUjhhgtg c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf = f7327Ujhhgtgfeyxiexzf.m2996Ujhhgtgfeyxiexzf((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2698Ujhhgtgfeyxiexzf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Application.class)}, 1, c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf), 1);
        c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf.m3483Ujhhgtgfeyxiexzf(new C2208Ujhhgtgfeyxiexzf(7));
        c2285feyxiexzfUjhhgtgM2996Ujhhgtgfeyxiexzf.m3485Ujhhgtgfeyxiexzf();
    }
}
