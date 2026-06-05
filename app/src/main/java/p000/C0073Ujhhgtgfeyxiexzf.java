package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0073Ujhhgtgfeyxiexzf extends AbstractC2926Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C0077Ujhhgtgfeyxiexzf f1129Ujhhgtgfeyxiexzf;

    public C0073Ujhhgtgfeyxiexzf() {
        C1157feyxiexzfUjhhgtg c1157feyxiexzfUjhhgtg = C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf;
        C0117Ujhhgtgfeyxiexzf c0117Ujhhgtgfeyxiexzf = C0117Ujhhgtgfeyxiexzf.f1265Ujhhgtgfeyxiexzf;
        this.f1129Ujhhgtgfeyxiexzf = new C0077Ujhhgtgfeyxiexzf(C1157feyxiexzfUjhhgtg.f4353Ujhhgtgfeyxiexzf, C0117Ujhhgtgfeyxiexzf.f1266Ujhhgtgfeyxiexzf);
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1121feyxiexzfUjhhgtg mo1106Ujhhgtgfeyxiexzf() {
        return this.f1129Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0146Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void mo1107Ujhhgtgfeyxiexzf(InterfaceC3329Ujhhgtgfeyxiexzf interfaceC3329Ujhhgtgfeyxiexzf, Object obj) {
        int size = ((Map) obj).size();
        C0077Ujhhgtgfeyxiexzf c0077Ujhhgtgfeyxiexzf = this.f1129Ujhhgtgfeyxiexzf;
        InterfaceC2875feyxiexzfUjhhgtg interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf = interfaceC3329Ujhhgtgfeyxiexzf.mo2349Ujhhgtgfeyxiexzf(c0077Ujhhgtgfeyxiexzf, size);
        Iterator itMo1110Ujhhgtgfeyxiexzf = mo1110Ujhhgtgfeyxiexzf(obj);
        int i = 0;
        while (itMo1110Ujhhgtgfeyxiexzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo1110Ujhhgtgfeyxiexzf.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf.mo2333Ujhhgtgfeyxiexzf(c0077Ujhhgtgfeyxiexzf, i, C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf, key);
            i += 2;
            interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf.mo2333Ujhhgtgfeyxiexzf(c0077Ujhhgtgfeyxiexzf, i2, C0117Ujhhgtgfeyxiexzf.f1265Ujhhgtgfeyxiexzf, value);
        }
        interfaceC2875feyxiexzfUjhhgtgMo2349Ujhhgtgfeyxiexzf.mo2322Ujhhgtgfeyxiexzf(c0077Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object mo1108Ujhhgtgfeyxiexzf() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int mo1109Ujhhgtgfeyxiexzf(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Iterator mo1110Ujhhgtgfeyxiexzf(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int mo1111Ujhhgtgfeyxiexzf(Object obj) {
        throw null;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo1112Ujhhgtgfeyxiexzf(InterfaceC2876feyxiexzfUjhhgtg interfaceC2876feyxiexzfUjhhgtg, int i, Object obj) {
        Map map = (Map) obj;
        C0117Ujhhgtgfeyxiexzf c0117Ujhhgtgfeyxiexzf = C0117Ujhhgtgfeyxiexzf.f1265Ujhhgtgfeyxiexzf;
        C1157feyxiexzfUjhhgtg c1157feyxiexzfUjhhgtg = C1157feyxiexzfUjhhgtg.f4352Ujhhgtgfeyxiexzf;
        C0077Ujhhgtgfeyxiexzf c0077Ujhhgtgfeyxiexzf = this.f1129Ujhhgtgfeyxiexzf;
        Object objMo2279feyxiexzfUjhhgtg = interfaceC2876feyxiexzfUjhhgtg.mo2279feyxiexzfUjhhgtg(c0077Ujhhgtgfeyxiexzf, i, c1157feyxiexzfUjhhgtg, null);
        int iMo1185Ujhhgtgfeyxiexzf = interfaceC2876feyxiexzfUjhhgtg.mo1185Ujhhgtgfeyxiexzf(c0077Ujhhgtgfeyxiexzf);
        if (iMo1185Ujhhgtgfeyxiexzf != i + 1) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2700Ujhhgtgfeyxiexzf(i, "Value must follow key in a map, index for key: ", ", returned index for value: ", iMo1185Ujhhgtgfeyxiexzf).toString());
        }
        map.put(objMo2279feyxiexzfUjhhgtg, (!map.containsKey(objMo2279feyxiexzfUjhhgtg) || (C0117Ujhhgtgfeyxiexzf.f1266Ujhhgtgfeyxiexzf.f4189Ujhhgtgfeyxiexzf instanceof AbstractC0835feyxiexzfUjhhgtg)) ? interfaceC2876feyxiexzfUjhhgtg.mo2279feyxiexzfUjhhgtg(c0077Ujhhgtgfeyxiexzf, iMo1185Ujhhgtgfeyxiexzf, c0117Ujhhgtgfeyxiexzf, null) : interfaceC2876feyxiexzfUjhhgtg.mo2279feyxiexzfUjhhgtg(c0077Ujhhgtgfeyxiexzf, iMo1185Ujhhgtgfeyxiexzf, c0117Ujhhgtgfeyxiexzf, AbstractC0202Ujhhgtgfeyxiexzf.m1279Ujhhgtgfeyxiexzf(map, objMo2279feyxiexzfUjhhgtg)));
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final Object mo1113Ujhhgtgfeyxiexzf(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // p000.AbstractC2926Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Object mo1114Ujhhgtgfeyxiexzf(Object obj) {
        return (LinkedHashMap) obj;
    }
}
