package p000;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import com.umeng.analytics.pro.bz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1371 {

    public static final C1316 f4936 = new C1316(2);

    public static final C1369 f4937 = new C1369();

    public static C0408 m3090(Context context, List list) {
        String str;
        Typeface typefaceM5047;
        AbstractC0743.m2172("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C1372 c1372 = (C1372) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM5047 = AbstractC3460.m5047((str = c1372.f4942))) == null || AbstractC3460.m5048(typefaceM5047) == null) {
                    ProviderInfo providerInfoM3091 = m3091(context.getPackageManager(), c1372, context.getResources());
                    if (providerInfoM3091 == null) {
                        return new C0408((byte) 0, 5);
                    }
                    arrayList.add(m3092(context, c1372, providerInfoM3091.authority));
                } else {
                    arrayList.add(new C1383[]{new C1383(str, c1372.f4943)});
                }
            }
            return new C0408(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo m3091(PackageManager packageManager, C1372 c1372, Resources resources) {
        C1369 c1369 = f4937;
        C1316 c1316 = f4936;
        AbstractC0743.m2172("FontProvider.getProvider");
        try {
            List listM5085 = c1372.f4941;
            String str = c1372.f4938;
            String str2 = c1372.f4939;
            if (listM5085 == null) {
                listM5085 = AbstractC3471.m5085(resources, 0);
            }
            C1370 c1370 = new C1370();
            c1370.f4933 = str;
            c1370.f4934 = str2;
            c1370.f4935 = listM5085;
            ProviderInfo providerInfo = (ProviderInfo) c1316.m3033(c1370);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c1369);
            for (int i = 0; i < listM5085.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM5085.get(i));
                Collections.sort(arrayList2, c1369);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            c1316.m3040(c1370, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static C1383[] m3092(Context context, C1372 c1372, String str) {
        AbstractC0743.m2172("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC0743.m2172("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c1372.f4940};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new C1383(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, c1372.f4943, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    C1383[] c1383Arr = (C1383[]) arrayList.toArray(new C1383[0]);
                    Trace.endSection();
                    return c1383Arr;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
