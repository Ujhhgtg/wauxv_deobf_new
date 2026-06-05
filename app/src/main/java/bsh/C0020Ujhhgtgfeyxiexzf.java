package bsh;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Stack;
import p000.AbstractC2584feyxiexzfUjhhgtg;
import p000.C0920feyxiexzfUjhhgtg;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C3428feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0020Ujhhgtgfeyxiexzf extends AbstractC2584feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0029Ujhhgtgfeyxiexzf f462Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Modifiers[] f463Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Class[] f464Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final String[] f465Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Node f466Ujhhgtgfeyxiexzf;

    public C0020Ujhhgtgfeyxiexzf(Node node, C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, Modifiers[] modifiersArr, Class[] clsArr, String[] strArr, Node node2) {
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf;
        super(node);
        if (c0029Ujhhgtgfeyxiexzf != null) {
            c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.m360Ujhhgtgfeyxiexzf();
            Stack stack = new Stack();
            while (true) {
                c0029Ujhhgtgfeyxiexzf = c0029Ujhhgtgfeyxiexzf.f535Ujhhgtgfeyxiexzf;
                if (c0029Ujhhgtgfeyxiexzf == null) {
                    break;
                } else {
                    stack.add(c0029Ujhhgtgfeyxiexzf);
                }
            }
            while (!stack.isEmpty()) {
                C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf2 = (C0029Ujhhgtgfeyxiexzf) stack.pop();
                if (!c0029Ujhhgtgfeyxiexzf2.f549Ujhhgtgfeyxiexzf && !c0029Ujhhgtgfeyxiexzf2.f551Ujhhgtgfeyxiexzf) {
                    c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.f536Ujhhgtgfeyxiexzf.putAll(c0029Ujhhgtgfeyxiexzf2.f536Ujhhgtgfeyxiexzf);
                }
            }
            c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf.f536Ujhhgtgfeyxiexzf.replaceAll(new C3428feyxiexzfUjhhgtg(2));
        } else {
            c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf = null;
        }
        this.f462Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM360Ujhhgtgfeyxiexzf;
        this.f463Ujhhgtgfeyxiexzf = modifiersArr;
        this.f464Ujhhgtgfeyxiexzf = clsArr;
        this.f465Ujhhgtgfeyxiexzf = strArr;
        this.f466Ujhhgtgfeyxiexzf = node2;
        if (modifiersArr.length != clsArr.length || clsArr.length != strArr.length) {
            throw new IllegalArgumentException("The length of 'paramsModifiers', 'paramsTypes' and 'paramsNames' can't be different!");
        }
    }

    @Override // p000.AbstractC2584feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Object mo306Ujhhgtgfeyxiexzf(Object[] objArr) throws C1863Ujhhgtgfeyxiexzf {
        int length = objArr.length;
        Class[] clsArr = this.f464Ujhhgtgfeyxiexzf;
        if (length != clsArr.length) {
            throw new C1863Ujhhgtgfeyxiexzf("Wrong number of arguments!");
        }
        C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = new C0029Ujhhgtgfeyxiexzf(this.f462Ujhhgtgfeyxiexzf, null, "LambdaExpression");
        int i = 0;
        while (true) {
            String[] strArr = this.f465Ujhhgtgfeyxiexzf;
            if (i >= strArr.length) {
                break;
            }
            Class cls = clsArr[i];
            if (cls != null) {
                c0029Ujhhgtgfeyxiexzf.m385feyxiexzfUjhhgtg(strArr[i], cls, objArr[i], this.f463Ujhhgtgfeyxiexzf[i]);
            } else {
                c0029Ujhhgtgfeyxiexzf.mo303feyxiexzfUjhhgtg(strArr[i], objArr[i], true);
            }
            i++;
        }
        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(c0029Ujhhgtgfeyxiexzf);
        RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = new RunnableC0026Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf, null);
        Node node = this.f466Ujhhgtgfeyxiexzf;
        if (!(node instanceof BSHBlock)) {
            return node.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        }
        Object objEval = node.eval(c2637feyxiexzfUjhhgtg, runnableC0026Ujhhgtgfeyxiexzf);
        if (objEval instanceof C0920feyxiexzfUjhhgtg) {
            C0920feyxiexzfUjhhgtg c0920feyxiexzfUjhhgtg = (C0920feyxiexzfUjhhgtg) objEval;
            if (c0920feyxiexzfUjhhgtg.f3737Ujhhgtgfeyxiexzf == 47) {
                return c0920feyxiexzfUjhhgtg.f3739Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    @Override // p000.AbstractC2584feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean mo307Ujhhgtgfeyxiexzf(int i, Method method) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Class[] clsArr = this.f464Ujhhgtgfeyxiexzf;
        if (clsArr.length != genericParameterTypes.length) {
            return false;
        }
        return AbstractC0034Ujhhgtgfeyxiexzf.m577Ujhhgtgfeyxiexzf(clsArr, genericParameterTypes, i);
    }
}
