package bsh;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Stack;
import p000.AbstractC0472;
import p000.C0527;
import p000.C3581;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0003 extends AbstractC0472 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0012 f468;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Modifiers[] f469;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Class[] f470;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String[] f471;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Node f472;

    public C0003(Node node, C0012 c0012, Modifiers[] modifiersArr, Class[] clsArr, String[] strArr, Node node2) {
        C0012 c0012M362;
        super(node);
        if (c0012 != null) {
            c0012M362 = c0012.m362();
            Stack stack = new Stack();
            while (true) {
                c0012 = c0012.f521;
                if (c0012 == null) {
                    break;
                } else {
                    stack.add(c0012);
                }
            }
            while (!stack.isEmpty()) {
                C0012 c0013 = (C0012) stack.pop();
                if (!c0013.f535 && !c0013.f537) {
                    c0012M362.f522.putAll(c0013.f522);
                }
            }
            c0012M362.f522.replaceAll(new C0011());
        } else {
            c0012M362 = null;
        }
        this.f468 = c0012M362;
        this.f469 = modifiersArr;
        this.f470 = clsArr;
        this.f471 = strArr;
        this.f472 = node2;
        if (modifiersArr.length != clsArr.length || clsArr.length != strArr.length) {
            throw new IllegalArgumentException("The length of 'paramsModifiers', 'paramsTypes' and 'paramsNames' can't be different!");
        }
    }

    @Override // p000.AbstractC0472
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object mo320(Object[] objArr) throws C3581 {
        int length = objArr.length;
        Class[] clsArr = this.f470;
        if (length != clsArr.length) {
            throw new C3581("Wrong number of arguments!");
        }
        C0012 c0012 = new C0012(this.f468, null, "LambdaExpression");
        int i = 0;
        while (true) {
            String[] strArr = this.f471;
            if (i >= strArr.length) {
                break;
            }
            Class cls = clsArr[i];
            if (cls != null) {
                c0012.m386(strArr[i], cls, objArr[i], this.f469[i]);
            } else {
                c0012.mo317(strArr[i], objArr[i], true);
            }
            i++;
        }
        C0527 c0527 = new C0527(c0012);
        RunnableC0008 runnableC0008 = new RunnableC0008(c0012, null);
        Node node = this.f472;
        if (!(node instanceof BSHBlock)) {
            return node.eval(c0527, runnableC0008);
        }
        Object objEval = node.eval(c0527, runnableC0008);
        if (objEval instanceof ReturnControl) {
            ReturnControl returnControl = (ReturnControl) objEval;
            if (returnControl.kind == 47) {
                return returnControl.value;
            }
        }
        return null;
    }

    @Override // p000.AbstractC0472
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean mo321(int i, Method method) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Class[] clsArr = this.f470;
        if (clsArr.length != genericParameterTypes.length) {
            return false;
        }
        return AbstractC0017.m578(clsArr, genericParameterTypes, i);
    }
}
