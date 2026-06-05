package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛴᛳ能不能ᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0938feyxiexzfUjhhgtg implements Iterable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C0930feyxiexzfUjhhgtg f3779Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C0930feyxiexzfUjhhgtg f3780Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final WeakHashMap f3781Ujhhgtgfeyxiexzf = new WeakHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f3782Ujhhgtgfeyxiexzf = 0;

    public final boolean equals(Object obj) {
        C0934feyxiexzfUjhhgtg c0934feyxiexzfUjhhgtg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0938feyxiexzfUjhhgtg)) {
            return false;
        }
        C0938feyxiexzfUjhhgtg c0938feyxiexzfUjhhgtg = (C0938feyxiexzfUjhhgtg) obj;
        if (this.f3782Ujhhgtgfeyxiexzf != c0938feyxiexzfUjhhgtg.f3782Ujhhgtgfeyxiexzf) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0938feyxiexzfUjhhgtg.iterator();
        while (true) {
            c0934feyxiexzfUjhhgtg = (C0934feyxiexzfUjhhgtg) it;
            if (!c0934feyxiexzfUjhhgtg.hasNext()) {
                break;
            }
            C0934feyxiexzfUjhhgtg c0934feyxiexzfUjhhgtg2 = (C0934feyxiexzfUjhhgtg) it2;
            if (!c0934feyxiexzfUjhhgtg2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0934feyxiexzfUjhhgtg.next();
            Object next = c0934feyxiexzfUjhhgtg2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c0934feyxiexzfUjhhgtg.hasNext() || ((C0934feyxiexzfUjhhgtg) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C0934feyxiexzfUjhhgtg c0934feyxiexzfUjhhgtg = (C0934feyxiexzfUjhhgtg) it;
            if (!c0934feyxiexzfUjhhgtg.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0934feyxiexzfUjhhgtg.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0934feyxiexzfUjhhgtg c0934feyxiexzfUjhhgtg = new C0934feyxiexzfUjhhgtg(this.f3779Ujhhgtgfeyxiexzf, this.f3780Ujhhgtgfeyxiexzf, 0);
        this.f3781Ujhhgtgfeyxiexzf.put(c0934feyxiexzfUjhhgtg, Boolean.FALSE);
        return c0934feyxiexzfUjhhgtg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0934feyxiexzfUjhhgtg c0934feyxiexzfUjhhgtg = (C0934feyxiexzfUjhhgtg) it;
            if (!c0934feyxiexzfUjhhgtg.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0934feyxiexzfUjhhgtg.next()).toString());
            if (c0934feyxiexzfUjhhgtg.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C0930feyxiexzfUjhhgtg mo2431Ujhhgtgfeyxiexzf(Object obj) {
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = this.f3779Ujhhgtgfeyxiexzf;
        while (c0930feyxiexzfUjhhgtg != null && !c0930feyxiexzfUjhhgtg.f3760Ujhhgtgfeyxiexzf.equals(obj)) {
            c0930feyxiexzfUjhhgtg = c0930feyxiexzfUjhhgtg.f3762Ujhhgtgfeyxiexzf;
        }
        return c0930feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Object mo2432Ujhhgtgfeyxiexzf(Object obj) {
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf = mo2431Ujhhgtgfeyxiexzf(obj);
        if (c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        this.f3782Ujhhgtgfeyxiexzf--;
        WeakHashMap weakHashMap = this.f3781Ujhhgtgfeyxiexzf;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0939feyxiexzfUjhhgtg) it.next()).mo2429Ujhhgtgfeyxiexzf(c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf);
            }
        }
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg = c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3763Ujhhgtgfeyxiexzf;
        if (c0930feyxiexzfUjhhgtg != null) {
            c0930feyxiexzfUjhhgtg.f3762Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3762Ujhhgtgfeyxiexzf;
        } else {
            this.f3779Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3762Ujhhgtgfeyxiexzf;
        }
        C0930feyxiexzfUjhhgtg c0930feyxiexzfUjhhgtg2 = c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3762Ujhhgtgfeyxiexzf;
        if (c0930feyxiexzfUjhhgtg2 != null) {
            c0930feyxiexzfUjhhgtg2.f3763Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
        } else {
            this.f3780Ujhhgtgfeyxiexzf = c0930feyxiexzfUjhhgtg;
        }
        c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3762Ujhhgtgfeyxiexzf = null;
        c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3763Ujhhgtgfeyxiexzf = null;
        return c0930feyxiexzfUjhhgtgMo2431Ujhhgtgfeyxiexzf.f3761Ujhhgtgfeyxiexzf;
    }
}
