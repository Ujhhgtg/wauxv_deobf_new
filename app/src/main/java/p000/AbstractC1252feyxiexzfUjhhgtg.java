package p000;

import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;
import okhttp3.Request;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛳ要点脸ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1252feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C3339feyxiexzfUjhhgtg f4602Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(4);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C2419Ujhhgtgfeyxiexzf f4603Ujhhgtgfeyxiexzf = new C2419Ujhhgtgfeyxiexzf(20);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C2629Ujhhgtgfeyxiexzf f4604Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static long f4605Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static Method f4606Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static boolean f4607Ujhhgtgfeyxiexzf = true;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0659Ujhhgtgfeyxiexzf m2780Ujhhgtgfeyxiexzf(String str, InterfaceC0146Ujhhgtgfeyxiexzf interfaceC0146Ujhhgtgfeyxiexzf) {
        return new C0659Ujhhgtgfeyxiexzf(str, new C0660Ujhhgtgfeyxiexzf(interfaceC0146Ujhhgtgfeyxiexzf));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m2781Ujhhgtgfeyxiexzf(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final ColorStateList m2782Ujhhgtgfeyxiexzf(int i) {
        C1381feyxiexzfUjhhgtg[] c1381feyxiexzfUjhhgtgArr = {new C1381feyxiexzfUjhhgtg(0, Integer.valueOf(i))};
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = c1381feyxiexzfUjhhgtgArr[0];
        for (Map.Entry entry : Collections.singletonMap(c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (iIntValue == 0) {
                arrayList.add(new int[0]);
            } else {
                arrayList.add(new int[]{iIntValue});
            }
            arrayList2.add(Integer.valueOf(iIntValue2));
        }
        return new ColorStateList((int[][]) arrayList.toArray(new int[0][]), AbstractC2856feyxiexzfUjhhgtg.m4252feyxiexzfUjhhgtg(arrayList2));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final C0428Ujhhgtgfeyxiexzf m2783Ujhhgtgfeyxiexzf(Request request) {
        C0428Ujhhgtgfeyxiexzf c0428Ujhhgtgfeyxiexzf = (C0428Ujhhgtgfeyxiexzf) request.tag(C0428Ujhhgtgfeyxiexzf.class);
        return c0428Ujhhgtgfeyxiexzf == null ? AbstractC0427Ujhhgtgfeyxiexzf.f2281Ujhhgtgfeyxiexzf : c0428Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m2784Ujhhgtgfeyxiexzf(SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf, String str) {
        Log.e("FastKV", sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10937Ujhhgtgfeyxiexzf + " " + str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static ArrayList m2785Ujhhgtgfeyxiexzf(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m2786Ujhhgtgfeyxiexzf(SharedPreferencesC3515Ujhhgtgfeyxiexzf sharedPreferencesC3515Ujhhgtgfeyxiexzf, String str) {
        Log.i("FastKV", sharedPreferencesC3515Ujhhgtgfeyxiexzf.f10937Ujhhgtgfeyxiexzf + " " + str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final InterfaceC1026feyxiexzfUjhhgtg m2787Ujhhgtgfeyxiexzf(Socket socket) {
        Logger logger = AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf;
        C1228feyxiexzfUjhhgtg c1228feyxiexzfUjhhgtg = new C1228feyxiexzfUjhhgtg(socket);
        return c1228feyxiexzfUjhhgtg.sink(new C2406Ujhhgtgfeyxiexzf(socket.getOutputStream(), 1, c1228feyxiexzfUjhhgtg));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C2406Ujhhgtgfeyxiexzf m2788Ujhhgtgfeyxiexzf(File file) {
        Logger logger = AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf;
        return new C2406Ujhhgtgfeyxiexzf(new FileOutputStream(file, false), 1, new C1744Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final InterfaceC1227feyxiexzfUjhhgtg m2789Ujhhgtgfeyxiexzf(Socket socket) {
        Logger logger = AbstractC1318feyxiexzfUjhhgtg.f4798Ujhhgtgfeyxiexzf;
        C1228feyxiexzfUjhhgtg c1228feyxiexzfUjhhgtg = new C1228feyxiexzfUjhhgtg(socket);
        return c1228feyxiexzfUjhhgtg.source(new C2402Ujhhgtgfeyxiexzf(socket.getInputStream(), 1, c1228feyxiexzfUjhhgtg));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static void m2790Ujhhgtgfeyxiexzf(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2293Ujhhgtgfeyxiexzf.m3504Ujhhgtgfeyxiexzf(viewGroup, z);
        } else if (f4607Ujhhgtgfeyxiexzf) {
            try {
                AbstractC2293Ujhhgtgfeyxiexzf.m3504Ujhhgtgfeyxiexzf(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f4607Ujhhgtgfeyxiexzf = false;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C2366Ujhhgtgfeyxiexzf m2791Ujhhgtgfeyxiexzf(int i, InterfaceC3507feyxiexzfUjhhgtg interfaceC3507feyxiexzfUjhhgtg) {
        return new C2366Ujhhgtgfeyxiexzf(new C1440feyxiexzfUjhhgtg(i), interfaceC3507feyxiexzfUjhhgtg, f4602Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final Class m2792Ujhhgtgfeyxiexzf(String str) {
        C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
        return AbstractC2842feyxiexzfUjhhgtg.m4167Ujhhgtgfeyxiexzf(C0580Ujhhgtgfeyxiexzf.m1854Ujhhgtgfeyxiexzf(), str);
    }
}
