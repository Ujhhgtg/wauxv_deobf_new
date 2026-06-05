package bsh;

import java.lang.reflect.InvocationTargetException;
import p000.C0958feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.C3354Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodInvocation extends SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHMethodInvocation(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf) throws C3353Ujhhgtgfeyxiexzf {
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf();
        BSHAmbiguousName nameNode = getNameNode();
        if ("fail".equals(nameNode.text)) {
            runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.f547Ujhhgtgfeyxiexzf = this;
        }
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf.f535Ujhhgtgfeyxiexzf;
        if (c0029Ujhhgtgfeyxiexzf != null && c0029Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf && (nameNode.text.equals("super") || nameNode.text.equals("this"))) {
            return Primitive.VOID;
        }
        C0028Ujhhgtgfeyxiexzf name = nameNode.getName(c0029UjhhgtgfeyxiexzfM3973Ujhhgtgfeyxiexzf);
        try {
            return name.m354Ujhhgtgfeyxiexzf(runnableC0026Ujhhgtgfeyxiexzf, getArgsNode().getArguments(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf), c2637feyxiexzfUjhhgtg, this);
        } catch (InvocationTargetException e) {
            throw AbstractC0033Ujhhgtgfeyxiexzf.m553feyxiexzfUjhhgtg(e, name.f526Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, this);
        } catch (C0958feyxiexzfUjhhgtg e2) {
            throw new C3354Ujhhgtgfeyxiexzf("Error in method invocation: " + e2.getMessage(), this, c2637feyxiexzfUjhhgtg, e2);
        } catch (C1863Ujhhgtgfeyxiexzf e3) {
            throw e3.mo2569Ujhhgtgfeyxiexzf(this, c2637feyxiexzfUjhhgtg);
        }
    }

    public BSHArguments getArgsNode() {
        return (BSHArguments) jjtGetChild(1);
    }

    public BSHAmbiguousName getNameNode() {
        return (BSHAmbiguousName) jjtGetChild(0);
    }
}
