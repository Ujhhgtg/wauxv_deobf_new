package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛲᛱUjhhgtgᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3259feyxiexzfUjhhgtg implements InterfaceC3257feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC2229feyxiexzfUjhhgtg f10227Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f10229Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f10230Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public AbstractC2229feyxiexzfUjhhgtg f10224Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f10225Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f10226Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f10228Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f10231Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public C3160feyxiexzfUjhhgtg f10232Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f10233Ujhhgtgfeyxiexzf = false;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final ArrayList f10234Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f10235Ujhhgtgfeyxiexzf = new ArrayList();

    public C3259feyxiexzfUjhhgtg(AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg) {
        this.f10227Ujhhgtgfeyxiexzf = abstractC2229feyxiexzfUjhhgtg;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10227Ujhhgtgfeyxiexzf.f7255Ujhhgtgfeyxiexzf.f11623Ujhhgtgfeyxiexzf);
        sb.append(":");
        switch (this.f10228Ujhhgtgfeyxiexzf) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f10233Ujhhgtgfeyxiexzf ? Integer.valueOf(this.f10230Ujhhgtgfeyxiexzf) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f10235Ujhhgtgfeyxiexzf.size());
        sb.append(":d=");
        sb.append(this.f10234Ujhhgtgfeyxiexzf.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // p000.InterfaceC3257feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1820Ujhhgtgfeyxiexzf(InterfaceC3257feyxiexzfUjhhgtg interfaceC3257feyxiexzfUjhhgtg) {
        ArrayList<C3259feyxiexzfUjhhgtg> arrayList = this.f10235Ujhhgtgfeyxiexzf;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C3259feyxiexzfUjhhgtg) it.next()).f10233Ujhhgtgfeyxiexzf) {
                return;
            }
        }
        this.f10226Ujhhgtgfeyxiexzf = true;
        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg = this.f10224Ujhhgtgfeyxiexzf;
        if (abstractC2229feyxiexzfUjhhgtg != null) {
            abstractC2229feyxiexzfUjhhgtg.mo1820Ujhhgtgfeyxiexzf(this);
        }
        if (this.f10225Ujhhgtgfeyxiexzf) {
            this.f10227Ujhhgtgfeyxiexzf.mo1820Ujhhgtgfeyxiexzf(this);
            return;
        }
        C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg = null;
        int i = 0;
        for (C3259feyxiexzfUjhhgtg c3259feyxiexzfUjhhgtg2 : arrayList) {
            if (!(c3259feyxiexzfUjhhgtg2 instanceof C3160feyxiexzfUjhhgtg)) {
                i++;
                c3259feyxiexzfUjhhgtg = c3259feyxiexzfUjhhgtg2;
            }
        }
        if (c3259feyxiexzfUjhhgtg != null && i == 1 && c3259feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf) {
            C3160feyxiexzfUjhhgtg c3160feyxiexzfUjhhgtg = this.f10232Ujhhgtgfeyxiexzf;
            if (c3160feyxiexzfUjhhgtg != null) {
                if (!c3160feyxiexzfUjhhgtg.f10233Ujhhgtgfeyxiexzf) {
                    return;
                } else {
                    this.f10229Ujhhgtgfeyxiexzf = this.f10231Ujhhgtgfeyxiexzf * c3160feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf;
                }
            }
            mo4674Ujhhgtgfeyxiexzf(c3259feyxiexzfUjhhgtg.f10230Ujhhgtgfeyxiexzf + this.f10229Ujhhgtgfeyxiexzf);
        }
        AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg2 = this.f10224Ujhhgtgfeyxiexzf;
        if (abstractC2229feyxiexzfUjhhgtg2 != null) {
            abstractC2229feyxiexzfUjhhgtg2.mo1820Ujhhgtgfeyxiexzf(this);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m4767Ujhhgtgfeyxiexzf(AbstractC2229feyxiexzfUjhhgtg abstractC2229feyxiexzfUjhhgtg) {
        this.f10234Ujhhgtgfeyxiexzf.add(abstractC2229feyxiexzfUjhhgtg);
        if (this.f10233Ujhhgtgfeyxiexzf) {
            abstractC2229feyxiexzfUjhhgtg.mo1820Ujhhgtgfeyxiexzf(abstractC2229feyxiexzfUjhhgtg);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m4768Ujhhgtgfeyxiexzf() {
        this.f10235Ujhhgtgfeyxiexzf.clear();
        this.f10234Ujhhgtgfeyxiexzf.clear();
        this.f10233Ujhhgtgfeyxiexzf = false;
        this.f10230Ujhhgtgfeyxiexzf = 0;
        this.f10226Ujhhgtgfeyxiexzf = false;
        this.f10225Ujhhgtgfeyxiexzf = false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public void mo4674Ujhhgtgfeyxiexzf(int i) {
        if (this.f10233Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f10233Ujhhgtgfeyxiexzf = true;
        this.f10230Ujhhgtgfeyxiexzf = i;
        for (InterfaceC3257feyxiexzfUjhhgtg interfaceC3257feyxiexzfUjhhgtg : this.f10234Ujhhgtgfeyxiexzf) {
            interfaceC3257feyxiexzfUjhhgtg.mo1820Ujhhgtgfeyxiexzf(interfaceC3257feyxiexzfUjhhgtg);
        }
    }
}
