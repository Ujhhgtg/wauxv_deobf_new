package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C3339feyxiexzfUjhhgtg implements InterfaceC3507feyxiexzfUjhhgtg, InterfaceC0891feyxiexzfUjhhgtg, InterfaceC0887feyxiexzfUjhhgtg, InterfaceC0148Ujhhgtgfeyxiexzf, InterfaceC0075Ujhhgtgfeyxiexzf, InterfaceC0853feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C3339feyxiexzfUjhhgtg f10439Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10440Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3339feyxiexzfUjhhgtg(int i) {
        this.f10440Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static C0216Ujhhgtgfeyxiexzf m4848Ujhhgtgfeyxiexzf(int i, Class cls, Object obj) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return new C0216Ujhhgtgfeyxiexzf(cls, obj);
    }

    @Override // p000.InterfaceC0148Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public void mo1191Ujhhgtgfeyxiexzf(String str) {
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C0147Ujhhgtgfeyxiexzf.f1304Ujhhgtgfeyxiexzf;
        if (((Boolean) C0147Ujhhgtgfeyxiexzf.f1305Ujhhgtgfeyxiexzf.getValue()).booleanValue()) {
            Log.d("KavaRef", String.valueOf(str), null);
        } else {
            ((InterfaceC0259Ujhhgtgfeyxiexzf) C0147Ujhhgtgfeyxiexzf.f1304Ujhhgtgfeyxiexzf.getValue()).mo1427Ujhhgtgfeyxiexzf(String.valueOf(str));
        }
    }

    @Override // p000.InterfaceC0148Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public void mo1192Ujhhgtgfeyxiexzf(Object obj, Throwable th) {
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C0147Ujhhgtgfeyxiexzf.f1304Ujhhgtgfeyxiexzf;
        if (((Boolean) C0147Ujhhgtgfeyxiexzf.f1305Ujhhgtgfeyxiexzf.getValue()).booleanValue()) {
            Log.w("KavaRef", String.valueOf(obj), th);
        } else {
            ((InterfaceC0259Ujhhgtgfeyxiexzf) C0147Ujhhgtgfeyxiexzf.f1304Ujhhgtgfeyxiexzf.getValue()).mo1433Ujhhgtgfeyxiexzf(String.valueOf(obj), th);
        }
    }

    @Override // p000.InterfaceC0075Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public void mo1115Ujhhgtgfeyxiexzf(View view, String str) {
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }

    @Override // p000.InterfaceC0891feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public InterfaceC0901feyxiexzfUjhhgtg mo2369Ujhhgtgfeyxiexzf(InterfaceC0901feyxiexzfUjhhgtg interfaceC0901feyxiexzfUjhhgtg, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C3580feyxiexzfUjhhgtg) ((C3571feyxiexzfUjhhgtg) interfaceC0901feyxiexzfUjhhgtg.get()).f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf).f11125Ujhhgtgfeyxiexzf.f4258Ujhhgtgfeyxiexzf.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC2648Ujhhgtgfeyxiexzf.f8502Ujhhgtgfeyxiexzf;
        C2615feyxiexzfUjhhgtg c2615feyxiexzfUjhhgtg = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C2615feyxiexzfUjhhgtg(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (c2615feyxiexzfUjhhgtg != null && c2615feyxiexzfUjhhgtg.f8432Ujhhgtgfeyxiexzf == 0 && c2615feyxiexzfUjhhgtg.f8433Ujhhgtgfeyxiexzf == c2615feyxiexzfUjhhgtg.f8434Ujhhgtgfeyxiexzf.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new C3030feyxiexzfUjhhgtg(bArrArray);
    }

    @Override // p000.InterfaceC3507feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public Object mo1740Ujhhgtgfeyxiexzf() {
        switch (this.f10440Ujhhgtgfeyxiexzf) {
            case 5:
                return new ArrayList();
            default:
                return new C0263Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.InterfaceC0853feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public CharSequence mo2260Ujhhgtgfeyxiexzf(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f310Ujhhgtgfeyxiexzf.getString(R.string.not_set);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳ能不能ᛱUjhhgtgᛱ要点脸ᛴ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public List mo4504Ujhhgtgfeyxiexzf(Class cls) {
        ?? c0919feyxiexzfUjhhgtg;
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            c0919feyxiexzfUjhhgtg = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor != null) {
                    c0919feyxiexzfUjhhgtg.add(constructor);
                }
            }
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
        if (thM2409Ujhhgtgfeyxiexzf != null) {
            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C0147Ujhhgtgfeyxiexzf.f1304Ujhhgtgfeyxiexzf;
            C0147Ujhhgtgfeyxiexzf.m1190Ujhhgtgfeyxiexzf("Failed to get declared constructors in " + this + " because got an exception.", thM2409Ujhhgtgfeyxiexzf);
        }
        boolean z = c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg;
        ?? r0 = c0919feyxiexzfUjhhgtg;
        if (z) {
            r0 = 0;
        }
        List list = (List) r0;
        return list == null ? C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf : list;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public List mo4505Ujhhgtgfeyxiexzf(Class cls) {
        Object c0919feyxiexzfUjhhgtg;
        try {
            c0919feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3653feyxiexzfUjhhgtg(cls.getDeclaredMethods());
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
        if (thM2409Ujhhgtgfeyxiexzf != null) {
            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C0147Ujhhgtgfeyxiexzf.f1304Ujhhgtgfeyxiexzf;
            C0147Ujhhgtgfeyxiexzf.m1190Ujhhgtgfeyxiexzf("Failed to get declared methods in " + this + " because got an exception.", thM2409Ujhhgtgfeyxiexzf);
        }
        if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
            c0919feyxiexzfUjhhgtg = null;
        }
        List list = (List) c0919feyxiexzfUjhhgtg;
        return list == null ? C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf : list;
    }

    @Override // p000.InterfaceC3330Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public boolean mo2018Ujhhgtgfeyxiexzf(Object obj, File file, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) throws Throwable {
        try {
            AbstractC2648Ujhhgtgfeyxiexzf.m3981Ujhhgtgfeyxiexzf(((C3580feyxiexzfUjhhgtg) ((C3571feyxiexzfUjhhgtg) ((InterfaceC0901feyxiexzfUjhhgtg) obj).get()).f11095Ujhhgtgfeyxiexzf.f9406Ujhhgtgfeyxiexzf).f11125Ujhhgtgfeyxiexzf.f4258Ujhhgtgfeyxiexzf.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // p000.InterfaceC0887feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ */
    public int mo2365Ujhhgtgfeyxiexzf(C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        return 1;
    }

    public C3339feyxiexzfUjhhgtg(C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg) {
        this.f10440Ujhhgtgfeyxiexzf = 11;
        new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    private final void m4849Ujhhgtgfeyxiexzf(Object obj) {
    }
}
