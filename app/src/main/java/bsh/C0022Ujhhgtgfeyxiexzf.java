package bsh;

import bsh.BSHBlock;
import p000.EnumC2814Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0022Ujhhgtgfeyxiexzf implements BSHBlock.NodeFilter {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C0022Ujhhgtgfeyxiexzf f484Ujhhgtgfeyxiexzf = new C0022Ujhhgtgfeyxiexzf(1, 3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C0022Ujhhgtgfeyxiexzf f485Ujhhgtgfeyxiexzf = new C0022Ujhhgtgfeyxiexzf(1, 2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C0022Ujhhgtgfeyxiexzf f486Ujhhgtgfeyxiexzf = new C0022Ujhhgtgfeyxiexzf(2, 3);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C0022Ujhhgtgfeyxiexzf f487Ujhhgtgfeyxiexzf = new C0022Ujhhgtgfeyxiexzf(2, 2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final C0022Ujhhgtgfeyxiexzf f488Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int f489Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f490Ujhhgtgfeyxiexzf;

    static {
        C0022Ujhhgtgfeyxiexzf c0022Ujhhgtgfeyxiexzf = new C0022Ujhhgtgfeyxiexzf();
        c0022Ujhhgtgfeyxiexzf.f490Ujhhgtgfeyxiexzf = 1;
        c0022Ujhhgtgfeyxiexzf.f489Ujhhgtgfeyxiexzf = 3;
        f488Ujhhgtgfeyxiexzf = c0022Ujhhgtgfeyxiexzf;
    }

    public C0022Ujhhgtgfeyxiexzf(int i, int i2) {
        this.f489Ujhhgtgfeyxiexzf = i;
        this.f490Ujhhgtgfeyxiexzf = i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m319Ujhhgtgfeyxiexzf(Node node) {
        if ((node.jjtGetParent().jjtGetParent() instanceof BSHClassDeclaration) && ((BSHClassDeclaration) node.jjtGetParent().jjtGetParent()).type == EnumC2814Ujhhgtgfeyxiexzf.f8961Ujhhgtgfeyxiexzf) {
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
        int i = this.f490Ujhhgtgfeyxiexzf;
        int i2 = this.f489Ujhhgtgfeyxiexzf;
        if (i2 == 3) {
            return node instanceof BSHClassDeclaration;
        }
        if (node instanceof BSHClassDeclaration) {
            return false;
        }
        if (i2 == 1) {
            if (i != 2) {
                return m319Ujhhgtgfeyxiexzf(node);
            }
            if (node instanceof BSHMethodDeclaration) {
                return ((BSHMethodDeclaration) node).modifiers.hasModifier("static");
            }
        } else {
            if (i != 2) {
                if (node instanceof BSHMethodDeclaration) {
                    return false;
                }
                return !m319Ujhhgtgfeyxiexzf(node);
            }
            if (node instanceof BSHMethodDeclaration) {
                return !((BSHMethodDeclaration) node).modifiers.hasModifier("static");
            }
        }
        return false;
    }
}
