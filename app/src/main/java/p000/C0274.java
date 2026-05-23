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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲀᲇᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0274 implements InterfaceC1996 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1478;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f1479;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f1480;

    public /* synthetic */ C0274(Object obj, int i, Object obj2) {
        this.f1478 = i;
        this.f1480 = obj;
        this.f1479 = obj2;
    }

    public String toString() {
        switch (this.f1478) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f1480).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo1394(Object obj) {
        switch (this.f1478) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f1480).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1996) it.next()).mo1394(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f1480).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // p000.InterfaceC1996
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1995 mo1395(Object obj, int i, int i2, C2303 c2303) {
        C1320 c1320;
        C1995 c1995Mo1395;
        Uri uri;
        switch (this.f1478) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C2244 c2244 = new C2244(uri2);
                AssetManager assetManager = (AssetManager) this.f1480;
                switch (((C0273) this.f1479).f1476) {
                    case 0:
                        c1320 = new C1320(assetManager, strSubstring, 0);
                        break;
                    default:
                        c1320 = new C1320(assetManager, strSubstring, 1);
                        break;
                }
                return new C1995(c2244, c1320);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c2303.m4165(C2573.f8167);
                return new C1995(new C2244(num), new C1045(theme, theme != null ? theme.getResources() : ((Context) this.f1480).getResources(), (C1044) this.f1479, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f1480;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC1749 interfaceC1749 = null;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC1996 interfaceC1996 = (InterfaceC1996) arrayList.get(i3);
                    if (interfaceC1996.mo1394(obj) && (c1995Mo1395 = interfaceC1996.mo1395(obj, i, i2, c2303)) != null) {
                        interfaceC1749 = c1995Mo1395.f6655;
                        arrayList2.add(c1995Mo1395.f6657);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC1749 == null) {
                    return null;
                }
                return new C1995(interfaceC1749, new C2100(arrayList2, (InterfaceC2378) this.f1479));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f1479).getResourcePackageName(num2.intValue()) + '/' + num2);
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
                return ((InterfaceC1996) this.f1480).mo1395(uri, i, i2, c2303);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC1996 interfaceC1997 = (InterfaceC1996) this.f1479;
                List<String> pathSegments = uri3.getPathSegments();
                C1995 c1995Mo1396 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i4 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i4 != 0) {
                            c1995Mo1396 = interfaceC1997.mo1395(Integer.valueOf(i4), i, i2, c2303);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c1995Mo1396;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c1995Mo1396;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return c1995Mo1396;
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
                Context context = (Context) this.f1480;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC1997.mo1395(Integer.valueOf(identifier), i, i2, c2303);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public C0274(Resources resources, InterfaceC1996 interfaceC1996) {
        this.f1478 = 3;
        this.f1479 = resources;
        this.f1480 = interfaceC1996;
    }

    public C0274(Context context, C1044 c1044) {
        this.f1478 = 1;
        this.f1480 = context.getApplicationContext();
        this.f1479 = c1044;
    }

    public C0274(Context context, InterfaceC1996 interfaceC1996) {
        this.f1478 = 4;
        this.f1480 = context.getApplicationContext();
        this.f1479 = interfaceC1996;
    }
}
