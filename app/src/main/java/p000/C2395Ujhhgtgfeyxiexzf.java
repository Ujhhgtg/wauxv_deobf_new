package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2395Ujhhgtgfeyxiexzf implements InterfaceC0285Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7785Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f7786Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f7787Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2395Ujhhgtgfeyxiexzf(Object obj, int i, Object obj2) {
        this.f7785Ujhhgtgfeyxiexzf = i;
        this.f7787Ujhhgtgfeyxiexzf = obj;
        this.f7786Ujhhgtgfeyxiexzf = obj2;
    }

    public String toString() {
        switch (this.f7785Ujhhgtgfeyxiexzf) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f7787Ujhhgtgfeyxiexzf).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final boolean mo1303Ujhhgtgfeyxiexzf(Object obj) {
        switch (this.f7785Ujhhgtgfeyxiexzf) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f7787Ujhhgtgfeyxiexzf).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0285Ujhhgtgfeyxiexzf) it.next()).mo1303Ujhhgtgfeyxiexzf(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f7787Ujhhgtgfeyxiexzf).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // p000.InterfaceC0285Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final C0286Ujhhgtgfeyxiexzf mo1304Ujhhgtgfeyxiexzf(Object obj, int i, int i2, C1471feyxiexzfUjhhgtg c1471feyxiexzfUjhhgtg) {
        C3463Ujhhgtgfeyxiexzf c3463Ujhhgtgfeyxiexzf;
        C0286Ujhhgtgfeyxiexzf c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf;
        Uri uri;
        switch (this.f7785Ujhhgtgfeyxiexzf) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C1308feyxiexzfUjhhgtg c1308feyxiexzfUjhhgtg = new C1308feyxiexzfUjhhgtg(uri2);
                AssetManager assetManager = (AssetManager) this.f7787Ujhhgtgfeyxiexzf;
                switch (((C2396Ujhhgtgfeyxiexzf) this.f7786Ujhhgtgfeyxiexzf).f7788Ujhhgtgfeyxiexzf) {
                    case 0:
                        c3463Ujhhgtgfeyxiexzf = new C3463Ujhhgtgfeyxiexzf(assetManager, strSubstring, 0);
                        break;
                    default:
                        c3463Ujhhgtgfeyxiexzf = new C3463Ujhhgtgfeyxiexzf(assetManager, strSubstring, 1);
                        break;
                }
                return new C0286Ujhhgtgfeyxiexzf(c1308feyxiexzfUjhhgtg, c3463Ujhhgtgfeyxiexzf);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c1471feyxiexzfUjhhgtg.m2973Ujhhgtgfeyxiexzf(C0884feyxiexzfUjhhgtg.f3423Ujhhgtgfeyxiexzf);
                return new C0286Ujhhgtgfeyxiexzf(new C1308feyxiexzfUjhhgtg(num), new C3168feyxiexzfUjhhgtg(theme, theme != null ? theme.getResources() : ((Context) this.f7787Ujhhgtgfeyxiexzf).getResources(), (C3167feyxiexzfUjhhgtg) this.f7786Ujhhgtgfeyxiexzf, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f7787Ujhhgtgfeyxiexzf;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC0156Ujhhgtgfeyxiexzf interfaceC0156Ujhhgtgfeyxiexzf = null;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf = (InterfaceC0285Ujhhgtgfeyxiexzf) arrayList.get(i3);
                    if (interfaceC0285Ujhhgtgfeyxiexzf.mo1303Ujhhgtgfeyxiexzf(obj) && (c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf.mo1304Ujhhgtgfeyxiexzf(obj, i, i2, c1471feyxiexzfUjhhgtg)) != null) {
                        interfaceC0156Ujhhgtgfeyxiexzf = c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf.f1717Ujhhgtgfeyxiexzf;
                        arrayList2.add(c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf.f1719Ujhhgtgfeyxiexzf);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC0156Ujhhgtgfeyxiexzf == null) {
                    return null;
                }
                return new C0286Ujhhgtgfeyxiexzf(interfaceC0156Ujhhgtgfeyxiexzf, new C0513Ujhhgtgfeyxiexzf(arrayList2, (InterfaceC1445feyxiexzfUjhhgtg) this.f7786Ujhhgtgfeyxiexzf));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f7786Ujhhgtgfeyxiexzf).getResourcePackageName(num2.intValue()) + '/' + num2);
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC0285Ujhhgtgfeyxiexzf) this.f7787Ujhhgtgfeyxiexzf).mo1304Ujhhgtgfeyxiexzf(uri, i, i2, c1471feyxiexzfUjhhgtg);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf2 = (InterfaceC0285Ujhhgtgfeyxiexzf) this.f7786Ujhhgtgfeyxiexzf;
                List<String> pathSegments = uri3.getPathSegments();
                C0286Ujhhgtgfeyxiexzf c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i4 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i4 != 0) {
                            c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf2 = interfaceC0285Ujhhgtgfeyxiexzf2.mo1304Ujhhgtgfeyxiexzf(Integer.valueOf(i4), i, i2, c1471feyxiexzfUjhhgtg);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf2;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return c0286UjhhgtgfeyxiexzfMo1304Ujhhgtgfeyxiexzf2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f7787Ujhhgtgfeyxiexzf;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC0285Ujhhgtgfeyxiexzf2.mo1304Ujhhgtgfeyxiexzf(Integer.valueOf(identifier), i, i2, c1471feyxiexzfUjhhgtg);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public C2395Ujhhgtgfeyxiexzf(Resources resources, InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf) {
        this.f7785Ujhhgtgfeyxiexzf = 3;
        this.f7786Ujhhgtgfeyxiexzf = resources;
        this.f7787Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf;
    }

    public C2395Ujhhgtgfeyxiexzf(Context context, C3167feyxiexzfUjhhgtg c3167feyxiexzfUjhhgtg) {
        this.f7785Ujhhgtgfeyxiexzf = 1;
        this.f7787Ujhhgtgfeyxiexzf = context.getApplicationContext();
        this.f7786Ujhhgtgfeyxiexzf = c3167feyxiexzfUjhhgtg;
    }

    public C2395Ujhhgtgfeyxiexzf(Context context, InterfaceC0285Ujhhgtgfeyxiexzf interfaceC0285Ujhhgtgfeyxiexzf) {
        this.f7785Ujhhgtgfeyxiexzf = 4;
        this.f7787Ujhhgtgfeyxiexzf = context.getApplicationContext();
        this.f7786Ujhhgtgfeyxiexzf = interfaceC0285Ujhhgtgfeyxiexzf;
    }
}
