package p000;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.umeng.commonsdk.debug.UMLogUtils;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2668 {
    public static View m4676(View view, int i, ViewGroup viewGroup, boolean z) {
        return LayoutInflater.from(view.getContext()).inflate(i, viewGroup, z);
    }

    public static String m4677(StringBuilder sb, Integer num, char c) {
        sb.append(num);
        sb.append(c);
        return sb.toString();
    }

    public static String m4678(StringBuilder sb, String str) {
        sb.append(UMLogUtils.makeUrl(str));
        return sb.toString();
    }

    public static StringBuilder m4679(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void m4680(C2360 c2360, String str, boolean z, int i) {
        c2360.m4338(str, z);
        c2360.m4339(new C0380(i, 9));
    }

    public static void m4681(String str, Exception exc, String str2) {
        Log.e(str2, str + exc);
    }

    public static void m4682(String str, String str2, Throwable th) {
        Log.e(str2, str + th);
    }
}
