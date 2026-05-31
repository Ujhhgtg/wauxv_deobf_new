package bsh;

import bsh.BSHBlock;
import p000.EnumC0698;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0004 implements BSHBlock.NodeFilter {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0004 f473 = new C0004(1, 3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0004 f474 = new C0004(1, 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0004 f475 = new C0004(2, 3);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0004 f476 = new C0004(2, 2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0004 f477;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int f478;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f479;

    static {
        C0004 c0004 = new C0004();
        c0004.f479 = 1;
        c0004.f478 = 3;
        f477 = c0004;
    }

    public C0004(int i, int i2) {
        this.f478 = i;
        this.f479 = i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m322(Node node) {
        if ((node.jjtGetParent().jjtGetParent() instanceof BSHClassDeclaration) && ((BSHClassDeclaration) node.jjtGetParent().jjtGetParent()).type == EnumC0698.f2673) {
            return true;
        }
        if (node instanceof BSHTypedVariableDeclaration) {
            return ((BSHTypedVariableDeclaration) node).modifiers.hasModifier("static");
        }
        if (node instanceof BSHBlock) {
            return ((BSHBlock) node).isStatic;
        }
        return false;
    }

    @Override // bsh.BSHBlock.NodeFilter
    public final boolean isVisible(Node node) {
        int i = this.f479;
        int i2 = this.f478;
        if (i2 == 3) {
            return node instanceof BSHClassDeclaration;
        }
        if (node instanceof BSHClassDeclaration) {
            return false;
        }
        if (i2 == 1) {
            if (i != 2) {
                return m322(node);
            }
            if (node instanceof BSHMethodDeclaration) {
                return ((BSHMethodDeclaration) node).modifiers.hasModifier("static");
            }
        } else {
            if (i != 2) {
                if (node instanceof BSHMethodDeclaration) {
                    return false;
                }
                return !m322(node);
            }
            if (node instanceof BSHMethodDeclaration) {
                return !((BSHMethodDeclaration) node).modifiers.hasModifier("static");
            }
        }
        return false;
    }
}
