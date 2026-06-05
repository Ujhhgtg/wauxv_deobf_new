package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3624feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f11320Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f11321Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f11322Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final List f11323Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final String f11324Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String f11325Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String f11326Ujhhgtgfeyxiexzf;

    public C3624feyxiexzfUjhhgtg(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f11320Ujhhgtgfeyxiexzf = str;
        str2.getClass();
        this.f11321Ujhhgtgfeyxiexzf = str2;
        this.f11322Ujhhgtgfeyxiexzf = str3;
        list.getClass();
        this.f11323Ujhhgtgfeyxiexzf = list;
        this.f11324Ujhhgtgfeyxiexzf = str4;
        this.f11325Ujhhgtgfeyxiexzf = str5;
        this.f11326Ujhhgtgfeyxiexzf = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f11320Ujhhgtgfeyxiexzf + ", mProviderPackage: " + this.f11321Ujhhgtgfeyxiexzf + ", mQuery: " + this.f11322Ujhhgtgfeyxiexzf + ", mSystemFont: " + this.f11324Ujhhgtgfeyxiexzf + ", mVariationSettings: " + this.f11325Ujhhgtgfeyxiexzf + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f11323Ujhhgtgfeyxiexzf;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
