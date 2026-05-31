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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲁᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0284 implements InterfaceC2027 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f1553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f1554;

    public /* synthetic */ C0284(Object obj, int i, Object obj2) {
        this.f1552 = i;
        this.f1554 = obj;
        this.f1553 = obj2;
    }

    public String toString() {
        switch (this.f1552) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f1554).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final boolean mo1540(Object obj) {
        switch (this.f1552) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.f1554).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2027) it.next()).mo1540(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f1554).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // p000.InterfaceC2027
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2026 mo1541(Object obj, int i, int i2, C2336 c2336) {
        C1321 c1321;
        C2026 c2026Mo1541;
        Uri uri;
        switch (this.f1552) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                C2275 c2275 = new C2275(uri2);
                AssetManager assetManager = (AssetManager) this.f1554;
                switch (((C0283) this.f1553).f1550) {
                    case 0:
                        c1321 = new C1321(assetManager, strSubstring, 0);
                        break;
                    default:
                        c1321 = new C1321(assetManager, strSubstring, 1);
                        break;
                }
                return new C2026(c2275, c1321);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c2336.m4294(C2629.f8320);
                return new C2026(new C2275(num), new C1048(theme, theme != null ? theme.getResources() : ((Context) this.f1554).getResources(), (C1047) this.f1553, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f1554;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                InterfaceC1772 interfaceC1772 = null;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC2027 interfaceC2027 = (InterfaceC2027) arrayList.get(i3);
                    if (interfaceC2027.mo1540(obj) && (c2026Mo1541 = interfaceC2027.mo1541(obj, i, i2, c2336)) != null) {
                        interfaceC1772 = c2026Mo1541.f6760;
                        arrayList2.add(c2026Mo1541.f6762);
                    }
                }
                if (arrayList2.isEmpty() || interfaceC1772 == null) {
                    return null;
                }
                return new C2026(interfaceC1772, new C2133(arrayList2, (InterfaceC2431) this.f1553));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f1553).getResourcePackageName(num2.intValue()) + '/' + num2);
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
                return ((InterfaceC2027) this.f1554).mo1541(uri, i, i2, c2336);
            default:
                Uri uri3 = (Uri) obj;
                InterfaceC2027 interfaceC2028 = (InterfaceC2027) this.f1553;
                List<String> pathSegments = uri3.getPathSegments();
                C2026 c2026Mo1542 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i4 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i4 != 0) {
                            c2026Mo1542 = interfaceC2028.mo1541(Integer.valueOf(i4), i, i2, c2336);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return c2026Mo1542;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return c2026Mo1542;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return c2026Mo1542;
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
                Context context = (Context) this.f1554;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return interfaceC2028.mo1541(Integer.valueOf(identifier), i, i2, c2336);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public C0284(Resources resources, InterfaceC2027 interfaceC2027) {
        this.f1552 = 3;
        this.f1553 = resources;
        this.f1554 = interfaceC2027;
    }

    public C0284(Context context, C1047 c1047) {
        this.f1552 = 1;
        this.f1554 = context.getApplicationContext();
        this.f1553 = c1047;
    }

    public C0284(Context context, InterfaceC2027 interfaceC2027) {
        this.f1552 = 4;
        this.f1554 = context.getApplicationContext();
        this.f1553 = interfaceC2027;
    }
}
