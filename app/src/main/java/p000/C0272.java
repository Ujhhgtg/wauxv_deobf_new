package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0272 extends AbstractC1831 {

    public final /* synthetic */ int f1475;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0272(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.f1475 = i;
    }

    @Override // p000.InterfaceC0955
    public final Class mo1391() {
        switch (this.f1475) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.AbstractC1831
    public final void mo1392(Object obj) throws IOException {
        switch (this.f1475) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // p000.AbstractC1831
    public final Object mo1393(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.f1475) {
            case 0:
                boolean z = this.f6115;
                ContentResolver contentResolver2 = this.f6117;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (!z || !AbstractC0968.m2477(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                boolean z2 = this.f6115;
                ContentResolver contentResolver3 = this.f6117;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = (!z2 || !AbstractC0968.m2477(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver3.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver3, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}
