package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2573 implements InterfaceC2571 {

    public static final C2301 f8167 = new C2301("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C2301.f7412);

    public final Context f8168;

    public C2573(Context context) {
        this.f8168 = context.getApplicationContext();
    }

    @Override // p000.InterfaceC2571
    public final boolean mo1209(Object obj, C2303 c2303) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // p000.InterfaceC2571
    public final /* bridge */ /* synthetic */ InterfaceC2568 mo1210(Object obj, int i, int i2, C2303 c2303) {
        return m4584((Uri) obj, c2303);
    }

    public final InterfaceC2568 m4584(Uri uri, C2303 c2303) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f8168;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c2303.m4165(f8167) : null;
        Drawable drawableM4996 = theme == null ? AbstractC3453.m4996(context, contextCreatePackageContext, identifier, null) : AbstractC3453.m4996(context, context, identifier, theme);
        if (drawableM4996 != null) {
            return new C1447(drawableM4996, 1);
        }
        return null;
    }
}
