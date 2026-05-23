package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1372 {

    public final String f4938;

    public final String f4939;

    public final String f4940;

    public final List f4941;

    public final String f4942;

    public final String f4943;

    public final String f4944;

    public C1372(String str, String str2, String str3, List list, String str4, String str5) {
        
        this.f4938 = str;
        
        this.f4939 = str2;
        this.f4940 = str3;
        
        this.f4941 = list;
        this.f4942 = str4;
        this.f4943 = str5;
        this.f4944 = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4938 + ", mProviderPackage: " + this.f4939 + ", mQuery: " + this.f4940 + ", mSystemFont: " + this.f4942 + ", mVariationSettings: " + this.f4943 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f4941;
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
