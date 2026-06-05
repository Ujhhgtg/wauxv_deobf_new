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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴ能不能ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3623feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C3434feyxiexzfUjhhgtg f11318Ujhhgtgfeyxiexzf = new C3434feyxiexzfUjhhgtg(2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C3621feyxiexzfUjhhgtg f11319Ujhhgtgfeyxiexzf = new C3621feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C2501feyxiexzfUjhhgtg m5264Ujhhgtgfeyxiexzf(Context context, List list) {
        String str;
        Typeface typefaceM3095Ujhhgtgfeyxiexzf;
        AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg = (C3624feyxiexzfUjhhgtg) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM3095Ujhhgtgfeyxiexzf = AbstractC1771Ujhhgtgfeyxiexzf.m3095Ujhhgtgfeyxiexzf((str = c3624feyxiexzfUjhhgtg.f11324Ujhhgtgfeyxiexzf))) == null || AbstractC1771Ujhhgtgfeyxiexzf.m3096Ujhhgtgfeyxiexzf(typefaceM3095Ujhhgtgfeyxiexzf) == null) {
                    ProviderInfo providerInfoM5265Ujhhgtgfeyxiexzf = m5265Ujhhgtgfeyxiexzf(context.getPackageManager(), c3624feyxiexzfUjhhgtg, context.getResources());
                    if (providerInfoM5265Ujhhgtgfeyxiexzf == null) {
                        return new C2501feyxiexzfUjhhgtg((byte) 0, 5);
                    }
                    arrayList.add(m5266Ujhhgtgfeyxiexzf(context, c3624feyxiexzfUjhhgtg, providerInfoM5265Ujhhgtgfeyxiexzf.authority));
                } else {
                    arrayList.add(new C3635Ujhhgtgfeyxiexzf[]{new C3635Ujhhgtgfeyxiexzf(str, c3624feyxiexzfUjhhgtg.f11325Ujhhgtgfeyxiexzf)});
                }
            }
            return new C2501feyxiexzfUjhhgtg(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static ProviderInfo m5265Ujhhgtgfeyxiexzf(PackageManager packageManager, C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg, Resources resources) {
        C3621feyxiexzfUjhhgtg c3621feyxiexzfUjhhgtg = f11319Ujhhgtgfeyxiexzf;
        C3434feyxiexzfUjhhgtg c3434feyxiexzfUjhhgtg = f11318Ujhhgtgfeyxiexzf;
        AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("FontProvider.getProvider");
        try {
            List listM5225Ujhhgtgfeyxiexzf = c3624feyxiexzfUjhhgtg.f11323Ujhhgtgfeyxiexzf;
            String str = c3624feyxiexzfUjhhgtg.f11320Ujhhgtgfeyxiexzf;
            String str2 = c3624feyxiexzfUjhhgtg.f11321Ujhhgtgfeyxiexzf;
            if (listM5225Ujhhgtgfeyxiexzf == null) {
                listM5225Ujhhgtgfeyxiexzf = AbstractC3611Ujhhgtgfeyxiexzf.m5225Ujhhgtgfeyxiexzf(resources, 0);
            }
            C3622feyxiexzfUjhhgtg c3622feyxiexzfUjhhgtg = new C3622feyxiexzfUjhhgtg();
            c3622feyxiexzfUjhhgtg.f11315Ujhhgtgfeyxiexzf = str;
            c3622feyxiexzfUjhhgtg.f11316Ujhhgtgfeyxiexzf = str2;
            c3622feyxiexzfUjhhgtg.f11317Ujhhgtgfeyxiexzf = listM5225Ujhhgtgfeyxiexzf;
            ProviderInfo providerInfo = (ProviderInfo) c3434feyxiexzfUjhhgtg.m4930Ujhhgtgfeyxiexzf(c3622feyxiexzfUjhhgtg);
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
            Collections.sort(arrayList, c3621feyxiexzfUjhhgtg);
            for (int i = 0; i < listM5225Ujhhgtgfeyxiexzf.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM5225Ujhhgtgfeyxiexzf.get(i));
                Collections.sort(arrayList2, c3621feyxiexzfUjhhgtg);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            c3434feyxiexzfUjhhgtg.m4937Ujhhgtgfeyxiexzf(c3622feyxiexzfUjhhgtg, providerInfoResolveContentProvider);
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static C3635Ujhhgtgfeyxiexzf[] m5266Ujhhgtgfeyxiexzf(Context context, C3624feyxiexzfUjhhgtg c3624feyxiexzfUjhhgtg, String str) {
        AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {bz.d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {c3624feyxiexzfUjhhgtg.f11322Ujhhgtgfeyxiexzf};
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
                        int columnIndex2 = cursorQuery.getColumnIndex(bz.d);
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new C3635Ujhhgtgfeyxiexzf(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, c3624feyxiexzfUjhhgtg.f11325Ujhhgtgfeyxiexzf, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    C3635Ujhhgtgfeyxiexzf[] c3635UjhhgtgfeyxiexzfArr = (C3635Ujhhgtgfeyxiexzf[]) arrayList.toArray(new C3635Ujhhgtgfeyxiexzf[0]);
                    Trace.endSection();
                    return c3635UjhhgtgfeyxiexzfArr;
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
