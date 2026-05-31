package bsh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p000.AbstractC2240;
import p000.AbstractC2844;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C1910;
import p000.C2705;
import p000.C3581;
import p000.EnumC0698;
import p000.InterfaceC2706;

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
    EnumC0698 type;

    public BSHClassDeclaration(int i) {
        super(i);
        this.modifiers = new Modifiers(0);
    }

    private Class<?> generateClass(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        int i;
        Class<?> cls;
        BshMethod bshMethodM534;
        int i2 = 0;
        ArrayList<BshMethod> arrayList = new ArrayList(0);
        if (this.extend) {
            Class<?> cls2 = ((BSHAmbiguousName) jjtGetChild(0)).toClass(c0527, runnableC0008);
            try {
                Iterator it = RunnableC0008.f502.f6304.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2706) it.next()).getClass();
                }
                if (AbstractC0016.m546(cls2)) {
                    if (AbstractC0016.m527(cls2).hasModifier("final")) {
                        throw new C1232("Cannot inherit from final class ".concat(cls2.getName()), null, null);
                    }
                    arrayList.addAll((Collection) Stream.of((Object[]) AbstractC0016.m529(cls2)).filter(new C0001()).collect(Collectors.toList()));
                }
                cls = cls2;
                i = 1;
            } catch (C3581 e) {
                throw e.mo4677(this, c0527);
            }
        } else {
            i = 0;
            cls = null;
        }
        Class[] clsArr = new Class[this.numInterfaces];
        while (i2 < this.numInterfaces) {
            int i3 = i + 1;
            BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild(i);
            Class<?> cls3 = bSHAmbiguousName.toClass(c0527, runnableC0008);
            clsArr[i2] = cls3;
            if (!cls3.isInterface()) {
                throw new C1232(AbstractC2844.m4786(new StringBuilder("Type: "), bSHAmbiguousName.text, " is not an interface!"), this, c0527);
            }
            try {
                C1910 c1910 = RunnableC0008.f502;
                Class cls4 = clsArr[i2];
                Iterator it2 = c1910.f6304.iterator();
                while (it2.hasNext()) {
                    if (!((InterfaceC2706) it2.next()).mo3835(cls4)) {
                        int i4 = C2705.f8703;
                        throw new C2705("Can't implement this interface: ".concat(cls4.getName()));
                    }
                }
                i2++;
                i = i3;
            } catch (C3581 e2) {
                throw e2.mo4677(this, c0527);
            }
        }
        BSHBlock bSHBlock = (BSHBlock) jjtGetChild(i);
        if (this.type == EnumC0698.f2673) {
            this.modifiers.changeContext(1);
        }
        if (C0005.f480 == null) {
            C0005.f480 = new C0005();
        }
        C0005 c0005 = C0005.f480;
        String str = this.name;
        Modifiers modifiers = this.modifiers;
        EnumC0698 enumC0698 = this.type;
        c0005.getClass();
        Class<?> clsM323 = C0005.m323(str, modifiers, clsArr, cls, bSHBlock, enumC0698, c0527, runnableC0008);
        for (BshMethod bshMethod : arrayList) {
            String name = bshMethod.getName();
            Class<?>[] parameterTypes = bshMethod.getParameterTypes();
            if (AbstractC0016.m546(clsM323)) {
                bshMethodM534 = AbstractC0016.m534(AbstractC0016.m539(clsM323), name, parameterTypes, true);
                if (bshMethodM534 == null && !clsM323.isInterface()) {
                    bshMethodM534 = AbstractC0016.m534(AbstractC0016.m540(AbstractC0016.m535(clsM323)), name, parameterTypes, true);
                }
            } else {
                bshMethodM534 = null;
            }
            if (bshMethodM534 != null) {
                throw new C1232("Cannot override " + bshMethod.getName() + "() in " + AbstractC2240.m4267(cls) + " overridden method is final", null, null);
            }
        }
        return clsM323;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$generateClass$0(BshMethod bshMethod) {
        return bshMethod.hasModifier("final") && !bshMethod.hasModifier("private");
    }

    @Override // bsh.SimpleNode, bsh.Node
    public synchronized Object eval(C0527 c0527, RunnableC0008 runnableC0008) {
        try {
            if (this.generatedClass == null) {
                this.generatedClass = generateClass(c0527, runnableC0008);
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
