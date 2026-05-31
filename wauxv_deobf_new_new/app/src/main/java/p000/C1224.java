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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᛸᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1224 implements InterfaceC1263, InterfaceC2634, InterfaceC2630, InterfaceC1769, InterfaceC1819, InterfaceC2443 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C1224 f4429;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4430;

    public /* synthetic */ C1224(int i) {
        this.f4430 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C1958 m2968(int i, Class cls, Object obj) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return new C1958(cls, obj);
    }

    @Override // p000.InterfaceC1769
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void mo2970(String str) {
        C2933 c2933 = C1770.f5907;
        if (((Boolean) C1770.f5908.getValue()).booleanValue()) {
            Log.d("KavaRef", String.valueOf(str), null);
        } else {
            ((InterfaceC1881) C1770.f5907.getValue()).mo1088(String.valueOf(str));
        }
    }

    @Override // p000.InterfaceC1769
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void mo2971(Object obj, Throwable th) {
        C2933 c2933 = C1770.f5907;
        if (((Boolean) C1770.f5908.getValue()).booleanValue()) {
            Log.w("KavaRef", String.valueOf(obj), th);
        } else {
            ((InterfaceC1881) C1770.f5907.getValue()).mo1089(String.valueOf(obj), th);
        }
    }

    @Override // p000.InterfaceC1819
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1801(View view, String str) {
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

    @Override // p000.InterfaceC2634
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC2624 mo1460(InterfaceC2624 interfaceC2624, C2336 c2336) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C1461) ((C1454) interfaceC2624.get()).f5143.f1247).f5176.f9123.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC0511.f2190;
        C0498 c0498 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C0498(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (c0498 != null && c0498.f2159 == 0 && c0498.f2160 == c0498.f2161.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new C0166(bArrArray);
    }

    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public Object mo1246() {
        switch (this.f4430) {
            case 5:
                return new ArrayList();
            default:
                return new C1878();
        }
    }

    @Override // p000.InterfaceC2443
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public CharSequence mo1612(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f309.getString(R.string.not_set);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲇᲈᤝᛸ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public List mo1340(Class cls) {
        ?? c2641;
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            c2641 = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor != null) {
                    c2641.add(constructor);
                }
            }
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Throwable thM4616 = C2642.m4616(c2641);
        if (thM4616 != null) {
            C2933 c2933 = C1770.f5907;
            C1770.m3652("Failed to get declared constructors in " + this + " because got an exception.", thM4616);
        }
        boolean z = c2641 instanceof C2641;
        ?? r0 = c2641;
        if (z) {
            r0 = 0;
        }
        List list = (List) r0;
        return list == null ? C1191.f4326 : list;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public List mo1341(Class cls) {
        Object c2641;
        try {
            c2641 = AbstractC0280.m1535(cls.getDeclaredMethods());
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Throwable thM4616 = C2642.m4616(c2641);
        if (thM4616 != null) {
            C2933 c2933 = C1770.f5907;
            C1770.m3652("Failed to get declared methods in " + this + " because got an exception.", thM4616);
        }
        if (c2641 instanceof C2641) {
            c2641 = null;
        }
        List list = (List) c2641;
        return list == null ? C1191.f4326 : list;
    }

    @Override // p000.InterfaceC1208
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public boolean mo1615(Object obj, File file, C2336 c2336) throws Throwable {
        try {
            AbstractC0511.m1960(((C1461) ((C1454) ((InterfaceC2624) obj).get()).f5143.f1247).f5176.f9123.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // p000.InterfaceC2630
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public int mo1720(C2336 c2336) {
        return 1;
    }

    public C1224(C0552 c0552) {
        this.f4430 = 11;
        new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    private final void m2969(Object obj) {
    }
}
