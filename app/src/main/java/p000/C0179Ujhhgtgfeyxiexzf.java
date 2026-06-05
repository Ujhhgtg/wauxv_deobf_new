package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ能不能要点脸ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0179Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final LinkedHashMap f1382Ujhhgtgfeyxiexzf = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final long f1383Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public long f1384Ujhhgtgfeyxiexzf;

    public C0179Ujhhgtgfeyxiexzf(long j) {
        this.f1383Ujhhgtgfeyxiexzf = j;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final synchronized Object m1245Ujhhgtgfeyxiexzf(Object obj) {
        C0273Ujhhgtgfeyxiexzf c0273Ujhhgtgfeyxiexzf;
        c0273Ujhhgtgfeyxiexzf = (C0273Ujhhgtgfeyxiexzf) this.f1382Ujhhgtgfeyxiexzf.get(obj);
        return c0273Ujhhgtgfeyxiexzf != null ? c0273Ujhhgtgfeyxiexzf.f1672Ujhhgtgfeyxiexzf : null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int mo1246Ujhhgtgfeyxiexzf(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final synchronized Object m1248Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        int iMo1246Ujhhgtgfeyxiexzf = mo1246Ujhhgtgfeyxiexzf(obj2);
        long j = iMo1246Ujhhgtgfeyxiexzf;
        if (j >= this.f1383Ujhhgtgfeyxiexzf) {
            mo1247Ujhhgtgfeyxiexzf(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f1384Ujhhgtgfeyxiexzf += j;
        }
        C0273Ujhhgtgfeyxiexzf c0273Ujhhgtgfeyxiexzf = (C0273Ujhhgtgfeyxiexzf) this.f1382Ujhhgtgfeyxiexzf.put(obj, obj2 == null ? null : new C0273Ujhhgtgfeyxiexzf(iMo1246Ujhhgtgfeyxiexzf, obj2));
        if (c0273Ujhhgtgfeyxiexzf != null) {
            this.f1384Ujhhgtgfeyxiexzf -= (long) c0273Ujhhgtgfeyxiexzf.f1673Ujhhgtgfeyxiexzf;
            if (!c0273Ujhhgtgfeyxiexzf.f1672Ujhhgtgfeyxiexzf.equals(obj2)) {
                mo1247Ujhhgtgfeyxiexzf(obj, c0273Ujhhgtgfeyxiexzf.f1672Ujhhgtgfeyxiexzf);
            }
        }
        m1249Ujhhgtgfeyxiexzf(this.f1383Ujhhgtgfeyxiexzf);
        return c0273Ujhhgtgfeyxiexzf != null ? c0273Ujhhgtgfeyxiexzf.f1672Ujhhgtgfeyxiexzf : null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final synchronized void m1249Ujhhgtgfeyxiexzf(long j) {
        while (this.f1384Ujhhgtgfeyxiexzf > j) {
            Iterator it = this.f1382Ujhhgtgfeyxiexzf.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C0273Ujhhgtgfeyxiexzf c0273Ujhhgtgfeyxiexzf = (C0273Ujhhgtgfeyxiexzf) entry.getValue();
            this.f1384Ujhhgtgfeyxiexzf -= (long) c0273Ujhhgtgfeyxiexzf.f1673Ujhhgtgfeyxiexzf;
            Object key = entry.getKey();
            it.remove();
            mo1247Ujhhgtgfeyxiexzf(key, c0273Ujhhgtgfeyxiexzf.f1672Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public void mo1247Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
    }
}
