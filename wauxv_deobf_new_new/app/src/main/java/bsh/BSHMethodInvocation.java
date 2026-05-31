package bsh;

import java.lang.reflect.InvocationTargetException;
import p000.C0527;
import p000.C1231;
import p000.C1232;
import p000.C2573;
import p000.C3581;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodInvocation extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHMethodInvocation(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C0527 c0527, RunnableC0008 runnableC0008) throws C1231 {
        C0012 c0012M2024 = c0527.m2024();
        BSHAmbiguousName nameNode = getNameNode();
        if ("fail".equals(nameNode.text)) {
            runnableC0008.f505.f533 = this;
        }
        C0012 c0012 = c0012M2024.f521;
        if (c0012 != null && c0012.f535 && (nameNode.text.equals("super") || nameNode.text.equals("this"))) {
            return Primitive.VOID;
        }
        C0010 name = nameNode.getName(c0012M2024);
        try {
            return name.m356(getArgsNode().getArguments(c0527, runnableC0008), runnableC0008, c0527, this);
        } catch (InvocationTargetException e) {
            throw AbstractC0016.m554(e, name.f512, c0527, this);
        } catch (C2573 e2) {
            throw new C1232("Error in method invocation: " + e2.getMessage(), this, c0527, e2);
        } catch (C3581 e3) {
            throw e3.mo4677(this, c0527);
        }
    }

    public BSHArguments getArgsNode() {
        return (BSHArguments) jjtGetChild(1);
    }

    public BSHAmbiguousName getNameNode() {
        return (BSHAmbiguousName) jjtGetChild(0);
    }
}
