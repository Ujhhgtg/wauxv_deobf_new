package p000;

import bsh.Node;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛴ能不能ᛱfeyxiexzfᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0733Ujhhgtgfeyxiexzf implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public ArrayList f3006Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public ArrayList f3007Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f3008Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f3009Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public boolean f3010Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m2074Ujhhgtgfeyxiexzf() {
        while (this.f3008Ujhhgtgfeyxiexzf > this.f3009Ujhhgtgfeyxiexzf) {
            m2078Ujhhgtgfeyxiexzf();
        }
        ArrayList arrayList = this.f3007Ujhhgtgfeyxiexzf;
        this.f3009Ujhhgtgfeyxiexzf = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m2075Ujhhgtgfeyxiexzf(Node node) {
        ArrayList arrayList = this.f3007Ujhhgtgfeyxiexzf;
        int i = this.f3008Ujhhgtgfeyxiexzf - this.f3009Ujhhgtgfeyxiexzf;
        this.f3009Ujhhgtgfeyxiexzf = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                node.jjtClose();
                this.f3006Ujhhgtgfeyxiexzf.add(node);
                this.f3008Ujhhgtgfeyxiexzf++;
                this.f3010Ujhhgtgfeyxiexzf = true;
                return;
            }
            Node nodeM2078Ujhhgtgfeyxiexzf = m2078Ujhhgtgfeyxiexzf();
            nodeM2078Ujhhgtgfeyxiexzf.jjtSetParent(node);
            node.jjtAddChild(nodeM2078Ujhhgtgfeyxiexzf, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m2076Ujhhgtgfeyxiexzf(Node node, int i) {
        ArrayList arrayList = this.f3007Ujhhgtgfeyxiexzf;
        this.f3009Ujhhgtgfeyxiexzf = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                node.jjtClose();
                this.f3006Ujhhgtgfeyxiexzf.add(node);
                this.f3008Ujhhgtgfeyxiexzf++;
                this.f3010Ujhhgtgfeyxiexzf = true;
                return;
            }
            Node nodeM2078Ujhhgtgfeyxiexzf = m2078Ujhhgtgfeyxiexzf();
            nodeM2078Ujhhgtgfeyxiexzf.jjtSetParent(node);
            node.jjtAddChild(nodeM2078Ujhhgtgfeyxiexzf, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m2077Ujhhgtgfeyxiexzf(Node node) {
        this.f3007Ujhhgtgfeyxiexzf.add(Integer.valueOf(this.f3009Ujhhgtgfeyxiexzf));
        this.f3009Ujhhgtgfeyxiexzf = this.f3008Ujhhgtgfeyxiexzf;
        node.jjtOpen();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Node m2078Ujhhgtgfeyxiexzf() {
        int i = this.f3008Ujhhgtgfeyxiexzf - 1;
        this.f3008Ujhhgtgfeyxiexzf = i;
        if (i < this.f3009Ujhhgtgfeyxiexzf) {
            ArrayList arrayList = this.f3007Ujhhgtgfeyxiexzf;
            this.f3009Ujhhgtgfeyxiexzf = ((Integer) arrayList.remove(arrayList.size() - 1)).intValue();
        }
        ArrayList arrayList2 = this.f3006Ujhhgtgfeyxiexzf;
        return (Node) arrayList2.remove(arrayList2.size() - 1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m2079Ujhhgtgfeyxiexzf() {
        this.f3006Ujhhgtgfeyxiexzf.clear();
        this.f3007Ujhhgtgfeyxiexzf.clear();
        this.f3008Ujhhgtgfeyxiexzf = 0;
        this.f3009Ujhhgtgfeyxiexzf = 0;
    }
}
