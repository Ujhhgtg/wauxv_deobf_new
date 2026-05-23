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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᛸᲇᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1227 implements InterfaceC1261, InterfaceC2578, InterfaceC2574, InterfaceC1746, InterfaceC1796, InterfaceC2390 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C1227 f4446;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4447;

    public /* synthetic */ C1227(int i) {
        this.f4447 = i;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C1927 m2859(int i, Class cls, Object obj) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return new C1927(cls, obj);
    }

    public String toString() {
        switch (this.f4447) {
            case 20:
                return AbstractC1194.m2785("JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='    ', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='type', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=", "POLYMORPHIC", ", exceptionsWithDebugInfo=true)");
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1746
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public void mo2861(String str) {
        C2873 c2873 = C1747.f5845;
        if (((Boolean) C1747.f5846.getValue()).booleanValue()) {
            Log.d("KavaRef", String.valueOf(str), null);
        } else {
            ((InterfaceC1855) C1747.f5845.getValue()).mo2876(String.valueOf(str));
        }
    }

    @Override // p000.InterfaceC1746
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void mo2862(Object obj, Throwable th) {
        C2873 c2873 = C1747.f5845;
        if (((Boolean) C1747.f5846.getValue()).booleanValue()) {
            Log.w("KavaRef", String.valueOf(obj), th);
        } else {
            ((InterfaceC1855) C1747.f5845.getValue()).mo2882(String.valueOf(obj), th);
        }
    }

    @Override // p000.InterfaceC1796
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public void mo1693(View view, String str) {
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

    @Override // p000.InterfaceC2578
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public InterfaceC2568 mo1314(InterfaceC2568 interfaceC2568, C2303 c2303) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C1453) ((C1446) interfaceC2568.get()).f5114.f1179).f5147.f8962.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC0534.f2234;
        C0521 c0521 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C0521(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (c0521 != null && c0521.f2203 == 0 && c0521.f2204 == c0521.f2205.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new C0158(bArrArray);
    }

    @Override // p000.InterfaceC1261
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public Object mo1100() {
        switch (this.f4447) {
            case 4:
                return new ArrayList();
            default:
                return new C1852();
        }
    }

    @Override // p000.InterfaceC2390
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public CharSequence mo1507(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f309.getString(R.string.not_set);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲇᲈᤝᤞ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public List mo1194(Class cls) {
        ?? c2585;
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            c2585 = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor != null) {
                    c2585.add(constructor);
                }
            }
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            C2873 c2873 = C1747.f5845;
            C1747.m3496("Failed to get declared constructors in " + this + " because got an exception.", thM4594);
        }
        boolean z = c2585 instanceof C2585;
        ?? r0 = c2585;
        if (z) {
            r0 = 0;
        }
        List list = (List) r0;
        return list == null ? C1189.f4329 : list;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public List mo1195(Class cls) {
        Object c2585;
        try {
            c2585 = AbstractC0270.m1389(cls.getDeclaredMethods());
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            C2873 c2873 = C1747.f5845;
            C1747.m3496("Failed to get declared methods in " + this + " because got an exception.", thM4594);
        }
        if (c2585 instanceof C2585) {
            c2585 = null;
        }
        List list = (List) c2585;
        return list == null ? C1189.f4329 : list;
    }

    @Override // p000.InterfaceC1207
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public boolean mo1510(Object obj, File file, C2303 c2303) throws Throwable {
        try {
            AbstractC0534.m1866(((C1453) ((C1446) ((InterfaceC2568) obj).get()).f5114.f1179).f5147.f8962.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // p000.InterfaceC2574
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public int mo1614(C2303 c2303) {
        return 1;
    }

    public C1227(C0575 c0575) {
        this.f4447 = 10;
        new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    private final void m2860(Object obj) {
    }
}
