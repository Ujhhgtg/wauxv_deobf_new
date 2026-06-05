package bsh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C0168Ujhhgtgfeyxiexzf;
import p000.C1091feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;
import p000.EnumC2814Ujhhgtgfeyxiexzf;
import p000.InterfaceC1087feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHClassDeclaration extends SimpleNode {
    static final String CLASSINITNAME = "_bshClassInit";
    private static final long serialVersionUID = 1;
    boolean extend;
    private Class<?> generatedClass;
    Modifiers modifiers;
    String name;
    int numInterfaces;
    EnumC2814Ujhhgtgfeyxiexzf type;

    public BSHClassDeclaration(int i) {
        super(i);
        this.modifiers = new Modifiers(0);
    }

    private Class<?> generateClass(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        int i;
        Class<?> cls;
        C0021Ujhhgtgfeyxiexzf c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf;
        int i2 = 0;
        ArrayList<C0021Ujhhgtgfeyxiexzf> arrayList = new ArrayList(0);
        if (this.extend) {
            Class<?> cls2 = ((BSHAmbiguousName) jjtGetChild(0)).toClass(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            try {
                Iterator it = RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf.f1352Ujhhgtgfeyxiexzf.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1087feyxiexzfUjhhgtg) it.next()).getClass();
                }
                if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(cls2)) {
                    if (AbstractC0033Ujhhgtgfeyxiexzf.m526Ujhhgtgfeyxiexzf(cls2).hasModifier("final")) {
                        throw new C3354Ujhhgtgfeyxiexzf("Cannot inherit from final class ".concat(cls2.getName()), null, null);
                    }
                    arrayList.addAll((Collection) Stream.of((Object[]) AbstractC0033Ujhhgtgfeyxiexzf.m528Ujhhgtgfeyxiexzf(cls2)).filter(new Ujhhgtgfeyxiexzf()).collect(Collectors.toList()));
                }
                cls = cls2;
                i = 1;
            } catch (C1863Ujhhgtgfeyxiexzf e) {
                throw e.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
            }
        } else {
            i = 0;
            cls = null;
        }
        Class[] clsArr = new Class[this.numInterfaces];
        while (i2 < this.numInterfaces) {
            int i3 = i + 1;
            BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild(i);
            Class<?> cls3 = bSHAmbiguousName.toClass(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            clsArr[i2] = cls3;
            if (!cls3.isInterface()) {
                throw new C3354Ujhhgtgfeyxiexzf(AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("Type: "), bSHAmbiguousName.text, " is not an interface!"), this, c2637feyxiexzfUjhhgtg);
            }
            try {
                C0168Ujhhgtgfeyxiexzf c0168Ujhhgtgfeyxiexzf = RunnableC0026Ujhhgtgfeyxiexzf.f516Ujhhgtgfeyxiexzf;
                Class cls4 = clsArr[i2];
                Iterator it2 = c0168Ujhhgtgfeyxiexzf.f1352Ujhhgtgfeyxiexzf.iterator();
                while (it2.hasNext()) {
                    if (!((InterfaceC1087feyxiexzfUjhhgtg) it2.next()).mo1209Ujhhgtgfeyxiexzf(cls4)) {
                        int i4 = C1091feyxiexzfUjhhgtg.f4176Ujhhgtgfeyxiexzf;
                        throw new C1091feyxiexzfUjhhgtg("Can't implement this interface: ".concat(cls4.getName()));
                    }
                }
                i2++;
                i = i3;
            } catch (C1863Ujhhgtgfeyxiexzf e2) {
                throw e2.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
            }
        }
        BSHBlock bSHBlock = (BSHBlock) jjtGetChild(i);
        if (this.type == EnumC2814Ujhhgtgfeyxiexzf.f8961Ujhhgtgfeyxiexzf) {
            this.modifiers.changeContext(1);
        }
        if (C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf == null) {
            C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf = new C0023Ujhhgtgfeyxiexzf();
        }
        C0023Ujhhgtgfeyxiexzf c0023Ujhhgtgfeyxiexzf = C0023Ujhhgtgfeyxiexzf.f491Ujhhgtgfeyxiexzf;
        String str = this.name;
        Modifiers modifiers = this.modifiers;
        EnumC2814Ujhhgtgfeyxiexzf enumC2814Ujhhgtgfeyxiexzf = this.type;
        c0023Ujhhgtgfeyxiexzf.getClass();
        Class<?> clsM320Ujhhgtgfeyxiexzf = C0023Ujhhgtgfeyxiexzf.m320Ujhhgtgfeyxiexzf(str, modifiers, clsArr, cls, bSHBlock, enumC2814Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        for (C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf : arrayList) {
            String strM310Ujhhgtgfeyxiexzf = c0021Ujhhgtgfeyxiexzf.m310Ujhhgtgfeyxiexzf();
            Class[] clsArrMo313Ujhhgtgfeyxiexzf = c0021Ujhhgtgfeyxiexzf.mo313Ujhhgtgfeyxiexzf();
            if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(clsM320Ujhhgtgfeyxiexzf)) {
                c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m533Ujhhgtgfeyxiexzf(AbstractC0033Ujhhgtgfeyxiexzf.m538Ujhhgtgfeyxiexzf(clsM320Ujhhgtgfeyxiexzf), strM310Ujhhgtgfeyxiexzf, clsArrMo313Ujhhgtgfeyxiexzf, true);
                if (c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf == null && !clsM320Ujhhgtgfeyxiexzf.isInterface()) {
                    c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m533Ujhhgtgfeyxiexzf(AbstractC0033Ujhhgtgfeyxiexzf.m539Ujhhgtgfeyxiexzf(AbstractC0033Ujhhgtgfeyxiexzf.m534Ujhhgtgfeyxiexzf(clsM320Ujhhgtgfeyxiexzf)), strM310Ujhhgtgfeyxiexzf, clsArrMo313Ujhhgtgfeyxiexzf, true);
                }
            } else {
                c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf = null;
            }
            if (c0021UjhhgtgfeyxiexzfM533Ujhhgtgfeyxiexzf != null) {
                throw new C3354Ujhhgtgfeyxiexzf("Cannot override " + c0021Ujhhgtgfeyxiexzf.m310Ujhhgtgfeyxiexzf() + "() in " + AbstractC3594Ujhhgtgfeyxiexzf.m5196feyxiexzfUjhhgtg(cls) + " overridden method is final", null, null);
            }
        }
        return clsM320Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$generateClass$0(C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf) {
        return c0021Ujhhgtgfeyxiexzf.m315Ujhhgtgfeyxiexzf("final") && !c0021Ujhhgtgfeyxiexzf.m315Ujhhgtgfeyxiexzf("private");
    }

    @Override // bsh.SimpleNode, bsh.Node
    public synchronized Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) {
        try {
            if (this.generatedClass == null) {
                this.generatedClass = generateClass(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.generatedClass;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
